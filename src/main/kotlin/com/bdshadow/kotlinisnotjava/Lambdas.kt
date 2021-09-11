package main.com.bdshadow.kotlinisnotjava

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }


fun main() {
    println(sum(1,2))

    // According to Kotlin convention, if the last parameter of a function is a function,
    // then a lambda expression passed as the corresponding argument can be placed outside the parentheses
    // Such syntax is also known as trailing lambda
    val array = Array(5) { i -> (i * i).toString() }
    array.forEach { x -> println(x) }
}