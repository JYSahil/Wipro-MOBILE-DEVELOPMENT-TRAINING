import java.util.Map;
import java.util.Scanner;

public class CartManagementSystem {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Menu Driven Program for the Warehouse Manager.");

        

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View warehouse items");
            System.out.println("2. Add item to cart");
            System.out.println("3. View cart items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Warehouse Inventory:");
                    for (Map.Entry<Item, Integer> entry : warehouse.getInventory().entrySet()) {
                        System.out.println(entry.getKey().getTitle() + " - Quantity: " + entry.getValue());
                    }
                    break;
                case 2:
                    System.out.print("Enter the item ID to add to the cart: ");
                    int itemId = scanner.nextInt();
                    Item selectedItem = null;
                    for (Item item : warehouse.getInventory().keySet()) {
                        if (item.getId() == itemId) {
                            selectedItem = item;
                            break;
                        }
                    }
                    if (selectedItem != null) {
                        System.out.print("Enter the quantity: ");
                        int quantity = scanner.nextInt();
                        if (warehouse.getQuantity(selectedItem) >= quantity) {
                            cart.addItem(selectedItem, quantity);
                            warehouse.removeItem(selectedItem, quantity);
                            System.out.println("Item added to cart.");
                        } else {
                            System.out.println("Insufficient stock.");
                        }
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 3:
                    System.out.println("Cart Items:");
                    for (Map.Entry<Item, Integer> entry : cart.getItems().entrySet()) {
                        System.out.println(entry.getKey().getTitle() + " - Quantity: " + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
