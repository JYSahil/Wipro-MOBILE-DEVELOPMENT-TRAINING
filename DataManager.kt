class DataManager<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
        println("Item added: $item")
    }

    fun removeItem(item: T): Boolean {
        val removed = items.remove(item)
        if (removed) {
            println("Item removed: $item")
        } else {
            println("Item not found: $item")
        }
        return removed
    }

    fun listItems() {
        if (items.isEmpty()) {
            println("No items available.")
        } else {
            println("Items:")
            items.forEach { println(it) }
        }
    }

    fun filterItems(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}
