import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {

        Scanner quiz = new Scanner(System.in);

        while (true) {

            System.out.println("\n========= MAIN MENU =========");
            System.out.println("1 Simple Calculator");
            System.out.println("2 Temperature Converter");
            System.out.println("3 Exit");
            System.out.print("Enter your choice: ");

            int choice = quiz.nextInt();

            // SIMPLE CALCULATOR
            if (choice == 1) {

                System.out.println("Simple Calculator");
                System.out.println("1 Add");
                System.out.println("2 Subtract");
                System.out.println("3 Multiply");
                System.out.println("4 Divide");
                System.out.print("Choose operation: ");

                int operator = quiz.nextInt();

                System.out.print("Enter number: ");
                int a = quiz.nextInt();

                System.out.print("Enter number: ");
                int b = quiz.nextInt();

                int result = 0;

                if (operator == 1) {
                    result = a + b;
                    System.out.println("Result: " + result);

                } else if (operator == 2) {
                    result = a - b;
                    System.out.println("Result: " + result);

                } else if (operator == 3) {
                    result = a * b;
                    System.out.println("Result: " + result);

                } else if (operator == 4) {
                    if (b == 0) {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                    result = a / b;
                    System.out.println("Result: " + result);

                } else {
                    continue;
                }
         
            }

            //  TEMPERATURE CONVERTER
            else if (choice == 2) {

                System.out.println("TEMPERATURE CONVERTER");
                System.out.println("1 Celsius to Fahrenheit");
                System.out.println("2 Fahrenheit to Celsius");
                System.out.print("Choose operator: ");

                int tChoice = quiz.nextInt();

                if (tChoice == 1) {
                    System.out.print("Enter temperature Celsius: ");
                    double c = quiz.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println(c + "°C is " + f + "°F");

                } else if (tChoice == 2) {
                    System.out.print("Enter temperature Fahrenheit: ");
                    double f = quiz.nextDouble();
                    double c = (f - 32) * 5 / 9;
                    System.out.println(f + "°F is " + c + "°C");
                }
            }
            // EXIT PROGRAM
            else           
            if (choice == 3) {
                System.out.println("Exit Program");
                break;
            }            
        }

        quiz.close();
    }
}
