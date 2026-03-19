package OOP.Abstract;

public abstract class TwoDShape extends Shape {
    private int numberOfSides;
    
    public TwoDShape(String name, String color, int numberOfSides) {
        super(name, color,  true);
        this.numberOfSides = numberOfSides;
    }
    
    public int getNumberofSides() {
        return numberOfSides;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}