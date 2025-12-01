public class StatisticalAnalyser implements IAnalyzer {
    @Override
    public AnalysisResult analyze(Object data){
        System.out.println("Statistical analysis in progress...");
        return new AnalysisResult("Statistical result with data: " + data);
    }
}
