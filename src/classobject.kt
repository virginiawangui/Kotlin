class Person{
    //Attributes/Properties
    var name = "Johari"
    var age = 32
    var gender = "Female"

    //Methods/Functions
    fun walk(){
        println("Person is walking ")
    }

}

fun main() {
    var accountant = Person()
    accountant.walk()

    println(accountant.gender)
}