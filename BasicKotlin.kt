
// variable
/*var a: Int = 5
// val --> final, constant
val b = 6

var name: String = "Aaryan"
var name2: String = "Arush"
println(name[name.length - 1])
println(name.toUpperCase())
println(name.toLowerCase())
println("There are two names \n1. " + name + "\n2. " + name2)
println("There are two names \n1. $name\n2. $name2") // String Templates/Interpolation

if(a > b) {
    println("2 is greater")
} else if(a == b) {
    println("2 is equal")
} else {
    println("2 is lesser")
}

val hours = 15
val greeting = if(hours < 15) "Good day" else "Good eve"
println(greeting)

// when
  val day = 10
val result = when(day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3-> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"

    else -> "Invalid day"
}

println(result)

var i = 0
do {
    println(i)
    i++
} while(i < 5)

var i = 0
while(i < 10) {
    if(i == 4) {
        i++
        continue
    }
    if(i == 6) {
        break
    }
    println(i)
    i++
}

val cars = arrayOf("Fortuner", "BMW 330i", "Tourbillion", "RR", "Nexon", "Porsche Taycan")

for(car in cars) {
    println(car)
}

// a --> z
for(ch in 'a'..'z') {
    println(ch)
}

for(num in 34..45){
    println(num)
}
fun addFunc(a: Int, b: Int): Int {
    return (a + b);
}
fun main(){
    val result=addFunc(3,4)
    println(result);
}

fun main() {
  val a = "Hello world"
println(a);
}


fun main() {

    val name: String = "SAHIL GAUTAM"
    var a: Int = 30

// Printing values
    println("Name: $name, Integer Value: $a")

}

fun main(){
    val a = 5 + 3
    val b = 10 - 2
    val c = 4 * 7
    val d = 20 / 4
    val e = 15 % 4

    println("Sum: $a")
    println("minus: $b")
    println("multiply: $c")
    println("Quotient: $d")
    println("Remainder: $e")

}
*/
/*
fun main(){
    val num = 10
    val a = 2
    if (num > 0) {
        println("Positive number")
    } else {
        println("Non-positive number")
    }
// When expression
    when (a) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other number")
    }
}   */
fun main() {
    // For loop
    /* for (i in 1..5) {
        println("i: $i")
    }

// While loop
    var i = 5
    while (i > 0) {
        print("i: $i")
        i--
        //break
    }

     */


    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        if (i == 6) {
            break
        }
        println(i)
        i++
    }
}
