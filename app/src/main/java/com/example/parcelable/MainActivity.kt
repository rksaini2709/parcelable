package com.example.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btn)

         button.setOnClickListener {
             var intent = Intent(this, HomepageActivity::class.java)
             intent.putExtra("employee",Parcel(52,"Saini"))
             startActivity(intent)
         }
    }
}