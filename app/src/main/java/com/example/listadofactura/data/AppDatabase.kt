package com.example.listadofactura.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.listadofactura.data.dao.BillDao
import com.example.listadofactura.data.model.Bill

@Database(entities = [Bill::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun BillDao(): BillDao

    companion object{

        private var intance: AppDatabase? = null;

        fun create(context: Context){
            intance = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "database-App"
            ).fallbackToDestructiveMigrationOnDowngrade().build()
        }

        fun getIntance(): AppDatabase{
            return intance!!
        }

    }
}