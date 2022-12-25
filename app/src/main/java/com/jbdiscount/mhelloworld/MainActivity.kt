package com.jbdiscount.mhelloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jbdiscount.toasesti.Toasti

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toasti.showToasd(applicationContext,"message")
    }
}
