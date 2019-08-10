package com.volvoxglobator.androidosguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class GridAdapter : RecyclerView.Adapter<GridViewHolder>() {

    val data = os_list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.os_list_item, parent, false)

        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val objectItem = data[position]

        holder.osImage.setImageResource(objectItem.img)
    }
}

class GridViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val osImage = v.findViewById<ImageView>(R.id.os_item_image)
}
