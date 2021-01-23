package com.mmd.minalibrary

import android.content.Context
import android.widget.Toast

class MinaLibrary {

    companion object {
        fun minaToast(cxt: Context) {
            Toast.makeText(cxt, "MinaToast", Toast.LENGTH_LONG).show()
        }
    }
}