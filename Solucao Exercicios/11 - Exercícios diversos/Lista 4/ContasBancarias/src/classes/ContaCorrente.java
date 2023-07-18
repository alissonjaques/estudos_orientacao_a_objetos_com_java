package classes;

import interfaces.ContaBancaria; // importação da interface ContaBancaria

/**
 * A classe ContaCorrente possui campos e métodos que representam uma conta corrente.
 * Esta classe implementa os métodos da interface ContaBancaria.
 * @author Alisson Jaques
 */
public class ContaCorrente implements ContaBancaria{ // declara a classe
    
    /**
     * Declaração dos campos da classe
     */
    private String nome;        // o nome do correntista
    private String cpf;         // o CPF do correntista
    private int numeroDaConta;  // o número da conta corrente
    private double saldo;       // o saldo da conta corrente
    
    /**
     * O construtor da classe ContaCorrente recebe argumentos e inicializa os campos da
     * classe com os mesmos.
     * @param nome o nome do correntista
     * @param cpf o CPF do correntista
     * @param numeroDaConta o número da conta do correntista
     * @param saldo o saldo disponível na conta corrente encapsulada
     */
    public ContaCorrente(String nome, String cpf, int numeroDaConta, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        if(numeroDaConta<=0){ // se o número da conta for negativo
            this.numeroDaConta = 0; // o número da conta será, por default, 0
        }
        else{ // senão
            this.numeroDaConta = numeroDaConta;
        }
        this.saldo = saldo;    
    } // fim do construtor
    
    /**
     * O construtor default para a classe ContaCorrente, que não recebe argumentos e
     * inicializa os campos da classe com valores default.
     */
    public ContaCorrente(){
        this("","",(int)0,0.0); // chama em cascata o construtor com argumentos
    } // fim do construtor default
    
    /**
     * O método depositar recebe como argumento uma quantia e deposita na conta corrente
     * encapsulada.
     * @param valorDeposito o valor para depósito
     */
    @Override
    public void depositar(double valorDeposito) {
        if(valorDeposito<=0){ // se o valor for absurdo, faça:
            System.out.println("O valor informado não pode ser depósitado, pois trata-se de um valor inválido.");
        }
        else{ // senão, faça:
            setSaldo(saldo + valorDeposito); // deposita o valor na conta corrente encapsulada
            System.out.println("Depósito realizado com sucesso!"); // informa que o depósito foi realizado com sucesso
        }        
    } // fim do método depositar
    
    /**
     * O método sacar recebe como argumento um valor para saque (flutuante) e saca esse valor da conta corrente encapsulada.
     * Cada saque possui uma taxa de operação de 0,5% do valor sacado, cobrada na hora, no momento do saque.
     * @param valorParaSaque a quantia a ser sacada da conta corrente
     */
    @Override
    public void sacar(double valorParaSaque) {
        if(valorParaSaque>saldo){ // se o saldo for insuficiente, faça:
            System.out.println("O valor não pode ser sacado, saldo insuficiente.");
        }
        else if(valorParaSaque<=0){ // senão, se o saque for um valor absurdo, faça:
            System.out.println("Não foi possível efetivar o saque, pois o valor não é válido.");
        }
        else{ // senão, faça:
            setSaldo(saldo - valorParaSaque - (0.005*valorParaSaque)); // saca o valor da conta corrente e cobra a tarifa de operação
            System.out.println("Saque realizado com sucesso!"); // informa que o saque foi efetivado com sucesso
        }
    } // fim do método saca
    
    /**
     * O método consultaSaldo retorna o saldo disponível na conta corrente.
     * @return saldo o valor correspondente ao saldo da conta corrente
     */
    @Override
    public double consultaSaldo() {
       return saldo;
    } // fim do método consultaSaldo
    
    /**
     * O método setSaldo recebe um valor e seta o saldo encapsulado na classe com
     * esse valor.
     * @param saldo o saldo para o set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } // fim do método setSaldo
    
    /**
     * O método getNome retorna o nome do correntista encapsulado na classe.
     * @return o nome do correntista
     */
    public String getNome() {
        return nome;
    }

    /**
     * O método setNome recebe uma string, que representa um nome, e seta o campo
     * nome, encapsulado na classe, com esse valor.
     * @param nome o nome para o set
     */
    public void setNome(String nome) {
        this.nome = nome;
    } // fim do método setNome

    /**
     * O método getCpf retorna o cpf da conta corrente encapsulada na classe.
     * @return o CPF encapsulado na classe
     */
    public String getCpf() {
        return cpf;
    } // fim do método getCpf

    /**
     * O método setCpf recebe uma string, que representa um CPF, e seta o CPF,
     * encapsulado na classe, com esse valor.
     * @param cpf o CPF para o set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    } // fim do método setCpf

    /**
     * O método getNumeroDaConta retorna o número da conta do correntista.
     * @return o número da conta encapsulado na classe
     */
    public int getNumeroDaConta() {
        return numeroDaConta;
    } // fim do método getNumeroDaConta

    /**
     * O método setNumeroDaConta recebe um novo número de conta e atualiza a conta
     * corrente, do correntista encapsulado.
     * @param numeroDaConta o número de conta para o set
     */
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    } // fim do método setNumeroDaConta
    
    /**
     * O método toString não recebe argumentos e retorna uma string com os campos
     * da classe formatados.
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString(){
        String resultado = "";
        resultado += "Nome : " + getNome() + "\n";
        resultado += "CPF: " + getCpf() + "\n";
        resultado += "Conta: " + getNumeroDaConta() + "\n";
        resultado += "Saldo: R$" + saldo + "\n";        
        return resultado;    
    } // fim do método toString
} // fim da classe ContaCorrente
