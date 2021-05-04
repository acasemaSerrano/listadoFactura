package com.example.listadofactura.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.listadofactura.data.AppDatabase
import com.example.listadofactura.data.dao.BillDao
import com.example.listadofactura.data.model.Bill
import java.util.concurrent.ExecutionException

class BillRepository {
    companion object {

        private var billDao: BillDao = AppDatabase.getIntance().BillDao()

        private val billLiveData: MutableLiveData<List<Bill>> = MutableLiveData()

        fun get(): List<Bill> {
             var bills: List<Bill> = arrayListOf()

            try {
                bills = AppDatabase.databaseWriteExecutor.submit{  billDao.getAll()}.get() as List<Bill>
            } catch (e: ExecutionException) {
                e.printStackTrace()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            } finally {
                return bills
            }

        }

        fun add(bill: Bill){
            AppDatabase.databaseWriteExecutor.submit{ billDao.insert(bill)}
        }
        fun addAll(bills: List<Bill>){
            for (bill in bills)
                add(bill)
        }
    }
}