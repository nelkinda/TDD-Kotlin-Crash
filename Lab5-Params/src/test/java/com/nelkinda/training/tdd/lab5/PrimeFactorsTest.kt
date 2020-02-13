package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class PrimeFactorsTest {
    @Test
    fun primeFactorsOf1() {
        assertEquals(listOf(), primeFactors(1))
    }

    @Test
    fun primeFactorsOf2() {
        assertEquals(listOf(2), primeFactors(2))
    }

    @Test
    fun primeFactorsOf3() {
        assertEquals(listOf(3), primeFactors(3))
    }

    @Test
    fun primeFactorsOf4() {
        assertEquals(listOf(2, 2), primeFactors(4))
    }
}