public class DemoRaise {
    public static void main(String[] args){
        double salary = 200.00;
        double startingWage = 800.00;
        System.out.println("Demonstrating some raise");
        predictRaise(400.00);
        predictRaise(salary);
        predictRaise(startingWage);
    }
    public static void predictRaise(double salary){
        double newSalary;
        final double RAISE_RATE = 1.10;
        newSalary = salary * RAISE_RATE;
        System.out.printf("Current Salary: " + salary  + "After Raise: " + newSalary);
    }
}
