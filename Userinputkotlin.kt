/*
fun main() {
    print("Enter the first number: ")
    val a = readLine()
    val firstNumber = a?.toIntOrNull()
    print("Enter the second number: ")
    val b = readLine()
    val secondNumber = b?.toIntOrNull()
    if (firstNumber == null || secondNumber == null) {
        println("Invalid input.")
        return
    }
    if (firstNumber == secondNumber) {
        println("numbers are equal.")
    } else if (firstNumber > secondNumber) {
        println("$firstNumber is greater")
    } else {
        println("$secondNumber is greater")
    }
}
*/

fun main(){
    print("Enter age: ")
    val a = readLine()
    val age = a?.toIntOrNull()
    if (age == null) {
        println("Invalid input. Please enter a valid integer.")
        return
    }
    val lifeStage = when (age) {
        in 0..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..64 -> "Adult"
        in 65..120 -> "Senior"
        else -> "Invalid age"
    }

    println("You are a $lifeStage.")

}














