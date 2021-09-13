package main.com.bdshadow.kotlinisnotjava.classes

fun eval(expr: Expr): Int =
    // smart casts
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
    }

/*
Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.
All direct subclasses of a sealed class are known at compile time. No other subclasses may appear after a module with
the sealed class is compiled. For example, third-party clients can't extend your sealed class in their code.
Thus, each instance of a sealed class has a type from a limited set that is known when this class is compiled.
 */
sealed interface Expr
sealed class MathExpr(): Expr
class Num(val value: Int) : MathExpr()
class Sum(val left: Expr, val right: Expr) : MathExpr()