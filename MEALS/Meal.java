public class Meal{

    private String carbs;
    private String protein;
    private String fats;

    public Meal(String carbs, String protein, String fats){
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void diplayMeal(){
        System.out.println("Carbs: " + carbs);
        System.out.println("Protein: " + protein);
        System.out.println("Fat: " + fats);
    }

}