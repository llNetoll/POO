public class InternationalProcessingStrategy {
    @Override
    public ProcessingResult InternationalProcessingStrategy(Order orderType){
        System.out.println("Processing in international way...");
        return("Internationaly processed " + orderType);
    }

}
