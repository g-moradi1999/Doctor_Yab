package com.example.myapplication.doctorList

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


const val BaseUrl = "http://10.0.2.2//"

interface DoctorsApi {
    @GET("http://10.0.2.2//")
    fun getList(): Call<List<Doctors>>

    companion object {
        operator fun invoke(): DoctorsApi {
            val logger: HttpLoggingInterceptor =
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            val okHttp: OkHttpClient.Builder = OkHttpClient.Builder().addInterceptor(logger)

            return Retrofit.Builder().baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create()).client(okHttp.build())
                .build()
                .create(DoctorsApi::class.java)
        }
    }
}


