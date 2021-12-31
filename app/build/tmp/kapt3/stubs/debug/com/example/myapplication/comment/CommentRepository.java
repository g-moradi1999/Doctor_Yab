package com.example.myapplication.comment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myapplication/comment/CommentRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allComments", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myapplication/comment/Comment;", "getAllComments", "()Landroidx/lifecycle/LiveData;", "commentDao", "Lcom/example/myapplication/comment/CommentDao;", "getCommentDao", "()Lcom/example/myapplication/comment/CommentDao;", "commentDatabase", "Lcom/example/myapplication/comment/CommentDataBase;", "getCommentDatabase", "()Lcom/example/myapplication/comment/CommentDataBase;", "deleteComment", "", "comment", "getComments", "insertComment", "app_debug"})
public final class CommentRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.comment.CommentDao commentDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.comment.Comment>> allComments = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.comment.CommentDataBase commentDatabase = null;
    
    public CommentRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.comment.CommentDao getCommentDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.comment.Comment>> getAllComments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.comment.CommentDataBase getCommentDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.comment.Comment>> getComments() {
        return null;
    }
    
    public final void insertComment(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.comment.Comment comment) {
    }
    
    public final void deleteComment(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.comment.Comment comment) {
    }
}