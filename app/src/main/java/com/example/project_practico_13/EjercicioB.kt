package com.example.project_practico_13
//SUPERHERO
class EjercicioB {
}

data class Heroe(
    val superheroe: String,
    val publisher: String,
    val realName: String,
    val photo: String
)

fun main() {
    var superheroe: String
    var publisher: String
    var realName: String
    var photo: String
    var i = 0
    var reingreso: String = "Si"
    var heroesList = mutableListOf<Heroe>()

    println("Datos superheroe")

    do{
        println("Ingrese el nombre: ")
        superheroe = readln()

        print("Ingrese el publisher: ")
        publisher = readln()

        print("Ingrese el nombre real: ")
        realName = readln()

        println("Ingrese una foto: ")
        photo = readln()
        heroesList.add(Heroe(superheroe, publisher, realName, photo))

        println("¿Quiere ingresar otro heroe? Ingrese Si para ingresar otro heroe")
        reingreso = readln()

    }while (reingreso.equals("Si".uppercase().lowercase()))

    for (h in heroesList) {
        println(h)
    }

}