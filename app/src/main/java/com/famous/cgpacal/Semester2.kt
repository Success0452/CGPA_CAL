package com.famous.cgpacal

class Semester2
{

    var grade:String?=null;

    fun result(first:Float,second:Float,three: Float, four: Float,
               five: Float, six: Float, seven: Float, eight: Float):String?{


        val firstPercentResult = (first + second) / 2
        val secondPercentResult = (three + four)  / 2
        val threePercentResult = (five + six)  / 2
        val fourPercentResult = (seven + eight)  / 2

        val totalCgpa =
                (firstPercentResult + secondPercentResult + threePercentResult
                        + fourPercentResult ) / 4;

        val cgpaString = String.format("%.3g%n", totalCgpa)
        val Cgpa = cgpaString.toFloat()
        if (Cgpa >= 4.50) {
            grade= "(A)"
        } else if (Cgpa < 5.0 && Cgpa >= 4.50) {
            grade=  "(A)"
        } else if (Cgpa < 4.49 && Cgpa >= 3.50) {
            grade= "(B)"
        } else if (Cgpa < 3.49 && Cgpa >= 2.50) {
            grade=  "(C)"
        } else if (Cgpa < 2.49 && Cgpa >= 1.50) {
            grade=  "(D)"
        } else if (Cgpa < 1.49 && Cgpa >= 0.00 ) {
            grade=  "(FAIL)"
        }

        return Cgpa.toString()+ "\t\t" + grade ;
    }
}