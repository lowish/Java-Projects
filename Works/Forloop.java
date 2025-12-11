import java.util.Scanner;

public class Forloop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.println(i);
}
input.close();
    }
}
