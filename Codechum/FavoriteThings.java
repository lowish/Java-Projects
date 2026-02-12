import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FavoriteThings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<String> favoriteThings = new ArrayList<>();
        
        System.out.print("Enter your first favorite thing: ");
        favoriteThings.add(sc.nextLine());
        
        System.out.print("Enter your second favorite thing: ");
        favoriteThings.add(sc.nextLine());
        
        System.out.print("Enter your third favorite thing: ");
        favoriteThings.add(sc.nextLine());
        
        System.out.println("Your favorite things are: " + favoriteThings);
        
        
        sc.close();
        
    }
}