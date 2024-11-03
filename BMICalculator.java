package nutritrack;

public class BMICalculator implements ICalculator {
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } 
        else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } 
        else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } 
        else {
            return "Obese";
        }
    }

    public static String getRecommendedWeightRange(double height) {
        height = height / 100; // Convert height from cm to meters
        double minWeight = 18.5 * height * height;
        double maxWeight = 24.9 * height * height;
        return "Your recommended weight range is " + String.format("%.1f", minWeight) + " kg to " + String.format("%.1f", maxWeight) + " kg.";
    }

    public static String getBMIDescription(double weight, double height) {
        double bmi = calculateBMI(weight, height);
        String category = getBMICategory(bmi);
        String recommendedRange = getRecommendedWeightRange(height);

        return "Your BMI is " + String.format("%.1f", bmi) + ", which is considered " + category + ". " + recommendedRange;
    }
}