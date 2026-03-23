package OOP.Inheritance;

public final class Son extends Father {
    public Son(String name, int age){
        super(name, age);
    }
    
    public Son(int age) {
        super("Unknown", age);
    }
    
    public void introduceWithStyle(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0;  j < (n - 1 - i); j++){
                System.out.print(" ");
            }
            System.out.println("I am your son");
        }
    }
}
