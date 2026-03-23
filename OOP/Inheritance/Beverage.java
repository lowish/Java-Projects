package OOP.Inheritance;

public class Beverage {
    private String name;
    private int volume;
    private boolean isChilled;
    
    public Beverage(String name, int volume, boolean isChilled) {
        this.name = name;
        this.volume = volume;
        this.isChilled = isChilled;
    }
    
    public boolean isEmpty(){
        return volume == 0;
    }
    
    public String getName(){
        return  name;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public boolean isChilled(){
        return isChilled;
    }
    
    @Override
    public String toString(){
        String chilledStatus = isChilled ? "is still chilled" : "is not chilled anymore";
        return name + " (" + volume + "mL) " + chilledStatus;
    }
}