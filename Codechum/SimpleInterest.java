public class SimpleInterest {
    public static double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0;
        double time = 2.5;
        
        double interest = calculateInterest(principal, rate, time);
        
        System.out.printf("Principal: %.2f, Rate: %.2f%%, Time: %.2f years, Simple Interest: %.2f\n", principal, rate, time, interest); 
    }
}