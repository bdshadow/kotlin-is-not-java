package main.com.bdshadow.kotlinisnotjava

val text1 = """
    for (c in "foo")
        print(c)
"""

val text2 = """
    for (c in "foo")
        print(c)
    """.trimMargin()

val text3 = """
    $text1
    """

fun main() {
    println("text1 = {$text1}")
    println("text2 = {$text2}")
    println("text3 = {$text3}")
}