package nutritrack;
public class FoodItem {
	//a class representing a non-composite food item
	private String name;
	private int calories;
	private String imagePath;
	
	public FoodItem(String name, int calories, String imagePath) {
		this.name=name;
		this.calories=calories;
		this.imagePath=imagePath;
	}
	
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public String getImagePath() {
		return imagePath;
	}
	@Override
	public String toString() {
		return name+" ("+calories+ " calories)";
	}
	
	public void setCalories(int calories) {
		this.calories=calories;
	}
	

}





