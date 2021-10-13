fun main(args: Array<String>) {

//Question 1
//Write a Kotlin program that designs a calculator.
// The program should read from the user two integer numbers and a character
// which indicates the type of operation desired. +, -, *, / and %.

    println("calculater program:")

    println("Enter first num:")
    var num1  = readLine()!! .toBigInteger()
    println("Enter second num:")
    var num2  = readLine()!! .toBigInteger()


    println("Enter the operator to calculate +, -, *, / or %:")
    var operator = readLine()

    if(operator == "+"){
        println("result is : ${num1+num2}")
    }
    else if(operator == "-"){

        println("result is : ${num1-num2}")
    } else if(operator == "*"){

        println("result is : ${num1*num2}")
    } else if(operator == "/"){

        println("result is : ${num1/num2}")
    } else if(operator == "%"){

        println("result is : ${num1%num2}")
    }

//Question 2 :-
//Complete the following program to determine the raise and new salary
// for an employee by adding if -else statements to compute the raise.
// The input to program includes the current annual salary for the employee and a number indicating
// the performance rating (1=excellent, 2=good, and 3=poor).
// An employee with a rating of 1 will receive a 6% raise,
// an employee with a rating of 2 will receive a 4% raise, and one with a rating of 3 will receive a 1.5% raise.

    println("determine the raise and new salary program")


    println("Enter the current salary:")
    var salary  = readLine()!! .toDouble()

    println("Enter performance rate from 1 to 3:")
    var rate  = readLine()!! .toInt()


    if(rate == 1){
        println("performance rating is excellent and new salary is : ${salary+salary*6/100}")

    }
    else if(rate == 2){

        println("performance rating is good and new salary is : ${salary+salary*4/100}")

    } else if(rate == 3){


        println("performance rating is poor and new salary is : ${salary+salary*1.5/100}")
    }
}