public class CreditCardPayment extends Payment{
    private String numCartao;
    private String vencimento;

    public CreditCardPayment(double valor, String numCartao, String vencimento){
        super(valor);
        this.numCartao = numCartao;
        this.vencimento = vencimento; 
    }
}
