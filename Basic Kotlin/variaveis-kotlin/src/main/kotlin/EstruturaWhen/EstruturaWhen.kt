package EstruturaWhen

fun main() {

    var opcao = 1

//    when(opcao){
//        1 -> println("Suco de laranja")
//        2 -> println("Suco de uva")
//        3 -> println("Suco de morango")
//        else -> println("Nenhuma opcao foi selecionada")
//    }
//
    var mensagem = when(opcao){
        1 -> "Suco de Laranja"
        2 -> "Suco de Uva"
        3 -> "Suco de Morango"
        else -> "Nenhuma opcao foi selecionada"
    }

    println(mensagem)
}