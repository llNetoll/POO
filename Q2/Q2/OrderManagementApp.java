import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class OrderManagementApp {

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        String items = "Brinquedos";
        String customer = "João Morais";

        // Diferentes tipos de pedidos com estratégias específicas
        Order standardOrder = new StandardOrder(items, customer);
        Order expressOrder = new ExpressOrder(items, customer);
        Order internationalOrder = new InternationalOrder(items, customer);

        // Processamento polimórfico através de múltiplas hierarquias
        ProcessingResult result1 = processor.processOrder(
            standardOrder,
            new StandardProcessingStrategy(),
            new DomesticShippingCalculator()
        );

        ProcessingResult result2 = processor.processOrder(
            expressOrder,
            new ExpressProcessingStrategy(),
            new PriorityShippingCalculator()
        );

        ProcessingResult result3 = processor.processOrder(
            internationalOrder,
            new InternationalProcessingStrategy(),
            new InternationalShippingCalculator()
        );

        // Processamento em lote com diferentes combinações
        List<Order> orderBatch = Arrays.asList(standardOrder, expressOrder);
        Map<Order, IProcessingStrategy> strategyMap = new HashMap<>();
        
        strategyMap.put(standardOrder, new StandardProcessingStrategy());
        strategyMap.put(expressOrder, new ExpressProcessingStrategy());

        List<ProcessingResult> batchResults = processor.processOrderBatch(
            orderBatch,
            strategyMap,
            new DomesticShippingCalculator()
        );
    }
}
