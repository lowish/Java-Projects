 public class Productinformation {
    public static void main(String[] args){
        String product_name = "Laptop";
        float price = 1200.50f;
        int quantity = 3;
        
        System.out.println("Product: " + product_name);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Quantity: " + quantity + " units");
        
    }
}