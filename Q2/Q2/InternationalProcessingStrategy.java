public class InternationalProcessingStrategy implements IProcessingStrategy{
    @Override
    public ProcessingResult process(Order order){
        System.out.println("Processing in international way...");
        return new ProcessingResult("Internationaly processed " + order);
    }

}
