package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class LeapYearTest {
    @ParameterizedTest
    @ValueSource(ints = [2019, 1900])
    fun testNotLeapYears(notLeapYear: Int) {
        assertFalse(isLeapYear(notLeapYear))
    }

    @ParameterizedTest
    @ValueSource(ints = [2020, 2000])
    fun testLeapYears(leapYear: Int) {
        assertTrue(isLeapYear(leapYear))
    }
}