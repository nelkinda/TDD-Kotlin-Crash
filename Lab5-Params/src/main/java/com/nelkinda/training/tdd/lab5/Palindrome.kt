package com.nelkinda.training.tdd.lab5

fun isPalindrome(candidate: String): Boolean {
    val cleanedCandidate = candidate.replace("\\W".toRegex(), "").toLowerCase()
    return cleanedCandidate == StringBuilder(cleanedCandidate).reverse().toString()
}
