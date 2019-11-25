package com.example.idiusdesign.api



data class GetSellingObjects(
    val success: Boolean,
    val message: String,
    val data: ArrayList<DataBestSelling>?
)


data class DataBestSelling (
    val idx: Int,
    val img: String,
    val sellerImg: String,
    val seller: String,
    val desc: String,
    val isStar: Boolean
)
