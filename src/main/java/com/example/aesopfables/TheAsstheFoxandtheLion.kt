package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_assthe_foxandthe_lion.*

class TheAsstheFoxandtheLion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_assthe_foxandthe_lion)
        setSupportActionBar(toolbar)
        val tvstory6:TextView=findViewById(R.id.tvstory6)
        tvstory6.setText("The Ass and the Fox, having entered into a partnership together, went out into the forest to hunt.\n" +
                "\n" +
                "They had not proceeded far, when they met a Lion.\n" +
                "\n" +
                "The Fox approached the Lion and promised to contrive for him the capture of the Ass, if he would pledge his word that his own life should be spared.\n" +
                "\n" +
                "On his assuring him that he would not injure him, the Fox led the Ass to a deep pit, and contrived that he should fall into it.\n" +
                "\n" +
                "The Lion, seeing that the Ass was secured, immediately clutched the Fox, and then attacked the Ass at his leisure.\n" +
                "\n" +
                " ")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
