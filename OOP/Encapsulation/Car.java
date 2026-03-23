package OOP.Encapsulation;

public class Car {
    private String color;
    private double price;
    private char size;
    
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public char getSize(){
        return size;
    }
    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }
    

    
    @Override
    public String toString() {
        String label = "";
        
        if (this.size == 'S'){
            label = "small";
        } else if (this.size == 'M'){
            label = "medium";
        } else if (this.size == 'L') {
            label = "large";
        }
        
        return String.format("Car (%s) - P%.2f - %s", this.color, this.price, label);
    }
}