import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Item> items;
    private double totalTax;
    private double total;
    
    public Receipt() {
        this.items = new ArrayList<>();
        this.totalTax = 0;
        this.total = 0;
    }
    
    public void addItem(Item item) {
        items.add(item);
        double tax = TaxCalculator.calculateTax(item);
        totalTax += tax;
        total += item.getPrice() + tax;
    }
    
    public void printReceipt() {
        for (Item item : items) {
            double itemTax = TaxCalculator.calculateTax(item);
            System.out.printf("1 %s: %.2f%n", 
                item.getName(), 
                item.getPrice() + itemTax);
        }
        System.out.printf("Sales Taxes: %.2f%n", totalTax);
        System.out.printf("Total: %.2f%n", total);
    }
} 