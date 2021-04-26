package com.example.listadofactura.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.data.model.Filter
import com.example.listadofactura.data.repository.JsonToBill
import com.example.listadofactura.data.retrofit.JsonPlaceHolderApi
import com.example.listadofactura.ui.DowloadService

class BillViewModel : ViewModel() {

    private val billLiveData: MutableLiveData<List<Bill>> = MutableLiveData()
    private val filterLiveData: MutableLiveData<Filter?> = MutableLiveData()
    private val service = DowloadService()

    /**
     * Descarga el json y lo guarda
     */
    fun downloadJson() {
        billLiveData.postValue(JsonToBill.parseToList(service.returnJsonArray()))
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