package OOP.Inheritance;

public class Dancer extends Performer {
    private String danceStyle;
    
     public Dancer(String name, int age, String danceStyle){
        super(name, age);
        this.danceStyle  = danceStyle;
    }
    
    public String getDanceStyle(){
        return danceStyle;
    }
    public void dance(){
        System.out.println(getName() + " is performing " + danceStyle +  " dance.");
    }
}