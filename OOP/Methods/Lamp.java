package OOP.Methods;

public class Lamp{
    private boolean isOn;
    
    public Lamp(){
        this.isOn = false;
    }
    
    public void turnOn(){
        isOn = true;
    }
    
    public void turnOff(){
        isOn = false;
    }
    
    public boolean isOn(){
        return isOn;
    }
}
