package com.nelkinda.training.tddjavacrash.lab1

import com.nelkinda.training.tddjavacrash.lab1.Hello.main
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.Charset

internal class HelloTest {
    private lateinit var interceptedStdout: ByteArrayOutputStream

    @BeforeEach
    fun interceptStdout() {
        interceptedStdout = ByteArrayOutputStream()
        System.setOut(PrintStream(interceptedStdout))
    }

    @AfterEach
    fun restoreStdout() {
        System.setOut(originalStdout)
    }

    @Test
    fun testHello() {
        main()
        val expected = String.format("Hello, world!%n")
        val actual = interceptedStdout.toString(Charset.defaultCharset())
        Assertions.assertEquals(expected, actual)
    }

    companion object {
        private val originalStdout = System.out
    }
}