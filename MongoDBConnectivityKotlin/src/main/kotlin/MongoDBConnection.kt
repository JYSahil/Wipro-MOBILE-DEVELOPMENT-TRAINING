import com.mongodb.client.MongoClients
import com.mongodb.client.MongoDatabase

object MongoDBConnection {
    private const val CONNECTION_STRING = "mongodb://localhost:27017"
    private const val DATABASE_NAME = "your_database"

    val database: MongoDatabase

    init {
        val client = MongoClients.create(CONNECTION_STRING)
        database = client.getDatabase(DATABASE_NAME)
    }
}
