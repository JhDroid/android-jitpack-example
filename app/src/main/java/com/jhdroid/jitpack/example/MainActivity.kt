package com.jhdroid.jitpack.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jhdroid.jitpack.exlibrary.Example

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val example = Example()
        Log.d("jhdroid", "example library get string : ${example.getString()}")
        Log.d("jhdroid", "example library get blog url : ${example.getBlogUrl()}")
    }
}