package com.example.workbook.home.adapter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.workbook.R

class HomeRecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    private var mItemIndexTv : TextView = itemView.findViewById(R.id.item_index_tv)

    fun bind(){
        mItemIndexTv.text = adapterPosition.toString()
    }
}