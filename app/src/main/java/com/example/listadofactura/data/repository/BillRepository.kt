package com.example.listadofactura.data.repository

import com.example.listadofactura.data.AppDatabase
import com.example.listadofactura.data.dao.BillDao
import com.example.listadofactura.data.model.Bill

class BillRepository {
    companion object {
        private var billDao: BillDao = AppDatabase.getIntance().BillDao()

        fun get(): List<Bill> {
            return billDao.getAll()
        }
        fun add(bill:Bill){
            billDao.insert(bill)
        }
        fun addAll(bills: List<Bill>){
            for (bill in bills)
                add(bill)
        }
    }
}