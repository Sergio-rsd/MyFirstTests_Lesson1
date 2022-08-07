package com.geekbrains.myfirsttests

import org.junit.Assert.*
import org.junit.Test

class UnitTestHomeWork {
    @Test
    fun unit_AssertEquals() {
        assertEquals(5, TestAssert().isTesting(2, 3))
    }

    @Test
    fun unit_AssertNotEquals() {
        assertNotEquals(4, TestAssert().isTesting(2, 3))
    }

    @Test
    fun unit_assertArrayEquals() {
        assertArrayEquals(arrayOf(1, 2, 3), TestAssert().isTesting(arrayOf(1, 2, 3)))
    }

    @Test
    fun unit_assertNull() {
        assertNull(TestAssert().isTesting(null))
    }

    @Test
    fun unit_assertNotNull() {
        assertNotNull(TestAssert().isTesting(2, 3))
    }

    @Test
    fun unit_assertSame() {
        assertSame("Test", TestAssert().isTesting("Test"))
    }
}