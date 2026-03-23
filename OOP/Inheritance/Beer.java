package OOP.Inheritance;

public class Beer extends Beverage {
    private double alcoholicContent;
    
    public Beer(int  volume, boolean isChilled, double alcoholicContent){
        super("Beer", volume, isChilled);
        this.alcoholicContent = alcoholicContent;
    }
    
    public String getType(){
        if (alcoholicContent < 0.03) {
            return "Flavored";
        } else if (alcoholicContent < 0.06) {
            return "Regular";
        } else {
            return "Strong";
        }
    }
    
    public double getAlcoholicContent() {
        return alcoholicContent;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (" + (alcoholicContent * 100) + "% alcoholic content)";
    }
}
