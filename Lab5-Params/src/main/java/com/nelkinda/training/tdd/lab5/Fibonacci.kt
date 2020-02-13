package com.nelkinda.training.tdd.lab5

fun fibonacci(n: Long): Long {
    return if (n == 0L || n == 1L) 1 else fibonacci(n - 1) + fibonacci(n - 2)
}
