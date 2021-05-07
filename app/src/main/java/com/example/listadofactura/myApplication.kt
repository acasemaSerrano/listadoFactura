package com.example.listadofactura

import android.app.Application
import com.example.listadofactura.data.AppDatabase

/**
 * se añadio al manifiest
 * se usa para crear una sola intancia de la base de datos y pasarle el contecto desde aqui
 */
class myApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppDatabase.create(this)
    }
}