import java.util.List;

public class ReceiptPrinter {
    public void printReceipt(ReceiptOperations receipt) {
        for (ReceiptLine line : receipt.getReceiptLines()) {
            System.out.printf("1 %s: %.2f%n", 
                line.getItem().getName(), 
                line.getTotalPrice());
        }
        System.out.printf("Sales Taxes: %.2f%n", receipt.getTotalTax());
        System.out.printf("Total: %.2f%n", receipt.getTotal());
    }
} 