class User(private val username: String, private var password: String) {
    private val expenses = mutableListOf<Double>()

    fun login(enteredUsername: String, enteredPassword: String): Boolean {
        return username == enteredUsername && password == enteredPassword
    }

    fun addExpense(amount: Double) {
        expenses.add(amount)
    }

    fun displayExpenseSummary() {
        val totalExpenses = expenses.sum()
        println("Expense summary for $username:")
        println("Total Expenses: $totalExpenses rupees")
        println("Number of Expenses: ${expenses.size}")
    }

    fun setPassword(newPassword: String) {
        password = newPassword
    }

    // Main function for example usage
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Example usage:
            val user = User("sahil", "password123")

            // Simulate login
            if (user.login("sahil", "password123")) {
                println("Login successful!")
            } else {
                println("Invalid username or password.")
            }

            user.addExpense(10.0)
            user.addExpense(25.0)

            user.displayExpenseSummary()
        }
    }
}
