package OOP.Encapsulation;

public class Dog {
    private  String breed;
    private int barkCount = 0;
    
    public Dog(){
        this.barkCount = 0;
        this.breed = null;
        
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public int getBarkCount() {
        return barkCount;
    }
    public boolean hasBarkedALot() {
        if (this.barkCount >= 100){
            return true;
        } else {
            return false;
        }
    }
    
    
    public void bark(int n) {
        for (int i = 0; i < n; i++){
            System.out.println("Woof");
        }
        this.barkCount += n;
    }
}
