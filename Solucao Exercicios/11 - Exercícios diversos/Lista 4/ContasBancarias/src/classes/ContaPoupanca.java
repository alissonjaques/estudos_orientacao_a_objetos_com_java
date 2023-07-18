package classes;

/**
 * A classe ContaPoupanca representa uma conta poupança. Esta classe herda todos
 * os campos e métodos da classe ContaCorrente, sendo uma especialização desta.
 * @author Alisson Jaques
 */
public class ContaPoupanca extends ContaCorrente{
    
    /**
     * Declaração dos campos da classe.
     */
    private double valorTotalDeposito; // o valor total do depósito em um mês
    
    /**
     * O construtor para a classe ContaPoupanca que recebe argumentos para iniciliazar
     * todos os seus campos, incluindo os campos herdados da classe ContaCorrente.
     * @param nome o nome do correntista
     * @param cpf o CPF do correntista
     * @param numeroDaConta o número da conta poupança
     * @param saldo o saldo da conta poupança
     */
    public ContaPoupanca(String nome, String cpf, int numeroDaConta, double saldo){
        super(nome,cpf,numeroDaConta,saldo); // inicializa os campos herdados da super classe
        valorTotalDeposito = 0;
    } // fim do construtor
    
    /**
     * O construtor default para a classe ContaPoupanca não possui argumentos e inicializa os 
     * campos da classe com valores default.
     */
    public ContaPoupanca(){
        this("","",(int)0,0.0);    
    } // fim do construtor default
    
    /**
     * O método depositar sobreescreve o método depositar da classe mãe. Este método recebe 
     * uma quantia e a deposita na conta poupança encapsulada.
     * @param valorDeposito a quantia para depósito
     */
    @Override
    public void depositar(double valorDeposito) {
        if(valorDeposito<=0){ // se o valor para depósito for absurdor, faça:
            System.out.println("O valor informado não pode ser depositado, pois trata-se de um valor inválido."); // informa que o valor para depósito é inválido
        }
        else{ // senão, faça:
            setSaldo(consultaSaldo() + valorDeposito); // deposita o valor na conta poupança
            valorTotalDeposito += valorDeposito; // atualiza o valor total de depósito
            System.out.println("Depósito realizado com sucesso!"); // informa que o depósito foi realizado com sucesso
        }        
    } // fim do método depositar
    
    /**
     * O método fazAniversario recebe como argumento um valor booleano, se esse valor booleano
     * for verdadeiro este método adiciona uma bonificação ao saldo da conta poupança, essa bonificação
     * corresponde a 0,05% do valor total depositado (não considera o depósito para abertura da conta),
     * em um mês.
     * @param mes o valor booleano que informa que se passou um mês
     */
    public void fazAniversario(boolean mes){
        if(mes){ // se tiver passado um mês, faça:
            double bonificacao = 0.0005*valorTotalDeposito; // calcula a bonificação
            setSaldo(consultaSaldo() + bonificacao); // deposita a bonificação na conta poupança
            valorTotalDeposito = 0.0; // zera o valor total de depósito, para um novo ciclo
        }    
    } // fim do método fazAniversario
} // fim da classe ContaPoupanca
