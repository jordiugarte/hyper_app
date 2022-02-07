package com.digistring.hyper.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digistring.hyper.R
import com.digistring.hyper.data.LinkRepository
import com.digistring.hyper.data.model.LinkModel
import com.digistring.hyper.ui.adapter.LinkAdapter

class HomeActivity : AppCompatActivity() {

    private val context: Context = this;

    lateinit var linkList: MutableList<LinkModel>

    lateinit var linkRecyclerView: RecyclerView
    lateinit var linkAdapter: LinkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        getData()
        initViews()
    }

    private fun getData() {
        //TODO MOCKED
        linkList = LinkRepository.getRepositoriesList()
    }

    private fun initViews() {
        linkAdapter = LinkAdapter()
        linkRecyclerView = findViewById(R.id.url_recycler)
        linkRecyclerView.setHasFixedSize(true)
        linkRecyclerView.layoutManager = GridLayoutManager(context, 3)
        linkAdapter.LinkAdapter(context, linkList)
        linkRecyclerView.adapter = linkAdapter
    }
}