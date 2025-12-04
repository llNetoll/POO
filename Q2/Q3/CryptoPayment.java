public class CryptoPayment extends Payment{
    String cod;
    String moeda;
    public CryptoPayment(double valor,String cod, String moeda){
        super(valor);
        this.cod = cod;
        this.moeda = moeda;
    }
}
