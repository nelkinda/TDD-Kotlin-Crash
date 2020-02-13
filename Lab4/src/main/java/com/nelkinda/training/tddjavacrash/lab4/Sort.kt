package com.nelkinda.training.tddjavacrash.lab4

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.stream.Stream

fun main(args: Array<String>) {
    Stream
            .of(*args)
            .map { first -> Paths.get(first) }
            .map { path -> readAllLines(path) }
            .flatMap { obj -> obj.stream() }
            .sorted()
            .forEach { x -> println(x) }
}

private fun readAllLines(path: Path): Collection<String?> {
    return try {
        Files.readAllLines(path)
    } catch (e: IOException) {
        e.printStackTrace()
        emptyList<String>()
    }
}
