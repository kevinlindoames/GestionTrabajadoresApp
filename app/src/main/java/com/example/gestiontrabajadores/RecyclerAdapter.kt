package com.example.gestiontrabajadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val list:ArrayList<MyDataItem>,val context: Context):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val txtIds:TextView=itemView.findViewById(R.id.txtId)

        val txtNombres:TextView=itemView.findViewById(R.id.txtNombre)

        val txtApellidos:TextView=itemView.findViewById(R.id.txtApellido)

        val txtDnis:TextView=itemView.findViewById(R.id.txtDni)

        val txtTelefonos:TextView=itemView.findViewById(R.id.txtTelefono)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.design_layout,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
      return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val currentItem=list[position]
        holder.apply {
            txtIds.text=currentItem.id.toString()
            txtNombres.text=currentItem.nombre
            txtApellidos.text=currentItem.apellido
            txtDnis.text=currentItem.dni
            txtTelefonos.text=currentItem.telefono



        }
    }
}