package com.example.listadofactura.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.listadofactura.data.model.Bill

@Dao
interface BillDao {

    @Query("SELECT * FROM bill")
    fun getAll(): List<Bill>

    @Insert
    fun insert(bill: Bill)

    @Delete
    fun delete(bill: Bill)

}