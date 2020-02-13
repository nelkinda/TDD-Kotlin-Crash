package com.nelkinda.training.tddjavacrash.lab3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class StackTest {
    @Test
    fun test() {
        val stack = Stack()
        assertTrue(stack.isEmpty)
        assertEquals(0, stack.size)
        stack.push(5)
        assertFalse(stack.isEmpty)
        assertEquals(1, stack.size)
        assertEquals(5, stack.peek())
        stack.push(10)
        assertFalse(stack.isEmpty)
        assertEquals(2, stack.size)
        assertEquals(10, stack.peek())
        assertEquals(10, stack.pop())
        assertFalse(stack.isEmpty)
        assertEquals(1, stack.size)
        assertEquals(5, stack.pop())
        assertTrue(stack.isEmpty)
        assertEquals(0, stack.size)
    }
}