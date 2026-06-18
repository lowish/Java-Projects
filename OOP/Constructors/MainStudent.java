import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char answer;
        int count = 0;

        do {

            System.out.println("Entering student Details");

            System.out.print("Student No : ");
            long studentNo = input.nextLong();
            input.nextLine();

            System.out.print("Name : ");
            String name = input.nextLine();
            System.out.println("Enter your course based on the following :");
            System.out.println("CS - Computer Science");
            System.out.println("EMC - Entertainment and MultiMedia Computing");
            System.out.println("NETAD - IT Net Administration");
            System.out.println("WEBDEV - IT Web Development");
            System.out.print("Course : ");
            String course = input.nextLine();

            System.out.print("Enter your No of units enrolled : ");
            int units = input.nextInt();

            Student stud = new Student(studentNo, name, course, units);

            stud.display();

            count++;

            System.out.print("DO YOU WANT TO REPEAT AGAIN? Answer [Y/y] : ");
            answer = input.next().toUpperCase().charAt(0);
            input.nextLine();

        } while (answer == 'Y');

        System.out.println("You have entered " + count + " student/s.");
        System.out.println("Thank you for using my program.");

        input.close();
    }
}