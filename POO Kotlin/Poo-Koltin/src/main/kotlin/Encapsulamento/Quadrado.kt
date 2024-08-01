package Encapsulamento

class Quadrado(val width:Int, val height:Int) {
    val isQuadrado:Boolean
        get(){
            return width == height
        }

    val area:Int
        get() {
            return width*height
        }

}

fun main() {
    val quadrado = Quadrado(10, 5)
    println(quadrado.isQuadrado) //false
    println(quadrado.area)
}