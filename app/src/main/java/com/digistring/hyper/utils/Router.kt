package com.digistring.hyper.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.digistring.hyper.ui.HomeActivity

object Router {
    fun goToHome(context: Context) {
        val intent = Intent(context, HomeActivity::class.java)
        context.startActivity(intent)
    }

    fun toURL(context: Context, url: String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(browserIntent)
    }
}