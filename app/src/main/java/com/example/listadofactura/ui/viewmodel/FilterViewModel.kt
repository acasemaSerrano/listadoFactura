package com.example.listadofactura.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listadofactura.data.model.Filter

class FilterViewModel : ViewModel() {

    private val filterLiveData: MutableLiveData<Filter?> = MutableLiveData()

    fun getFilterLiveData(): MutableLiveData<Filter?> {
        return filterLiveData
    }
    fun set(filter: Filter?){
        filterLiveData.postValue(filter)
    }
}