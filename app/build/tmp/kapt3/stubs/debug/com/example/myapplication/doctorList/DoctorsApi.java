package com.example.myapplication.doctorList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/doctorList/DoctorsApi;", "", "getList", "Lretrofit2/Call;", "", "Lcom/example/myapplication/doctorList/Doctors;", "Companion", "app_debug"})
public abstract interface DoctorsApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myapplication.doctorList.DoctorsApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "http://10.0.2.2//")
    public abstract retrofit2.Call<java.util.List<com.example.myapplication.doctorList.Doctors>> getList();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/doctorList/DoctorsApi$Companion;", "", "()V", "invoke", "Lcom/example/myapplication/doctorList/DoctorsApi;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myapplication.doctorList.DoctorsApi invoke() {
            return null;
        }
    }
}