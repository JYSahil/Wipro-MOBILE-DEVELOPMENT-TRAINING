import java.time.LocalDateTime
import java.time.LocalDate

fun main() {

    val attendeeManager = DataManager<Attendee>()
    val attendee1 = Attendee("junior", "junior@gmail.com")
    val attendee2 = Attendee("Kelly", "Kelly@gmail.com")

    attendeeManager.addItem(attendee1)
    attendeeManager.addItem(attendee2)
    attendeeManager.listItems()
    attendeeManager.removeItem(attendee1)
    attendeeManager.listItems()


    val eventManager = DataManager<Event>()
    val meeting = Meeting("Project Meeting", LocalDateTime.of(2024, 8, 1, 10, 0))
    val appointment = Appointment("Doctor's Appointment", LocalDateTime.of(2024, 8, 2, 9, 0))
    val anotherMeeting = Meeting("Team Sync", LocalDateTime.of(2024, 8, 1, 14, 0))

    eventManager.addItem(meeting)
    eventManager.addItem(appointment)
    eventManager.addItem(anotherMeeting)
    eventManager.listItems()

    val eventsOnDate = eventManager.filterItems { it.scheduledTime.toLocalDate() == LocalDate.of(2024, 8, 1) }
    println("\nEvents on 2024-08-01:")
    eventsOnDate.forEach { println("${it.name} at ${it.scheduledTime}") }


    val meetings = eventManager.filterItems { it is Meeting }
    println("\nMeetings:")
    meetings.forEach { println("${(it as Meeting).name} at ${it.scheduledTime}") }
}
