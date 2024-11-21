import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Receipt receipt = new Receipt();
            System.out.println("Enter items for the receipt (or type 'done' to finish):");

            while (true) {
                String line = scanner.nextLine();

                if (line.equalsIgnoreCase("done")) {
                    break;
                }

                // Parse input
                String[] parts = line.split(" at ");
                String[] details = parts[0].split(" ");
                double price = Double.parseDouble(parts[1]);

                boolean isImported = line.contains("imported");
                String name = String.join(" ", details).replace("1 ", "").trim();
                ItemType type = determineItemType(name);

                Item item = new Item(name, price, isImported, type);
                receipt.addItem(item);
            }

            receipt.printReceipt();
            System.out.println("\nDo you want to process another receipt? (yes/no)");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }

    private static ItemType determineItemType(String name) {
        if (name.contains("book")) {
            return ItemType.BOOK;
        } else if (name.contains("chocolate") || name.contains("food")) {
            return ItemType.FOOD;
        } else if (name.contains("pill")) {
            return ItemType.MEDICAL;
        } else {
            return ItemType.OTHER;
        }
    }
}