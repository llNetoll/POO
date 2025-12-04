public interface IProcessor {
    public PaymentResult process(Payment payment);
    public boolean supports(Payment payment);
}
