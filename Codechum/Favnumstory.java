import java.util.Scanner;

public class Favnumstory {
    public static void main(String[] args) {
        Scanner story = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = story.nextLine();

        System.out.print("Enter your favorite number: ");
        int fav = story.nextInt();

        System.out.print("Once upon a time, in a land far away, " + name + " discovered a magical treasure of " + fav + " golden coins. It was a wonderful day!");

        story.close();
    }
}