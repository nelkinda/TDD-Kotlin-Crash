package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

internal class FibonacciTest {
    @ParameterizedTest
    @CsvSource("0, 1", "1, 1", "2, 2", "3, 3", "4, 5", "5, 8", "6, 13")
    fun testFibonacci(n: Long, expected: Long) {
        assertEquals(expected, fibonacci(n))
    }
}