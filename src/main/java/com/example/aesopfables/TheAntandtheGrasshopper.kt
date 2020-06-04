package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_antandthe_grasshopper.*

class TheAntandtheGrasshopper : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_antandthe_grasshopper)
        setSupportActionBar(toolbar)
        val tvstory3:TextView=findViewById(R.id.tvstory3)
        tvstory3.setText("In a field one summer's day a Grasshopper was hopping about, chirping and singing to its heart's content. An Ant passed by, bearing along with great toil an ear of corn he was taking to the nest.\n" +
                "\n" +
                "\"Why not come and chat with me,\" said the Grasshopper, \"instead of toiling and moiling in that way?\"\n" +
                "\n" +
                "\"I am helping to lay up food for the winter,\" said the Ant, \"and recommend you to do the same.\"\n" +
                "\n" +
                "\"Why bother about winter?\" said the Grasshopper; \"we have got plenty of food at present.\"\n" +
                "\n" +
                "But the Ant went on its way and continued its toil.\n" +
                "\n" +
                "When the winter came the Grasshopper had no food and found itself dying of hunger, while it saw the ants distributing every day corn and grain from the stores they had collected in the summer.\n" +
                "\n" +
                "Then the Grasshopper knew: It is best to prepare for the days of necessity.\n" +
                "\n" +
                " ")


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
