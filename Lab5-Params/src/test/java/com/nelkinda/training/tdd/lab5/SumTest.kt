package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SumTest {
    @Test
    fun sumOfNothingIsZero() {
        assertEquals(0.0, sum())
    }

    @Test
    fun sumOfSingleNumberIsThatNumber() {
        assertEquals(42.0, sum(42.0))
    }

    @Test
    fun sumOfTwoNumbers() {
        assertEquals(65.0, sum(23.0, 42.0))
    }
}