package org.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("------------------------------")
    println("Maior salario: ${salarios.maxOrNull()}") //search the larger
    println("Menor salario: ${salarios.minOrNull()}") //search the smaller
    println("Media salarial: ${salarios.average()}") //search the average

    val salariosMaiorQue2500 = salarios.filter {it > 2500.0}
    println("-----------------------------")
    salariosMaiorQue2500.forEach({ println(it)})

    println("----------------------")
    //CONTA QUANTOS SALARIOS TEM DE 2K A 5K UTILIZAMOS O RANGE
    println(salarios.count{it in 2000.0..5000.0})

    println("----------------------")
    //encontra a conta que é igual a 2250.0 , vai direto.
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 50.0})

    println("----------------------")
    //search the wage, but return true or false.
    println(salarios.any {it == 1000.0})
    println(salarios.any {it == 5000.0})
}
