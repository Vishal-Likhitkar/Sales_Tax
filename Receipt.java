import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Receipt implements ReceiptOperations {
    private final List<ReceiptLine> receiptLines;
    private double totalTax;
    private double total;
    
    public Receipt() {
        this.receiptLines = new ArrayList<>();
        this.totalTax = 0;
        this.total = 0;
    }
    
    @Override
    public void addItem(Item item) {
        double tax = TaxCalculator.calculateTax(item);
        ReceiptLine receiptLine = new ReceiptLine(item, tax);
        receiptLines.add(receiptLine);
        totalTax += tax;
        total += item.getPrice() + tax;
    }
    
    @Override
    public double getTotalTax() { return totalTax; }
    
    @Override
    public double getTotal() { return total; }
    
    @Override
    public List<ReceiptLine> getReceiptLines() {
        return Collections.unmodifiableList(receiptLines);
    }
} 