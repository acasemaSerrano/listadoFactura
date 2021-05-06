package com.example.listadofactura.data.dao

import androidx.room.*
import com.example.listadofactura.data.model.Bill

@Dao
interface BillDao {

    @Query("SELECT * FROM bill")
    suspend fun getAll(): List<Bill>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(bill: Bill)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(bills: List<Bill>)

    @Delete
    suspend fun delete(bill: Bill)

}