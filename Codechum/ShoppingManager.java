import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        // Input 3 items
        System.out.print("Enter item 1: ");
        shoppingList.add(scanner.nextLine());

        System.out.print("Enter item 2: ");
        shoppingList.add(scanner.nextLine());

        System.out.print("Enter item 3: ");
        shoppingList.add(scanner.nextLine());

        // Display shopping list
        System.out.println("Your shopping list: " + shoppingList);

        // Ask which item to remove
        System.out.print("Which item to remove? ");
        String removeItem = scanner.nextLine();

        // Remove item
        shoppingList.remove(removeItem);

        // Display updated list
        System.out.println("Updated shopping list: " + shoppingList);

        scanner.close();
    }
}
