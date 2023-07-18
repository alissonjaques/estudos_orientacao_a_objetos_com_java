package interfaces;

/**
 * A interface ContaBancaria descreve as principais funcionalidades de uma
 * conta bancária simples.
 * @author Alisson Jaques
 */
public interface ContaBancaria { // declara a interface
    /**
     * O método depositar recebe como argumento um valor flutuante, e o deposita
     * na conta bancária encapsulada.
     * @param valorDeposito o valor para depósito
     */
    public void depositar(double valorDeposito);
    /**
     * O método sacar recebe como argumento um valor flutuante, referenta ao saque,
     * e saque essa quantidade da conta bancária encapsulada.
     * @param valorParaSaque o valor para saque
     */
    public void sacar(double valorParaSaque);
    /**
     * O método consultaSaldo não recebe argumento e retorna o valor do saldo, da
     * conta bancária encapsulada.
     * @return o saldo da conta bancária
     */
    public double consultaSaldo();    
} // fim da interface ContaBancaria
