package com.example.listadofactura.ui

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.listadofactura.R
import com.example.listadofactura.data.model.Filter
import com.example.listadofactura.databinding.FragmentFilterBillBinding
import com.example.listadofactura.ui.viewmodel.FilterViewModel
import com.google.android.material.slider.RangeSlider
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class FilterBillFragment: Fragment() {

    lateinit  var binding: FragmentFilterBillBinding
    var filter = FilterViewModel()
    val dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        binding = FragmentFilterBillBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_filter_bill, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_closetFilter ->{
                goBack(filter.getFilterLiveData().value)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //esto solo se ejecutara si hesite un filtro, en el caso de ser NULL pasara de largo
        if (filter.getFilterLiveData().value != null)
        init(filter.getFilterLiveData().value!!)

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


        binding.bttEliminarFiltro.setOnClickListener {
            goBack(null)
        }
        binding.bttAplicar.setOnClickListener {
            goBack(finit())
        }

    }



    private fun init(filter: Filter) {
        //fecha
        binding.bttdateFrom.text = filter.dateFrom.format(dateTimeFormatter)
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

        if(binding.cbPagada.isChecked())
            states.add(Filter.State.Pagada)

        if(binding.cbAnulada.isChecked())
            states.add(Filter.State.Anulada)

        if(binding.cbCuotaFigada.isChecked())
            states.add(Filter.State.CuotaFija)

        if(binding.cbPendientePago.isChecked())
            states.add(Filter.State.PendientePago)

        if(binding.cbPlanPago.isChecked())
            states.add(Filter.State.PlanPago)

        return Filter(dateFrom,dateTo, minMoney, maxMoney, states)
    }

    private fun goBack(filter: Filter?) {
        this.filter.set(filter)
        view?.findNavController()?.popBackStack()
    }

    fun buttonListenerWithDate(view: View, buttonView:View){
        val button :Button = view.findViewById(buttonView.id)
        showDatePickerDialog{ view, year, month, dayOfMonth ->
            var ld = LocalDate.of(year, month, dayOfMonth)
            button.text = ld.format(dateTimeFormatter)
        }
    }
    //
    fun showDatePickerDialog(lisener: DatePickerDialog.OnDateSetListener) {
        val datePicker = DatePickerDialog(requireContext())
        datePicker.setOnDateSetListener(lisener)
        datePicker.show()
    }



}