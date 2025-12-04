import java.util.List;

public abstract class Order {
    
    private String items;
    private String customer;

    public Order(String items,String customer){
        this.items = items;
        this.customer = customer;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
