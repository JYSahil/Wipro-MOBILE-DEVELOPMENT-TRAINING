import java.time.LocalDateTime

interface Schedulable {
    val name: String
    var scheduledTime: LocalDateTime

    fun schedule(time: LocalDateTime)
    fun reschedule(newTime: LocalDateTime)
}
