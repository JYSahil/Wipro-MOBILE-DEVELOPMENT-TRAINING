import java.time.LocalDate

class Schedule {
    private val events = mutableListOf<Event>()

    fun addEvent(event: Event) {
        events.add(event)
        println("Event added: ${event.name}")
    }

    fun removeEvent(event: Event) {
        if (events.remove(event)) {
            println("Event removed: ${event.name}")
        } else {
            println("Event not found: ${event.name}")
        }
    }

    fun listEvents() {
        if (events.isEmpty()) {
            println("No events scheduled.")
        } else {
            println("Scheduled Events:")
            events.forEach { event ->
                println("${event.name} at ${event.scheduledTime}")
            }
        }
    }

    fun filterEventsByDate(date: LocalDate): List<Event> {
        return events.filter { it.scheduledTime.toLocalDate() == date }
    }

    fun filterEventsByType(eventType: Class<out Event>): List<Event> {
        return events.filter { it.javaClass == eventType }
    }
}
