package com.example.workbook.home

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.workbook.R
import com.example.workbook.base.activity.BaseActivity
import com.example.workbook.home.adapter.HomeRecycleViewAdapter
import com.example.workbook.view.VerticalRecycleView

class HomeActivity : BaseActivity() {

    private lateinit var mVerticalRecycleView : VerticalRecycleView
    private lateinit var mHomeRecycleViewAdapter : HomeRecycleViewAdapter
    private lateinit var mLayoutManager : LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        mVerticalRecycleView = findViewById(R.id.home_vertical_recycle_view)
        initAdapter()
    }

    private fun initAdapter(){
        mHomeRecycleViewAdapter = HomeRecycleViewAdapter()
        mLayoutManager = LinearLayoutManager(this)
        mVerticalRecycleView.layoutManager = mLayoutManager
        mVerticalRecycleView.adapter = mHomeRecycleViewAdapter
    }
}