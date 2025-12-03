import java.util.Scanner;

public class Totalprice {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = price.nextInt();

        System.out.print("Enter price per item: ");
        double per_price = price.nextDouble();

        double cost = quantity * per_price;

        System.out.printf("Total cost: $%.2f", cost);

        price.close();
    }
}