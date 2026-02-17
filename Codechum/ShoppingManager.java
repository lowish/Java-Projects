import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();


        System.out.print("Enter item 1: ");
        shoppingList.add(scanner.nextLine());

        System.out.print("Enter item 2: ");
        shoppingList.add(scanner.nextLine());

        System.out.print("Enter item 3: ");
        shoppingList.add(scanner.nextLine());

        System.out.println("Your shopping list: " + shoppingList);


        System.out.print("Which item to remove? ");
        String removeItem = scanner.nextLine();


        shoppingList.remove(removeItem);

        System.out.println("Updated shopping list: " + shoppingList);

        scanner.close();
    }
}
