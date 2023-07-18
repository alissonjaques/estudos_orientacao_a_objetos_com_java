package classes;

/**
 * A classe ContaCorrenteEspecial representa uma conta corrente especial. Esta
 * classe herda todos os campos e métodos da classe Conta Corrente, sendo uma 
 * especialização desta.
 * @author Alisson Jaques
 */
public class ContaCorrenteEspecial extends ContaCorrente{ // declara a classe
    
    /**
     * O construtor para a classe ContaCorrenteEspecial, que recebe argumentos
     * para inicializar os campos herdados da classe ContaCorrente.
     * @param nome o nome do correntista especial
     * @param cpf o CPF do correntista especial
     * @param numeroDaConta o número da conta
     * @param saldo o saldo da conta
     */
    public ContaCorrenteEspecial(String nome, String cpf, int numeroDaConta, double saldo){
        super(nome,cpf,numeroDaConta,saldo); // inicializa os campos herdados da super classe
    } // fim do construtor
    
    /**
     * O construtor default para a classe ContaCorrenteEspecial, que não recebe argumentos
     * e inicializa os campos herdados da classe ContaCorrente com valores default.
     */
    public ContaCorrenteEspecial(){
        this("","",(int)0,0.0);    
    } // fim do construtor default
    
    /**
     * O método sacar sobreescreve o método herdado sacar, da super classe. 
     * O método sacar recebe como argumento um valor para saque (flutuante) e saca 
     * esse valor da conta corrente encapsulada. Cada saque possui uma taxa de operação 
     * de 0,1% do valor sacado, cobrada na hora, no momento do saque.
     * @param valorParaSaque a quantia a ser sacada da conta corrente especial
     */
    @Override
    public void sacar(double valorParaSaque){
        if(valorParaSaque>consultaSaldo()){ // se o saldo for insuficiente, faça:
            System.out.println("O valor não pode ser sacado, saldo insuficiente."); // informa que o saldo é insuficiente para a operação
        }
        else if(valorParaSaque<=0){ // senão, se o saldo for absurdo, faça:
            System.out.println("Não foi possível efetivar o saque, pois o valor não é válido."); // informa que o valor solicitado para saque é inválido
        }
        else{ // senão, faça:
            double valor = consultaSaldo(); // declara uma variável auxiliar
            valor = valor - valorParaSaque - (0.001*valorParaSaque); // calcula o débito total (saque + taxa de operação)
            setSaldo(valor); // saca e cobra a taxa de operação
            System.out.println("Saque realizado com sucesso!"); // informa que o saque foi realizado com sucesso
        }    
    } // fim do método sacar 
} // fim da classe ContaCorrenteEspecial
