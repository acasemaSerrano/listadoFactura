package com.example.listadofactura.data.retrofit

import android.util.Log
import com.google.gson.JsonArray
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GetBillsUseCase {



    companion object {
        private var retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://viewnextandroid.mocklab.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun getJsonArray(jsonArray: JsonArray?): JsonArray? {
            var jsonArray1 = jsonArray
            val call = retrofit.create(GetBillsApi::class.java).getAllBill().execute()
            if (call.isSuccessful) {
                jsonArray1 = call.body()!!.get("facturas").asJsonArray
            } else
                Log.e("json", "Error no se ha podido cargar el json")
            return jsonArray1
        }
    }
}