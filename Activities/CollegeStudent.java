// INHERITANCE: CollegeStudent inherits from Student class
// METHOD OVERRIDING: checkResult() overrides the method from Student
// IF ELSE CONDITION: Used to determine pass or fail

public class CollegeStudent extends Student {

    public CollegeStudent(String name, int grade) {
        super(name, grade);
    }

    // METHOD OVERRIDING
    @Override
    public void checkResult() {

        // IF ELSE CONDITION
        if (grade >= 75) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
    }
}