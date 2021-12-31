package com.example.myapplication.uploadImage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/example/myapplication/uploadImage/UploadImage;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/myapplication/uploadImage/ImagesAdapter$RowClickListener;", "()V", "doctor", "Landroid/widget/TextView;", "getDoctor", "()Landroid/widget/TextView;", "setDoctor", "(Landroid/widget/TextView;)V", "filePath", "Landroid/net/Uri;", "getFilePath", "()Landroid/net/Uri;", "setFilePath", "(Landroid/net/Uri;)V", "mViewModel", "Lcom/example/myapplication/uploadImage/ImageViewModel;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "picture", "Landroid/widget/ImageView;", "getPicture", "()Landroid/widget/ImageView;", "setPicture", "(Landroid/widget/ImageView;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteImageClickListener", "image", "Lcom/example/myapplication/uploadImage/Image;", "onItemClickListener", "app_release"})
public final class UploadImage extends androidx.appcompat.app.AppCompatActivity implements com.example.myapplication.uploadImage.ImagesAdapter.RowClickListener {
    private com.example.myapplication.uploadImage.ImageViewModel mViewModel;
    public android.net.Uri filePath;
    public android.widget.ImageView picture;
    public android.widget.TextView doctor;
    public java.lang.String name;
    
    public UploadImage() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getFilePath() {
        return null;
    }
    
    public final void setFilePath(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getPicture() {
        return null;
    }
    
    public final void setPicture(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDoctor() {
        return null;
    }
    
    public final void setDoctor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
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