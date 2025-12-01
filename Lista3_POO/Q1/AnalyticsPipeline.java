
public class AnalyticsPipeline {
    public AnalysisResult executeAnalysis(IAnalyzer algorithm, IDataSource source) {

        Object dados = source.getDados();

        AnalysisResult resultado = algorithm.analyze(dados); 

        System.out.println("Analysis finished");


        return resultado;

    }

    public List<AnalysisResult> executeBatchAnalysis(Map<IAnalyzer, ISource> jobs) {

    }

    public ComparativeReport generateComparativeReport(list<IAnalyzer> algorithms, IDataSource source) {
        ComparativeReport relatorio = new ComparativeReport();

        Object dados = source.getDados();

        for(IAnalyzer alg : algorithms) {
            AnalysisResult res = alg.analyze(dados);
            relatorio.add(res);
        }
    }








}
