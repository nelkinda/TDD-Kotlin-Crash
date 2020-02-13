package com.nelkinda.training.tddjavacrash.lab3

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class LeapYearTest {
    @Test
    fun nonLeapYears() {
        assertAll(
                { assertFalse(isLeapYear(2019)) },
                { assertFalse(isLeapYear(2100)) }
        )
    }

    @Test
    fun leapYears() {
        assertAll(
                { assertTrue(isLeapYear(2020)) },
                { assertTrue(isLeapYear(2000)) }
        )
    }
}