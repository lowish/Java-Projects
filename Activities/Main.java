import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter the first number: ");
double n1 = sc.nextDouble();

System.out.print("Enter the first number: ");
double n2 = sc.nextDouble();


Arithmetic calculator = new Arithmetic (n1, n2);

System.out.println("-- Results --");
System.out.println("Sum: " + calculator.add());
System.out.println("Difference: " + calculator.subtract());
System.out.println("Product: " + calculator.multiply());
System.out.println("Quotient: " + calculator.divide());

}
}