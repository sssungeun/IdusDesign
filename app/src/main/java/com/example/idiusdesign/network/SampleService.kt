package com.example.idiusdesign.network

import retrofit2.Call
import retrofit2.http.GET

interface SampleService {
        @GET("api/users")
        fun getListUser(

        ): Call<SomeObject>

    data class SomeObject(

        val page: Int,
        val per_page: Int,
        val total: Int,
        val total_pages: Int,
        val data: List<OtherObject>

    )

    data class OtherObject(
        val id: Int,
        val first_name: String,
        val last_name: String,
        val avatar: String
    )

}