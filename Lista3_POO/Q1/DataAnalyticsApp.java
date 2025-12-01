import java.util.*;

public class DataAnalyticsApp {
    public static void main(String[] args) {
        AnalyticsPipeline pipeline = new AnalyticsPipeline();

        // 1. Execução Individual: Diferentes combinações de algoritmos e fontes
        AnalysisResult result1 = pipeline.executeAnalysis(
            new MLRegressionAnalyzer(),
            new DatabaseDataSource("sales_db")
        );

        AnalysisResult result2 = pipeline.executeAnalysis(
            new StatisticalAnalyzer(),
            new FileDataSource("data.csv")
        );

        AnalysisResult result3 = pipeline.executeAnalysis(
            new NeuralNetworkAnalyzer(),
            new APIDataSource("https://api.data.com")
        );

        // 2. Processamento em lote (Batch) com múltiplas combinações
        // Nota: O Map associa um Algoritmo a uma Fonte de Dados
        Map<Analyzer, DataSource> analysisJobs = new LinkedHashMap<>(); // Usando tipos genéricos hipotéticos aqui

        analysisJobs.put(new MLRegressionAnalyzer(), new DatabaseDataSource("db1"));
        analysisJobs.put(new StatisticalAnalyzer(), new FileDataSource("file1.csv"));

        List<AnalysisResult> batchResults = pipeline.executeBatchAnalysis(analysisJobs);

        // 3. Análise comparativa (Vários algoritmos na mesma fonte)
        ComparativeReport report = pipeline.generateComparativeReport(
            Arrays.asList(new MLRegressionAnalyzer(), new StatisticalAnalyzer()),
            new DatabaseDataSource("comparison_db")
        );
    }
}
