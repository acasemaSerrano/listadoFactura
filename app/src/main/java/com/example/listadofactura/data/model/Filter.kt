package com.example.listadofactura.data.model

import java.time.LocalDate

/**
 * clase filtro podria pasar por clase POJO, sirbe para filtrar los bills
 */
data class Filter(var dateFrom:LocalDate, var dateTo:LocalDate, var minMoney:Int, var maxMoney:Int, var states:List<String>) {

    /**
     * clase estatica para los elementos posibles de states de la clase padre
     * Se podia canbiar por una enumeracion con posivilidad de varias
     */
     class State{
         companion object{
             var Pagada = "Pagada"
             var Anulada = "Anulada"
             var CuotaFija = "Cuota Fija"
             var PendientePago = "Pendiente de pago"
             var PlanPago = "Plan de pago"
        }
    }
}