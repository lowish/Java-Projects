package OOP.Constructors;

// Your code here! Create the Plant class with three chained constructors.

public class Plant {
    public String species;
    public double heightCm;
    public boolean isIndoor;
    
public Plant(String species) {
        this.species = species;
        this.heightCm = 10.0;
        this.isIndoor = true;
    }

public Plant(String species, double heightCm) {
        this.species = species;
        this.heightCm = heightCm;
        this.isIndoor = true;
        
    }
public Plant(String species, double heightCm, boolean isIndoor) {
        this.species = species;
        this.heightCm = heightCm;
        this.isIndoor = isIndoor;
        
    }

}