package com.example.idiusdesign.api

import retrofit2.Call
import retrofit2.http.GET

interface Service {
    @GET("/bestSelling")
    fun getBestSelling(): Call<GetSellingObjects>
}