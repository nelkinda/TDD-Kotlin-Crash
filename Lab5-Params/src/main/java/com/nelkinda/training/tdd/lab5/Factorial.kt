package com.nelkinda.training.tdd.lab5

fun factorial(n: Long): Long {
    return if (n == 0L) 1 else n * factorial(n - 1)
}
