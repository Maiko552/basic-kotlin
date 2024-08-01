package EstruturaRepetição.Para


fun main() {


    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos")
    var size = listaCompras.size - 1

    //Estrutura de Repetição - For
    // colocar ..
    for (indice in 0..size) println(listaCompras[indice])
}