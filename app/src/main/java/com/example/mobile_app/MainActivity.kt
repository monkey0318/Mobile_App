package com.example.mobile_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val registerTextView:TextView= findViewById(R.id.registerTextView)
        registerTextView.setOnClickListener { registerAccount(it) }
    }
    private fun registerAccount(view: View) {
        val context = view.context
        val intent = Intent(context, Register::class.java)
        context.startActivity(intent)
    }
}