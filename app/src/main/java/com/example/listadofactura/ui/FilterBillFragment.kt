package com.example.listadofactura.ui

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.listadofactura.R
import com.example.listadofactura.data.model.Filter
import com.example.listadofactura.databinding.FragmentFilterBillBinding
import com.example.listadofactura.ui.viewmodel.BillViewModel
import com.google.android.material.slider.RangeSlider
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class FilterBillFragment: Fragment() {

    lateinit  var binding: FragmentFilterBillBinding
    private val viewModel: BillViewModel by activityViewModels()
    val dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")


    //region metodos para añadir un menu y ver si se pulsa en un frament
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_filter_bill, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_closetFilter ->{
                goBack(viewModel.getFilter())
            }
        }
        return super.onOptionsItemSelected(item)
    }
    //endregion


    //region metodos del ciclo de vida
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        binding = FragmentFilterBillBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (viewModel.getFilter() != null) {
            init(viewModel.getFilter()!!)
        }

        // preparacion de los lisener para el filtro
        binding.bttdateFrom.setOnClickListener { button-> buttonListenerWithDate(view, button)/*setMinDateForDateTo()*/ }
        binding.bttDateTo.setOnClickListener { button-> buttonListenerWithDate(view, button)/*setMaxDateForDateFrom()*/ }
        binding.sldImporte.addOnSliderTouchListener(object : RangeSlider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: RangeSlider) {
            }
            override fun onStopTrackingTouch(slider: RangeSlider) {
                binding.tvMinMoney.text = slider.values[0].toInt().toString() + "€"
                binding.tvMaxMoney.text = slider.values[1].toInt().toString()+ "€"
            }
        })


        //preparacion de los lisener de salida de la aplicacion
        binding.bttEliminarFiltro.setOnClickListener { goBack(null) }
        binding.bttAplicar.setOnClickListener { goBack(finit()) }

    }
    //endregion

    /**
     * clase qur inicializa en caso que haya filtro
     */
    private fun init(filter: Filter) {
        //fecha
        if (filter.dateFrom != LocalDate.MIN)
            binding.bttdateFrom.text = filter.dateFrom.format(dateTimeFormatter)
        if (filter.dateTo != LocalDate.MAX)
            binding.bttDateTo.text = filter.dateTo.format(dateTimeFormatter)

        //precio
        binding.tvMinMoney.text = filter.minMoney.toString() + "€"
        binding.tvMaxMoney.text = filter.maxMoney.toString() + "€"
        binding.sldImporte.values = listOf(filter.minMoney.toFloat(), filter.maxMoney.toFloat())

        //estado
        for (state: String in filter.states) {
            if(state == Filter.State.Pagada)
                binding.cbPagada.isChecked = true

            if(state == Filter.State.Anulada)
                binding.cbAnulada.isChecked = true

            if(state == Filter.State.CuotaFija)
                binding.cbCuotaFigada.isChecked = true

            if(state == Filter.State.PendientePago)
                binding.cbPendientePago.isChecked = true

            if(state == Filter.State.PlanPago)
                binding.cbPlanPago.isChecked = true
        }

    }

    /**
     * clase que recoje el filtro
     */
    private fun finit():Filter{

        //este es un tratamiento an caso de no selecionar ninguna fecha para no dar error
        var dateFrom = LocalDate.MIN
        if (binding.bttdateFrom.text != resources.getString(R.string.dateFormat))
            dateFrom = LocalDate.parse(binding.bttdateFrom.text, dateTimeFormatter)

        var dateTo = LocalDate.MAX
        if (binding.bttDateTo.text != resources.getString(R.string.dateFormat))
            dateTo = LocalDate.parse(binding.bttDateTo.text, dateTimeFormatter)

        var minMoney = binding.sldImporte.values[0].toInt()
        var maxMoney = binding.sldImporte.values[1].toInt()

        var states = arrayListOf<String>()

        if(binding.cbPagada.isChecked)
            states.add(Filter.State.Pagada)

        if(binding.cbAnulada.isChecked)
            states.add(Filter.State.Anulada)

        if(binding.cbCuotaFigada.isChecked)
            states.add(Filter.State.CuotaFija)

        if(binding.cbPendientePago.isChecked)
            states.add(Filter.State.PendientePago)

        if(binding.cbPlanPago.isChecked)
            states.add(Filter.State.PlanPago)

        return Filter(dateFrom,dateTo, minMoney, maxMoney, states)
    }

    /**
     * clase que va a listBill con o sin filtro(en ca so de sin filtro sera null)
     */
    private fun goBack(filter: Filter?) {
        viewModel.setFilter(filter)
        view?.findNavController()?.popBackStack()
    }

    /**
     * clase para los botones que abre el datePiker
     */
    fun buttonListenerWithDate(view: View, buttonView:View){
        val button :Button = view.findViewById(buttonView.id)
        showDatePickerDialog{ view, year, month, dayOfMonth ->
            var ld = LocalDate.of(year, month+1, dayOfMonth)
            button.text = ld.format(dateTimeFormatter)
        }
    }

    /**
     * clase que prepara el datePiker
     */
    fun showDatePickerDialog(lisener: DatePickerDialog.OnDateSetListener) {
        val datePicker = DatePickerDialog(requireContext())
        datePicker.setOnDateSetListener(lisener)
        datePicker.show()
    }



}