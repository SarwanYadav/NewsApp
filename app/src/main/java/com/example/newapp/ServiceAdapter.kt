package com.example.newapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ServiceAdapter(var arrayList: ArrayList<User>, var context: Context) :
    RecyclerView.Adapter<ServiceAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return MyViewHolder(itemView)



    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.HImage.setImageResource(arrayList[position].image)
        holder.hTitle.setText(arrayList[position].name)
    }



    override fun getItemCount(): Int {
        return arrayList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val hTitle = itemView.findViewById<TextView>(R.id.txtName)
        val HImage = itemView.findViewById<ImageView>(R.id.imgfruit)



    }


}