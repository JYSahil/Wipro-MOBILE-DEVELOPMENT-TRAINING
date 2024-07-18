import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Transaction(val id: Int, val date: String, val amount: Double)

fun main() {
    val transactions = listOf(
        Transaction(1, "2024-07-15", 100.0),
        Transaction(2, "2024-07-16", 150.0),
        Transaction(3, "2024-07-14", 75.0),
        Transaction(4, "2024-07-17", 200.0)
    )

    val dateToCompare = LocalDate.parse("2024-07-15")
    val transactionsAfterDate = transactions.filter { LocalDate.parse(it.date) >= dateToCompare }
    println("Transactions after 2024-07-15: $transactionsAfterDate")


    val transactionsSortedByDate = transactions.sortedBy { LocalDate.parse(it.date) }
    println("Transactions sorted by date: $transactionsSortedByDate")

    val transactionsSortedByAmount = transactions.sortedByDescending { it.amount }
    println("Transactions sorted by amount (descending): $transactionsSortedByAmount")

    val customSortedTransactions = transactions.sortedWith(compareBy({ LocalDate.parse(it.date) }, { it.amount }))
    println("Transactions custom sorted by date then amount: $customSortedTransactions")
}
