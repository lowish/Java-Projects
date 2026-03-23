package OOP.Inheritance;

public class Father extends Person {
    public Father(String name, int age){
        super(name, age, 'M');
    }
    
    public void introduceWithStyle(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0;  j < i; j++){
                System.out.print(" ");
            }
            System.out.println("I am your father");
        }
    }
}