package com.example.listadofactura.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

/**
 * clase tipica POJO
 */
@Entity
data class Bill (
        var descEstado:String,
        var importeOrdenacion:Double,
        @PrimaryKey var fecha:Long){

    fun getFechaByLocaldate(): LocalDate{
        return LocalDate.ofEpochDay(fecha)
    }
}
