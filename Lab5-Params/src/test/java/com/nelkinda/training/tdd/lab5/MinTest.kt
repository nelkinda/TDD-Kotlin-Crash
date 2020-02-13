package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.api.Test
import kotlin.Double.Companion.POSITIVE_INFINITY
import kotlin.test.assertEquals

internal class MinTest {
    @Test
    fun minOfNothingIsInfinity() {
        assertEquals(POSITIVE_INFINITY, min())
    }

    @Test
    fun minOfOneNumberIsThatNumber() {
        assertEquals(42.0, min(42.0))
    }

    @Test
    fun maxOfTwoNumber() {
        assertEquals(23.0, min(23.0, 42.0))
        assertEquals(23.0, min(42.0, 23.0))
    }
}