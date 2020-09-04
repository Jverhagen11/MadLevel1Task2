package com.example.madlevel1task2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }


    private fun initViews(){
        binding.btnSubmit.setOnClickListener { onSubmitClick() }

    }



    private  fun onSubmitClick() {
        checkAnswer()
    }


    private fun checkAnswer(){

       var correctAnswers = 0

        val answer1 = binding.inputRow1.text.toString()
        val answer2 = binding.inputRow2.text.toString()
        val answer3 = binding.inputRow3.text.toString()
        val answer4 = binding.inputRow4.text.toString()


            if(answer1 == "T"){
                correctAnswers++
            } else{
                correctAnswers = 0
            }

            if (answer2 == "F"){
                correctAnswers++
            } else {
                correctAnswers += 0
            }

            if (answer3 == "F"){
                correctAnswers++
            } else{
                correctAnswers += 0
            }

            if (answer4 == "F"){
                correctAnswers++
            } else{
                correctAnswers += 0

        }



       Toast.makeText(this, correctAnswers.toString() + " " + getString(R.string.correct), Toast.LENGTH_LONG).show()

        }


    }

