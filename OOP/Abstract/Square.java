package OOP.Abstract;

public class Square extends TwoDShape {
    
    private double side;
    
    public Square (String color, double side) {
        super("Square", color, 4);
        this.side = side;
    }
    
   @Override
   public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return 4 * side;
    }
}
