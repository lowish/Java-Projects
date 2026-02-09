public class NumberDoubler {
    public static int myNumber(int num) {
        return num * 2;
    }
    public static void main(String[] args){
        int number = 7;
        int doubled =  myNumber(number);
        
        System.out.println("The double of " + number + " is " + doubled + ".");
    } 
}