package org.collections

data class Employee(
    val name: String,
    val wage: Double,
    val hiringtype: String)
{
    //return
    override fun toString(): String =
        """
            name: $name
            wage: $wage
        """.trimIndent()
}