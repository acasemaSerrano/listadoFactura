package com.example.listadofactura

import android.app.Application
import com.example.listadofactura.data.AppDatabase

class myApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppDatabase.create(this)
    }
}