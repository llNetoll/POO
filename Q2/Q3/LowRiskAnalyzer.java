public class LowRiskAnalyzer implements IRiskAnalyzer{
    @Override
    public String riskAnalyze(Payment payment){
        System.out.println("Analyzing...");
        return("Low risk analyze on" + payment);
    }

}
