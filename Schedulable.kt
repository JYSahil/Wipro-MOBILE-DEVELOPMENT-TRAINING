import java.time.LocalDateTime

interface Schedulable {
    var name: String
    var scheduledTime: LocalDateTime

    fun schedule(time: LocalDateTime)
    fun reschedule(newTime: LocalDateTime)
}
