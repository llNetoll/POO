public class DomesticShippingCalculator implements IShippingCalculator{
    @Override
    public String calculate(Order order){
        System.out.println("Calculating...");
        return ("Domestic Shipping Calculate from " + order);
    }
}
