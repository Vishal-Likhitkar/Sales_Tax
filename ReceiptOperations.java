import java.util.List;

public interface ReceiptOperations {
    void addItem(Item item);
    double getTotalTax();
    double getTotal();
    List<ReceiptLine> getReceiptLines();
} 