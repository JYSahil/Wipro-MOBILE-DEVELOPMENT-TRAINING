fun main(){
    // Defining a class
    class Transaction(val category: String, var amount: String, var date: String)

// Creating an object
    val transaction = Transaction ("Apple", amount = "4", date = "18 july")

    println ("Transaction Details:")
    println ("Category: ${transaction.category}")
    println ("Amount: ${transaction.amount}")
    println ("Date: ${transaction.date}")

}