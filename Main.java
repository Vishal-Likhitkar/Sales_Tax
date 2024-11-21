public class Main {
    public static void main(String[] args) {
        // Input 1
        Receipt receipt1 = new Receipt();
        receipt1.addItem(new Item("book", 12.49, false, ItemType.BOOK));
        receipt1.addItem(new Item("music CD", 14.99, false, ItemType.OTHER));
        receipt1.addItem(new Item("chocolate bar", 0.85, false, ItemType.FOOD));

        receipt1.printReceipt();
        
        // Input 2
        Receipt receipt2 = new Receipt();
        receipt2.addItem(new Item("imported box of chocolates", 10.00, true, ItemType.FOOD));
        receipt2.addItem(new Item("imported bottle of perfume", 47.50, true, ItemType.OTHER));

        receipt2.printReceipt();
        
        // Input 3
        Receipt receipt3 = new Receipt();
        receipt3.addItem(new Item("imported bottle of perfume", 27.99, true, ItemType.OTHER));
        receipt3.addItem(new Item("bottle of perfume", 18.99, false, ItemType.OTHER));
        receipt3.addItem(new Item("packet of headache pills", 9.75, false, ItemType.MEDICAL));
        receipt3.addItem(new Item("box of imported chocolates", 21.99, true, ItemType.FOOD));
        
        receipt3.printReceipt();
    }
} 