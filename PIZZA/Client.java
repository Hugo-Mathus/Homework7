public class Client{
    public static void main(String[] args) {
        // BUILDER EXERCISE 1
        System.out.println("\nExercise 1: ");
        Pizza pizzaLarge = new PizzaBuilder().setChain("Pizza Hut")
                                        .setSize("Large")
                                        .addTopping("Pepperoni")
                                        .addTopping("Sausage")
                                        .addTopping("Mushrooms")
                                        .addTopping("Onions")
                                        .addTopping("Bacon")
                                        .addTopping("Extra Cheese")
                                        .addTopping("Peppers")
                                        .addTopping("Tomato and Basil")
                                        .addTopping("Ham")
                                        .createPizza();

        Pizza pizzaMedium = new PizzaBuilder().setChain("Pizza Hut")
                                        .setSize("Medium")
                                        .addTopping("Olives")
                                        .addTopping("Sausage")
                                        .addTopping("Mushrooms")
                                        .addTopping("Chicken")
                                        .addTopping("Spicy Pork")
                                        .addTopping("Tomato and Basil")
                                        .createPizza();

        Pizza pizzaSmall = new PizzaBuilder().setChain("Pizza Hut")
                                        .setSize("Small")
                                        .addTopping("Ham")
                                        .addTopping("Beef")
                                        .addTopping("Pepperoni")
                                        .createPizza();

        
        pizzaLarge.eat();
        System.out.println("\n");
        pizzaMedium.eat();
        System.out.println("\n");
        pizzaSmall.eat();

        // Exersice 2
        System.out.println("\nExercise2: ");
        Pizza PHlarge = new PizzaBuilder().setChain("Pizza Hut")
                                        .setSize("Large")
                                        .addTopping("Spinach")
                                        .addTopping("Chicken")
                                        .addTopping("Onions")
                                        .createPizza();
        
        Pizza PHsmall = new PizzaBuilder().setChain("Pizza Hut")
                                        .setSize("Small")
                                        .addTopping("Sausage")
                                        .addTopping("Pesto")
                                        .createPizza();

        Pizza LCmedium = new PizzaBuilder().setChain("Little Caesars")
                                        .setSize("Medium")
                                        .addTopping("Pepperoni")
                                        .addTopping("Sausage")
                                        .addTopping("Ham and Pineapple")
                                        .addTopping("Beef")
                                        .addTopping("Extra Cheese")
                                        .addTopping("Peppers")
                                        .addTopping("Tomato and Basil")
                                        .addTopping("Ham")
                                        .createPizza();
        Pizza LCsmall = new PizzaBuilder().setChain("Little Caesars")
                                        .setSize("Medium")
                                        .addTopping("Bacon")
                                        .addTopping("Peppers")
                                        .addTopping("Chicken")
                                        .addTopping("Ham")
                                        .addTopping("Extra Cheese")
                                        .addTopping("Sausage")
                                        .createPizza();
        Pizza Dsmall = new PizzaBuilder().setChain("Dominos")
                                        .setSize("Small")
                                        .addTopping("Extra Cheese")
                                        .createPizza();
        Pizza Dlarge = new PizzaBuilder().setChain("Dominos")
                                        .setSize("Large")
                                        .addTopping("Extra Cheese")
                                        .addTopping("Pepperoni")
                                        .addTopping("Bacon")
                                        .createPizza();
        
        PHlarge.eat();
        System.out.println("\n");
        PHsmall.eat();
        System.out.println("\n");
        LCmedium.eat();
        System.out.println("\n");
        LCsmall.eat();
        System.out.println("\n");
        Dsmall.eat();
        System.out.println("\n");
        Dlarge.eat();
    }
}