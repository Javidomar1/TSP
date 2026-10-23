package psp.ut1.util

import java.io.File

/** Prepara un ProcessBuilder que lanza una clase main de Kotlin en una JVM nueva. */
fun procesoKotlin(claseMain: String, vararg args: String): ProcessBuilder {
    val java = File(System.getProperty("java.home"), "bin/java").absolutePath
    val classpath = System.getProperty("java.class.path")
    return ProcessBuilder(listOf(java, "-cp", classpath, claseMain) + args)
}