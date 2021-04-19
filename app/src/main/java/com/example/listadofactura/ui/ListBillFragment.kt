package com.example.listadofactura.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadofactura.R
import com.example.listadofactura.adapter.AdapterBill
import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.data.repository.JsonToBill
import com.example.listadofactura.ui.viewmodel.BillViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ListBillFragment : Fragment() {

    lateinit var adapter: AdapterBill
    private val viewModel = BillViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_list_bill, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycleview:RecyclerView = view.findViewById(R.id.listBill)

        val layoutManager = LinearLayoutManager(parentFragment?.context, LinearLayoutManager.VERTICAL, false)
        recycleview.layoutManager = layoutManager

        val dividerItemDecoration = DividerItemDecoration(parentFragment?.context, layoutManager.orientation)
        recycleview.addItemDecoration(dividerItemDecoration)

        this.adapter= AdapterBill(requireContext())
        recycleview.adapter = adapter

        viewModel.getBillLiveData().observe(viewLifecycleOwner, Observer {
            adapter.setList(it)
        })

        viewModel.downloadJson()

    }

}