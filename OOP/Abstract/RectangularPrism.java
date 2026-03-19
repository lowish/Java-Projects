package OOP.Abstract;

public class RectangularPrism extends ThreeDShape {
    
    private double length;
    private double width;
    private double height;
    
    public RectangularPrism(String color, double length, double width, double height) {
        super("Rectangular Prism", color);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
   @Override
   public double getSurfaceArea() {
        return 2 * (length * width + length * height + width *  height);
    }
    public double getVolume() {
        return length * width * height;
    }
}
