package OOP.Inheritance;

public class Water extends Beverage{
    private String type;
    
    public Water(int volume, boolean isChilled, String type){
        super("Water", volume, isChilled);
        this.type  = type;
    }
    
    public Water(int volume, boolean isChilled){
        super("Water", volume, isChilled);
        this.type  = "Regular";
    }
    public String getType() {
        return type;
    }
}