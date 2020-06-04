package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_asss_brains.*

class TheAsssBrains : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_asss_brains)
        setSupportActionBar(toolbar)


        val tvstory8: TextView =findViewById(R.id.tvstory8)
        tvstory8.setText("\n" +
                "The Lion and the Fox went hunting together.\n" +
                "\n" +
                "The Lion, on the advice of the Fox, sent a message to the Ass, proposing to make an alliance between their two families.\n" +
                "\n" +
                "The Ass came to the place of meeting, overjoyed at the prospect of a royal alliance.\n" +
                "\n" +
                "But when he came there the Lion simply pounced on the Ass, and said to the Fox: \n" +
                "\n" +
                "\"Here is our dinner for to-day. Watch you here while I go and have a nap. Woe betide you if you touch my prey.\" \n" +
                "\n" +
                "The Lion went away and the Fox waited; but finding that his master did not return, ventured to take out the brains of the Ass and ate them up.\n" +
                "\n" +
                "When the Lion came back he soon noticed the absence of the brains, and asked the Fox in a terrible voice:\n" +
                "\n" +
                "\"What have you done with the brains?\"\n" +
                "\n" +
                "\"Brains, your Majesty! it had none, or it would never have fallen into your trap.\"")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
