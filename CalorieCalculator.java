package nutritrack;

public class CalorieCalculator implements ICalculator {
    public static int calculateDailyCalories(String gender, int age, double weight, double height, int workoutsPerWeek, boolean isPregnant) {
        double bmr;

        if (gender.equalsIgnoreCase(MALE)) {
            // BMR formula for men
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } 
        else if (gender.equalsIgnoreCase(FEMALE)) {
            // BMR formula for women
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
            if (isPregnant) {
                bmr += 300; // Additional calories for pregnant women
            }
        } 
        else {
            throw new IllegalArgumentException("Invalid gender. Please use 'male' or 'female'.");
        }

        double activityFactor;

        if (workoutsPerWeek > 7 || workoutsPerWeek<0) {
            throw new IllegalArgumentException("Invalid number of workouts per week. Please enter a value between 0 and 7.");
        }

        if (workoutsPerWeek == 0) {
            activityFactor = 1.2;
        } 
        else if (workoutsPerWeek <= 2) {
            activityFactor = 1.375;
        } 
        else if (workoutsPerWeek <= 4) {
            activityFactor = 1.55;
        } 
        else {
            activityFactor = 1.725;
        }

        return (int) (bmr * activityFactor);
}
}