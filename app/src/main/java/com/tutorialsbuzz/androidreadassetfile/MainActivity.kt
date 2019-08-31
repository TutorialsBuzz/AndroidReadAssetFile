package com.tutorialsbuzz.androidreadassetfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = readFromAsset()

        textView.setText(data)

    }


    private fun readFromAsset(): String {
        val file_name = "android_version.json"

        val bufferReader = application.assets.open(file_name).bufferedReader()

        val data = bufferReader.use {
            it.readText()
        }

        Log.d("readFromAsset", data)

        return data;
    }
}
