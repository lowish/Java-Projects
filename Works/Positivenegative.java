import java.util.Scanner;

public class Positivenegative {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = check.nextInt();

        if(num > 0 ){
            System.out.println("The number is positive.");
        }else if(num < 0){
            System.out.println("The number is negative.");
        }else{
             System.out.println("The number is zero.");
        }

        check.close();
    }
}