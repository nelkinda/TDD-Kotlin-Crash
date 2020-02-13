package com.nelkinda.training.tddjavacrash.lab3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FactorialTest {
    @Test
    fun factorialOfZeroIsOne() {
        assertEquals(1, factorial(0))
    }

    @Test
    fun factorialOfOneIsOne() {
        assertEquals(1, factorial(1))
    }

    @Test
    fun factorialOfTwoIsTwo() {
        assertEquals(2, factorial(2))
    }
}