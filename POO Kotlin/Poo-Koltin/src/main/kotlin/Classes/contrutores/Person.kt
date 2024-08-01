package Classes.contrutores

//Construtor primario
//parametros do construtor nao é um atributo da classe desse jeito
//nao consigo acessa-las p.
class Person(firstName:String, lastName:String) {

    //uma variavel nunca pode ser atribuida sem nada porém podemos deixa-la vazia
    var completeName:String = ""

    //ação dentro do block init
    init {
        println("bloco init: firstName = $firstName, lastName = $lastName")
        this.completeName = "variável completeName: $firstName $lastName"
    }
}

//se eu declarar que é uma variável as coisas mudam
class Carro(val nome:String, val cor:String){

}

fun main() {

    println("Classe Person: ")
    //parametros do construtor nao é um atributo da classe
    //nao consigo acessa-las p.
    val p = Person("Maikon", "Sposito")
    println(p.completeName)

    println("Classe carro: ")
    //Agora detecta os atributos na classe carro
    val c = Carro("palio", "verde")
    println(c.cor)

}