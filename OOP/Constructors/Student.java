public class Student {

    double studentNo;
    String name;
    String course;
    int units;

    private final double miscFee = 11879.60;

    public Student(double studentNo, String name, String course, int units) {
        this.studentNo = studentNo;
        this.name = name;
        this.course = course.toUpperCase();
        this.units = units;
    }

    public double tuitionRate() {
        switch (course) {
            case "CS":
                return 1400.00;
            case "EMC":
                return 2000.00;
            case "NETAD":
                return 1600.00;
            case "WEBDEV":
                return 1500.00;
            default:
                return 0;
        }
    }

    public String courseName() {
        switch (course) {
            case "CS":
                return "Computer Science";
            case "EMC":
                return "Entertainment and MultiMedia Computing";
            case "NETAD":
                return "IT Net Administration";
            case "WEBDEV":
                return "IT Web Development";
            default:
                return "Invalid Course";
        }
    }

    public double compute() {
        return (tuitionRate() * units) + miscFee;
    }

    public void display() {
        System.out.println("\nDisplaying Student Details");
        System.out.println("Student No : " + studentNo);
        System.out.println("Name : " + name);
        System.out.println("Course " + courseName());
        System.out.printf("Per Unit Tuition : %,.2f%n", tuitionRate());
        System.out.printf("Total Tuition Fee with Misc Fees: %,.2f%n",
                compute());
    }
}