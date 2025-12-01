public class ComparatveReport {
    private List<AnalysisResult> results = new ArrayList<>();

    public void addResult(AnalysisResult item) {
        this.results.add(item);
    }

    public void printReport() {
        System.out.println("=======Comparative Report=======");
        
        for(AnalysisResult r : results) {
            System.out.println(r.getResult());
        }
    }
      

}
