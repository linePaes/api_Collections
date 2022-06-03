package org.collections

fun main() {

    val joao = employee("Joao", 4000.0, "CLT")
    val pedro = employee("Pedro", 5000.0, "PJ")
    val maria= employee("Maria", 1000.0, "CLT")

    val employees = listOf(joao, pedro, maria)

    employees.forEach(){
        println(it)
    }
    println("------------------------------")
    println(employees.find{it.name == "Maria"})

    println("------------------------------")
    employees.sortedBy { it.wage}.forEach{
        println(it)
    }
    //groupBy- separate by group
    println("------------------------------")
    employees.groupBy { it.hiringtype}.forEach{
        println(it)
    }

}
//USE WHEN MANIPULATING THE DATA STRUCTURE.
data class employee(
    val name: String,
    val wage: Double,
    val hiringtype: String
) {
    //return
    override fun toString(): String =
        """
            name: $name
            wage: $wage
        """.trimIndent()
}

