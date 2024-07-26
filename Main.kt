import java.time.LocalDateTime

fun main() {
    val schedule = Schedule()

    val meeting = Meeting("Project Meeting", LocalDateTime.of(2024, 8, 1, 10, 0))
    val appointment = Appointment("Doctor's Appointment", LocalDateTime.of(2024, 8, 2, 9, 0))

    schedule.addEvent(meeting)
    schedule.addEvent(appointment)

    schedule.listEvents()

    meeting.reschedule(LocalDateTime.of(2024, 8, 1, 14, 0))
    schedule.listEvents()

    schedule.removeEvent(appointment)
    schedule.listEvents()
}
