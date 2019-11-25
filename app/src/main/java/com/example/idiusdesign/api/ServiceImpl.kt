package com.example.idiusdesign.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceImpl {

    val BASE_URL = "http://54437277.ngrok.io"
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val serviceImpl = retrofit.create(Service::class.java)
}