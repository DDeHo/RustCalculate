package com.example.familyshume.rustcalculate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var resourse: Int? = null
    var slots: Int = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButtonIron.setOnClickListener{
            if (editTextSum.text.toString() == "") {
                Toast.makeText(this, "Введите количество ресурса...", Toast.LENGTH_SHORT).show()
            }  else {
                imageButtonIron.setImageResource(R.drawable.metal_fragments)
                imageButtonMHQ.setImageResource(R.drawable.hq_metal_ore)
                imageButtonSulfur.setImageResource(R.drawable.sulfur_ore)
                resourse = editTextSum.text.toString().toInt() / slots * 5
                Toast.makeText(this, "Собираем руду...", Toast.LENGTH_SHORT).show()
            }
        }

        imageButtonSulfur.setOnClickListener {
            if (editTextSum.text.toString() == "") {
                Toast.makeText(this, "Введите количество ресурса...", Toast.LENGTH_SHORT).show()
            }   else {
                imageButtonIron.setImageResource(R.drawable.metal_ore)
                imageButtonMHQ.setImageResource(R.drawable.hq_metal_ore)
                imageButtonSulfur.setImageResource(R.drawable.sulfur)
                resourse = (editTextSum.text.toString().toInt() / slots * 2.5).toInt()
                Toast.makeText(this, "Собираем руду...", Toast.LENGTH_SHORT).show()
            }
        }

        imageButtonMHQ.setOnClickListener {
            if (editTextSum.text.toString() == "") {
                Toast.makeText(this, "Введите количество ресурса...", Toast.LENGTH_SHORT).show()
            }   else {
                imageButtonIron.setImageResource(R.drawable.hq_metal_ore)
                imageButtonSulfur.setImageResource(R.drawable.sulfur_ore)
                imageButtonMHQ.setImageResource(R.drawable.metal_refined)
                resourse = editTextSum.text.toString().toInt() / slots * 10
                Toast.makeText(this, "Собираем руду...", Toast.LENGTH_SHORT).show()
            }
        }

        buttonSum.setOnClickListener {
            textViewRes.text = "Вам нужно $resourse дерева."
            imageButtonIron.setImageResource(R.drawable.metal_ore)
            imageButtonSulfur.setImageResource(R.drawable.sulfur_ore)
            imageButtonMHQ.setImageResource(R.drawable.hq_metal_ore)
        }
    }
}
