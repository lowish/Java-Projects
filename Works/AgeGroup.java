import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {
        Scanner group = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        
        int age = group.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        group.close();
    }
}
