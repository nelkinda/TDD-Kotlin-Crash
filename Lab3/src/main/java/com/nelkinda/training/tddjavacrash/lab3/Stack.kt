package com.nelkinda.training.tddjavacrash.lab3

class Stack {
    private var data = IntArray(0)
    var size = 0
        private set
    val isEmpty: Boolean
        get() = size == 0

    fun push(number: Int) {
        if (data.size == size) grow()
        data[size++] = number
    }

    fun pop(): Int {
        if (size == 0) throw Underflow()
        return data[--size]
    }

    fun peek(): Int {
        if (size == 0) throw Underflow()
        return data[size - 1]
    }

    private fun grow() {
        val oldData = data
        val newData = IntArray((oldData.size * 1.5 + 1).toInt())
        System.arraycopy(oldData, 0, newData, 0, oldData.size)
        data = newData
    }

    class Underflow : RuntimeException()
}