package com.example.tiptime

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

class TipTimeTest {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val percentTip = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, percentTip, false)

        assertEquals(expectedTip, actualTip)
    }
}