package nutritrack;
import java.util.ArrayList;
import java.util.List;

public class DailyFoodLog {
    private List<FoodItem> foodItems = new ArrayList<>();
    private int dailyCalorieGoal;

    public DailyFoodLog(int dailyCalorieGoal) {
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
    }

    public int getTotalCalories() {
        int totalCalories = 0;
        for (FoodItem item : foodItems) {
            totalCalories += item.getCalories();
        }
        return totalCalories;
    }

    public String checkCalorieGoal() {
        int totalCalories = getTotalCalories();
        int difference = dailyCalorieGoal - totalCalories;

        if (Math.abs(difference) <= 100) {
            return "good job!";
        } 
        else if (difference > 0) {
            return "You're almost there! Try to consume " + difference + " more calories to reach your daily goal.";
        } 
        else {
            return "You've exceeded your daily calorie goal by " + Math.abs(difference) + " calories. Tomorrow is a new day to work towards your targets and stay on track!";
        }
    }
}