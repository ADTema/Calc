package com.example.calc


import android.os.Bundle
import android.view.View
import android.webkit.WebSettings.PluginState
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.View.OnClickListener;


class MainActivity : AppCompatActivity() {

    lateinit var FirstNum: EditText
    lateinit var SecondNum: EditText
    lateinit var Result: TextView
    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var umn: Button
    lateinit var del: Button
    var res: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        try {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plus = findViewById(R.id.Plus)
        minus = findViewById(R.id.Minus)
        umn = findViewById(R.id.Umn)
        del = findViewById(R.id.Del)
        FirstNum = findViewById(R.id.FirstNum)
        SecondNum = findViewById(R.id.SecondNum)
        Result = findViewById(R.id.Result)
        val first: String = FirstNum.text.toString()
        val second: String = FirstNum.text.toString()
        //res = FirstNum.text.toString().toDouble() + SecondNum.text.toString().toDouble()

         val summ: OnClickListener = OnClickListener { Result.text = (FirstNum.text.toString().toDouble() + SecondNum.text.toString().toDouble()).toString() }
         val razn: OnClickListener = OnClickListener { Result.text = (FirstNum.text.toString().toDouble() - SecondNum.text.toString().toDouble()).toString()}
         val proiz: OnClickListener = OnClickListener { Result.text = (FirstNum.text.toString().toDouble() * SecondNum.text.toString().toDouble()).toString()}
         val chast: OnClickListener = OnClickListener { Result.text = (FirstNum.text.toString().toDouble() / SecondNum.text.toString().toDouble()).toString()}
         plus.setOnClickListener(summ)
         minus.setOnClickListener(razn)
         umn.setOnClickListener(proiz)
         del.setOnClickListener(chast)
        }
        catch (e : java.lang.Exception){
            Result.text = ("not empty")
        }
    }



}


