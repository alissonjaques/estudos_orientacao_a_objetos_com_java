package classes;

import enums.FormaDePagamento; // importação do enum FormaDePagamento
import java.util.Scanner;      // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Cliente possui campos e métodos que representam um cliente de supermercado.
 * @author Alisson Jaques
 */
public class Cliente { // declara a classe
    
    /*
        Campos da classe
    */
    private String nome;     // o nome do cliente
    private String cpf;      // o cpf do cliente
    private String endereco; // o endereço do cliente
    
    /**
     * O construtor completo da classe Cliente que recebe como argumentos o nome,
     * o cpf e o endereço do cliente e inicializa os campos da classe com esses dados.
     * @param nome o nome do cliente
     * @param cpf o cpf do cliente
     * @param endereco o endereço do cliente
     */
    public Cliente(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;    
    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado classe Cliente que recebe apenas dois argumentos,
     * um referente ao nome e o outro referente ao cpf, e inicialia os campos da classe
     * com os dados passados. O endereço é iniciliazado com a string vazia. Esse método
     * usa o construtor completo para realizar suas instruções.
     * @param nome o nome do cliente
     * @param cpf o cpf do cliente
     */
    public Cliente(String nome, String cpf){
        this(nome,cpf,"");
    } // fim do construtor sobrecarregado com dois argumentos
    
    /**
     * O construtor sobrecarregado da classe Cliente que recebe apenas um argumento,
     * referente ao nome do cliente, inicializa o campo da classe correspondente com
     * o mesmo e os demais com a string vazia. Esse construtor chama em cascata outros
     * construtores, ao chamar o construtor Cliente(string,string), para realizar suas
     * instruções.
     * @param nome o nome do cliente
     */
    public Cliente(String nome){
        this(nome,"");
    } // fim construtor sobrecarregado com apenas um argumento
    
    /**
     * O construtor default para classe Cliente que não recebe nenhum argumento e
     * inicializa os campos da classe com valores default. Este método usa o construtor
     * Cliente(string), que chamará outros construtores em cascata, para realizar suas 
     * instruções.
     */
    public Cliente(){
        this("");
    } // fim do construtor default

    /**
     * O método getNome retorna o nome do cliente, encapsulado no objeto.
     * @return o nome do cliente
     */
    public String getNome() {
        return nome;
    } // fim do método getNome

    /**
     * O método setNome recebe como argumento um nome e seta o nome encapsulado
     * no objeto com esse valor;
     * @param nome o nome a ser atualizado
     */
    public void setNome(String nome) {
        this.nome = nome;
    } // fim do método setNome

    /**
     * O método getCpf retorna o cpf encapsulado no objeto.
     * @return o cpf do cliente
     */
    public String getCpf() {
        return cpf;
    } // fim do método getCpf

    /**
     * O método setCpf recebe como argumento um novo CPF e atualiza
     * o CPF encapsulado no objeto.
     * @param cpf o novo CPF
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    } // fim do método setCpf

    /**
     * O método getEndereco retorna o endereço do cliente, encapsulado no
     * objeto.
     * @return o endereço do cliente
     */
    public String getEndereco() {
        return endereco;
    } // fim do método getEndereco

    /**
     * O método setEndereco recebe como argumento um novo endereço e atualiza o
     * endereço encapsulado no objeto.
     * @param endereco o novo endereço do cliente
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } // fim do método setEndereco
    
    /**
     * O método fazerCompra não recebe argumentos, ele representa o cliente fazendo
     * uma compra. Este método utiliza as classes Pedido e Produto, para realizar suas
     * instruções.
     */
    public void fazerCompra(){
        /*
            Declaração de variáveis auxiliares
        */
        Pedido compra = new Pedido();
        Produto listaProdutos[];
        int quantidadePorProduto[];
        int quantidadeDiferentes;
        int escolha;
        boolean controlador = false;
        String codigo;
        Scanner scan = new Scanner(System.in,"ISO-8859-1");     
        
        // solicita que o usuário entre com o identificador do pedido e inicializa o campo correspondente com esse dado
        System.out.println("\n====================== Informações Básicas do Pedido ====================");
        System.out.print("\nInforme o código do pedido: ");
        codigo = scan.nextLine();
        compra.setCodigoDoPedido(codigo); // seta o campo código do objeto compra
        
        // solicita a quantidade de produtos diferentes e declara os vetores listaProdutos e quantidadePorProduto com essa informação
        System.out.print("Entre com a quantidade de produtos diferentes: ");
        quantidadeDiferentes = scan.nextInt();
        listaProdutos = new Produto[quantidadeDiferentes];
        quantidadePorProduto = new int[quantidadeDiferentes];
        
        System.out.println("\n===================== Informações Básicas do Pedido =====================\n");
                    
        for(int i=0; i<listaProdutos.length; i++){ // enquanto não percorrer toda a lista de produtos, faça:
            int quantidade;                              // a quantidade do mesmo produto
            Produto produto = new Produto();             // um produto
            scan = new Scanner(System.in, "ISO-8859-1"); // scan é um objeto da classe Scanner
            
            /* 
               Solicita os dados do produto ao usuário, esses dados são utilizados para setar
               os campos correspondentes do produto.
            */
            System.out.print("Informe o nome produto: ");
            produto.setNome(scan.nextLine());
            System.out.print("Informe o código do produto: ");
            produto.setCodigoDoProduto(scan.nextLine());
            scan.reset();
            System.out.print("Informe o valor do produto: ");
            produto.setPreco(scan.nextDouble());
            System.out.print("Informe quantas unidades do produto serão compradas: ");
            quantidade = scan.nextInt();
            System.out.println(); // quebra de linha para organização dos dados no terminal
            if(quantidade>produto.getQuantidadeEmEstoque() || quantidade<0){ // se a quantidade solicita do produto for maior que o valor contido no estoque ou a quantidade for um valor absurdo, faça:
                System.out.println("Não é possível comprar essa quantidade do produto! Esse produto saíra da compra.\n");
                quantidadePorProduto[i] = 0; // a quantidade do produto será 0
                controlador = true;
            }
            else{ // senão, faça:
                produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade); // atualiza o estoque
                quantidadePorProduto[i] = quantidade; // a quantidade por produto será a informada pelo usuário
                controlador = false;
            } // fim-se
            listaProdutos[i] = produto; // armazena o produto no vetor de produtos
        }// fim do for
        
        compra.setListaDeProdutos(listaProdutos); // atualizamos a lista de produtos do objeto compra
        compra.setQuantidadePorProduto(quantidadePorProduto); // atualizamos a lista de quantidade do mesmo produto do objeto compra
        compra.setCliente(this); // passamos o objeto cliente atual, da própria classe Cliente, ao método setCliente, assim setamos o campo cliente do objeto compra
        
        if(controlador==false){ // se o controlador estiver com valor falso
            // solicita ao usuário que escolha a forma de pagamento e armazena a escolha em uma variável auxiliar
            System.out.println("Escolha uma das seguintes formas de pagamento:");
            System.out.println("1 - Cheque\n2 - Dinheiro\n3 - Cartão");
            System.out.print("Digite sua escolha: ");
            escolha = scan.nextInt();

            while(escolha!=1 && escolha!=2 && escolha!=3){ // enquanto a opção escolhida for inválida, faça:
                System.out.print("Opção inválida! Por favor, forneça uma opção válida: ");
                escolha = scan.nextInt();
            } // fim while

            switch(escolha){ // caso escolha seja:
                case 1: // 1, faça:
                    compra.setFormaDePagamento(FormaDePagamento.CHEQUE);
                    break;
                case 2: // 2, faça:
                    compra.setFormaDePagamento(FormaDePagamento.DINHEIRO);
                    break;
                case 3: // 3, faça:
                    compra.setFormaDePagamento(FormaDePagamento.CARTAO);
                    break;                  
            } // fim do switch

            System.out.println("Compra finalizada com sucesso!\n");
        } // fim-se
       
        System.out.println("========================== Extrato da Compra ============================");
        System.out.println(compra); // imprimi a string retornada pelo método toString, do objeto compra
    } // fim do método fazerCompra
    
    /**
     * O método toString não recebe argumentos e retorna os campos do
     * objeto, formatados.
     * @return uma string com os campos do objeto formatados
     */
    public String toString(){
        String descricao = "";
        descricao += "Nome: " + nome + "\n";
        descricao += "CPF: " + cpf + "\n";
        descricao += "Endereço: " + endereco + "\n";
        return descricao;
    }
} // fim da classe Cliente
