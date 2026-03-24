package OOP.Polymorphism;

import java.util.ArrayList;

public class PetHouse {
    public void makeNoise(ArrayList<Pet> pets){
        for(Pet pet : pets){
            pet.makeNoise();
        }
    }
}
