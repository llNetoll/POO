import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class OrderProcessor {
    public ProcessingResult processOrder(Order order,IProcessingStrategy strategy,IShippingCalculator calculator){

        ProcessingResult resultado = strategy.process(order);
        String calculo = calculator.calculate(order);
        System.out.println("Processing from " + order + " Finished");

        return resultado;
        
    }

    public List<ProcessingResult> processOrderBatch(List<Order> orders,Map<Order,IProcessingStrategy> map,IShippingCalculator calculate){

        List<ProcessingResult> resultados = new ArrayList<>();

        for (Order o : orders){
            IProcessingStrategy estrategia = map.get(o);
            ProcessingResult resultado = processOrder(o,estrategia,calculate);
            resultados.add(resultado);
        }

        return resultados;


    }
}
