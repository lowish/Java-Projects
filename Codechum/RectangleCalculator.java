public class RectangleCalculator {
    public static double calculateArea(double length, double width){
        return length * width;
    }
    public static void main(String[] args) {
        double length = 12.5;
        double width = 8.0;
        
        double area = calculateArea(length, width);
        
        System.out.printf("Rectangle with length %.1f and width %.1f has an area of %.2f square units.%n", length, width, area);
    }
}