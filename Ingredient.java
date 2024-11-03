package nutritrack;
public class Ingredient implements IFoodMeasurementStandards{
    private String name;
    private int calories;  
    private String unit; 
    private Category category;

    public Ingredient(String name, int calories, String unit, Category category) {
        this.name = name;
        this.calories = calories;
        this.unit = unit;
        this.category = category;
    }

    // Getters
    public String getName() { 
    	return name; 
    	}
    public int getCalories() { 
    	return calories; 
    	}
    public String getUnit() { 
    	return unit; 
    	}
    public Category getCategory() { 
    	return category; 
    	}

    @Override
    public String toString() {
        return name + " (" + calories + " calories to-" + unit + ")";
    }
}