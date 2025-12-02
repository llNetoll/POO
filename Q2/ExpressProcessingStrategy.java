public class ExpressProcessingStrategy implements IProcessingStrategy {
    @Override
    public ProcessingResult process(Order orderType){
        System.out.printl("processing in express way...");
        return ("Expressly processed " + orderType)
    }
}
