public class CryptoProcessor implements IProcessor{
    @Override
    public PaymentResult process(Payment payment){
        System.out.println("Processing...");
        return new PaymentResult("Crypto processor on" + payment);
    }

    public boolean supports(Payment payment){
        return payment instanceof CryptoPayment;
    }
}
