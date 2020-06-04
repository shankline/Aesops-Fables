package com.example.aesopfables

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {

            val intent = Intent(this, AvariciousandEnvious::class.java)
            startActivity(intent)


        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {

            val intent = Intent(this, HerculesandtheWaggoner::class.java)
            startActivity(intent)


        }
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {

            val intent = Intent(this, TheAntandtheGrasshopper::class.java)
            startActivity(intent)

        }
        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {

            val intent = Intent(this, TheAssandtheLapdog::class.java)
            startActivity(intent)


        }
        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {

            val intent = Intent(this, TheAssandtheCharger::class.java)
            startActivity(intent)


        }
        val btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {

            val intent = Intent(this, TheAsstheFoxandtheLion::class.java)
            startActivity(intent)


        }
        val btn7 = findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {

            val intent = Intent(this, TheAssintheLionsSkin::class.java)
            startActivity(intent)

        }
        val btn8 = findViewById<Button>(R.id.btn8)
        btn8.setOnClickListener {

            val intent = Intent(this, TheAsssBrains::class.java)
            startActivity(intent)

        }
        val btn9 = findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener {

            val intent = Intent(this, TheBaldManandtheFly::class.java)
            startActivity(intent)


        }
        val btn10 = findViewById<Button>(R.id.btn10)
        btn10.setOnClickListener {

            val intent = Intent(this, TheBattheBirdsandtheBeasts::class.java)
            startActivity(intent)

        }
    }
}