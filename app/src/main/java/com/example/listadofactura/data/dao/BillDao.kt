package com.example.listadofactura.data.dao

import androidx.room.*
import com.example.listadofactura.data.model.Bill

/**
 * dao estandar
 */
@Dao
interface BillDao {

    @Query("SELECT * FROM bill")
    suspend fun getAll(): List<Bill>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(bills: List<Bill>)

}