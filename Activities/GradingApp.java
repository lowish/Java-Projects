import java.util.Scanner;

// Main class
// OOP Concept: Object Creation and program execution

public class GradingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter grade: ");
        int grade = input.nextInt();

        System.out.println("1 - College Student");
        System.out.println("2 - Senior High Student");
        int choice = input.nextInt();

        Student student;

        // Object creation based on user choice
        if (choice == 1) {
            student = new CollegeStudent(name, grade);
        } else {
            student = new SeniorHighStudent(name, grade);
        }

        System.out.println();
        student.displayInfo();
        student.checkResult();

        input.close();
    }
}