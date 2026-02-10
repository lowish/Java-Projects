public class Fahrenheit {
    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args){
        double fahrenheit = 68.0;
        double celsius = convertToCelsius(fahrenheit);
        
        System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsius);
    }
}