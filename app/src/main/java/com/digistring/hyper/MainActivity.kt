package com.digistring.hyper

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digistring.hyper.utils.Router

class MainActivity : AppCompatActivity() {

    private val context: Context = this;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Router.goToHome(context)
    }
}