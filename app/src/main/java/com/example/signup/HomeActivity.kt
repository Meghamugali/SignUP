package com.example.signup
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    lateinit var tvEmail: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val email = intent.getStringExtra("ekey")
            val textView = findViewById<TextView>(R.id.tvEmail)
        val message = "You are signed in as, $email ;-) "
        textView.text=message

    }
}