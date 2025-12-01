public class MLRegressionAnalyzer implements IAnalyzer {
    @Override
    public AnalysisResult analyze(Object data){
        System.out.println("Regression analysis in progress...");
        return new AnalysisResult("Regression result with data: " + data);
    }
}
