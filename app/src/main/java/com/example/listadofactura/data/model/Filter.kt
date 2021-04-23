package com.example.listadofactura.data.model

import java.time.LocalDate

data class Filter(var dateFrom:LocalDate, var dateTo:LocalDate, var minMoney:Int, var maxMoney:Int, var states:List<String>) {


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