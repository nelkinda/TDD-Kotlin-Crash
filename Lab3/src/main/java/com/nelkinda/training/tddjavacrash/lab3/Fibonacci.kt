package com.nelkinda.training.tddjavacrash.lab3

fun fibonacci(n: Long): Long {
    return if (n < 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)
}
