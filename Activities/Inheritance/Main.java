import java.util.Scanner;

public class Main {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the First Number: ");
double n1 = scanner.nextDouble();

System.out.print("Enter the Second Number: ");
double n2 = scanner.nextDouble();

System.out.println("\nChoose Operation");
System.out.println("1 - Addition");
System.out.println("2 - Subtraction");
System.out.println("3 - Multiplication");
System.out.println("4 - Division");

int choice = scanner.nextInt();

ArithmeticParent operation = null;

switch(choice) {
case 1:
operation = new Addition(n1, n2);
break;
case 2:
operation = new Subtraction(n1, n2);
break;
case 3:
operation = new Multiplication(n1, n2);
break;
case 4:
operation = new Division(n1, n2);
break;
default:
System.out.println("Invalid Option");
System.exit(0);
}
System.out.println("Results: " + operation.calculate());

scanner.close();
}
}