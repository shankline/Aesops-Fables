package com.example.aesopfables

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_the_assinthe_lions_skin.*

class TheAssintheLionsSkin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_assinthe_lions_skin)
        setSupportActionBar(toolbar)

        val tvstory7:TextView=findViewById(R.id.tvstory7)
        tvstory7.setText("An Ass once found a Lion's skin which the hunters had left out in the sun to dry.\n" +
                "\n" +
                "He put it on and went towards his native village.\n" +
                "\n" +
                "All fled at his approach, both men and animals, and he was a proud Ass that day.\n" +
                "\n" +
                "In his delight he lifted up his voice and brayed, but then every one knew him, and his owner came up and gave him a sound cudgelling for the fright he had caused.\n" +
                "\n" +
                "And shortly afterwards a Fox came up to him and said:\n" +
                "\n" +
                "\"Ah, I knew you by your voice.\"")
    }

}
