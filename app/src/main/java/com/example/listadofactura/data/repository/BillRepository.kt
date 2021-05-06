package com.example.listadofactura.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.listadofactura.data.AppDatabase
import com.example.listadofactura.data.dao.BillDao
import com.example.listadofactura.data.model.Bill

class BillRepository {
    companion object {

        private var billDao: BillDao = AppDatabase.getIntance().BillDao()

        private val billLiveData: MutableLiveData<List<Bill>> = MutableLiveData()

        suspend fun get(): List<Bill> {
            return billDao.getAll()
        }

        suspend fun add(bill: Bill){
            billDao.insert(bill)
        }

        suspend fun addAll(bills: List<Bill>){
            billDao.insert(bills)
        }
    }
}