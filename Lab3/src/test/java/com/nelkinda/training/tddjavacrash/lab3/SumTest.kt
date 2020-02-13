package com.nelkinda.training.tddjavacrash.lab3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SumTest {
    @Test
    fun sumOfNothing_isZero() {
        assertEquals(0, sum())
    }

    @Test
    fun sumOfOne_isOne() {
        assertEquals(1, sum(1))
    }

    @Test
    fun sumOfTwoNumbers() {
        assertEquals(12, sum(5, 7))
    }
}