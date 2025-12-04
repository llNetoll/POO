public class CreditCardProcessor implements IProcessor{
    @Override
    public PaymentResult process(Payment payment){
        System.out.println("Processing...");
        return new PaymentResult("Credit card processor on " + payment);
    }

    public boolean supports(Payment payment){
        return payment instanceof CreditCardPayment;
    }
}
