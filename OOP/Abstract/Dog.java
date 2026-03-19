package OOP.Abstract;

class Dog extends Animal {
    
    public Dog(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Woof! My name is " + getName());
    }
}