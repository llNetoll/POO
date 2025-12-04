public class PriorityShippingCalculator implements IShippingCalculator{
    @Override
    public String calculate(Order order){
        System.out.println("Calculating...");
        return ("Priority Shipping Calculate from " + order);
    }
}
