public class Studentenrollment {
    public static void main(String[] args){
        String student_name = "Alice Smith";
        String enrollment_date = "2023-09-01";
        String course_name = "Introduction to Programming";
        int student_id = 1001;
        float tution_fee = 450.75f;
        
        System.out.println("Student Name: " + student_name);
        System.out.println("Student ID: " + student_id);
        System.out.println("Course: " + course_name);
        System.out.println("Enrollment Date: " + enrollment_date);
        System.out.printf("Tuition Fee: $%.2f%n", tution_fee);
    }
}