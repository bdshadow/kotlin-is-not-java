package main.com.bdshadow.kotlinisnotjava

inline fun <T> Collection<T>.each1(block: (T) -> Unit) {
    for (e in this) block(e)
}

fun <T> Collection<T>.each2(block: (T) -> Unit) {
    for (e in this) block(e)
}

// non-local returns
fun <T> List<T>.eachIndexed(f: (Int, T) -> Unit) {
    for (i in indices) {
        f(i, this[i])
    }
}

fun <T> List<T>.indexOf(x: T): Int {
    eachIndexed { index, value ->
        if (value == x) {
            // return index - RETURN IS NOT ALLOWED HERE, BUT INLINE-ING of eachIndexed SOLVES THIS PROBLEM
        }
    }
    return -1
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // decompile to see the difference
    // the call to each2 is just substituted with the code from the lambda definition
    numbers.each1 { println(it) }
    numbers.each2 { println(it) }
}