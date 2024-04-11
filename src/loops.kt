fun main() {
    //While loop
    var number =  200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    //Decrement
    var v =  100
    while (v >= 95) {
        println("counter is $v")
        v--
    }

    //Doo...while
    var num =  20
   do {
       println(num)
       num++
   }
       while (num <= 10)

       //For loop
       var furniture = arrayOf("Table","Chair","Desk")
       for (z in furniture){
           println(z)
       }
    var marks = arrayOf(25,30,35,40,45,50)
    for (a in marks){
        println(a)
    }
    //Range
    for (number in 30..35){
        println(number)
    }
    for (letter in 'a'..'d'){
        println(letter )
    }


}