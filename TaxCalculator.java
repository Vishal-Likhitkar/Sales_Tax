public class TaxCalculator {
    private static final double BASIC_TAX_RATE = 0.10;
    private static final double IMPORT_TAX_RATE = 0.05;
    
    public static double calculateTax(Item item) {
        double tax = 0;
        
        // Add basic sales tax if not exempt
        if (!item.getType().isExempt()) {
            tax += item.getPrice() * BASIC_TAX_RATE;
        }
        
        // Add import duty if applicable
        if (item.isImported()) {
            tax += item.getPrice() * IMPORT_TAX_RATE;
        }
        
        return roundToNearest0_05(tax);
    }
    
    private static double roundToNearest0_05(double value) {
        return Math.ceil(value * 20) / 20;
    }
} 