package com.example.myapplication.uploadImage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myapplication/uploadImage/ImageRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allImages", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myapplication/uploadImage/Image;", "getAllImages", "()Landroidx/lifecycle/LiveData;", "imageDao", "Lcom/example/myapplication/uploadImage/ImageDao;", "getImageDao", "()Lcom/example/myapplication/uploadImage/ImageDao;", "imageDataBase", "Lcom/example/myapplication/uploadImage/ImageDataBase;", "getImageDataBase", "()Lcom/example/myapplication/uploadImage/ImageDataBase;", "deleteImage", "", "image", "getImages", "insertImage", "app_release"})
public final class ImageRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.uploadImage.ImageDao imageDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.uploadImage.Image>> allImages = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.uploadImage.ImageDataBase imageDataBase = null;
    
    public ImageRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.uploadImage.ImageDao getImageDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.uploadImage.Image>> getAllImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.uploadImage.ImageDataBase getImageDataBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.uploadImage.Image>> getImages() {
        return null;
    }
    
    public final void insertImage(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.uploadImage.Image image) {
    }
    
    public final void deleteImage(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.uploadImage.Image image) {
    }
}