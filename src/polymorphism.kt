//Parent class

open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

//Child class

class Rhombus:Shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}

class Parallelogram:Shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}



fun main(){
    var s = Shape()
    s.draw()

    var t = Rhombus()
    t.draw()

    var v = Parallelogram()
    v.draw()
}