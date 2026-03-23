package OOP.Constructors;

// Your code here! Implement the GameCharacter class.

public class GameCharacter {
    public String name;
    public int health;
    public int level;
    
public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
    }

public GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
        
    }

}