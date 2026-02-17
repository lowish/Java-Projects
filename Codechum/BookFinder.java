import java.util.ArrayList;
import java.util.Scanner;

public class BookFinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> library = new ArrayList<>();

        
        System.out.print("Enter book 1: ");
        library.add(sc.nextLine());

        System.out.print("Enter book 2: ");
        library.add(sc.nextLine());

        System.out.print("Enter book 3: ");
        library.add(sc.nextLine());

        System.out.print("Enter book 4: ");
        library.add(sc.nextLine());


        System.out.print("Which book to find? ");
        String bookToFind = sc.nextLine();

        int position = library.indexOf(bookToFind);

        if (position >= 0) {
            System.out.println("The book '" + bookToFind + "' is at position " + position + ".");
        } else {
            System.out.println("The book '" + bookToFind + "' was not found.");
        }

        sc.close();
    }
}
