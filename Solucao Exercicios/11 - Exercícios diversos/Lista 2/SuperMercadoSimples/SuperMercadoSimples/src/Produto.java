/**
 * A classe Produto possui campos e métodos que representam um produto de supermercado.
 * @author Alisson Jaques
 */
public class Produto { // declara a classe
    
    /*
        Declaração dos campos da classe
    */
    private String nome;               // o nome do produto
    private String codigoDoProduto;    // o código do produto
    private double preco;              // o valor de venda do produto
    private int quantidadeEmEstoque;   // a quantidade do produto no estoque

    /**
     * O construtor completo para a classe Produto, que recebe argumentos (correspondentes ao 
     * nome, código, preço e quantidade do produto no estoque) e inicializa os campos do objeto 
     * encapsulado com os mesmos.
     * @param nome o nome do produto
     * @param codigoDoProduto o código identificador do produto
     * @param preco o valor de venda do produto
     * @param quantidadeEmEstoque a quantidade do produto no estoque
     */
    public Produto(String nome, String codigoDoProduto, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.codigoDoProduto = codigoDoProduto;
        
        if(preco<0){//se o preço for negativo
            this.preco = 0.0; // inicializa o campo com o valor default 0.0
        }
        else{ // senão
            this.preco = preco; // inicializa o campo com o argumento passado
        } // fim-se

        if(quantidadeEmEstoque<0){ // se a quantidade for negativa
            this.quantidadeEmEstoque = 0; // inicializa o campo o com valor default 0
        }
        else{ // senão
            this.quantidadeEmEstoque = quantidadeEmEstoque; // inicializa o campo com o argumento passado
        } // fim-se        
    } // fim do construtor completo

    /**
     * O construtor sobrecarregado da classe Produto, que recebe três argumentos (referentes
     * ao nome, código e preço) e inicializa os campos da classe com os mesmos. Ele atríbui o valor
     * default 0 ao atributo quantidadeEmEstoque e utiliza o construtor completo, para realizar suas
     * instruções.
     * @param nome o nome do produto
     * @param codigoDoProduto o código identificador do produto
     * @param preco a quantidade do produto no estoque
     */
    public Produto(String nome, String codigoDoProduto, double preco){
        this(nome,codigoDoProduto,preco,0);
    } // fim do construtor sobrecarregado com três argumentos

    /**
     * O construtor sobrecarregado da classe Produto, que recebe dois argumentos (referentes ao nome e o 
     * código do produto) e inicializa os campos correspondentes com esses dados, os campos preco e 
     * quantidadeEmEstoque são inicializados com o valor default 0. Este método utiliza o conceito de cascata
     * para realizar sua tarefa, chamando o cónstrutor sobrecarregado Produto(string,string,double).
     * @param nome o nome do produto
     * @param codigoDoProduto o código identificador do produto
     */
    public Produto(String nome, String codigoDoProduto){
        this(nome,codigoDoProduto,0.0);
    } // fim do construtor sobrecarregado com dois argumentos

    /**
     * O construtor sobrecarregado da classe Produto recebe apenas um argumento, referente ao 
     * nome do produto, inicializa o campo correspondente com esse argumento e os outros com valores
     * default. Este construtor chama o construtor Produto(string,string), que por sua vez chamará
     * outro construtor da mesma classe (com mais argumentos) até chegar no construtor completo (que realizará
     * todas as instruções necessárias).
     * @param nome o nome do produto
     */
    public Produto(String nome){
        this(nome,"");
    } // fim do construtor sobrecarregado com apenas um argumento

    /**
     * O construtor default para a classe Produto, que não recebe nenhum argumento e inicializa os 
     * campos da classe com valores default.
     */
    public Produto(){
        this("");
    } // fim do construtor default

    /**
     * O método getNome não possui argumentos e retorna o nome do produto,
     * encapsulado no objeto.
     * @return o nome do produto
     */
    public String getNome(){
        return nome;
    } // fim do método getNome

    /**
     * O método getCodigoDoProduto não possui argurmentos e retorna o código do produto,
     * encapsulado no objeto.
     * @return o código do produto
     */
    public String getCodigoDoProduto(){
        return codigoDoProduto;
    } // fim do método getCodigoDoProtudo

    /**
     * O método getPreco não possui argumentos e retorna o preço do produto,
     * encapsulado no objeto.
     * @return o preço do produto
     */
    public double getPreco(){
        return preco;
    } // fim do método getPreco

    /**
     * O método getQuantidadeEmEstoque não possui argumentos e retorna a quantidade
     * do produto no estoque do supermercado.
     * @return a quantidade do produto no estoque
     */
    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    } // fim do método getQuantidadeEmEstoque

    /**
     * O método setNome recebe como argumento um nome e altera o nome do produto,
     * encapsulado no objeto.
     * @param nome o nome do produto
     */
    public void setNome(String nome){
        this.nome = nome;
    } // fim do método setNome

    /**
     * O método codigoDoProduto recebe como argumento um código e atualiza o código
     * encapsulado no objeto.
     * @param codigoDoProduto o código identificador do produto
     */
    public void setCodigoDoProduto(String codigoDoProduto){
        this.codigoDoProduto = codigoDoProduto;
    } // fim do método setCodigoDoProduto

    /**
     * O método setPreco seta o preço do produto, encapsulado no objeto, para o valor
     * passado como argumento.
     * @param preco o preço de venda do produto
     */
    public void setPreco(double preco){
        this.preco = (preco>=0) ? preco : 0.0;
    } // fim do método setPreco

    /**
     * O método setQuantidadeEmEstoque seta a quantidade do produto no estoque para
     * o valor passado como argumento.
     * @param quantidadeEmEstoque a quantidade do produto no estoque
     */
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque = (quantidadeEmEstoque>=0) ? quantidadeEmEstoque : 0;
    } // fim do método setQuantidadeEmEstoque

    /**
     * O método toString não possui argumentos e retorna uma string com os campos 
     * encapsuladados do objeto formatados.
     * @return uma string com os campos do objeto formatados
     */
    public String toString(){
        String impressaoObjeto = "";
        impressaoObjeto += "Nome do Produto: " + nome + "\n";
        impressaoObjeto += "Código: " + codigoDoProduto + "\n";
        impressaoObjeto += "Preço: " + preco + "\n";
        impressaoObjeto += "Quantidade em Estoque: " + quantidadeEmEstoque + "\n";

        return impressaoObjeto;
    } // fim do método toString
} // fim da classe Produto
