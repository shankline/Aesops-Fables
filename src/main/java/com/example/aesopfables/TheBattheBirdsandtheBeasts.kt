package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_batthe_birdsandthe_beasts.*

class TheBattheBirdsandtheBeasts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_batthe_birdsandthe_beasts)
        setSupportActionBar(toolbar)

        val tvstory10: TextView =findViewById(R.id.tvstory10)
        tvstory10.setText("A great conflict was about to come off between the Birds and the Beasts.\n" +
                "\n" +
                "When the two armies were collected together the Bat hesitated which to join.\n" +
                "\n" +
                "The Birds that passed his perch said:\n" +
                "\n" +
                "\"Come with us\"; but he said: \"I am a Beast.\"\n" +
                "\n" +
                "Later on, some Beasts who were passing underneath him looked up and said:\n" +
                "\n" +
                "\"Come with us\"; but he said: \"I am a Bird.\"\n" +
                "\n" +
                "Luckily at the last moment peace was made, and no battle took place, so the Bat came to the Birds and wished to join in the rejoicings, but they all turned against him and he had to fly away.\n" +
                "\n" +
                "He then went to the Beasts, but soon had to beat a retreat, or else they would have torn him to pieces. \n" +
                "\n" +
                "\"Ah,\" said the Bat, \"I see now, He that is neither one thing nor the other has no friends.\"")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
