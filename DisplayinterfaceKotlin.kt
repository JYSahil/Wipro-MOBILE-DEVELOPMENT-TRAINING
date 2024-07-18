
interface EventDetails {
    fun showDetails()
}

open class EventManagerk : EventDetails {
    protected val events: MutableList<String> = mutableListOf()

    fun addEvent(event: String) {
        events.add(event)
        println("Event '$event' added.")
    }

    fun removeEvent(event: String) {
        if (events.remove(event)) {
            println("Event '$event' removed.")
        } else {
            println("Event '$event' not found.")
        }
    }

    override fun showDetails() {
        if (events.isEmpty()) {
            println("No events currently.")
        } else {
            println("Events:")
            for (event in events) {
                println("- $event")
            }
        }
    }
}

// SpecialEvent subclass extending EventManagerj
class SpecialEventi : EventManagerk() {

    // List to store VIPs
    private val vipList: MutableList<String> = mutableListOf()

    // List to store premium services
    private val premiumServices: MutableList<String> = mutableListOf()

    // Method to add a VIP
    fun addVIP(vip: String) {
        vipList.add(vip)
        println("VIP '$vip' added.")
    }

    // Method to remove a VIP
    fun removeVIP(vip: String) {
        if (vipList.remove(vip)) {
            println("VIP '$vip' removed.")
        } else {
            println("VIP '$vip' not found.")
        }
    }

    // Method to add a premium service
    fun addPremiumService(service: String) {
        premiumServices.add(service)
        println("Premium service '$service' added.")
    }

    // Method to remove a premium service
    fun removePremiumService(service: String) {
        if (premiumServices.remove(service)) {
            println("Premium service '$service' removed.")
        } else {
            println("Premium service '$service' not found.")
        }
    }

    override fun showDetails() {
        super.showDetails()

        if (vipList.isEmpty()) {
            println("No VIPs currently.")
        } else {
            println("VIPs:")
            for (vip in vipList) {
                println("- $vip")
            }
        }

        if (premiumServices.isEmpty()) {
            println("No premium services currently.")
        } else {
            println("Premium Services:")
            for (service in premiumServices) {
                println("- $service")
            }
        }
    }
}


fun main() {
    val specialEvent = SpecialEvent()

    specialEvent.addEvent("Conference")
    specialEvent.addEvent("Workshop")
    specialEvent.showDetails()

    specialEvent.addVIP("Sahil")
    specialEvent.addPremiumService("Catering")
    specialEvent.showDetails()

    specialEvent.removeEvent("Conference")
    specialEvent.showDetails()

    specialEvent.removeVIP("Sahil")
    specialEvent.removePremiumService("Catering")
    specialEvent.showDetails()

    specialEvent.removeEvent("Meeting")
}
