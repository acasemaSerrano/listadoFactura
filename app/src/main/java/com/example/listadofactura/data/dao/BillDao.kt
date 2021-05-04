package com.example.listadofactura.data.dao

import androidx.room.*
import com.example.listadofactura.data.model.Bill

@Dao
interface BillDao {

    @Query("SELECT * FROM bill")
    fun getAll(): List<Bill>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(bill: Bill)

    @Delete
    fun delete(bill: Bill)

}