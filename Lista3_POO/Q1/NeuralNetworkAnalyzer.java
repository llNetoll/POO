public class NeuralNetworkAnalyzer implements IAnalyzer {
    @Override
    public AnalysisResult analze(Object data){
        System.out.println("Neural Network analysis in progress...");
        return AnalysisResult("Neural Network result with data:" + data);
    }
}
