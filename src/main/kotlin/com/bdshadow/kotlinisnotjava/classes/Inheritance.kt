package main.com.bdshadow.kotlinisnotjava.classes

open class Base(p: Int)
class Derived(p: Int) : Base(p)

class MyView : Base {
    constructor(p: Int) : super(p)

    constructor(p: Int, attrs: List<String>) : super(p)
}