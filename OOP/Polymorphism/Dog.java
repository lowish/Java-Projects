package OOP.Polymorphism;

public class Dog extends Pet{
    
    private String breed; 
    
    public Dog(String breed){
        super("dog", true);
        this.breed = breed;
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Arf!");
    }
    
    @Override
    public String toString() {
        return super.toString() + " [" + breed + "]";
    }
}
