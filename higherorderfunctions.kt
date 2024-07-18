interface Display {
    fun showDetails()
}

typealias EventCallback = (String) -> Unit

class Eventmanageri : Display {

    private val events: MutableList<String> = mutableListOf()

    private val subscribers: MutableList<EventCallback> = mutableListOf()

    fun addEvent(event: String) {
        events.add(event)
        println("Event '$event' added.")
        notifySubscribers("Added: $event")
    }

    fun removeEvent(event: String) {
        if (events.remove(event)) {
            println("Event '$event' removed.")
            notifySubscribers("Removed: $event")
        } else {
            println("Event '$event' not found.")
        }
    }

    override fun showDetails() {
        if (events.isEmpty()) {
            println("No events currently.")
        } else {
            println("Events:")
            for (event in events) {
                println("- $event")
            }
        }
    }

    fun subscribe(callback: EventCallback) {
        subscribers.add(callback)
    }

    fun unsubscribe(callback: EventCallback) {
        subscribers.remove(callback)
    }

    private fun notifySubscribers(message: String) {
        for (callback in subscribers) {
            callback(message)
        }
    }
}

fun main() {
    val eventManager = Eventmanageri()

    val subscriber1: EventCallback = { message -> println("Subscriber 1 received: $message") }
    val subscriber2: EventCallback = { message -> println("Subscriber 2 received: $message") }

    eventManager.subscribe(subscriber1)
    eventManager.subscribe(subscriber2)

    eventManager.addEvent("Conference")
    eventManager.addEvent("Workshop")
    eventManager.showDetails()

    eventManager.removeEvent("Conference")
    eventManager.showDetails()

    eventManager.removeEvent("Meeting")

    // Unsubscribe a subscriber
    eventManager.unsubscribe(subscriber1)

    eventManager.addEvent("Seminar")
}
