package com.example.listadofactura

import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.data.repository.BillRepository
import com.example.listadofactura.data.repository.JsonToBill
import com.example.listadofactura.ui.DowloadService
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import com.google.gson.JsonStreamParser
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {

    lateinit var service : DowloadService

    @Before
    fun init(){
        service = DowloadService()
    }

    /**
     * ** DowloadService.returnJsonArray **
     * compueba que la conexion al servidor es corecta al devuelbe un JsonArray
     */
    @Test
    fun returnJsonArrayNotNull(){
        assertNotNull(service.returnJsonArray())
    }

    /**
     * ** DowloadService.returnJsonArray **
     * comprueva que el servidor no devuelva una lista vacia
     */
    @Test
    fun returnJsonArrayIsNotZero(){
        assert(service.returnJsonArray()!!.size() > 0)
    }

    /**
     * ** JsonToBill.parseToList **
     * Comprueva que JsonToBill.parseToList convierte el JsonArray en List<bill>
     */
    @Test
    fun jsonArrayParseListBill(){
        //contruccion del JsonArray
        //determinar un json posible en Strin
        var strinJson = "{\"descEstado\": \"Pendiente de pago\",\"importeOrdenacion\": 1.5600000000000001,\"fecha\": \"07/02/2019\"}"
        var jsonArray = JsonArray()
        //convierte el strin en jsonElement y lo añades a un JsonArray
        jsonArray.add(JsonParser().parse(strinJson))

        var bills = JsonToBill.parseToList(jsonArray)

        assertNotNull(bills)
    }
    /**
     * ** JsonToBill.parseToList **
     * Comprueva que JsonToBill.parseToList convierte el JsonArray en List<bill> es corecta al
     * devolver el vil de la posicion 0 bill igual otro
     */
    @Test
    fun jsonArrayElementBill(){
        var strinJson = "{\"descEstado\": \"Pendiente de pago\",\"importeOrdenacion\": 1.56,\"fecha\": \"07/02/2019\"}"

        var jsonArray = JsonArray()
        jsonArray.add(JsonParser().parse(strinJson))

        var dowloadBill = JsonToBill.parseToList(jsonArray)[0]

        val formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        var createdBill = Bill("Pendiente de pago",1.56, LocalDate.parse("07/02/2019", formatDate).toEpochDay())

        assertEquals(dowloadBill, createdBill)
    }

    /**
     * comprueva que el sevidor esta devolviendo una lista de bill
     */
    @Test
    fun jsonArrayElementToBill(){
        var bills =  JsonToBill.parseToList(service.returnJsonArray())
        assertNotNull(bills)
    }


}