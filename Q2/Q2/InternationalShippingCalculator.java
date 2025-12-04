public class InternationalShippingCalculator implements IShippingCalculator{
    @Override
    public String calculate(Order order){
        System.out.println("Calculating...");
        return ("International Shipping Calculate from " + order);
    }
}
