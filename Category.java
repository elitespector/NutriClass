package nutritrack;
import java.util.List;
public class Category implements ICategory {
    private String name;

    //check if category is valid according to the interface ICategory
    public Category(String name) {
        if (isValidCategory(name)) {
            this.name = name;
        } 
        else {
            throw new IllegalArgumentException("Category not found. Please choose a valid category.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Static method to check if a category is valid according to the interface ICategory
    public static boolean isValidCategory(String category) {
        return ICategory.ALL_CATEGORIES.contains(category);
    }

 // Static method to check if a unit is valid for a given category according to the interface ICategory
    public static boolean isValidUnitForCategory(String category, String unit) {
        List<String> validUnits = ICategory.CATEGORY_UNITS.get(category);        
        if (validUnits != null) {
            if (validUnits.contains(unit)) {
                return true;
            } 
            else {
                System.out.println("Invalid unit. Valid units for category " + category + " are: " + validUnits);
                return false;
            }
        } 
        else {
            System.out.println("Category " + category + " does not exist.");
            return false;
        }
    }
}
    
    
    




    