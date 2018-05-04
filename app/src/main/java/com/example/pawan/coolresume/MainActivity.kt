package com.example.pawan.coolresume

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistoryButton)

        workHistory.setOnClickListener() {
            println("You hit the button.")

            var moveToWorkHistory = Intent(applicationContext, WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var callButton = findViewById<Button>(R.id.callButton)

        callButton.setOnClickListener() {
            println("You hit the call button.")

            var phoneUri = Uri.parse("tel: 9840060129")
            var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }

        var emailButton = findViewById<Button>(R.id.emailButton)

        emailButton.setOnClickListener() {
            println("You hit the email button.")

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "pawanman56@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hello Pawan.")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I really like your resume. Noice.")
            startActivity(emailIntent)
        }
    }
}
