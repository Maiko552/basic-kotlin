package EstruturaRepetição.Enquanto


fun main() {


    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos")
    var indice = 0
    var size = listaCompras.size-1

    //Estrutura de Repetição - While
    // .size cria mais um indice por isso precisamos do -1
    while (indice <= size ) {
        println(listaCompras[indice])
        indice++
    }
}
