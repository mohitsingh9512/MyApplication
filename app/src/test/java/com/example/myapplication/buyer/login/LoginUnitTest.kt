package com.example.myapplication.buyer.login

import com.example.myapplication.BaseTesting
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LoginUnitTest : BaseTesting() {

    @Test
    fun subtraction_isCorrect() {
        description = "\n Checks if Subtraction is correct (should return true)";
        assertEquals(0, 2 - 2)
    }
}