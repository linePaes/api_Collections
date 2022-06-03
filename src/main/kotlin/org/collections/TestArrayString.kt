package org.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Joana"
    nomes[2] = "Aline"

    for (nome in nomes) {
        println(nome)
    }

    println("-----------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("-----------")
    val nomes2 = arrayOf("Maria","Joana","Aline")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}