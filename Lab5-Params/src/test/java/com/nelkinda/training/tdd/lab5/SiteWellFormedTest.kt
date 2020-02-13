package com.nelkinda.training.tdd.lab5

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.w3c.dom.bootstrap.DOMImplementationRegistry
import org.w3c.dom.ls.DOMImplementationLS
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes
import java.util.function.BiPredicate
import java.util.stream.Stream
import kotlin.test.assertTrue

internal class SiteWellFormedTest {
    @ParameterizedTest
    @MethodSource("siteFiles")
    @Throws(IllegalAccessException::class, ClassNotFoundException::class, InstantiationException::class)
    fun siteFileIsValid(path: Path) {
        assertTrue(isValid(path))
    }

    companion object {
        @Throws(IOException::class)
        fun siteFiles(): Stream<Path> {
            return Files.find(
                    Path.of("src", "main", "resources", "site"), Int.MAX_VALUE,
                    BiPredicate { path: Path, basicFileAttributes: BasicFileAttributes? -> path.toString().endsWith(".xhtml") }
            )
        }

        @Throws(InstantiationException::class, IllegalAccessException::class, ClassNotFoundException::class)
        fun isValid(path: Path): Boolean {
            val domImpl = DOMImplementationRegistry.newInstance().getDOMImplementation("LS") as DOMImplementationLS
            val lsInput = domImpl.createLSInput()
            val lsParser = domImpl.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, null)
            lsInput.systemId = path.toUri().toString()
            return try {
                lsParser.parse(lsInput)
                true
            } catch (e: Exception) {
                false
            }
        }
    }
}