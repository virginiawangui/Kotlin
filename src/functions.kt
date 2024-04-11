fun main() {
    //Predefined functions
    println("Hello Kotlin")

    var x = Math.min(55,85)
    println(x)

    var v = Math.max(90,124)
    println("The maximum value is $v")

    var t = Math.round(54.67)
    println(t)

    name()
    product(12,15)
    product(17,12)
    details("Ivan",18)

}
//User defined function
fun name() {
    println("Taraga")

}

fun product(num1:Int, num2:Int){

    println(num1*num2)
}

fun details(name:String,age:Int){
    println("$name is $age years old")
}

