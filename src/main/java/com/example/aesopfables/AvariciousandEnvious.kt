package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_avariciousand_envious.*

class AvariciousandEnvious : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avariciousand_envious)
        setSupportActionBar(toolbar)
        val tvstory1:TextView=findViewById(R.id.tvstory1)
        tvstory1.setText("Two neighbours came before Jupiter and prayed him to grant their hearts' desire. Now the one was full of avarice, and the other eaten up with envy.\n" +
                "\n" +
                "So to punish them both, Jupiter granted that each might have whatever he wished for himself, but only on condition that his neighbour had twice as much.\n" +
                "\n" +
                "The Avaricious man prayed to have a room full of gold.\n" +
                "\n" +
                "No sooner said than done; but all his joy was turned to grief when he found that his neighbour had two rooms full of the precious metal.\n" +
                "\n" +
                "Then came the turn of the Envious man, who could not bear to think that his neighbour had any joy at all.\n" +
                "\n" +
                "So he prayed that he might have one of his own eyes put out, by which means his companion would become totally blind.\n" +
                "\n" +
                " ")


//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
