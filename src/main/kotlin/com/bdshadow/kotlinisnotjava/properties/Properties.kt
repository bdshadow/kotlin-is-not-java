package main.com.bdshadow.kotlinisnotjava.properties

const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

class Rectangle(val width: Int, val height: Int) {

    val square get() = this.width * this.height

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            value + "" // parses the string and assigns values to other properties
        }

    var setterVisibility: String = "abc"
        private set // the setter is private and has the default implementation

    var counter = 0 // the initializer assigns the backing field directly
        set(value) {
            if (value >= 0)
                field = value
            // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
        }
}