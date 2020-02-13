package com.nelkinda.training.tddjavacrash.lab3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FibonacciTest {
    @Test
    fun fibonacciOfZeroIsOne() {
        assertEquals(1, fibonacci(0))
    }

    @Test
    fun fibonacciOfOneIsOne() {
        assertEquals(1, fibonacci(1))
    }

    @Test
    fun fibonacciOfTwoIsTwo() {
        assertEquals(2, fibonacci(2))
    }

    @Test
    fun fibonacciOfThreeIsThree() {
        assertEquals(3, fibonacci(3))
    }

    @Test
    fun fibonacciOfFourIsFive() {
        assertEquals(5, fibonacci(4))
    }
}