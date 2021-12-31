package com.example.myapplication.comment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/myapplication/comment/CommentsList;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/myapplication/comment/CommentAdapter$RowClickListener;", "()V", "dataList", "Ljava/util/ArrayList;", "Lcom/example/myapplication/comment/Comment;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "mCommentViewModel", "Lcom/example/myapplication/comment/CommentViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteCommentClickListener", "comment", "onItemClickListener", "app_debug"})
public final class CommentsList extends androidx.appcompat.app.AppCompatActivity implements com.example.myapplication.comment.CommentAdapter.RowClickListener {
    private com.example.myapplication.comment.CommentViewModel mCommentViewModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myapplication.comment.Comment> dataList;
    
    public CommentsList() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myapplication.comment.Comment> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myapplication.comment.Comment> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDeleteCommentClickListener(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.comment.Comment comment) {
    }
    
    @java.lang.Override()
    public void onItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.comment.Comment comment) {
    }
}