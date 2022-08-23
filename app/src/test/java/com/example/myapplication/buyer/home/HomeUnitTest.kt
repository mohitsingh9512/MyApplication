package com.example.myapplication.buyer.home

import com.example.myapplication.BaseTesting
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class HomeUnitTest : BaseTesting() {

    @Test
    fun addition_isCorrect() {
        description = "\n Checks if Addition is correct (should return true)";
        assertEquals(4, 2 + 2)
    }
}