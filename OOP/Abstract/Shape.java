package OOP.Abstract;

public abstract  class Shape {
    private String name;
    private String color;
    private boolean isFlat;
    
    public Shape(String name, String color, boolean isFlat) {
        this.name = name;
        this.color = color;
        this.isFlat = isFlat;
    }
    
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    public boolean getIsFlat() {
        return isFlat;
    }
    public boolean isFlat() {
        return isFlat;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
