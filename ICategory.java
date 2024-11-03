package nutritrack;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ICategory {
    // Common food categories
    String MEAT = "Meat";
    String SEAFOOD = "Seafood";
    String VEGETABLES = "Vegetables";
    String FRUITS = "Fruits";
    String GRAINS_AND_CEREALS = "Grains and Cereals";
    String DAIRY_PRODUCTS = "Dairy Products";
    String NUTS_AND_SEEDS = "Nuts and Seeds";
    String FATS_AND_OILS = "Fats and Oils";
    String BEVERAGES = "Beverages";
    String SNACKS = "Snacks";
    String SAUCES = "Sauces";
    String SWEETS = "Sweets";
    String EGGS = "Eggs";

    // List of all categories for validation
    List<String> ALL_CATEGORIES = Arrays.asList(
        MEAT, SEAFOOD, VEGETABLES, FRUITS, GRAINS_AND_CEREALS,
        DAIRY_PRODUCTS, NUTS_AND_SEEDS, FATS_AND_OILS, BEVERAGES,
        SNACKS, SAUCES, SWEETS, EGGS
    );

    // Common units for each category
    String GRAM = "g";
    String MILLILITER = "ml";
    String PIECE = "piece";
    String CUP = "cup";
    String TEASPOON = "tsp";
    String TABLESPOON = "tbsp";
    String SLICE = "slice";

    // Mapping of categories to appropriate measurement units
    Map<String, List<String>> CATEGORY_UNITS = new HashMap<>() {{
        put(MEAT, Arrays.asList(GRAM, PIECE, SLICE));
        put(SEAFOOD, Arrays.asList(GRAM, PIECE, SLICE));
        put(VEGETABLES, Arrays.asList(GRAM, CUP, PIECE));
        put(FRUITS, Arrays.asList(GRAM, CUP, PIECE, SLICE));
        put(GRAINS_AND_CEREALS, Arrays.asList(GRAM, CUP));
        put(DAIRY_PRODUCTS, Arrays.asList(GRAM, MILLILITER, CUP));
        put(NUTS_AND_SEEDS, Arrays.asList(GRAM, CUP, PIECE));
        put(FATS_AND_OILS, Arrays.asList(GRAM, MILLILITER, TEASPOON, TABLESPOON));
        put(BEVERAGES, Arrays.asList(MILLILITER, CUP));
        put(SNACKS, Arrays.asList(GRAM, PIECE, CUP));
        put(SAUCES, Arrays.asList(MILLILITER, TEASPOON, TABLESPOON));
        put(SWEETS, Arrays.asList(GRAM, PIECE, SLICE));
        put(EGGS, Arrays.asList(PIECE));
    }};
}