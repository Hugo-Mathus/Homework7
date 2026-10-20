import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbsFactory implements FoodFactory{
    private static CarbsFactory instance = null;

    private CarbsFactory(){}
    
    public static CarbsFactory getInstance(){
        if (instance == null){
            instance = new CarbsFactory();
        }
        return instance;
    }

    @Override
    public String createFood(String diet){
        List<String> allowedCarbs = new ArrayList<>();

        if (diet.equals("Paleo")){
            allowedCarbs.add("Pistachio");
        }
        else if (diet.equals("Vegan")){
            allowedCarbs.add("Bread");
            allowedCarbs.add("Lentils");
            allowedCarbs.add("Pistachio");
        }
        else if (diet.equals("Nut Allergy")){
            allowedCarbs.add("Cheese");
            allowedCarbs.add("Bread");
            allowedCarbs.add("Lentils");
        }
        else if (diet.equals("No Restriction")) {
            allowedCarbs.add("Cheese");
            allowedCarbs.add("Bread");
            allowedCarbs.add("Lentils");
            allowedCarbs.add("Pistachio");
        }
        else {
            throw new IllegalArgumentException("Invalid diet plan");
        }
        Random random = new Random();
        int index = random.nextInt(allowedCarbs.size());
        return allowedCarbs.get(index);
    }
}