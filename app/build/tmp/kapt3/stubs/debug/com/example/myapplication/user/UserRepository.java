package com.example.myapplication.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0016\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/example/myapplication/user/UserRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allUsers", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myapplication/user/User;", "getAllUsers", "()Landroidx/lifecycle/LiveData;", "userDao", "Lcom/example/myapplication/user/UserDao;", "getUserDao", "()Lcom/example/myapplication/user/UserDao;", "userDatabase", "Lcom/example/myapplication/user/UserDatabase;", "getUserDatabase", "()Lcom/example/myapplication/user/UserDatabase;", "checkExistUser", "", "name", "", "code", "deleteUsers", "", "user", "getUsers", "insertUsers", "loginUsers", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.user.UserDao userDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.user.User>> allUsers = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.user.UserDatabase userDatabase = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.user.UserDao getUserDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.user.User>> getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.user.UserDatabase getUserDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.user.User>> getUsers() {
        return null;
    }
    
    public final void insertUsers(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.user.User user) {
    }
    
    public final void deleteUsers(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.user.User user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.user.User loginUsers(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    public final boolean checkExistUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return false;
    }
}