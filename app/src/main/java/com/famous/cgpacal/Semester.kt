package com.famous.cgpacal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.famous.cgpacal.databinding.ActivityCalculateBinding
import com.famous.cgpacal.databinding.ActivitySemesterBinding

class Semester : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivitySemesterBinding

    @SuppressLint("SetTextI18n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySemesterBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //button finding
        val calculateBtn = binding.calculateButtonId
        val  resetBtn = binding.resetButtonId
        //textViewFinding
        val result = binding.resultTextViewId

        //editText finding
        val first = binding.firstSemesterEditTextId
        val second = binding.secondSemesterEditTextId
        val three = binding.thirdSemesterEditTextId
        val four = binding.fourthSemesterEditTextId
        val five = binding.fifthSemesterEditTextId
        val six = binding.sixthSemesterEditTextId
        val seven = binding.seventhSemesterEditTextId
        val eight = binding.eighthSemesterEditTextId

        //set OnClickListener on calculateBtn button
        calculateBtn.setOnClickListener()  {
            val string_first = first.text.toString()
            val string_second = second.text.toString()
            val string_three = three.text.toString()
            val string_four = four.text.toString()
            val  string_five = five.text.toString()
            val string_six = six.text.toString()
            val string_seven = seven.text.toString()
            val string_eight = eight.text.toString()


            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_first)) {
                first.error = "Enter a value"
                first.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_first.toFloat() > 5 || string_first.toFloat() < 1.5) {
                first.error = "Should not be greater than 5 and less than 1.5"
                first.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_second)) {
                second.error = "Enter a value"
                second.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_second.toFloat() > 5 || string_second.toFloat() < 1.5) {
                second.error = "Should not be greater than 5 and less than 1.5"
                second.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_three)) {
                three.error = "Enter a value"
                three.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_three.toFloat() > 5 || string_three.toFloat() < 0) {
                three.error = "Should not be greater than 5 and less than 1.5"
                three.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_four)) {
                four.error = "Enter a value"
                four.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_four.toFloat() > 5 || string_four.toFloat() < 0) {
                four.error = "Should not be greater than 5 and less than 1.5"
                four.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_five)) {
                five.error = "Enter a value"
                five.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_five.toFloat() > 5 || string_five.toFloat() < 0) {
                five.error = "Should not be greater than 5 and less than 1.5"
                five.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_six)) {
                six.error = "Enter a value"
                six.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_six.toFloat() > 5 || string_six.toFloat() < 0) {
                six.error = "Should not be greater than 5 and less than 1.5"
                six.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_seven)) {
                seven.error = "Enter a value"
                seven.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_seven.toFloat() > 5 || string_seven.toFloat() < 0) {
                seven.error = "Should not be greater than 5 and less than 1.5"
                seven.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(string_eight)) {
                eight.error = "Enter a value"
                eight.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (string_eight.toFloat() > 5 || string_eight.toFloat() < 0) {
                eight.error = "Should not greater than 5 and less than 1.5"
                eight.requestFocus()
                return@setOnClickListener
            }


            //store converted string into a variable
            val floatFirst = string_first.toFloat()
            val floatSecond = string_second.toFloat()
            val floatThree = string_three.toFloat()
            val floatFour = string_four.toFloat()
            val floatFive = string_five.toFloat()
            val floatSix = string_six.toFloat()
            val floatSeven = string_seven.toFloat()
            val floatEight = string_eight.toFloat()


            //store the overall calculation into a variable
            val totalCgpaAndGrade = Semester2().result(
                    floatFirst, floatSecond, floatThree,
                    floatFour,floatFive, floatSix, floatSeven, floatEight
            )

            //set totalCgpaGrade on the resultText
            result.text = totalCgpaAndGrade


        }


        //set OnClick Listener on resetBtn
        resetBtn.setOnClickListener {

            //set empty string on all the editText for reset
            result.text = "Result"
            first.setText("")
            second.setText("")
            three.setText("")
            four.setText("")
            five.setText("")
            six.setText("")
            seven.setText("")
            eight.setText("")

        }

    }
}