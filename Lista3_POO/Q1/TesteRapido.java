public class TesteRapido {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO TESTE MANUAL ===");

        // -------------------------------------------------
        // PASSO 1: Testando se a FONTE entrega os dados
        // -------------------------------------------------
        // Criamos a fonte (simulando um arquivo)
        FileDataSource minhaFonte = new FileDataSource("relatorio_vendas.csv");

        // Pedimos os dados
        Object dadosBrutos = minhaFonte.getDados();

        System.out.println("1. A fonte funcionou? Veja os dados: " + dadosBrutos);

        // -------------------------------------------------
        // PASSO 2: Testando se o ANALISADOR processa
        // -------------------------------------------------
        // Criamos o operário (o analisador)
        MLRegressionAnalyzer meuAnalisador = new MLRegressionAnalyzer();

        // Mandamos ele trabalhar com os dados que pegamos acima
        // Lembre-se: O método retorna um ENVELOPE (AnalysisResult)
        AnalysisResult envelope = meuAnalisador.analyze(dadosBrutos);

        // -------------------------------------------------
        // PASSO 3: Testando se o RESULTADO está legível
        // -------------------------------------------------
        // Abrimos o envelope para ler a mensagem
        String mensagemFinal = envelope.getResult();

        System.out.println("2. O analisador funcionou? Veja o resultado: " + mensagemFinal);
    }
}
