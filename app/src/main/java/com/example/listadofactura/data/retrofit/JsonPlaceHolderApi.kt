package com.example.listadofactura.data.retrofit

import retrofit2.Call
import retrofit2.http.GET
import com.google.gson.JsonObject

/**
 * interfac que se pide para retrofit
 */
interface JsonPlaceHolderApi {

    @GET("facturas")
    fun getAllBill(): Call<JsonObject>
}