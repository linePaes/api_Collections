package org.collections

fun main() {
    val jonna = employee("Jonna", 4000.0, "CLT")
    val peter = employee("Peter", 5000.0, "PJ")
    val maria= employee("Maria", 1000.0, "CLT")

    val repository = Repository<employee>()

    repository.create(jonna.name, jonna)
    repository.create(peter.name, peter)
    repository.create(maria.name, maria)

    println(repository.findById(maria.name))

    println("---------------------")
    repository.finAll().forEach{
        println(it)
    }

    println("---------------------")
    println(repository.remove(maria.name))
    repository.finAll().forEach{
        println(it)
    }
}