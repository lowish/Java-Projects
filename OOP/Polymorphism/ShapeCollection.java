package OOP.Polymorphism;

import java.util.ArrayList;

public class ShapeCollection {
    private ArrayList<Shape> shapes;
    
    public ShapeCollection(ArrayList<Shape> shapes){
        this.shapes = shapes;
    }
    
    public void calculateAndPrintAreaAndPerimeter() {
        for(Shape shape : shapes){
            System.out.printf("Area: %.2f\n", shape.getArea());
            System.out.printf("Perimeter: %.2f\n", shape.getPerimeter());
            System.out.println();
        }
    }
}
