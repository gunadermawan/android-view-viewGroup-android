package com.gunder.test_viewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//      tambahin ini yaa :D
        supportActionBar?.title = "Google Pixel"
    }
}