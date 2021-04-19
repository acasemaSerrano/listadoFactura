package com.example.listadofactura.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.listadofactura.R
import com.example.listadofactura.data.model.Bill
import com.example.listadofactura.data.repository.JsonToBill

class AdapterBill(val context:Context, var list: ArrayList<Bill>): RecyclerView.Adapter<AdapterBill.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.items_bill,parent,false)
        return Viewholder(v)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }




    inner class Viewholder(view: View): RecyclerView.ViewHolder(view){
        fun bindItems(data: Bill){
            val tvDate:TextView = itemView.findViewById(R.id.tvDate)
            val tvMoney:TextView = itemView.findViewById(R.id.tvMoney)
            val tvState:TextView = itemView.findViewById(R.id.tvState)

            tvDate.text = JsonToBill.dateParserPrint(data.fecha.toString())
            tvMoney.text = "${data.importeOrdenacion}€"
            tvState.text =if (data.descEstado.equals("Pagada")) "" else data.descEstado

            itemView.setOnClickListener{
                Toast.makeText(context, data.toString(), Toast.LENGTH_LONG).show()
            }
        }
    }


}