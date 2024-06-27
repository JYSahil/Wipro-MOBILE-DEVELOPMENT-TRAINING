public class Item {
    private int id;
    private double price;
    private String description;
    private String title;

    public Item(int id, double price, String description, String title) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
