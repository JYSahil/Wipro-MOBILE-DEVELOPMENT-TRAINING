import java.time.LocalDateTime

data class Meeting(
   override var name: String,
    override var scheduledTime: LocalDateTime
) : Schedulable {
    override fun schedule(time: LocalDateTime) {
        this.scheduledTime = time
        println("Meeting '$name' scheduled for $scheduledTime")
    }

    override fun reschedule(newTime: LocalDateTime) {
        this.scheduledTime = newTime
        println("Meeting '$name' rescheduled to $scheduledTime")
    }
}

