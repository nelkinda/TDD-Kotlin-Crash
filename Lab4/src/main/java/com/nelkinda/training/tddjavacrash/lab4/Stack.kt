package com.nelkinda.training.tddjavacrash.lab4

class Stack {
    var size = 0
        private set
    private var numbers = IntArray(0)
    val isEmpty: Boolean
        get() = size == 0

    fun push(i: Int) {
        grow()
        numbers[size++] = i
    }

    private fun grow() {
        numbers = growArray(numbers)
    }

    fun peek(): Int {
        return numbers[size - 1]
    }

    fun pop(): Int {
        if (size == 0) throw Underflow()
        return numbers[--size]
    }

    class Underflow : RuntimeException()
}