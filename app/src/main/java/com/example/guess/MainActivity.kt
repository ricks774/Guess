package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","secret:" + secretNumber.secret)
    }

    fun check(view: View) {
        val n = ed_number.text.toString().toInt()

        val diff = secretNumber.vaildate(n)
        var messge = "Yes, you got it"

        if (diff < 0){
            messge = "Bigger!!!"
        }else if (diff > 0){
            messge = "Smaller"
        }
        AlertDialog.Builder(this)
            .setTitle("Messge")
            .setMessage(messge)
            .setPositiveButton("ok",null)
            .show()
    }
}