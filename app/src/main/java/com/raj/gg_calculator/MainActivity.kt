package com.raj.gg_calculator

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.raj.gg_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var  binding: ActivityMainBinding

      private var num1 :Int =0
        private var num2 :Int =0

    //get number

         fun getNumber():Boolean{

            val value1 = binding.etValue1.text.toString()
            val value2 = binding.etValue2.text.toString()

            if (value1< 0.toString())
            {
                Toast.makeText(this,"PLease dont Valid number",Toast.LENGTH_SHORT).show()
            }
            if (value1.isEmpty() && value2.isEmpty())
            {
                Toast.makeText(this,"Please enter the value",Toast.LENGTH_SHORT).show()

                return false

            }
            num1 = value1.toInt()
            num2 = value2.toInt()
            return true
        }

        fun doSum(v:View){
        if (getNumber())
        {
            binding.result.text = (num1+num2).toString()
        }

      }
    fun doSub(v:View){
        if (getNumber())
        {
            binding.result.text = (num1-num2).toString()
        }

    }
     fun doDiv(v:View){
        if (getNumber()&&num2!=0)
        {
            binding.result.text = (num1/num2).toString()
        }

    }
     fun doMul(v:View){
        if (getNumber())
        {
            binding.result.text = (num1*num2).toString()
        }

    }
     fun doMod(v:View){
        if (getNumber())
        {
            binding.result.text = (num1%num2).toString()
        }

    }
    fun doPow(v:View)
    {
        val result =Math.pow(num1.toDouble(),num2.toDouble())
        binding.result.text =result.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}