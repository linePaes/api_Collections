package org.collections

fun main() {
    val joao = employee("Joao", 4000.0, "CLT")
    val pedro = employee("Pedro", 5000.0, "PJ")
    val maria= employee("Maria", 1000.0, "CLT")

    val employees1 = setOf(joao, pedro)
    val employees2 = setOf(maria)

    val resultUnion = employees1.union(employees2)
    resultUnion.forEach{
        println(it)
    }

    println("----------------------------")
    val employees3 = setOf(joao,pedro, maria)
    val resultSubtract = employees3.subtract(employees2)
    resultSubtract.forEach{
        println(it)
    }

    println("----------------------------")
    val resultIntersect = employees3.intersect(employees2)
    resultIntersect.forEach{
        println(it)
    }
}