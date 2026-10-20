import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory implements FoodFactory {
    private static ProteinFactory instance = null;

    private ProteinFactory(){}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }
    @Override
    public String createFood(String diet) {

        List<String> allowedProteins = new ArrayList<>();

        if (diet.equals("Paleo")) {
            allowedProteins.add("Fish");
            allowedProteins.add("Chicken");
            allowedProteins.add("Beef");
        }
        else if (diet.equals("Vegan")) {
            allowedProteins.add("Tofu");
        }
        else if (diet.equals("Nut Allergy") ||
                 diet.equals("No Restriction")) {
            allowedProteins.add("Fish");
            allowedProteins.add("Chicken");
            allowedProteins.add("Beef");
            allowedProteins.add("Tofu");
        }
        else {
            throw new IllegalArgumentException("Invalid diet plan");
        }

        Random random = new Random();
        int index = random.nextInt(allowedProteins.size());

        return allowedProteins.get(index);
    }
}
