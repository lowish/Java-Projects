package OOP.Methods;

class Robot {
    String name;
    int batteryLevel;
    boolean isPoweredOn;

    // Constructor to initialize the Robot object
    public Robot(String name, int batteryLevel) {
        this.name = name;
        // Ensures battery level is between 0 and 100
        if (batteryLevel > 100) {
            this.batteryLevel = 100;
        } else if (batteryLevel < 0) {
            this.batteryLevel = 0;
        } else {
            this.batteryLevel = batteryLevel;
        }
        this.isPoweredOn = false; 
    }

    /**
     * A void method to display the robot's current status.
     * It should print the name, power status (e.g., "On" or "Off"), 
     * and battery level (e.g., "Battery Level: 75%").
     */
    public void displayStatus() {
        String status = isPoweredOn ? "On" : "Off";
        System.out.println("Robot: " + name);
        System.out.println("Power Status: " + status);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    /**
     * A void method to turn the robot on.
     * It should set the isPoweredOn field to true and print a confirmation message,
     * e.g., "Robbie is now powered on."
     */
    public void powerOn() {
        isPoweredOn = true;
        System.out.println(name + " is now powered on.");
        
    }

    /**
     * A void method to turn the robot off.
     * It should set the isPoweredOn field to false and print a confirmation message,
     * e.g., "Robbie is now powered off."
     */
    public void powerOff() {
        isPoweredOn = false;
        System.out.println(name + " is now powered off.");
    }

    /**
     * A void method with parameters to perform a task.
     * It should first check if the robot is powered on. If not, print an error.
     * Then, check if it has enough battery (batteryLevel >= batteryCost). If not, print an error.
     * If all checks pass, subtract batteryCost from batteryLevel and print a success message,
     * e.g., "Robbie is cleaning. Battery consumed: 20%."
     * @param task The name of the task.
     * @param batteryCost The amount of battery the task consumes.
     */
    public void performTask(String task, int batteryCost) {
        if (!isPoweredOn) {
            System.out.println(name + " cannot perform task. Robot is powered off.");
        } else if (batteryLevel < batteryCost) {
            System.out.println(name + " cannot perform task. Not enough battery.");
        } else {
            batteryLevel -= batteryCost;
            System.out.println(name + " is " +  task + ". Battery consumed: " + batteryCost + "%");
        }
        
    }

    /**
     * A method with a return value to charge the battery.
     * It should increase the batteryLevel by the given amount.
     * The battery level should not exceed 100. If charging makes it go over 100, cap it at 100.
     * It should then return the new battery level.
     * @param amount The amount to charge the battery.
     * @return The new battery level after charging.
     */
    public int chargeBattery(int amount){
            System.out.println(name + " is charging.");
            batteryLevel += amount;
            if (batteryLevel > 100){
                batteryLevel = 100;
            } 
            return batteryLevel;
        }
}
