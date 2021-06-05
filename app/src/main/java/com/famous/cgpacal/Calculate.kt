package com.famous.cgpacal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import com.famous.cgpacal.databinding.ActivityCalculateBinding

class Calculate : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityCalculateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set onClickListener on Reset Button
        binding.Reset.setOnClickListener {
            reset()
        }

        //set onClickListener on Calculate Button
        binding.calculate.setOnClickListener {

            //initialize the editTexts into a variable
            val creditUnit = binding.creditUnit.text.toString()
            val grade = binding.grade.text.toString()
            val creditUnit2 = binding.creditUnit2.text.toString()
            val grade2 = binding.grade2.text.toString()
            val creditUnit3 = binding.creditUnit3.text.toString()
            val grade3 = binding.grade3.text.toString()
            val creditUnit4 = binding.creditUnit4.text.toString()
            val grade4 = binding.grade4.text.toString()
            val creditUnit5 = binding.creditUnit5.text.toString()
            val grade5 = binding.grade5.text.toString()
            val creditUnit6 = binding.creditUnit6.text.toString()
            val grade6 = binding.grade6.text.toString()
            val creditUnit7 = binding.creditUnit7.text.toString()
            val grade7 = binding.grade7.text.toString()
            val creditUnit8 = binding.creditUnit8.text.toString()
            val grade8 = binding.grade8.text.toString()
            val creditUnit9 = binding.creditUnit9.text.toString()
            val grade9 = binding.grade9.text.toString()
            val creditUnit10 = binding.creditUnit10.text.toString()
            val grade10 = binding.grade10.text.toString()
            val creditUnit11 = binding.creditUnit11.text.toString()
            val grade11 = binding.grade11.text.toString()
            val creditUnit12 = binding.creditUnit12.text.toString()
            val grade12 = binding.grade12.text.toString()

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit)) {
                binding.creditUnit.error = "Enter a value"
                binding.creditUnit.requestFocus()
                return@setOnClickListener
            }
            //Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit.toFloat() > 6 || creditUnit.toFloat() < 1) {
                binding.creditUnit.error = "Should not be greater than 6 and less than 1"
                binding.creditUnit.requestFocus()
                return@setOnClickListener
            }
            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade)) {
                binding.grade.error = "Enter a value"
                binding.grade.requestFocus()
                return@setOnClickListener
            }
            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade.toFloat() > 5 || grade.toFloat() < 0) {
                binding.grade.error = "Should not be greater than 5 and less than 0"
                binding.grade.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit2)) {
                binding.creditUnit2.error = "Enter a value"
                binding.creditUnit2.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit2.toFloat() > 6 || creditUnit2.toFloat() < 1) {
                binding.creditUnit2.error = "Should not greater than 6 and less than 1"
                binding.creditUnit2.requestFocus()
                return@setOnClickListener
            }
            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade2)) {
                binding.grade2.error = "Enter a value"
                binding.grade2.requestFocus()
                return@setOnClickListener
            }
            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade2.toFloat() > 5 || grade2.toFloat() < 0) {
                binding.grade2.error = "Should not greater than 5 and less than 0"
                binding.grade2.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit3)) {
                binding.creditUnit3.error = "Enter a value"
                binding.creditUnit3.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade3)) {
                binding.grade3.error = "Enter a value"
                binding.grade3.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade3.toFloat() > 5 || grade3.toFloat() < 0) {
                binding.grade3.error = "Should not be greater than 5 and less than 1"
                binding.grade3.requestFocus()
                return@setOnClickListener
            }
            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit3.toFloat() > 6 || creditUnit3.toFloat() < 1) {
                binding.creditUnit3.error = "Should not greater than 6 and less than 1"
                binding.creditUnit3.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade4)) {
                binding.grade4.error = "Enter a value"
                binding.grade4.requestFocus()
                return@setOnClickListener
            }
            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade4.toFloat() > 5 || grade4.toFloat() < 0) {
                binding.grade4.error = "Should not greater than 5 and less than 0"
                binding.grade4.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit4)) {
                binding.creditUnit4.error = "Enter a value"
                binding.creditUnit4.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit4.toFloat() > 6 || creditUnit4.toFloat() < 1) {
                binding.creditUnit4.error = "Should not greater than 6 and less than 1"
                binding.creditUnit4.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit5)) {
                binding.creditUnit5.error = "Enter a value"
                binding.creditUnit5.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit5.toFloat() > 6 || creditUnit5.toFloat() < 1) {
                binding.creditUnit5.error = "Should not greater than 6 and less than 1"
                binding.creditUnit5.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade5)) {
                binding.grade5.error = "Enter a value"
                binding.grade5.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade5.toFloat() > 5 || grade4.toFloat() < 0) {
                binding.grade5.error = "Should not greater than 5 and less than 0"
                binding.grade5.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit6)) {
                binding.creditUnit5.error = "Enter a value"
                binding.creditUnit5.requestFocus()
                return@setOnClickListener
            }
            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit6.toFloat() > 6 || creditUnit6.toFloat() < 1) {
                binding.creditUnit6.error = "Should not greater than 6 and less than 1"
                binding.creditUnit6.requestFocus()
                return@setOnClickListener
            }
            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade6)) {
                binding.grade6.error = "Enter a value"
                binding.grade6.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade6.toFloat() > 5 || grade6.toFloat() < 0) {
                binding.grade6.error = "Should not greater than 5 and less than 0"
                binding.grade6.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit7)) {
                binding.creditUnit7.error = "Enter a value"
                binding.creditUnit7.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit7.toFloat() > 6 || creditUnit7.toFloat() < 0) {
                binding.creditUnit7.error = "Should not greater than 6 and less than 0"
                binding.creditUnit7.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade7)) {
                binding.grade7.error = "Enter a value"
                binding.grade7.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade7.toFloat() > 5 || grade7.toFloat() < 0) {
                binding.grade7.error = "Should not greater than 5 and less than 0"
                binding.grade7.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit8)) {
                binding.creditUnit8.error = "Enter a value"
                binding.creditUnit8.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit8.toFloat() > 6 || creditUnit8.toFloat() < 0) {
                binding.creditUnit8.error = "Should not be greater than 6 and less than 0"
                binding.creditUnit8.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade8)) {
                binding.grade8.error = "Enter a value"
                binding.grade8.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade8.toFloat() > 5 || grade8.toFloat() < 0) {
                binding.grade8.error = "Should not be greater than 5 and less than 0"
                binding.grade8.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit9)) {
                binding.creditUnit9.error = "Enter a value"
                binding.creditUnit9.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit9.toFloat() > 6 || creditUnit9.toFloat() < 0) {
                binding.creditUnit9.error = "Should not greater than 6 and less than 0"
                binding.creditUnit9.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade9)) {
                binding.grade9.error = "Enter a value"
                binding.grade9.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade9.toFloat() > 5 || grade9.toFloat() < 0) {
                binding.grade9.error = "Should not greater than 5 and less than 0"
                binding.grade9.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit10)) {
                binding.creditUnit10.error = "Enter a value"
                binding.creditUnit10.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit10.toFloat() > 6 || creditUnit10.toFloat() < 0) {
                binding.creditUnit10.error = "Should not greater than 6 and less than 0"
                binding.creditUnit10.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade10)) {
                binding.grade10.error = "Enter a value"
                binding.grade10.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade10.toFloat() > 5 || grade10.toFloat() < 0) {
                binding.grade10.error = "Should not greater than 5 and less than 0"
                binding.grade10.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit11)) {
                binding.creditUnit11.error = "Enter a value"
                binding.creditUnit11.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit11.toFloat() > 6 || creditUnit11.toFloat() < 0) {
                binding.creditUnit11.error = "Should not greater than 6 and less than 0"
                binding.creditUnit11.requestFocus()
                return@setOnClickListener
            }

            // Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade11)) {
                binding.grade11.error = "Enter a value"
                binding.grade11.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade11.toFloat() > 5 || grade11.toFloat() < 0) {
                binding.grade11.error = "Should not greater than 5 and less than 0"
                binding.grade11.requestFocus()
                return@setOnClickListener
            }

            //Check whether the editText is empty Or not
            if (TextUtils.isEmpty(creditUnit12)) {
                binding.creditUnit12.error = "Enter a value"
                binding.creditUnit12.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (creditUnit12.toFloat() > 6 || creditUnit12.toFloat() < 0) {
                binding.creditUnit12.error = "Should not greater than 6 and less than 1"
                binding.creditUnit12.requestFocus()
                return@setOnClickListener
            }

            //Check whether the editText is empty Or not
            if (TextUtils.isEmpty(grade12)) {
                binding.grade12.error = "Enter a value"
                binding.grade12.requestFocus()
                return@setOnClickListener
            }

            // Check whether the number inserted is not greater or lesser than a particular number
            if (grade12.toFloat() > 5 || grade12.toFloat() < 0) {
                binding.grade12.error = "Should not greater than 5 and less than 0"
                binding.grade12.requestFocus()
                return@setOnClickListener
            }

            //Storing formula into defined variable
            val calculate = grade.toFloat() * creditUnit.toFloat()
            val calculate2 = grade2.toFloat() * creditUnit2.toFloat()
            val calculate3 = grade3.toFloat() * creditUnit3.toFloat()
            val calculate4 = grade4.toFloat() * creditUnit4.toFloat()
            val calculate5 = grade5.toFloat() * creditUnit5.toFloat()
            val calculate6 = grade6.toFloat() * creditUnit6.toFloat()
            val calculate7 = grade7.toFloat() * creditUnit7.toFloat()
            val calculate8 = grade8.toFloat() * creditUnit8.toFloat()
            val calculate9 = grade9.toFloat() * creditUnit9.toFloat()
            val calculate10 = grade10.toFloat() * creditUnit10.toFloat()
            val calculate11 = grade11.toFloat() * creditUnit11.toFloat()
            val calculate12 = grade12.toFloat() * creditUnit12.toFloat()

            //Addition of all the calculation
            val addition = calculate + calculate2 + calculate3 + calculate4 + calculate5 + calculate6 + calculate7 + calculate8 + calculate9 + calculate10 + calculate11 + calculate12
           // Addition of all the credit unit
            val creditAddition = creditUnit.toFloat() + creditUnit2.toFloat() + creditUnit3.toFloat() + creditUnit4.toFloat() + creditUnit5.toFloat() + creditUnit6.toFloat() + creditUnit7.toFloat() + creditUnit8.toFloat() + creditUnit9.toFloat() + creditUnit.toFloat() + creditUnit11.toFloat() + creditUnit12.toFloat()
            //Division of calculation and creditUnit
            val total = addition / creditAddition
            //String format
            val cgpaString = String.format("%.3g%n", total)

            //displaying result
            binding.result.text = cgpaString


        }

    }

    private fun reset() {
        binding.result.text = R.string.value.toString()
        binding.creditUnit.setText("")
        binding.grade.setText("")
        binding.creditUnit2.setText("")
        binding.grade2.setText("")
        binding.creditUnit3.setText("")
        binding.grade3.setText("")
        binding.creditUnit4.setText("")
        binding.grade4.setText("")
        binding.creditUnit5.setText("")
        binding.grade5.setText("")
        binding.creditUnit6.setText("")
        binding.grade6.setText("")
        binding.creditUnit7.setText("")
        binding.grade7.setText("")
        binding.creditUnit8.setText("")
        binding.grade8.setText("")
        binding.creditUnit9.setText("")
        binding.grade9.setText("")
        binding.creditUnit10.setText("")
        binding.grade10.setText("")
        binding.creditUnit11.setText("")
        binding.grade11.setText("")
        binding.creditUnit12.setText("")
        binding.grade12.setText("")
    }
}