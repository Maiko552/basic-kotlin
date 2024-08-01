package Classes

import java.time.LocalDate

class Pessoa(
    //atributos
    val nome: String,
    val cpf: String,
    val dtNascimento: LocalDate
){
    val idade = LocalDate.now().year - dtNascimento.year

    fun falar(mensagem: String){
        println("$nome falou: $mensagem")
    }

    //Funcão main dentro de UMA CLASSE
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val maikon = Pessoa("Maikon", "1234567", LocalDate.of(2001, 1,6))
            maikon.falar("Hello World!")

        }
    }

}