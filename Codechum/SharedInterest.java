import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SharedInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many hobbies does Alice have: ");
        int aliceCount = sc.nextInt();
        sc.nextLine();
        Set<String> aliceHobbies  = new HashSet<>();
        
         for(int i = 1; i <= aliceCount; i++) {
            System.out.print("Enter Alice's hobby " + i + ": ");
            aliceHobbies.add(sc.nextLine());
        }
        
        
        System.out.print("How many hobbies does Bob have: ");
        int bobCount = sc.nextInt();
        sc.nextLine();
        Set<String> bobHobbies  = new HashSet<>();
        for(int i = 1; i <= bobCount; i++) {
            System.out.print("Enter Bob's hobby " + i + ": ");
            bobHobbies.add(sc.nextLine());
        }
        
        System.out.println("\nAlice's hobbies: " + aliceHobbies);
        System.out.println("Bob's hobbies: " + bobHobbies);
        
        aliceHobbies.retainAll(bobHobbies);
        System.out.println("Shared hobbies: " + aliceHobbies);
        
        sc.close();
        
    }
}