package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_herculesandthe_waggoner.*

class HerculesandtheWaggoner : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_herculesandthe_waggoner)
        setSupportActionBar(toolbar)

        val tvstory2:TextView=findViewById(R.id.tvstory2)
         tvstory2.setText("A Waggoner was once driving a heavy load along a very muddy way.\n" +
                 "\n" +
                 "At last he came to a part of the road where the wheels sank half-way into the mire, and the more the horses pulled, the deeper sank the wheels.\n" +
                 "\n" +
                 "So the Waggoner threw down his whip, and knelt down and prayed to Hercules the Strong.\n" +
                 "\n" +
                 "\"O Hercules, help me in this my hour of distress,\" quoth he. \n" +
                 "\n" +
                 "But Hercules appeared to him, and said:\n" +
                 "\n" +
                 "\"Tut, man, don't sprawl there. Get up and put your shoulder to the wheel.\"")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
