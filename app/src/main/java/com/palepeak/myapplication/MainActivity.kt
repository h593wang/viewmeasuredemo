package com.palepeak.myapplication

import android.app.Activity
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val response = "long response long "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = response
    }

    override fun onResume() {
        super.onResume()
        setResultView()
    }

    private fun setResultView() {
        val displayWidth = Resources.getSystem().displayMetrics.widthPixels
        val textWidth = textView.measuredWidth.toFloat()
        resultView.text = (100 * textWidth / displayWidth).toString() + "%"
    }

}