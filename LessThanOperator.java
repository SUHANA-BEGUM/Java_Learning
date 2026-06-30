class LessThanOperator {
    public static void main(String[] args) {
        int lowBatteryLevel = 20;  // Minimum battery level
        int currentBattery = 15;   // Current battery percentage
        
        boolean isBatteryLow =  currentBattery < lowBatteryLevel;// Add code here to compare
        
        // Write statement to print the result
        System.out.println("Battery low? " + isBatteryLow);
    }
}