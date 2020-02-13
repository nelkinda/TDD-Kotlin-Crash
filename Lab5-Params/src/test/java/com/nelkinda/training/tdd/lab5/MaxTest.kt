package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.api.Test
import kotlin.Double.Companion.NEGATIVE_INFINITY
import kotlin.test.assertEquals

internal class MaxTest {
    @Test
    fun maxOfNothingIsNegativeInfinity() {
        assertEquals(NEGATIVE_INFINITY, max())
    }

    @Test
    fun maxOfOneNumberIsThatNumber() {
        assertEquals(42.0, max(42.0))
    }

    @Test
    fun maxOfTwoNumber() {
        assertEquals(42.0, max(23.0, 42.0))
        assertEquals(42.0, max(42.0, 23.0))
    }
}