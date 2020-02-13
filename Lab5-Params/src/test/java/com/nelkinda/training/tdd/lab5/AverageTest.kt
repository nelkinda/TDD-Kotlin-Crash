package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.api.Test
import kotlin.Double.Companion.NaN
import kotlin.test.assertEquals

internal class AverageTest {
    @Test
    fun averageOfNothingIsZero() {
        assertEquals(NaN, average())
    }

    @Test
    fun averageOfSingleNumberIsThatNumber() {
        assertEquals(42.0, average(42.0))
    }

    @Test
    fun averageOfTwoNumbers() {
        assertEquals(20.0, average(10.0, 30.0))
    }

    @Test
    fun averageOfMirrorNumbersIsZero() {
        assertEquals(0.0, average(42.0, -42.0, 23.0, -23.0))
    }
}