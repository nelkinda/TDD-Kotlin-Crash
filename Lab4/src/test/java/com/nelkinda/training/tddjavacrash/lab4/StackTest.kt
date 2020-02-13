package com.nelkinda.training.tddjavacrash.lab4

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class StackTest {
    private val stack = Stack()

    @Test
    fun newStack_isEmpty() {
        assertTrue(stack.isEmpty)
        assertEquals(0, stack.size)
    }

    @Test
    fun pushingOneElement() {
        stack.push(5)
        assertFalse(stack.isEmpty)
        assertEquals(1, stack.size)
        assertEquals(5, stack.peek())
    }

    @Test
    fun poppingEmptyStack_throwsException() {
        assertThrows(Stack.Underflow::class.java) { stack.pop() }
    }

    @Test
    fun poppingOneElementStack_returnsThatElement() {
        stack.push(10)
        val actual = stack.pop()
        assertEquals(10, actual)
        assertTrue(stack.isEmpty)
        assertEquals(0, stack.size)
    }

    @Test
    fun pushingTwoElements() {
        stack.push(20)
        stack.push(30)
        assertEquals(2, stack.size)
        assertFalse(stack.isEmpty)
        assertEquals(30, stack.peek())
    }

    @Test
    fun poppingTwoElements() {
        stack.push(20)
        stack.push(30)
        assertEquals(30, stack.pop())
        assertEquals(20, stack.pop())
    }
}