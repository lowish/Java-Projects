package OOP.Polymorphism;

public class Lion extends Pet{
    public Lion(){
        super("lion", false);
    }
    @Override
    public void makeNoise() {
        System.out.println("Roar!");
    }
}
