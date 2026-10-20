import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatsFactory implements FoodFactory {

    private static FatsFactory instance = null;

    
    private FatsFactory() {
    }

    
    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }

    
    @Override
    public String createFood(String diet) {

        List<String> allowedFats = new ArrayList<>();

        if (diet.equals("Paleo")) {
            allowedFats.add("Avocado");
            allowedFats.add("Tuna");
            allowedFats.add("Peanuts");
        }
        else if (diet.equals("Vegan")) {
            allowedFats.add("Avocado");
            allowedFats.add("Peanuts");
        }
        else if (diet.equals("Nut Allergy")) {
            allowedFats.add("Avocado");
            allowedFats.add("Sour cream");
            allowedFats.add("Tuna");
        }
        else if (diet.equals("No Restriction")) {
            allowedFats.add("Avocado");
            allowedFats.add("Sour cream");
            allowedFats.add("Tuna");
            allowedFats.add("Peanuts");
        }
        else {
            throw new IllegalArgumentException("Invalid diet plan");
        }

        Random random = new Random();
        int index = random.nextInt(allowedFats.size());

        return allowedFats.get(index);
    }
}

