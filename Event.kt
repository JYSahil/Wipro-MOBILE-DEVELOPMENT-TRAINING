import java.time.LocalDateTime

interface Event {
    val name: String
    val scheduledTime: LocalDateTime

    fun schedule(time: LocalDateTime)
    fun reschedule(newTime: LocalDateTime)
}
