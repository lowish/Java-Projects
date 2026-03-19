package OOP.Constructors;

public class Laptop {
    public String brand;
    public int ram;

    // Default constructor
    public Laptop() {
        this.brand = "Unknown";
        this.ram = 8;
    }

    // Custom constructor
    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }
}
