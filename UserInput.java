package nutritrack;

public class UserInput implements ICalculator{
    public static void main(String[] args) {
        System.out.println("Please enter your weight in " + ICalculator.WEIGHT_UNIT + ":");
        System.out.println("Please enter your height in " + ICalculator.HEIGHT_UNIT + ":");
        System.out.println("Please specify your gender (" + ICalculator.MALE + " / " + ICalculator.FEMALE + "):");
    }
}