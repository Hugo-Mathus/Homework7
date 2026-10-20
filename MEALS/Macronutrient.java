
public class Macronutrient implements AbstractMacronutrientsFactory {

    private static Macronutrient instance = null;

    
    private Macronutrient() {
    }

    
    public static Macronutrient getInstance() {
        if (instance == null) {
            instance = new Macronutrient();
        }
        return instance;
    }

    
    @Override
    public FoodFactory createCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    @Override
    public FoodFactory createProteinFactory() {
        return ProteinFactory.getInstance();
    }

    @Override
    public FoodFactory createFatsFactory() {
        return FatsFactory.getInstance();
    }
}
