
public class MealDriver {

    public static void main(String[] args) {

        Customer[] customers = {
            new Customer("John", "No Restriction"),
            new Customer("Alice", "Paleo"),
            new Customer("Bob", "Vegan"),
            new Customer("Mary", "Nut Allergy"),
            new Customer("David", "Paleo"),
            new Customer("Sarah", "Vegan")
        };

        // Get the single Macronutrient factory
        AbstractMacronutrientsFactory factory = Macronutrient.getInstance();

        // Get the three food factories
        FoodFactory carbsFactory = factory.createCarbsFactory();
        FoodFactory proteinFactory = factory.createProteinFactory();
        FoodFactory fatsFactory = factory.createFatsFactory();

        // Generate one meal for each customer
        for (Customer customer : customers) {

            String carbs = carbsFactory.createFood(customer.getDiet());
            String protein = proteinFactory.createFood(customer.getDiet());
            String fats = fatsFactory.createFood(customer.getDiet());

            Meal meal = new Meal(carbs, protein, fats);

            System.out.println("-------------------------");
            System.out.println("Customer: " + customer.getName());
            System.out.println("Diet: " + customer.getDiet());

            meal.displayMeal();
        }
    }
}
