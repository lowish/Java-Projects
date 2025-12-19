import java.util.Scanner;

public class Informationprogram{
    public static void main(String[] args){
        Scanner program = new Scanner(System.in);

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


        program.close();
        
    }
}