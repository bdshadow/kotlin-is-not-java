package main.com.bdshadow.kotlinisnotjava.properties

import kotlin.properties.Delegates
import kotlin.reflect.KProperty


/*
 The expression after by is a delegate, because get() (and set()) corresponding to the property will be delegated to
 its getValue() and setValue() methods. Property delegates don’t have to implement any interface,
 but they have to provide a getValue() function (and setValue()--- for var s)
 */
class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

class User {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
}
