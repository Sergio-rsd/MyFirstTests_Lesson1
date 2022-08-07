package com.geekbrains.myfirsttests

class TestAssert {
    // ДЗ
    fun isTesting(i: Int, j: Int): Int {
        return i + j
    }

    fun isTesting(array: Array<Int>): Array<Int> {
        return array
    }

    fun isTesting(nothing: Nothing?): Any? {
        return nothing
    }

    fun isTesting(objectBody: Any): Any {
        return objectBody
    }
}