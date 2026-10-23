package com.juancastro

import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsTest {

    @Test
    fun testGetGreeting() {
        val greeting = Utils.getGreeting("Juan")
        assertEquals("Hello, Juan! Welcome to the Android development workspace.", greeting)
    }

    @Test
    fun testCalculateSum() {
        val sum = Utils.calculateSum(listOf(1, 2, 3, 4, 5))
        assertEquals(15, sum)
    }
}
