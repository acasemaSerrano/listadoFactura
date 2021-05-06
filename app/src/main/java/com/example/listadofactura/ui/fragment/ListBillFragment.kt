package com.example.listadofactura.ui.fragment

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadofactura.R
import com.example.listadofactura.adapter.AdapterBill
import com.example.listadofactura.data.model.Filter
import com.example.listadofactura.ui.viewmodel.BillViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ListBillFragment : Fragment() {


    lateinit var adapter: AdapterBill
    private val viewModel: BillViewModel by activityViewModels()


    //region metodos para añadir un menu y ver si se pulsa en un frament
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_list_bill, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_openFilter ->{
                view?.findNavController()?.navigate(R.id.action_ListBill_to_filterBillFragment)
            }
        }
        return super.onOptionsItemSelected(item)
    }
    //endregion


    //region metodos del ciclo de vida
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list_bill, container, false)

        setHasOptionsMenu(true);

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //proceso normal para un recycleview
        //1. Busca recycleview
        val recycleview:RecyclerView = view.findViewById(R.id.listBill)

        //2. Crea y añade un layoutManager
        val layoutManager = LinearLayoutManager(parentFragment?.context,LinearLayoutManager.VERTICAL, false)
        recycleview.layoutManager = layoutManager

        //EXTRA. prepara el disaño del recycleview
        val dividerItemDecoration = DividerItemDecoration(parentFragment?.context, layoutManager.orientation)
        recycleview.addItemDecoration(dividerItemDecoration)

        //3. Crea y añade un Adapter
        this.adapter= AdapterBill(requireContext())
        recycleview.adapter = adapter

        //4 Cuando haya un lista nueva actializo el adapter
        viewModel.getBillLiveData().observe(viewLifecycleOwner, {adapter.setList(it)})

        //5 mando a actualizar la lista (preguntamos si hay conexion a internet)

        val cm = requireContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        val isConnected: Boolean? =activeNetwork?.isConnectedOrConnecting


        GlobalScope.launch {
            if (isConnected != null && isConnected)
                viewModel.downloadJson()
            else
                viewModel.reloadRoom()
        }

    }
    //endregion

}