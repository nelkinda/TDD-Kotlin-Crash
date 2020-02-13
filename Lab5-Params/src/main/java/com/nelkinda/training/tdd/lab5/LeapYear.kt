package com.nelkinda.training.tdd.lab5

fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
}
