package main.com.bdshadow.kotlinisnotjava

/**
 * The type of the throw expression is the special type Nothing.
 * The type has no values and is used to mark code locations that can never be reached.
 * In your own code, you can use Nothing to mark a function that never returns:
 */
fun methodReturningNothing(): Nothing {
    throw IllegalArgumentException("")
}