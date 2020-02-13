package com.nelkinda.training.tdd.lab5

fun average(vararg numbers: Double): Double {
    val sum = sum(*numbers)
    return sum / numbers.size
}
