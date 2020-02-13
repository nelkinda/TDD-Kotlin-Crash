package com.nelkinda.training.tddjavacrash.lab3

fun factorial(n: Long): Long {
    return if (n == 0L) 1 else n * factorial(n - 1)
}
