/*
 * This Kotlin source file was generated by the Gradle "init" task.
 */
package dev.wary.wordle

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolverTest {
    @Test fun testConstructor() {
        val solver = Solver()
        assertEquals(5, solver.wordLength)
        assertEquals(12947, solver.reset())
    }
}
