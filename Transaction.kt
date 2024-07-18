data class Transactionl(
    var id: Int,
    var amount: Double
)

class TransactionList {
    private val transactions = mutableListOf<Transactionl>()
    private var nextId = 1

    fun addTransaction(amount: Double): Transactionl {
        val transaction = Transactionl(nextId, amount)
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

    fun getTransactions(): List<Transactionl> {
        return transactions
    }
}

fun main() {
    val transactionList = TransactionList()
    transactionList.addTransaction(100.0)
    transactionList.addTransaction(-50.0)
    println(transactionList.getTransactions())

    transactionList.editTransaction(1, 150.0)
    println(transactionList.getTransactions())

    transactionList.deleteTransaction(2)
    println(transactionList.getTransactions())
}
