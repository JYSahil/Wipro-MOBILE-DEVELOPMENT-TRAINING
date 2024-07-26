data class Transaction(
    private var _id: Int,       // Private backing field for ID
    private var _amount: Double // Private backing field for amount
) {
    // Public read-only property for ID
    val id: Int
        get() = _id

    // Public property for amount with validation in setter
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

class TransactionList1 {
    private val transactions = mutableListOf<Transaction>()
    private var nextId = 1

    fun addTransaction(amount: Double): Transaction {
        val transaction = Transaction(nextId, amount)
        transactions.add(transaction)
        nextId++
        return transaction
    }

    fun deleteTransaction(transactionId: Int): Boolean {
        return transactions.removeIf { it.id == transactionId }
    }

    fun editTransaction(transactionId: Int, amount: Double): Boolean {
        val transaction = transactions.find { it.id == transactionId } ?: return false
        transaction.amount = amount
        return true
    }

    fun getTransactions(): List<Transaction> {
        return transactions
    }
}

fun main() {
    val transactionList = TransactionList1()
    transactionList.addTransaction(100.0)
    transactionList.addTransaction(-50.0)
    println(transactionList.getTransactions())

    transactionList.editTransaction(1, 150.0)
    println(transactionList.getTransactions())

    transactionList.deleteTransaction(2)
    println(transactionList.getTransactions())
}