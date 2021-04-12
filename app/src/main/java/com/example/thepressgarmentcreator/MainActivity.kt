package com.example.thepressgarmentcreator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_choice)
    }

    fun onClick(v: View) {
        when (v.id) {
            R.id.button -> {
                Toast.makeText(
                    this@MainActivity, "Time to Talk!",
                    Toast.LENGTH_SHORT
                ).show()
                startActivity(
                    Intent(
                        this@MainActivity,
                        CustomChoiceActivity::class.java
                    )
                )
            }

            R.id.button2 -> startActivity(
                Intent(
                    this@MainActivity,
                    CustomStoleActivity::class.java
                )
            )

        }
    }
}