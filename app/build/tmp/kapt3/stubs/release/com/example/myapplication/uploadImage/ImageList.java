package com.example.myapplication.uploadImage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/myapplication/uploadImage/ImageList;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/myapplication/uploadImage/ImagesAdapter$RowClickListener;", "()V", "dataList", "Ljava/util/ArrayList;", "Lcom/example/myapplication/uploadImage/Image;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "mViewModel", "Lcom/example/myapplication/uploadImage/ImageViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteImageClickListener", "image", "onItemClickListener", "app_release"})
public final class ImageList extends androidx.appcompat.app.AppCompatActivity implements com.example.myapplication.uploadImage.ImagesAdapter.RowClickListener {
    private com.example.myapplication.uploadImage.ImageViewModel mViewModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myapplication.uploadImage.Image> dataList;
    
    public ImageList() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myapplication.uploadImage.Image> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myapplication.uploadImage.Image> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDeleteImageClickListener(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.uploadImage.Image image) {
    }
    
    @java.lang.Override()
    public void onItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.uploadImage.Image image) {
    }
}