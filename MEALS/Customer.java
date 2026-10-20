

public class Customer {
    
    private String name;
    private String diet;

    public Customer(String name, String diet){
        this.name = name;
        this.diet = diet;
    }

    public String getName(){
        return name;        
    }

    public String getDiet(){
        return diet;
    }
}