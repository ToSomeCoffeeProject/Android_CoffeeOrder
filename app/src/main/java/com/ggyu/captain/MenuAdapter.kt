package com.ggyu.captain

import android.support.v7.widget.RecyclerView
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
        holder.itemView.menuName.text = menu[position]
    }

}

class MenuAdapter_Tea : RecyclerView.Adapter<MenuViewHolder>() {

    val menu = arrayOf("얼그레이", "레몬차", "녹차", "유자차")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false))
    }

    override fun getItemCount(): Int = menu.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.itemView.menuName.text = menu[position]
    }

}

class MenuAdapter_Beverage : RecyclerView.Adapter<MenuViewHolder>() {

    val menu = arrayOf("초코라떼", "민트초코프라푸치노", "오곡라떼", "녹차라떼")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false))
    }

    override fun getItemCount(): Int = menu.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.itemView.menuName.text = menu[position]
    }

}