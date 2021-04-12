package com.example.thepressgarmentcreator

import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CustomChoiceActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View) {
        when (v.id) {
            R.id.choice_tee -> {
                Toast.makeText(
                    this@CustomChoiceActivity, "Time to Talk!",
                    Toast.LENGTH_SHORT
                ).show()
                startActivity(
                    Intent(
                        this@CustomChoiceActivity,
                        TeeCreatorActivity::class.java
                    )
                )
            }

            R.id.choice_sweater -> startActivity(
                Intent(
                    this@CustomChoiceActivity,
                    SweatshirtActivity::class.java
                )
            )

            R.id.choice_tote_bag -> startActivity(
                Intent(
                    this@CustomChoiceActivity,
                    TotebagActivity::class.java
                )
            )

        }
    }


}


