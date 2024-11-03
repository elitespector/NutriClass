package nutritrack;
public interface IFoodMeasurementStandards {
    //common food measurement units
    String GRAM = "g";            // Gram - Commonly used for vegetables, meat, grains, fats, fish
    String MILLILITER = "ml";     // Milliliter - Used for liquids like milk, oil, juices
    String PIECE = "piece";       // Piece - For items that can be counted like eggs, apples, cookies
    String CUP = "cup";           // Cup - Volume unit used in cooking and recipes
    String TEASPOON = "tsp";      // Teaspoon - Commonly for spices, oil, sugar
    String TABLESPOON = "tbsp";   // Tablespoon - Commonly for spices, oil, sugar
    String SLICE = "slice";       // Slice - For items that are sliced like bread, cheese, pizza

    // Default descriptions for each unit type
    default String describeUnit(String unit) {
        switch (unit) {
            case GRAM:
                return "Gram (g) - Commonly used for foods like vegetables, meat, grains, and fats.";
            case MILLILITER:
                return "Milliliter (ml) - Used for liquids like milk, oil, or juices.";
            case PIECE:
                return "Piece (unit) - For food items that can be counted, like eggs, apples, bananas, or cookies.";
            case CUP:
                return "Cup (cup) - A common volume unit in cooking and recipes. A cup is typically around 240 ml.";
            case TEASPOON:
                return "Teaspoon (tsp) - Used for measuring spices, oil, or sugar. Approximately 5 ml.";
            case TABLESPOON:
                return "Tablespoon (tbsp) - Used for measuring spices, oil, or sugar. Approximately 15 ml.";
            case SLICE:
                return "Slice (slice) - For food items that are typically sliced, like bread, cake, or cheese.";
            default:
                return "Unknown unit. Use common food measurement units defined in the interface IFoodMeasurementStandards";
        }
    }
    
    // Conversion function
    static double convertUnits(String fromUnit, String toUnit, double quantity) {
         if (fromUnit.equals("tsp") && toUnit.equals("ml")) {
             return quantity * 5; // 1 teaspoon = 5 ml
         } 
         else if (fromUnit.equals("tbsp") && toUnit.equals("ml")) {
             return quantity * 15; // 1 tablespoon = 15 ml
         } 
         else if (fromUnit.equals("cup") && toUnit.equals("ml")) {
             return quantity * 240; // 1 cup = 240 ml
         }
         // Add more conversions as needed
         return -1; // Return -1 if conversion is not defined
        }
    }
