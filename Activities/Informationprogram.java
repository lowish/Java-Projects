import java.util.Scanner;

public class Informationprogram{
    public static void main(String[] args){
        Scanner program = new Scanner(System.in);
        String name = "";
        int age = 0;
        String course = "";
        String school = "";
        String interest = "";
        
        System.out.print("Name: ");
        String name1 = program.nextLine();

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