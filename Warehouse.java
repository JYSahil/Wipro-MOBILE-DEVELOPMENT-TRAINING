import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Item, Integer> inventory;

    public Warehouse() {
        this.inventory = new HashMap<>();
        
        Item item1 = new Item(1, 10.0, "Bread", "Best Bread in the Country");

        Item item2 = new Item(2, 10.0, "Milk", "Cow milk");

        Item item3 = new Item(3, 20.0, "Packed Food", "Best Imported Food");

        addItem(item1, 20); 
        addItem(item2, 20); 
        addItem(item3, 20); 
    }

    public void addItem(Item item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(Item item, int quantity) {
        if (inventory.containsKey(item)) {
            int currentQuantity = inventory.get(item);
            if (currentQuantity <= quantity) {
                inventory.remove(item);
            } else {
                inventory.put(item, currentQuantity - quantity);
            }
        }
    }

    public int getQuantity(Item item) {
        return inventory.getOrDefault(item, 0);
    }

    public Map<Item, Integer> getInventory() {
        return inventory;
    }
}