
open class TransactionI(
    val title: String,
    val amount: Double,
    val date: String
) {
    open fun displayTransactionType() {
        println("Transaction")
    }
}

class Income(
    title: String,
    amount: Double,
    date: String,
    val source: String
) : TransactionI(title, amount, date) {
    override fun displayTransactionType() {
        println("Income")
    }
}

// Derived class Expense inheriting from Transaction
class Expense(
    title: String,
    amount: Double,
    date: String,
    val category: String
) : TransactionI(title, amount, date) {
    override fun displayTransactionType() {
        println("Expense")
    }
}

fun main() {
    val incomeTransaction = Income("Salary", 3000.0, "2024-07-18", "Job")
    val expenseTransaction = Expense("Groceries", 100.0, "2024-07-18", "Food")

    incomeTransaction.displayTransactionType()
    expenseTransaction.displayTransactionType()
}
