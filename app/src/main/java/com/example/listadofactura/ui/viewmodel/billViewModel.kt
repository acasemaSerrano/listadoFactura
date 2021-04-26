package com.example.listadofactura.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.data.model.Filter
import com.example.listadofactura.data.repository.JsonToBill
import com.example.listadofactura.ui.DowloadService
import kotlin.streams.toList

/**
 * comparte
 */
class BillViewModel : ViewModel() {

    private val billLiveData: MutableLiveData<List<Bill>> = MutableLiveData()
    private var filter: Filter? = null
    private val service = DowloadService()

    /**
     * Descarga el json y lo guarda
     */
    fun downloadJson() {
        if(filter == null)
            billLiveData.postValue(JsonToBill.parseToList(service.returnJsonArray()))
        else{
            var unFilterList = JsonToBill.parseToList(service.returnJsonArray())
            var filterList = unFilterList.stream()
                    .filter { it.importeOrdenacion >= filter!!.minMoney}
                    .filter { it.importeOrdenacion <= filter!!.maxMoney}
                    .filter { it.fecha >= filter!!.dateFrom}
                    .filter { it.fecha <= filter!!.dateTo}
                    .filter { filter!!.states.contains(it.descEstado) }
            billLiveData.postValue(filterList.toList())
        }
    }

    fun getBillLiveData(): MutableLiveData<List<Bill>>{
        return billLiveData
    }

    fun getFilter(): Filter? {
        return filter
    }

    fun setFilter(filter: Filter?){
        this.filter=filter
    }

}