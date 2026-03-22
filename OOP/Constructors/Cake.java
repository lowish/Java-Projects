package OOP.Constructors;

// Your code here! Create the Cake class with constructor chaining.

public class Cake {
    public String flavor;
    public int layers;
    
public Cake() {
        this("Vanilla", 2);
        
    }

public Cake(String flavor, int layers) {
        this.flavor = flavor;
        this.layers = layers;
        
    }

}