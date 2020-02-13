package com.nelkinda.training.tdd.lab5

fun fizzBuzz(number: Int): String {
    if (number % 15 == 0) return "FizzBuzz"
    if (number % 3 == 0) return "Fizz"
    return if (number % 5 == 0) "Buzz" else number.toString()
}
