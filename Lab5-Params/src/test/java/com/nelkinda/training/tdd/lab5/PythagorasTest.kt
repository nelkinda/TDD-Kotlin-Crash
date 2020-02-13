package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import kotlin.test.assertEquals

internal class PythagorasTest {
    @ParameterizedTest
    @CsvFileSource(resources = ["pythagoras-test-data.csv"], numLinesToSkip = 1)
    fun testPythagoras(a: Double, b: Double, expectedC: Double) {
        assertEquals(expectedC, pythagoras(a, b))
    }
}