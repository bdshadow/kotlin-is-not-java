package main.com.bdshadow.kotlinisnotjava.properties

// https://stackoverflow.com/questions/55356837/what-is-the-difference-between-init-block-and-constructor-in-kotlin

class Sample(var s : String) {
    constructor(t: String, u: String) : this(t) {
        this.s += u
    }
    init {
        s += "B"
    }
}

fun main() {
    val a = Sample("T","U")
    println(a.s)
}