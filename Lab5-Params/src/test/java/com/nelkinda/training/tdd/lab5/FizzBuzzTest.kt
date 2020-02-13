package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FizzBuzzTest {
    @Test
    fun one() {
        assertEquals("1", fizzBuzz(1))
    }

    @Test
    fun two() {
        assertEquals("2", fizzBuzz(2))
    }

    @Test
    fun three() {
        assertEquals("Fizz", fizzBuzz(3))
    }

    @Test
    fun four() {
        assertEquals("4", fizzBuzz(4))
    }

    @Test
    fun five() {
        assertEquals("Buzz", fizzBuzz(5))
    }

    @Test
    fun six() {
        assertEquals("Fizz", fizzBuzz(6))
    }

    @Test
    fun ten() {
        assertEquals("Buzz", fizzBuzz(10))
    }

    @Test
    fun fifteen() {
        assertEquals("FizzBuzz", fizzBuzz(15))
    }

    @Test
    fun thirty() {
        assertEquals("FizzBuzz", fizzBuzz(30))
    }
}