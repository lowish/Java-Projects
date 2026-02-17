import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UniqueItem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> inventory  = new HashSet<>();
        
        System.out.print("How many items do you want to add: ");
        int numberOfitems = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= numberOfitems; i++) {
            System.out.print("Enter item " + i + ": ");
            String item = sc.nextLine();
            
            
            if (inventory.contains(item)){
                System.out.println("'" + item + "' is already in the inventory. Not added.");
            } else {
                inventory.add(item);
                System.out.println("Added '" + item + "'.");
            }
            
        }
        
        System.out.println("\nTotal unique items in inventory: " + inventory.size());
        System.out.println("Inventory items: " + inventory);
        
        sc.close();
    }
}