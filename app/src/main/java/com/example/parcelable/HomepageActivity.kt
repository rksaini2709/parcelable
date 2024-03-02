package com.example.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        var homePageText = findViewById<TextView>(R.id.homePageText)

        intent?.let{
            var employee = it.getParcelableExtra<Parcel>("employee")
            homePageText.text = "${employee!!.id} and ${employee!!.name}"
        }
    }
}