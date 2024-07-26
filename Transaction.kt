//Define an Exportable interface with a method to export transaction data to CSV.
import java.io.File
data class Transactionl(
    var id: Int,
    var amount: Double
) : Exportable {
    override fun exportToCSV(): String {
        return "$id,$amount"
    }
}

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

    fun exportTransactionsToCSV(): String {
        val header = "ID,Amount"
        val csvData = transactions.joinToString("\n") { it.exportToCSV() }
        return "$header\n$csvData"
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

    // Export transactions to CSV and write to a file
    val csvData = transactionList.exportTransactionsToCSV()
    val fileName = "transactions.csv"
    val file = File(fileName)
    file.writeText(csvData)

    println("Transaction data has been exported to $fileName")
}