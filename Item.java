public class Item {
    private String name;
    private double price;
    private boolean isImported;
    private ItemType type;
    
    public Item(String name, double price, boolean isImported, ItemType type) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.type = type;
    }
    
    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isImported() { return isImported; }
    public ItemType getType() { return type; }
} 