package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_bald_manandthe_fly.*

class TheBaldManandtheFly : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_bald_manandthe_fly)
        setSupportActionBar(toolbar)

        val tvstory9: TextView =findViewById(R.id.tvstory9)
        tvstory9.setText("There was once a Bald Man who sat down after work on a hot summer's day.\n" +
                "\n" +
                "A Fly came up and kept buzzing about his bald pate, and stinging him from time to time.\n" +
                "\n" +
                "The Man aimed a blow at his little enemy, but his palm came on his head instead.\n" +
                "\n" +
                "Again the Fly tormented him, but this time the Man was wiser and said:\n" +
                "\n" +
                "\"You will only injure yourself if you take notice of despicable enemies.\"\n" +
                "\n" +
                " ")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
