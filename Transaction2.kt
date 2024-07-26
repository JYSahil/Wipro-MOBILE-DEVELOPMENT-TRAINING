data class Transaction2(
    private var _id: Int,
    private var _amount: Double
) {
    val id: Int
        get() = _id

    var amount: Double
        get() = _amount
        set(value) {
            if (value >= 0) {
                _amount = value
            } else {
                println("Invalid amount: $value. Amount must be non-negative.")
            }
        }
}

fun <T : Collection<Transaction2>> printCollection(collection: T) {
    for (transaction in collection) {
        println("Transaction ID: ${transaction.id}, Amount: ${transaction.amount}")
    }
}

fun <T : Collection<Transaction2>> sumAmounts(collection: T): Double {
    return collection.sumOf { it.amount }
}

fun <T : Collection<Transaction2>> filterByMinAmount(collection: T, minAmount: Double): List<Transaction2> {
    return collection.filter { it.amount >= minAmount }
}

fun convertMapToCSV(map: Map<Int, Transaction2>): String {
    val header = "ID,Amount"
    val csvData = map.values.joinToString("\n") { "${it.id},${it.amount}" }
    return "$header\n$csvData"
}

fun main() {
    // Create some transactions
    val transaction1 = Transaction2(1, 100.0)
    val transaction2 = Transaction2(2, 150.0)
    val transaction3 = Transaction2(3, -50.0) // Negative amount for testing

    // Create different types of collections
    val transactionList = listOf(transaction1, transaction2, transaction3)
    val transactionSet = setOf(transaction1, transaction2, transaction3)
    val transactionMap = mapOf(
        1 to transaction1,
        2 to transaction2,
        3 to transaction3
    )

    println("List of Transactions:")
    printCollection(transactionList)

    println("\nSum of Amounts (List): ${sumAmounts(transactionList)}")

    println("\nFiltered Transactions (List) with Min Amount 0:")
    printCollection(filterByMinAmount(transactionList, 0.0))

    println("\nSet of Transactions:")
    printCollection(transactionSet)

    println("\nSum of Amounts (Set): ${sumAmounts(transactionSet)}")

    println("\nFiltered Transactions (Set) with Min Amount 0:")
    printCollection(filterByMinAmount(transactionSet, 0.0))

    println("\nTransaction Map in CSV Format:")
    println(convertMapToCSV(transactionMap))
}