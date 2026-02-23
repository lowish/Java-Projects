import java.util.Scanner;

class ooptest{
private double length;
private double width;

public ooptest(double length, double width) {
this.length = length;
this.width = width;
}

public double calculateArea() {
return length * width;
}

public void displayArea() {
System.out.println("The area of the rectangle is: " + calculateArea());
}

public double getLength() {
return length;
}

public void setLength(double length) {
this.length = length;
}

public double getWidth() {
return width;
}

public void setWidth(double width) {
this.width = width;
}
}



public class ClassOOPtest {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the length of the rectangle: ");
double length = scanner.nextDouble();

System.out.print("Enter the width of the rectangle: ");
double width = scanner.nextDouble();

ooptest rectangle = new ooptest(length, width);

rectangle.displayArea();
scanner.close();
}
}