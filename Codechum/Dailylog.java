public class Dailylog{
    public static void main(String[] args){
        String log_date = "2023-10-26";
        String activity1 =  "Coding";
        double hours1 = 4.5;
        double cost1 = 0.00;
        String activity2 = "Meeting";
        double hours2 = 2.0;
        double cost2 = 15.50;
        
        double total_hours = hours1 + hours2;
        double total_cost = cost1 + cost2;
        
        System.out.println("Daily Log for: " + log_date);
        System.out.println("--- Activities ---");
        System.out.printf("- %s: %.2f hrs, Cost: $%.2f%n", activity1, hours1, cost1);
        System.out.printf("- %s: %.2f hrs, Cost: $%.2f%n", activity2, hours2, cost2);
        System.out.println("------------------");
        System.out.printf("Total Hours: %.2f%n", total_hours);
        System.out.printf("Total Cost: $%.2f%n", total_cost);
    }
}