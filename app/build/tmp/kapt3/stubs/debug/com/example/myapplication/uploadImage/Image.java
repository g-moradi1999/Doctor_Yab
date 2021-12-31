package com.example.myapplication.uploadImage;

import java.lang.System;

@androidx.room.Entity(tableName = "Image_table")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/myapplication/uploadImage/Image;", "", "id", "", "photo", "Landroid/graphics/Bitmap;", "docName", "", "(ILandroid/graphics/Bitmap;Ljava/lang/String;)V", "getDocName", "()Ljava/lang/String;", "getId", "()I", "getPhoto", "()Landroid/graphics/Bitmap;", "app_debug"})
public final class Image {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "photo")
    private final android.graphics.Bitmap photo = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "doctor")
    private final java.lang.String docName = null;
    
    public Image(int id, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap photo, @org.jetbrains.annotations.NotNull()
    java.lang.String docName) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDocName() {
        return null;
    }
}