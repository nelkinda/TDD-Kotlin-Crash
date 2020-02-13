package com.nelkinda.training.tdd.lab5

fun sum(vararg numbers: Double): Double {
    var sum = 0.0
    for (number in numbers) sum += number
    return sum
}
