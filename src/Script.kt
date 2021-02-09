import java.util.Scanner;

fun sayHello(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

val scan = Scanner(System.`in`)

fun main() {
    val person = Person()
    person.printInfo()

}


