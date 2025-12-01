import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter length: ");
        double lenght = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double areas = lenght * width;

        System.out.printf("Area: %.2f", areas);

        sc.close();
    }
}