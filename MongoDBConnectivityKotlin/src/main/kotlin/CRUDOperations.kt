import com.mongodb.client.MongoCollection
import org.bson.Document

class CRUDOperations(private val collectionName: String) {

    private val collection: MongoCollection<Document> = MongoDBConnection.database.getCollection(collectionName)

    fun create(document: Document) {
        collection.insertOne(document)
        println("Document inserted successfully.")
    }

    fun readAll(): List<Document> {
        return collection.find().toList()
    }

    fun update(filter: Document, update: Document) {
        val result = collection.updateOne(filter, Document("\$set", update))
        if (result.matchedCount > 0) {
            println("Document updated successfully.")
        } else {
            println("No matching document found.")
        }
    }

    fun delete(filter: Document) {
        val result = collection.deleteOne(filter)
        if (result.deletedCount > 0) {
            println("Document deleted successfully.")
        } else {
            println("No matching document found.")
        }
    }
}
