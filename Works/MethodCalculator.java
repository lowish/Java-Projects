public class MethodCalculator {
    public static void main(String[] args) {
    
    calculator();
    addition(100, 50);
    subtraction(50,20);
    multiply(10,5);
    divide(100,2);

    combine();


}
public static void calculator(){
    System.out.println("Method Calculator");
}
public static void addition(int a, int b){
    System.out.println("Addition: " + (a + b));
}

public static void subtraction(int c, int d){
    System.out.println("Subtraction: " + (c - d));
}

public static void multiply(int a, int b){
    System.out.println("Multiplication: " + (a * b));
}

public static void divide(int a, int b){
    System.out.println("Division: " + (a / b));
}

public static void combine(){
    System.out.println("Combined PEMDAS: " + ((100 + 50) - 20) * 5 / 2); 
}
}