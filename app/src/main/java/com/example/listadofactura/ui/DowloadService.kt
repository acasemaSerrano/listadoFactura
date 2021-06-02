package com.example.listadofactura.ui

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.example.listadofactura.data.retrofit.GetBillsApi
import com.google.gson.JsonArray
import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * servicio para que no descarge los datos en el hilo principal
 */
class DowloadService  : Service() {

    private var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://viewnextandroid.mocklab.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


    private suspend fun getJsonArray() : JsonArray?{
        var jsonArray : JsonArray? = null
        val coroutine = CoroutineScope(Dispatchers.IO)

        val result : Deferred<JsonArray?> = coroutine.async{
            val call = retrofit.create(GetBillsApi::class.java).getAllBill().execute()
            if (call.isSuccessful) {
                jsonArray = call.body()!!.get("facturas").asJsonArray
            }
            else
                Log.e("json","Error no se ha podido cargar el json")
            jsonArray
        }

        return result.await()
    }

    fun returnJsonArray() : JsonArray? = runBlocking {
        getJsonArray()
    }
}