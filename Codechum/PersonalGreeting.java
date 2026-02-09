public class PersonalGreeting {
    public static String generateGreeting(String name, int age){
        return "Hello, " + name + "! You are " + age + " years old. ";
    }
    public static void main(String[] args){
        String name ="Emily";
        int age = 28;
        
        String greeting = generateGreeting(name, age);
        
        System.out.println(greeting);
    }
}