package com.example.listadofactura.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.data.model.Filter
import com.example.listadofactura.data.repository.JsonToBill
import com.example.listadofactura.ui.DowloadService
import java.util.stream.Collector
import java.util.stream.Collectors.toList
import kotlin.streams.toList

class BillViewModel : ViewModel() {

    private val billLiveData: MutableLiveData<List<Bill>> = MutableLiveData()
    private val filterLiveData: MutableLiveData<Filter?> = MutableLiveData()
    private val service = DowloadService()

    /**
     * Descarga el json y lo guarda
     */
    fun downloadJson() {
        if(filterLiveData.value == null)
            billLiveData.postValue(JsonToBill.parseToList(service.returnJsonArray()))
        else{
            var unFilterList = JsonToBill.parseToList(service.returnJsonArray())
            var filterList = unFilterList.stream()
                    .filter { it.importeOrdenacion >= filterLiveData.value!!.minMoney}
                    .filter { it.importeOrdenacion <= filterLiveData.value!!.maxMoney}
                    .filter { it.fecha >= filterLiveData.value!!.dateFrom}
                    .filter { it.fecha <= filterLiveData.value!!.dateTo}
                    .filter { filterLiveData.value!!.states.contains(it.descEstado) }
            billLiveData.postValue(filterList.toList())
        }
    }

    fun getBillLiveData(): MutableLiveData<List<Bill>>{
        return billLiveData
    }

    fun getFilterLiveData(): MutableLiveData<Filter?> {
        return filterLiveData
    }

    fun setFilterLiveData(filter: Filter?){
        filterLiveData.postValue(filter)
    }

}