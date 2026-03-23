package OOP.Methods;

public class LightSwitch {
    private Lamp lamp;
    
    public LightSwitch(Lamp lamp){
        this.lamp = lamp;
    }
    
    public void flip(){
        if(lamp.isOn()){
            lamp.turnOff();
        } else {
            lamp.turnOn();
        }
    }
}
