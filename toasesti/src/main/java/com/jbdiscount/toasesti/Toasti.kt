package com.jbdiscount.toasesti

import android.content.Context
import android.widget.Toast

class Toasti {
    companion object {
        fun showToasd(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}
