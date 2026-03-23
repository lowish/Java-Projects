import java.util.Scanner;

public class Informationprogram{
    public static void main(String[] args){
        Scanner program = new Scanner(System.in);

        System.out.println("Welcome to the Information Program!");

        System.out.print("Name: ");
        String name = program.nextLine();

        System.out.print("Age: ");
        int age = program.nextInt();

        System.out.print("Course: ");
        String course = program.next();

        System.out.print("School: ");
        String school = program.next();

        System.out.print("Interest: ");
        String interest = program.next();

        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("School: " + school);
        System.out.println("Interest: " + interest);

        program.close();
        
    }
}