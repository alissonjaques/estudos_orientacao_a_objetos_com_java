package classes;

import enums.FormaDePagamento; // importação do enum FormaDePagamento

/**
 * A classe Pedido possui campos e métodos que representam um pedido de compra, 
 * realizado por um cliente no supermercado.
 * @author Alisson Jaques
 */
public class Pedido { // declara a classe
    
    /*
        Campos da classe
    */
    private String codigoDoPedido;             // O código identficador do pedido
    private Produto listaDeProdutos[];         // A lista de produtos da compra
    private int quantidadePorProduto[];        // A lista de quantidade de produtos, correspondente à lista de produtos
    private Cliente cliente;                   // O cliente que fez a compra
    private FormaDePagamento formaDePagamento; // A forma de pagamento escolhiada pelo cliente
    
    /**
     * O construtor completo para a classe Pedido, que recebe como argumentos o
     * código do pedido, a lista de produtos, a lista de quantidade, um objeto da
     * classe cliente e um enum referente à forma de pagamento, inicializando os campos
     * encapsulados da classe com os argumentos correspondentes.
     * @param codigoDoPedido o código identificadro do pedido
     * @param listaDeProdutos um vetor de produtos
     * @param quantidadePorProduto um vetor de quantidade de produtos, 
     * cada quantidade desse vetor corresponde a um produto do vetor listaDeProdutos
     * @param cliente o cliente que realizou a campra
     * @param formaDePagamento a forma de pagamento escolhida pelo cliente
     */
    public Pedido(String codigoDoPedido, Produto[] listaDeProdutos, int[] quantidadePorProduto, Cliente cliente, FormaDePagamento formaDePagamento){
        this.codigoDoPedido = codigoDoPedido;
        
        if(listaDeProdutos.length==quantidadePorProduto.length){ // se os vetores quantidadePorProduto e listaDeProdutos, passados por argumento, tiverem tamanhos iguais
            // inicializa os campos encapsulados da classe com os valores passados por argumento
            this.listaDeProdutos = listaDeProdutos;
            this.quantidadePorProduto = quantidadePorProduto;
        }
        else{ // senão, os campos encapsulados da classe apontarão para null
            this.listaDeProdutos = null;
            this.quantidadePorProduto = null;
        } // fim-se
        
        this.cliente = cliente;
      
        this.formaDePagamento = formaDePagamento;
    } // fim do construtor completo
    
    /**
     * O construtor default para a classe Pedido que não recebe nenhum argumento
     * e inicializa os campos da classe com valores default.
     */
    public Pedido(){
        
    } // fim do construtor default

    /**
     * O método getCodigoDoPedido não recebe argumentos e retorna o valor encapsulado
     * no campo codigoDoPedido.
     * @return o codigoDoPedido
     */
    public String getCodigoDoPedido() {
        return codigoDoPedido;
    } // fim do método getCodigoDoPedido

    /**
     * O método setCodigoDoPedido recebe como argumento um texto, referente ao código 
     * do pedido, e atualiza o código do pedido.
     * @param codigoDoPedido uma string que reprenta o novo código do pedido
     */
    public void setCodigoDoPedido(String codigoDoPedido) {
        this.codigoDoPedido = codigoDoPedido;
    } // fim do método setCodigoDoPedido

    /**
     * O método getListaDeProdutos retorna o vetor de produtos encapsulados no objeto da
     * classe.
     * @return a lista de produtos da compra
     */
    public Produto[] getListaDeProdutos() {
        return listaDeProdutos;
    } // fim do método getListaDeProdutos

    /**
     * O método setListaDeProdutos recebe uma lista de produtos e atualiza a lista de produtos,
     * encapsulada no objeto da classe Pedido.
     * @param listaDeProdutos a lista de produtos que servirá para setar o vetor de produtos,
     * encapsulado na classe
     */
    public void setListaDeProdutos(Produto[] listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    } // fim do método setListaDeProdutos

