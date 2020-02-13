package com.nelkinda.training.tdd.lab5

fun primeFactors(number: Int): List<Int> {
    var number = number
    val primeFactors: MutableList<Int> = ArrayList()
    for (factor in 2..number) while (number % factor == 0) {
        primeFactors.add(factor)
        number /= factor
    }
    return primeFactors
}
