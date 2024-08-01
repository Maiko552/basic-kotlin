package Arrays

import java.util.Arrays

fun main(args: Array<String>) {

    //Arryas com numeros e strings diferente do JAVA sem erro
    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos", 23, 2.55)
    var size = listaCompras.size
    var listaInteira = Arrays.toString(listaCompras)

    println(listaCompras[2])

    println("Size: $size")

    println("lista completa: $listaInteira")

}