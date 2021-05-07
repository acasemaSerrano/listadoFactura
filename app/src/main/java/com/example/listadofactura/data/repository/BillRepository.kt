package com.example.listadofactura.data.repository

import com.example.listadofactura.data.AppDatabase
import com.example.listadofactura.data.dao.BillDao
import com.example.listadofactura.data.model.Bill

/**
 * clase estandar de repositorio para room
 * TODO(podria añadir mas metodos pero esto son los que se usan)
 */
class BillRepository {
    companion object {

        private var billDao: BillDao = AppDatabase.getIntance().BillDao()


        suspend fun get(): List<Bill> {
            return billDao.getAll()
        }

        suspend fun addAll(bills: List<Bill>){
            billDao.insert(bills)
        }
    }
}