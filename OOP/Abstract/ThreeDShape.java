package OOP.Abstract;

public abstract class ThreeDShape extends Shape {
    
    public ThreeDShape (String name, String color) {
        super(name, color,  false);
    }
    
    public abstract double getSurfaceArea();
    public abstract double getVolume();
}