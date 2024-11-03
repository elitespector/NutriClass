package nutritrack;

import java.util.ArrayList;
public class CompositeFood extends FoodItem implements IFoodMeasurementStandards {
	//a class representing composite food, allowing the user to calculate calories based on its ingredients
	private ArrayList<Ingredient> ingredients;
	
	public CompositeFood(String name, String imagePath) {
		super(name,0,imagePath); //calories would be updated later
		ingredients= new ArrayList<>();		
	}	
	public void addIngredient(Ingredient ingredient, int quantity) {
		ingredients.add(ingredient);
		
		this.setCalories(this.getCalories()+ingredient.getCalories()*quantity);
	}
}

