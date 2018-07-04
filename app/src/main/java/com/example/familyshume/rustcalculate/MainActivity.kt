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

        buttonIron.setOnClickListener{
            if (editTextSum.text.toString() == "") {
                Toast.makeText(this, "Введите количество ресурса...", Toast.LENGTH_SHORT).show()
            }  else {
                buttonIron.text = "Обработка..."
                resourse = editTextSum.text.toString().toInt() / slots * 5
                Toast.makeText(this, "Собираем руду...", Toast.LENGTH_SHORT).show()
            }
        }

        buttonSulfur.setOnClickListener {
            if (editTextSum.text.toString() == "") {
                Toast.makeText(this, "Введите количество ресурса...", Toast.LENGTH_SHORT).show()
            }   else {
                buttonSulfur.text = "Обработка..."
                resourse = (editTextSum.text.toString().toInt() / slots * 2.5).toInt()
                Toast.makeText(this, "Собираем руду...", Toast.LENGTH_SHORT).show()
            }
        }

        buttonMHQ.setOnClickListener {
            if (editTextSum.text.toString() == "") {
                Toast.makeText(this, "Введите количество ресурса...", Toast.LENGTH_SHORT).show()
            }   else {
                buttonMHQ.text = "Обработка..."
                resourse = editTextSum.text.toString().toInt() / slots * 10
                Toast.makeText(this, "Собираем руду...", Toast.LENGTH_SHORT).show()
            }
        }

        buttonSum.setOnClickListener {
            textViewRes.text = "Вам нужно $resourse дерева."
            buttonIron.text = "Железо"
            buttonMHQ.text = "МВК"
            buttonSulfur.text = "Сера"
        }
    }
}
