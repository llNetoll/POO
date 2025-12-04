public class PIXPayment extends Payment{
    private String chavePix;
    public PIXPayment(double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }
}
