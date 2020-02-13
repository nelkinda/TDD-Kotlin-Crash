package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "a", "mom", "noon", "racecar", "Don't nod", "I did, did I?", "Red rum, sir, is murder."])
    fun testPalindrome(palindrome: String) {
        assertTrue(isPalindrome(palindrome))
    }

    @ParameterizedTest
    @ValueSource(strings = ["ab", "noun", "Just some sentence, ain't it?"])
    fun testNotPalindrome(notPalindrome: String) {
        assertFalse(isPalindrome(notPalindrome))
    }
}