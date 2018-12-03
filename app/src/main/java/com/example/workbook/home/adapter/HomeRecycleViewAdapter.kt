package com.example.workbook.home.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.workbook.R
import com.example.workbook.base.adapter.BaseRecycleViewAdapter
import com.example.workbook.home.adapter.viewholder.HomeRecycleViewHolder
import io.reactivex.observers.DisposableObserver
import java.util.*
import io.reactivex.subjects.PublishSubject



class HomeRecycleViewAdapter : BaseRecycleViewAdapter<HomeRecycleViewHolder>() {

    private var visibleItems = TreeSet<Int>()
    val dataSubject = PublishSubject.create<Int>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): HomeRecycleViewHolder {
        return HomeRecycleViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.home_activity_recyle_list_item, viewGroup, false))
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: HomeRecycleViewHolder, position: Int) {
        holder.bind()
        visibleItems.add(holder.adapterPosition)
        Log.d("myLogs", String.format("attached = %s", visibleItems.toString()))
    }

    override fun onViewRecycled(holder: HomeRecycleViewHolder) {
        super.onViewRecycled(holder)
        visibleItems.remove(holder.adapterPosition)
        Log.d("myLogs", String.format("attached %s", visibleItems.toString()))

    }

}