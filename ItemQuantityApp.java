import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class ItemQuantityApp {
    public static void main(String[] args) {
        Map<String, Integer> itemQuantityMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. View Items and Quantities");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addItem(itemQuantityMap, scanner);
                    break;
                case 2:
                    viewItems(itemQuantityMap);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addItem(Map<String, Integer> itemQuantityMap, Scanner scanner) {
        System.out.print("Enter item name: ");
        String itemName = scanner.next();
        System.out.print("Enter item quantity: ");
        int itemQuantity = scanner.nextInt();

        if (itemQuantityMap.containsKey(itemName)) {
            int currentQuantity = itemQuantityMap.get(itemName);
            itemQuantityMap.put(itemName, currentQuantity + itemQuantity);
        } else {
            itemQuantityMap.put(itemName, itemQuantity);
        }

        System.out.println("Item added successfully.");
    }

    private static void viewItems(Map<String, Integer> itemQuantityMap) {
        System.out.println("Items and Quantities:");
        for (Map.Entry<String, Integer> entry : itemQuantityMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
