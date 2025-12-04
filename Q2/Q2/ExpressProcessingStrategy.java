public class ExpressProcessingStrategy implements IProcessingStrategy {
    @Override
    public ProcessingResult process(Order order){
        System.out.println("processing in express way...");
        return new ProcessingResult("Expressly processed " + order);
    }
}
