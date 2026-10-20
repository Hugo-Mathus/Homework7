/*
Homework7
CS3560
Hugo Mathus
*/
import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder{
    private String chain;
    private String size;
    private List<String> toppings = new ArrayList<>();

    public PizzaBuilder(){        
    }

    public PizzaBuilder setChain(String chain){
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping){
        toppings.add(topping);
        return this;
    }

    public Pizza createPizza(){
        if (size == null || size.isBlank()){
            throw new IllegalStateException("Please provide a pizza size, is required...");
        }
        if (!size.equals("Small")&&
            !size.equals("Medium")&& 
            !size.equals("Large")){


            throw new IllegalStateException("Invalid pizza size...");
        }
        return new Pizza(chain,size,toppings);
    }

}