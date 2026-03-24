package OOP.Polymorphism;

public class Cat extends Pet{
    public Cat(){
        super("cat", true);
    }
    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
}