package com.example.myapplication.user;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\'J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myapplication/user/UserDao;", "", "checkExist", "", "name", "", "code", "deleteUser", "", "user", "Lcom/example/myapplication/user/User;", "getAllUsers", "Landroidx/lifecycle/LiveData;", "", "insertUser", "loginUser", "app_release"})
public abstract interface UserDao {
    
    @androidx.room.Insert()
    public abstract void insertUser(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.user.User user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.user.User>> getAllUsers();
    
    @androidx.room.Delete()
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.user.User user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM USER_TABLE WHERE name = :name AND code = :code")
    public abstract com.example.myapplication.user.User loginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    @androidx.room.Query(value = "SELECT EXISTS (SELECT * FROM user_table WHERE name = :name AND code = :code)")
    public abstract boolean checkExist(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String code);
}