package com.nelkinda.training.tddjavacrash.lab4

fun growArray(numbers: IntArray): IntArray {
    val newNumbers = IntArray(numbers.size + 1)
    System.arraycopy(numbers, 0, newNumbers, 0, numbers.size)
    return newNumbers
}
