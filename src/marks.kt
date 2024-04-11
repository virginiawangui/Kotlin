import java.util.Scanner

fun main() {

    var input = Scanner(System.`in`)

    print("Enter mark scored:")
    var mark = input.nextInt()

    //To find out Grade based on Percentage
   when (mark){
       in 80..100 -> println("Grade:A")
       in 60..79 -> println("Grade:B")
       in 40..59 -> println("Grade:C")
       in 20..39 -> println("Grade:D")
       in 0..20 -> println("Grade:E")
       else -> println("Invalid mark")

   }


}