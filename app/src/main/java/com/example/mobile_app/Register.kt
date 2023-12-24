package com.example.mobile_app

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {

    lateinit var editNameText:EditText
    lateinit var editEmailText: EditText
    lateinit var editPasswordText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //data class User(val name:String, val email: String, val password: String)

        editNameText= findViewById(R.id.editNameText)
        editEmailText= findViewById(R.id.editEmailText)
        editPasswordText= findViewById(R.id.editPasswordText)
        val name = editNameText.text.toString()
        val email = editEmailText.text.toString()
        val password = editPasswordText.text.toString()

        //store data

        //val user=User(name,email,password)
         //val database = FirebaseDatabase.getInstance()
        //val usersRef = database.getReference("users")
        //val userId = usersRef.push().key
        //usersRef.child(userId!!).setValue(user)
    }

}