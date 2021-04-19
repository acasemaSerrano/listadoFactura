package com.example.listadofactura.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadofactura.R
import com.example.listadofactura.adapter.AdapterBill
import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.data.repository.JsonToBill

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ListBill : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_bill, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycleview:RecyclerView = view.findViewById(R.id.listBill)
        recycleview.layoutManager = LinearLayoutManager(parentFragment?.context, LinearLayoutManager.VERTICAL, false)



        val bills:ArrayList<Bill> =
            JsonToBill.parseToList(DowloadService().returnJsonArray()) as ArrayList<Bill>;

        val adapter= AdapterBill(requireContext(), bills)

        recycleview.adapter = adapter

    }

}