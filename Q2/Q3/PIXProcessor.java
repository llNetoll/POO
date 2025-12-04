public class PIXProcessor implements IProcessor{
    @Override
    public PaymentResult process(Payment payment){
        System.out.println("Processing...");
        return new PaymentResult("Pix processor on" + payment);
    }

    public boolean supports(Payment payment){
        return payment instanceof PIXPayment;
    }
}
