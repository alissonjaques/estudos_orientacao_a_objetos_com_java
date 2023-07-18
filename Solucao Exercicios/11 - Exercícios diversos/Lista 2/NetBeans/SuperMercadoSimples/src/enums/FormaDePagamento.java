package enums;

/**
 * O enum FormaDePagamento possibilida que a forma de pagamento sejam apenas três opções. São elas:
 * pagamento com cartão, pagamento com cheque e pagamento com dinheiro.
 * @author Alisson Jaques
 */
public enum FormaDePagamento { // declara o enum
    CARTAO("Pagamento com Cartão"), CHEQUE("Pagamento com Cheque"), DINHEIRO("Pagamento com Dinheiro");

    private final String descricao; // campo constante do enum FormaDePagamento
    
    /**
     * O construtor do enum FormaDePagamento que recebe uma das descrições possíveis e
     * inicializa o campo do enum com a mesma.
     * @param descricao um dos valores possíveis do enum FormaDePagamento (CARTAO,CHEQUE e DINHEIRO)
     */
    private FormaDePagamento(String descricao) {
        this.descricao = descricao;
    } // fim do construtor
    
    /**
     * O método getDescricao retorna o conteúdo do campo descrição, encapsulado no
     * enum.
     * @return a descricao do pagamento
     */
    public String getDescricao() {
        return descricao;
    } // fim do método getDeescricao    
} // fim do enum FormaDePagamento
