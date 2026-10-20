import java.util.List;

public class Pizza{
    private String chain;
    private String size;
    private List<String> toppings;

    public Pizza(String chain, String size, List<String> toppings){
        this.chain = chain;
        this.size = size;
        this.toppings = List.copyOf(toppings);        
    }

    public void eat(){
        System.out.println("Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.print("Toppings: " + toppings);
        
    }
}