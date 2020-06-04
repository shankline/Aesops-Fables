package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_assandthe_charger.*

class TheAssandtheCharger : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_assandthe_charger)
        setSupportActionBar(toolbar)

        val tvstory5:TextView=findViewById(R.id.tvstory5)
                tvstory5.setText("An Ass congratulated a Horse on being so ungrudgingly and carefully provided for, while he himself had scarcely enough to eat, nor even that without hard work.\n" +
                        "\n" +
                        "But when war broke out, the heavy armed soldier mounted the Horse, and rushed into the very midst of the enemy, and the Horse, being wounded, fell dead on the battle-field.\n" +
                        "\n" +
                        "Then the Ass, seeing all these things, changed his mind, and commiserated the Horse, saying: \"How much more fortunate am I than a charger. I can remain at home in safety while he is exposed to all the perils of war.\"\n" +
                        "\n" +
                        " ")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
