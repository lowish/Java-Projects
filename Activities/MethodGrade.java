import java.util.Scanner;

public class MethodGrade {

public static void main(String[] args) {
Scanner grade = new Scanner(System.in);

System.out.print("Enter student name:");
String name = grade.nextLine();

System.out.print("Enter Quiz 1:");
int quiz1 = grade.nextInt();

System.out.print("Enter Quiz 2:");
int quiz2 = grade.nextInt();

System.out.print("Enter Quiz 3:");
int quiz3 = grade.nextInt();

System.out.print("Enter Midterm Exam:");
int midterm = grade.nextInt();

System.out.print("Enter Final Exam:");
int finalExam = grade.nextInt();

double average = calculateAverage(quiz1, quiz2, quiz3, midterm, finalExam);
String equivalent = getEquivalentGrade(average);

displayResult(name, average, equivalent);

grade.close();
}






public static double calculateAverage(int Quiz1, int Quiz2, int Quiz3, int midterm, int finalExam) {
return (Quiz1 + Quiz2 + Quiz3 + midterm + finalExam) / 5.0;
}
public static String getEquivalentGrade(double average) {

if (average >= 90 && average <= 100) {
return "Excellent";
} else if (average >= 80) {
return "Very Good";
} else if (average >= 70) {
return "Good";
} else if (average >= 60) {
return "Passed";
} else {
return "Failed";
}
}

public static void displayResult(String name, double average, String grade) {
System.out.println("\nStudent Name:" + name);
System.out.printf("Final Average:%.1f%n", average);
System.out.println("Grade Equivalent:" + grade);

}

}