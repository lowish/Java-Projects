import java.util.*;

public class ShoppingList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many items are on your shopping list: ");
        int yourCount = sc.nextInt();
        sc.nextLine();
        
        Set<String> yourList  = new TreeSet<>();
        for(int i = 1; i <= yourCount; i++) {
            System.out.print("Enter your item " + i + ": ");
            String item = sc.nextLine().trim();
            yourList.add(item);
        }
        
        System.out.print("How many items are on your friend's shopping list: ");
        int friendCount = sc.nextInt();
        sc.nextLine();
        
        Set<String> friendLists  = new TreeSet<>();
        for(int i = 1; i <= friendCount; i++) {
            System.out.print("Enter friend's item " + i + ": ");
            String item = sc.nextLine().trim();
            friendLists.add(item);
        }
        
        System.out.println("\nYour shopping list: " + yourList);
        System.out.println("Friend's shopping list: " + friendLists);
        
        Set<String> combinedList  = new LinkedHashSet<>();
        combinedList.addAll(yourList);
        combinedList.addAll(friendLists);
        System.out.println("Combined unique shopping list: " + combinedList);
        
        sc.close();
    }
}