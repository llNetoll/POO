public class StandardProcessingStrategy implements IProcessingStrategy {
    @Override
    public ProcessingResult process(Order order){
        System.out.println("processing in standard way...");
        return new ProcessingResult("Standardly processed the " + order);
    }
}