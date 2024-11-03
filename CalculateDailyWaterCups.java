package nutritrack;

public class CalculateDailyWaterCups implements ICalculator {
    public static int calculateDailyWaterCups(double weight) {
        double waterMl = weight * 30; // 30 mL per kg
        int cups = (int) Math.ceil(waterMl / 240); // Convert to cups (240 mL per cup)
        return cups;
    }

    public String checkWaterIntake(int waterCupsConsumed, double weight) {
        int recommendedCups = calculateDailyWaterCups(weight);
        int difference = recommendedCups - waterCupsConsumed;

        if (difference <= 0) {
            return "Great job! You've met or exceeded your daily water intake goal.";
        } 
        else {
            return "You need to drink " + difference + " more cups of water to reach your daily goal.";
        }
    }
}