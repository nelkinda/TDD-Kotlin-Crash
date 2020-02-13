package com.nelkinda.training.tdd.lab5

fun min(vararg numbers: Double): Double {
    var minValue = Double.POSITIVE_INFINITY
    for (number in numbers) if (number < minValue) minValue = number
    return minValue
}
