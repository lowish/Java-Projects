import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuestListCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> guestList = new ArrayList<>();
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter guest " +  i + ": ");
            guestList.add(sc.nextLine());
        }
        
        System.out.println("Current guest list: " + guestList);
        
        System.out.print("Enter position to check (0-2): ");
        int position = sc.nextInt();
        
        if (position >= 0 && position < guestList.size()) {
            System.out.println("Guest at position " + position + " is: " + guestList.get(position));
        } else {
            System.out.println("Invalid position!");
        }
        
        sc.close();
    }
}