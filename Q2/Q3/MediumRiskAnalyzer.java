public class MediumRiskAnalyzer implements IRiskAnalyzer{
    @Override
    public String riskAnalyze(Payment payment){
        System.out.println("Analyzing...");
        return("Medium risk analyze on" + payment);
    }
}
