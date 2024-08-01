package Classes

fun main() {
    //Instancia
    val carro = Carro()
    carro.cor = "Preto"

    carro.abrirPorta()
    carro.marchas()
    println(carro.cor)
}

class Carro{
    //atributos
    var cor: String = ""

    //métodos
    fun abrirPorta(){
        println("Porta aberta")
    }

    fun primeiraMarcha(){
        println("Passando a primeira marcha")
    }
    fun segundaMarcha(){
        println("Passando a segunda marcha")
    }
    fun marchas(){
        this.primeiraMarcha()
        this.segundaMarcha()
    }
}