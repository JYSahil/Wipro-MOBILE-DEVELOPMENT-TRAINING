import java.time.LocalDateTime

class Meeting(
    private val _name: String,
    private var _scheduledTime: LocalDateTime
) : Schedulable {
    override val name: String
        get() = _name

    override var scheduledTime: LocalDateTime
        get() = _scheduledTime
        set(value) {
            _scheduledTime = value
        }

    override fun schedule(time: LocalDateTime) {
        scheduledTime = time
        println("Meeting '$name' scheduled for $scheduledTime")
    }

    override fun reschedule(newTime: LocalDateTime) {
        scheduledTime = newTime
        println("Meeting '$name' rescheduled to $scheduledTime")
    }
}
