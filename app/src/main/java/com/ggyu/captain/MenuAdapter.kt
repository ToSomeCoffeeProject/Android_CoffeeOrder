package com.ggyu.captain

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuAdapter : RecyclerView.Adapter<MenuViewHolder>() {

    val menu = arrayOf("아메리카노", "카페라떼", "카푸치노", "카페모카")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false))
    }

    override fun getItemCount(): Int = menu.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        Log.i("adapter", "menu ${position}: ${menu[position]}")
        holder.itemView.menuName.text = menu[position]
    }

}