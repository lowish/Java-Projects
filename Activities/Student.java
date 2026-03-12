// Base Class
// OOP Concept: This is the parent class that contains common attributes and methods
// for all types of students.

public class Student {

    protected String name;
    protected int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // Method to check result
    // OOP Concept: This method will be OVERRIDDEN by child classes
    public void checkResult() {
        System.out.println("Result: Checking...");
    }
}