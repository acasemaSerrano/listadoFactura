package com.example.listadofactura.data.retrofit

import retrofit2.Call
import retrofit2.http.GET
import com.google.gson.JsonObject

interface JsonPlaceHolderApi {

    @GET("facturas")
    fun getAllBill(): Call<JsonObject>
}