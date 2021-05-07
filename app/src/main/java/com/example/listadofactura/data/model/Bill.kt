package com.example.listadofactura.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

/**
 * clase tipica POJO
 * Version 2: se modifico la fecha para ser primary key y de añadio un metodo para que fecha lo pase
 * a localDate
 * TODO(hay una forma de no hacer esa modicicacion con una clase para room que se llama conversion)
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
