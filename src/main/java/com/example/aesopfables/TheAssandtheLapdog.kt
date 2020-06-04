package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_assandthe_lapdog.*

class TheAssandtheLapdog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_assandthe_lapdog)
        setSupportActionBar(toolbar)

        val tvstory4:TextView=findViewById(R.id.tvstory4)
            tvstory4.setText("A Farmer one day came to the stables to see to his beasts of burden: among them was his favourite Ass, that was always well fed and often carried his master.\n" +
                    "\n" +
                    "With the Farmer came his Lapdog, who danced about and licked his hand and frisked about as happy as could be.\n" +
                    "\n" +
                    "The Farmer felt in his pocket, gave the Lapdog some dainty food, and sat down while he gave his orders to his servants.\n" +
                    "\n" +
                    "The Lapdog jumped into his master's lap, and lay there blinking while the Farmer stroked his ears.\n" +
                    "\n" +
                    "The Ass, seeing this, broke loose from his halter and commenced prancing about in imitation of the Lapdog.\n" +
                    "\n" +
                    "The Farmer could not hold his sides with laughter, so the Ass went up to him, and putting his feet upon the Farmer's shoulder attempted to climb into his lap.\n" +
                    "\n" +
                    "The Farmer's servants rushed up with sticks and pitchforks and soon taught the Ass that: Clumsy jesting is no joke.\n" +
                    "\n" +
                    " ")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }


