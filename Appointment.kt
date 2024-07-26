import java.time.LocalDateTime

class Appointment(
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
        println("Appointment '$name' scheduled for $scheduledTime")
    }

    override fun reschedule(newTime: LocalDateTime) {
        scheduledTime = newTime
        println("Appointment '$name' rescheduled to $scheduledTime")
    }
}