    /**
     * O método getQuantidadePorProduto não possui argumentos e retorna o vetor
     * de quantidade por produto, encapsulado na classe Pedido.
     * @return a lista de quantidade por produto
     */
    public int[] getQuantidadePorProduto() {
        return quantidadePorProduto;
    } // fim do método getQuantidadePorProduto

    /**
     * O método setQuantidadePorProduto recebe uma lista de quantidade por produto e
     * seta a lista correspondente da classe.
     * @param quantidadePorProduto a lista de quantidade por produto
     */
    public void setQuantidadePorProduto(int[] quantidadePorProduto) {
        this.quantidadePorProduto = quantidadePorProduto;
    } // fim do método setQuantidadePorProduto

    /**
     * O método getCliente retorna o conteúdo do objeto cliente,
     * encapsulado na classe.
     * @return o conteúdo de cliente
     */
    public Cliente getCliente() {
        return cliente;
    } // fim do método getCliente

    /**
     * O método setCliente recebe como argumento um objeto cliente e 
     * seta o objeto cliente encapsulado na classe.
     * @param cliente o novo cliente, responsável pela compra
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    } // fim do método setCliente
    
    /**
     * O método valorTotalDaCompra retorna o valor total da compra realizada pelo
     * cliente.
     * @return valorTotalDaCompra o valor que cliente deverá pagar ao finalizar a 
     * compra
     */
    public double valorTotalDaCompra(){        
        double valorTotalDaCompra;
        if(listaDeProdutos == null){ // se a lista de produtos for nula
            valorTotalDaCompra = 0.0; // o valor total da compra será 0
        }
        else{ // senão
            valorTotalDaCompra = 0.0;
            for(int i = 0; i<listaDeProdutos.length; i++){ // enquanto não percorrer todo o vetor de compras
                valorTotalDaCompra = valorTotalDaCompra + (listaDeProdutos[i].getPreco()*quantidadePorProduto[i]);        
            } // fim do for
        }
        return valorTotalDaCompra;
    } // fim do método valorTotalDaCompra

    
    /**
     * O método getFormaDePagamento retorna a forma de pagamento escolhida pelo
     * cliente.
     * @return a forma de pagamento
     */
    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    } // fim do método getFormaDePagamento
    
    /**
     * o método setFormaDePagamento recebe uma forma de pagamento como argumento e 
     * atualiza o campo da classe correspondente com esse dado.
     * @param formaDePagamento a forma de pagamento da compra
     */
    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    } // fim do método setFormaDePagamento
    
    /**
     * O método toString não recebe argumentos e retorna uma string, com os campos
     * da classe formatados.
     * @return uma string com os campos da classe formatados
     */
    public String toString(){
        String extratoDaCompra = "";
        extratoDaCompra += "\nCódigo do Pedido: " + codigoDoPedido + "\n";
        for(int i=0; i<listaDeProdutos.length; i++){// enquanto não percorrer todo o vetor de produtos
            if(quantidadePorProduto[i]==0){ // se a quantidade de um produto for 0
                // o produto não será impresso no extrato                
            }
            else{ // senão
               extratoDaCompra += "\nNome do Produto: " + listaDeProdutos[i].getNome() 
               + "\nValor da unidade: R$" + listaDeProdutos[i].getPreco() + "\nQuantidade solicitada: " + quantidadePorProduto[i]
               + "\nSub valor total: R$" + listaDeProdutos[i].getPreco()*quantidadePorProduto[i] + "\n";
            } // fim-se            
        } // fim do for
        extratoDaCompra += "\nValor total da compra: R$" + valorTotalDaCompra() + "\n";
        extratoDaCompra += "Cliente: " + cliente.getNome() + "\n";
        extratoDaCompra += "Forma de pagamento: " + formaDePagamento + "\n";
        return extratoDaCompra;
    } // fim do método toString
} // fim da classe Pedido
