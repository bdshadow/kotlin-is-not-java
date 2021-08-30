package main.com.bdshadow.kotlinisnotjava

/*
    Functions `sum1` and `sum2` are equivalent
 */

fun sum1(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int) = a + b

/*
    If a default parameter precedes a parameter with no default value,
    the default value can only be used by calling the function with named arguments
 */
fun firstArgWithDefault(
    bar: Int = 0,
    baz: Int,
) {}

fun main() {
    println("sum of 19 and 23 is ${sum2(19, 23)}")
    println(firstArgWithDefault(baz = 1))
}
