import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import org.bson.Document
import kotlin.system.exitProcess

fun main() {
    val uri = "mongodb://localhost:27017"
    val client = MongoClients.create(uri)
    val database = client.getDatabase("your_database")
    val collection: MongoCollection<Document> = database.getCollection("your_collection")

    var name: String? = null
    var phoneNumber: String? = null
    var emailId: String? = null
    var city: String? = null

    while (true) {
        println("--- Main Menu ---")
        println("1. Enter your Name")
        println("2. Enter your Phone Number")
        println("3. Enter your Email Id")
        println("4. Enter your city")
        println("5. View Data")
        println("6. Update Data")
        println("7. Delete Data")
        println("8. Exit")
        print("Enter your choice: ")

        when (readLine()!!.toInt()) {
            1 -> {
                print("Enter your name: ")
                name = readLine()
            }
            2 -> {
                print("Enter your phone number: ")
                phoneNumber = readLine()
            }
            3 -> {
                print("Enter your email ID: ")
                emailId = readLine()
            }
            4 -> {
                print("Enter your city: ")
                city = readLine()
            }
            5 -> viewData(collection)
            6 -> updateData(collection)
            7 -> deleteData(collection)
            8 -> exitProcess(0)
            else -> println("Invalid choice. Please try again.")
        }

        if (name != null && phoneNumber != null && emailId != null && city != null) {
            val document = Document("name", name)
                .append("phoneNumber", phoneNumber)
                .append("emailId", emailId)
                .append("city", city)

            collection.insertOne(document)
            println("Document inserted successfully.")
            name = null
            phoneNumber = null
            emailId = null
            city = null
        }
    }
}

fun viewData(collection: MongoCollection<Document>) {
    println("Data in the collection:")
    collection.find().forEach { println(it.toJson()) }
}

fun updateData(collection: MongoCollection<Document>) {
    println("Enter the name of the document to update: ")
    val name = readLine()!!
    println("Enter the new phone number: ")
    val newPhoneNumber = readLine()!!
    println("Enter the new email ID: ")
    val newEmailId = readLine()!!
    println("Enter the new city: ")
    val newCity = readLine()!!

    val filter = Document("name", name)
    val update = Document("\$set", Document("phoneNumber", newPhoneNumber)
        .append("emailId", newEmailId)
        .append("city", newCity))

    val result = collection.updateOne(filter, update)
    if (result.modifiedCount > 0) {
        println("Document updated successfully.")
    } else {
        println("No document found with the provided name.")
    }
}

fun deleteData(collection: MongoCollection<Document>) {
    println("Enter the name of the document to delete: ")
    val name = readLine()!!

    val filter = Document("name", name)
    val result = collection.deleteOne(filter)
    if (result.deletedCount > 0) {
        println("Document deleted successfully.")
    } else {
        println("No document found with the provided name.")
    }
}
