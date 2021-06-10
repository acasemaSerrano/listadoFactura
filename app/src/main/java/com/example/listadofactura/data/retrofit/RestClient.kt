package com.example.listadofactura.data.retrofit

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.example.listadofactura.data.retrofit.GetBillsApi
import com.example.listadofactura.data.retrofit.GetBillsUseCase
import com.google.gson.JsonArray
import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * servicio para que no descarge los datos en el hilo principal
 */
class RestClient  : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    private suspend fun getJsonArray() : JsonArray?{
        var jsonArray : JsonArray? = null
        val coroutine = CoroutineScope(Dispatchers.IO)

        val result : Deferred<JsonArray?> = coroutine.async{
            GetBillsUseCase.getJsonArray(jsonArray)
        }

        return result.await()
    }


    fun returnJsonArray() : JsonArray? = runBlocking {
        getJsonArray()
    }
}