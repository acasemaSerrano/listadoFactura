package com.example.listadofactura.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.ui.DowloadService

class billViewModel : ViewModel() {

    val billLiveData: MutableLiveData<List<Bill>> = MutableLiveData()
    private val service = DowloadService()
    var listFactura: List<Bill> = listOf()

    /**
     * Descarga el json y lo guarda
     */
    fun downloadJson() {
        if (listFactura.isNullOrEmpty()) {
            val jsonFactura = service.returnJsonArray()
            billLiveData.postValue(listFactura)
        }
    }


}