public class Method {
    static void  myMethod() {
        System.out.println("Addition!");
    }

    static int addNumbers(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod();
        int sum = addNumbers(10, 15);
        System.out.println("Sum: " + sum);
    }
}
