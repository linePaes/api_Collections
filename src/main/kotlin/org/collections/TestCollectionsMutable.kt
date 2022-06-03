package org.collections

//list, set e map - not mutable
//mutableList used to create mutable lists from which elements can be removed or added.

fun main() {

    val jonna = employee("Jonna", 4000.0, "CLT")
    val peter = employee("Peter", 5000.0, "PJ")
    val maria= employee("Maria", 1000.0, "CLT")

    val employees = mutableListOf(jonna, maria)
    employees.forEach{
        println(it)
    }
    println("-------------------")

    employees.add(peter)
    employees.forEach{
        println(it)
    }
    println("-------------------")

    employees.remove(maria)
    employees.forEach{
        println(it)
    }
    println("--------SET--------")

    val employeesSet = mutableSetOf(maria)
    employeesSet.forEach{
        println(it)
    }

}