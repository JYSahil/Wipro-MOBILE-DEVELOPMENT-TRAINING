fun main() {
    val transactions = listOf("Groceries", "Electricity", "Movies", "Books")

    for (transaction in transactions) {
        val category = categorizeTransaction(transaction)
        println("Transaction: $transaction, Category: $category")
    }
}
fun categorizeTransaction(transaction: String): String {
    return when (transaction) {
        "Groceries", "Restaurant", "Coffee" -> "Food"
        "Electricity", "Water", "Internet" -> "Utilities"
        "Movies", "Concert", "Games" -> "Entertainment"
        else -> "Other"
    }
}


/*
* fun main(){
val day = 3

val Transaction = when (day) {
    1 -> "Transaction: Groceries, Category: Food"
    2 -> "Transaction: Electricity, Category: Utilities"
    3 -> "Transaction: Movies, Category: Entertainment"

    else -> "Invalid day"
}

println(Transaction)
}




* */
