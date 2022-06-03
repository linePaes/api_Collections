package org.collections

fun main() {
    val wage = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal())

    println("--------------")
    println(wage.sum())

    println("--------------")
    println(wage.average())
}