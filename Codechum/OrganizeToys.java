import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrganizeToys {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> toys = new ArrayList<>();


        System.out.print("Enter toy 1: ");
        toys.add(sc.nextLine());

        System.out.print("Enter toy 2: ");
        toys.add(sc.nextLine());

        System.out.print("Enter toy 3: ");
        toys.add(sc.nextLine());
        Collections.sort(toys);

        System.out.println("Your organized toy list:");
        for (String toy : toys) {
            System.out.println(toy);
        }

        sc.close();
    }
}
