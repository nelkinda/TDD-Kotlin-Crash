package com.nelkinda.training.tdd.lab5

fun max(vararg numbers: Double): Double {
    var maxValue = Double.NEGATIVE_INFINITY
    for (number in numbers) if (number > maxValue) maxValue = number
    return maxValue
}
