package com.digistring.hyper.ui.adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.digistring.hyper.R
import com.digistring.hyper.data.model.LinkModel
import com.digistring.hyper.utils.Router

class LinkAdapter : RecyclerView.Adapter<LinkAdapter.ViewHolder>() {

    var data: MutableList<LinkModel> = ArrayList()
    lateinit var context: Context

    fun LinkAdapter(context: Context, superheros: MutableList<LinkModel>) {
        this.context = context
        this.data = superheros
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_home_url, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById(R.id.item_link_name) as TextView
        val layout = view.findViewById(R.id.item_card_view) as CardView
        fun bind(link: LinkModel, context: Context) {
            name.text = link.name
            layout.setCardBackgroundColor(link.color)
            itemView.setOnClickListener {
                Router.toURL(context, link.url)
            }
        }
    }
}