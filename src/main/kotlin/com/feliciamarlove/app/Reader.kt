package com.feliciamarlove.app

import java.util.*

class Reader {

    companion object {
        fun read(): List<Int> {
            val integers = mutableListOf<Int>()
            val sc = Scanner(System.`in`)
            while (sc.hasNext()) {
                val values = sc.next().split(" ")
                values.forEach { i -> integers.add(i.toInt()) }
            }
            return integers
        }
    }
}
