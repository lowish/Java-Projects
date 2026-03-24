package OOP.Polymorphism;

public abstract class Pet{
    private String type;
    private boolean isFriendly;
    
    public Pet(String type, boolean isFriendly){
        this.type = type;
        this.isFriendly = isFriendly;
    }
    
    public abstract void makeNoise();
    
    @Override
    public String toString(){
        String friendlyStr = isFriendly ? "friendly" : "not friendly";
        return "Pet " + type + " is " + friendlyStr;
    }
}
