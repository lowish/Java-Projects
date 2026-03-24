package OOP.Polymorphism;

import java.util.ArrayList;

public class BirdCage{
    public void makeBirdSounds(ArrayList<Bird> birds){
        for (Bird bird: birds) {
            bird.makeSound();
        }
    }
}
