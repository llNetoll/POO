public class HighRiskAnalyzer implements IRiskAnalyzer{
    @Override
    public String riskAnalyze(Payment payment){
        System.out.println("Analyzing...");
        return("High risk analyze on" + payment);
    }
}
