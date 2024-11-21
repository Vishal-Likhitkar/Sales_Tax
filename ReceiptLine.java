public class ReceiptLine {
    private final Item item;
    private final double tax;
    private final double totalPrice;

    public ReceiptLine(Item item, double tax) {
        this.item = item;
        this.tax = tax;
        this.totalPrice = item.getPrice() + tax;
    }

    public Item getItem() { return item; }
    public double getTax() { return tax; }
    public double getTotalPrice() { return totalPrice; }
} 