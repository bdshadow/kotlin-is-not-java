package main.com.bdshadow.kotlinisnotjava

fun stringLength(a: String?) {
    println(a?.length);
}

fun main() {
    stringLength("abc")
    stringLength(null)
}
