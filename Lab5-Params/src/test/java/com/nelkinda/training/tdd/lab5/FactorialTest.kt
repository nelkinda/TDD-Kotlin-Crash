package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

internal class FactorialTest {
    @ParameterizedTest
    @CsvSource("0, 1", "1, 1", "2, 2", "3, 6", "4, 24", "5, 120", "6, 720")
    fun testFactorial(n: Long, expected: Long) {
        assertEquals(expected, factorial(n))
    }
}