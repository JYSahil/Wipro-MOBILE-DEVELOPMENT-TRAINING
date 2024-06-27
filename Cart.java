import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item, Integer> items = new HashMap<>();

    public void addItem(Item item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public Map<Item, Integer> getItems() {
        return items;
    }
}
