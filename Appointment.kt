import java.time.LocalDateTime
data class Appointment(
    override var name: String,
    override var scheduledTime: LocalDateTime
) : Schedulable {
    override fun schedule(time: LocalDateTime) {
        this.scheduledTime = time
        println("Appointment '$name' scheduled for $scheduledTime")
    }

    override fun reschedule(newTime: LocalDateTime) {
        this.scheduledTime = newTime
        println("Appointment '$name' rescheduled to $scheduledTime")
    }
}
