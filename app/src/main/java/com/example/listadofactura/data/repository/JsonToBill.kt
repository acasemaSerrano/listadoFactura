package com.example.listadofactura.data.repository


import com.example.listadofactura.data.model.Bill
import com.google.gson.JsonArray
import java.math.BigDecimal
import java.math.RoundingMode
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class JsonToBill() {

    companion object {

        private lateinit var mutableList: MutableList<Bill>

        /**
         * aqui se recoge el json y lo vuelve una lista de Bill(facturas)
         */
        fun parseToList(json: JsonArray?): List<Bill> {
            mutableList = mutableListOf()
            json?.forEach {
                mutableList.add(
                        Bill(
                                it.asJsonObject.get("descEstado").toString()
                                        .substring(1, it.asJsonObject.get("descEstado").toString().length - 1),
                                BigDecimal(it.asJsonObject.get("importeOrdenacion").asDouble).setScale(
                                        2,
                                        RoundingMode.HALF_EVEN
                                ).toDouble(),
                                dateParser(
                                        it.asJsonObject.get("fecha").toString()
                                                .substring(1, it.asJsonObject.get("fecha").toString().length - 1)
                                )
                        )
                )
            }
            //aqui se ordena por fecha
            mutableList.sortedBy {
                it.fecha
            }
            return mutableList
        }
        /**
         * Recoge las fechas del json (07/02/2021) y lo convierte a localDate
         */
        fun dateParser(dateJson: String): LocalDate {
            val initialFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            return LocalDate.parse(dateJson, initialFormat)
        }

        /**
         * Recoge las fechas del json (07/02/2021) y lo convierte a (07 Feb. 2021)
         */
        fun dateParserPrint(dateJson: String): String {
            val initialFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            val finalFormat = DateTimeFormatter.ofPattern("dd MMM yyyy")
            val date = LocalDate.parse(dateJson, initialFormat)
            return date.format(finalFormat)
        }
    }
}