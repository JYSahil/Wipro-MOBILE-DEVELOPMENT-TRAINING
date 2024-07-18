class EventManager {


    private val events: MutableList<String> = mutableListOf()
    fun addEvent(event: String) {
        events.add(event)
        println("Event '$event' added.")
    }

    fun removeEvent(event: String) {
        if (events.remove(event)) {
            println("Event '$event' removed.")
        } else {
            println("Event '$event' not found.")
        }
    }

    fun displayEvents() {
        if (events.isEmpty()) {
            println("No events currently.")
        } else {
            println("Events:")
            for (event in events) {
                println("- $event")
            }
        }
    }
}

fun main() {
    val eventManager = EventManager()

    eventManager.addEvent("Conference")
    eventManager.addEvent("Workshop")
    eventManager.displayEvents()

    eventManager.removeEvent("Conference")
    eventManager.displayEvents()

    eventManager.removeEvent("Meeting")
}
