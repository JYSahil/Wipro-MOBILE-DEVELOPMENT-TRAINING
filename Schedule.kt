class Schedule {
    private val events = mutableListOf<Schedulable>()

    fun addEvent(event: Schedulable) {
        events.add(event)
        println("Event added: ${event.name}")
    }

    fun removeEvent(event: Schedulable) {
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
}
