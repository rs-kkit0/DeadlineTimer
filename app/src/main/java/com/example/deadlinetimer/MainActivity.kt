package com.example.deadlinetimer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchListActivity(view: View) {
        Log.d(LOG_TAG, "Button clicked!")
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }

    companion object {
        private val LOG_TAG: String = MainActivity::class.java.simpleName
    }
}
