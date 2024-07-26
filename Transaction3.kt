data class User(
    val id: Int,
    var name: String,
    var email: String
)

class UserManager {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        if (users.none { it.id == user.id }) { // Prevent adding duplicate users based on ID
            users.add(user)
            println("User added: $user")
        } else {
            println("User with ID ${user.id} already exists.")
        }
    }

    fun removeUser(userId: Int) {
        val userToRemove = users.find { it.id == userId }
        if (userToRemove != null) {
            users.remove(userToRemove)
            println("User removed: $userToRemove")
        } else {
            println("User with ID $userId not found.")
        }
    }

    fun getAllUsers(): List<User> {
        return users
    }

    fun findUserById(userId: Int): User? {
        return users.find { it.id == userId }
    }
}

fun main() {
    val userManager = UserManager()

    // Adding users
    val user1 = User(1, "sahil", "sahil@gmail.com")
    val user2 = User(2, "Alex", "Alex@gmail.com")
    val user3 = User(3, "Hyper", "Hypere@gmail.com")

    userManager.addUser(user1)
    userManager.addUser(user2)
    userManager.addUser(user3)

    // Display all users
    println("\nAll Users:")
    userManager.getAllUsers().forEach { println(it) }

    // Attempting to add a user with a duplicate ID
    userManager.addUser(User(1, "sahil", "sahil@gmail.com"))

    // Removing a user
    userManager.removeUser(2)

    // Display all users after removal
    println("\nAll Users After Removal:")
    userManager.getAllUsers().forEach { println(it) }

    // Find a user by ID
    val foundUser = userManager.findUserById(1)
    println("\nUser with ID 1: $foundUser")
}