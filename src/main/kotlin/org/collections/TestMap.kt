package org.collections

//maps- immutable

fun main() {
    val pair: Pair<String, Double> = Pair("Aline", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Key: $k - Valor: $v") }

    val map2 = mapOf("Gustavo" to 2500.0, "Isabelle" to 3000.0 )

    map2.forEach { (k, v) -> println("Key: $k - Valor: $v") }
}
