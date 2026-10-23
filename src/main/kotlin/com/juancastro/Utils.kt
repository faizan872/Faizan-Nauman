package com.juancastro

/**
 * Utility functions for Juan Andrés Castro's project.
 */
object Utils {
    /**
     * Formats a greeting message for the given name.
     */
    fun getGreeting(name: String = "Juan Andrés Castro"): String {
        return "Hello, $name! Welcome to the Android development workspace."
    }

    /**
     * Calculates the sum of a list of integers.
     */
    fun calculateSum(numbers: List<Int>): Int {
        return numbers.sum()
    }
}
