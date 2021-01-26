package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmanifest.R
import com.example.androidmanifest.icons

class IconAdapter(private var icons: List<icons>):
    RecyclerView.Adapter<IconAdapter.IconViewHolder>() {
    class IconViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titleTextView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.icon_item, parent, false)
        return IconViewHolder(view)
    }

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        val i = icons[position]
        holder.imageView.setImageResource(i.image)
        holder.titleTextView.text = i.title
    }

    override fun getItemCount(): Int = icons.size
}