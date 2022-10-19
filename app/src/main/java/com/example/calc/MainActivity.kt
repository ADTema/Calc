package com.example.calc


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings.PluginState
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.View.OnClickListener;
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    lateinit var FirstNum: EditText
    lateinit var SecondNum: EditText
    lateinit var Result: TextView
    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var umn: Button
    lateinit var del: Button
    var res: Double = 0.0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plus = findViewById(R.id.Plus)
        minus = findViewById(R.id.Minus)
        umn = findViewById(R.id.Umn)
        del = findViewById(R.id.Del)
        FirstNum = findViewById(R.id.FirstNum)
        SecondNum = findViewById(R.id.SecondNum)
        Result = findViewById(R.id.Result)

        plus.setOnClickListener {
            if (FirstNum.text.isEmpty() || SecondNum.text.isEmpty()) {
                Result.text = "inter number"
            } else
                Result.text = (FirstNum.text.toString().toDouble() + SecondNum.text.toString()
                    .toDouble()).toString()
        }
        minus.setOnClickListener {
            if (FirstNum.text.isEmpty() || SecondNum.text.isEmpty()) {
                Result.text = "inter number"
            } else Result.text = (FirstNum.text.toString().toDouble() - SecondNum.text.toString()
                .toDouble()).toString()
        }
        umn.setOnClickListener {
            if (FirstNum.text.isEmpty() || SecondNum.text.isEmpty()) {
                Result.text = "inter number"
            } else Result.text = (FirstNum.text.toString().toDouble() * SecondNum.text.toString()
                .toDouble()).toString()
        }
        del.setOnClickListener {
            if (FirstNum.text.isEmpty() || SecondNum.text.isEmpty()) {
                Result.text = "inter number"
            } else Result.text = (FirstNum.text.toString().toDouble() / SecondNum.text.toString()
                .toDouble()).toString()
        }

    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        AlertDialog.Builder(this).apply {
            setTitle("Подтверждение")
            setMessage("Вы уверены, что хотите выйти из приложения?")

            setPositiveButton("Таки да") { _, _ ->
                super.onBackPressed()
            }

            setNegativeButton("Нет, я попутал"){_, _ ->
                // if user press no, then return the activity
                Toast.makeText(this@MainActivity, "Thank you",
                    Toast.LENGTH_LONG).show()
            }
            setCancelable(true)
        }.create().show()
    }

}


