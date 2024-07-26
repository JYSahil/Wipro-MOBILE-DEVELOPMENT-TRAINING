import java.time.LocalDateTime
import java.time.LocalDate

fun main() {
    val schedule = Schedule()

    val meeting = Meeting("Project Meeting", LocalDateTime.of(2024, 8, 1, 10, 0))
    val appointment = Appointment("Doctor's Appointment", LocalDateTime.of(2024, 8, 2, 9, 0))
    val anotherMeeting = Meeting("Team Sync", LocalDateTime.of(2024, 8, 1, 14, 0))


    schedule.addEvent(meeting)
    schedule.addEvent(appointment)
    schedule.addEvent(anotherMeeting)


    println("All events:")
    schedule.listEvents()

    val dateToFilter = LocalDate.of(2024, 8, 1)
    val eventsOnDate = schedule.filterEventsByDate(dateToFilter)
    println("\nEvents on $dateToFilter:")
    eventsOnDate.forEach { println("${it.name} at ${it.scheduledTime}") }

    val eventsOfType = schedule.filterEventsByType(Meeting::class.java)
    println("\nMeetings:")
    eventsOfType.forEach { println("${it.name} at ${it.scheduledTime}") }
}
