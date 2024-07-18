
class Event(
    val name: String,
    val date: String,
    val attendeeCount: Int
)
fun main() {
    // Example usage
    val eventName = "Birthday Party"
    val eventDate = "2024-05-12"
    val attendees = 20

    // Create an instance of Event
    val event = Event(eventName, eventDate, attendees)

    // Accessing event details
    println("Event Name: ${event.name}")
    println("Date: ${event.date}")
    println("Attendee Count: ${event.attendeeCount}")
}
