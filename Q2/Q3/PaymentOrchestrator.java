import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class PaymentOrchestrator {

    List<IProcessor> processors = new ArrayList<>();
    Map<String,IRiskAnalyzer> riskAnalyzers = new HashMap<>();

    public void registerPaymentProcessor(IProcessor processor){

        processors.add(processor);

    }

    public void registerRiskAnalyzer(String key, IRiskAnalyzer riskAnalyzer){

        riskAnalyzers.put(key,riskAnalyzer);

    }

    public PaymentResult processPayment(Payment payment, String key){


        IRiskAnalyzer analyzer = riskAnalyzers.get(key);
        

        for(IProcessor p : processors){
            boolean index;
            index = p.supports(payment);

            if(index){

                analyzer.riskAnalyze(payment);
                return p.process(payment);
            }
            
        }

        return new PaymentResult("Erro: Pagamento não suportado.");
    }

    public List<PaymentResult> processBatch(List<Payment> payments, String key) {
        List<PaymentResult> results = new ArrayList<>();
        IRiskAnalyzer analyzer1 = riskAnalyzers.get(key);

        for(Payment p : payments){
            for(IProcessor pr : processors){
                boolean index;
                index = pr.supports(p);
    
                if(index){
                    analyzer1.riskAnalyze(p);
                    results.add(pr.process(p));
                    break;
                }
                
            }
            
        }
        return results;
       
    }
        
        
    
}
