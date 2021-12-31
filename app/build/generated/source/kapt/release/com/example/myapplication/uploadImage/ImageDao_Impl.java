package com.example.myapplication.uploadImage;

import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImageDao_Impl implements ImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Image> __insertionAdapterOfImage;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Image> __deletionAdapterOfImage;

  public ImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfImage = new EntityInsertionAdapter<Image>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Image_table` (`id`,`photo`,`doctor`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Image value) {
        stmt.bindLong(1, value.getId());
        final byte[] _tmp;
        _tmp = __converters.fromBitmap(value.getPhoto());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindBlob(2, _tmp);
        }
        if (value.getDocName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDocName());
        }
      }
    };
    this.__deletionAdapterOfImage = new EntityDeletionOrUpdateAdapter<Image>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Image_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Image value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insertImage(final Image image) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfImage.insert(image);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteImage(final Image image) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfImage.handle(image);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Image>> getAllImage() {
    final String _sql = "SELECT * FROM Image_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Image_table"}, false, new Callable<List<Image>>() {
      @Override
      public List<Image> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
          final int _cursorIndexOfDocName = CursorUtil.getColumnIndexOrThrow(_cursor, "doctor");
          final List<Image> _result = new ArrayList<Image>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Image _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Bitmap _tmpPhoto;
            final byte[] _tmp;
            if (_cursor.isNull(_cursorIndexOfPhoto)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getBlob(_cursorIndexOfPhoto);
            }
            _tmpPhoto = __converters.toBitmap(_tmp);
            final String _tmpDocName;
            if (_cursor.isNull(_cursorIndexOfDocName)) {
              _tmpDocName = null;
            } else {
              _tmpDocName = _cursor.getString(_cursorIndexOfDocName);
            }
            _item = new Image(_tmpId,_tmpPhoto,_tmpDocName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
