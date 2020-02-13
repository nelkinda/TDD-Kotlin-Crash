package com.nelkinda.training.tdd

class Calculator {
    private var value = 0.0
    fun reset() {
        value = 0.0
    }

    val display: String
        get() = String.format("%f", value)

    fun enter(input: String) {
        for (c in input.toCharArray()) enter(c)
    }

    fun enter(c: Char) {}
}