package com.feliciamarlove.app

fun main() {
    val input = Reader.read()
    println("Total numbers: ${input.size}.")
    val max = input.maxOrNull()
    println("The greatest number: $max (${input.count { i -> i == max }} time(s)).")
}

