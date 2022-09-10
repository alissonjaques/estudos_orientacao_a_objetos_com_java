package classes;

/**
 * A classe Funcionario0, que encapsula os dados básicos de um funcionário de
 * uma empresa. Esta classe em especial mostra o que acontece quando uma
 * instância de outra classe (no caso, da classe Data), que tem modificadores de
 * acesso, é usada com outros modificadores de acesso. O nome da classe tem um
 * zero pois esta classe ainda será modificada.
 */
public class Funcionario0{ // declaração da classe

    /**
     * Declaração dos campos da classe
     */
    private Pessoa0 funcionário; // identificação do funcionário, dada por uma instância
    // da classe Pessoa0
    private Data admissão; // data de admissão, declarada propositalmente como pública
    private float salário; // salário do funcionário

    /**
     * O construtor para a classe Funcionario0, que recebe argumentos para
     * inicializar todos os campos da classe.
     *
     * @param f uma instância da classe Pessoa0 com a identificação do
     * funcionário
     * @param a uma instância da classe Data com a data de admissão
     * @param s um valor de ponto flutuante com o salário do funcionário
     */
    public Funcionario0(Pessoa0 f, Data a, float s) {
        funcionário = f;
        admissão = a;
        salário = s;
    }
    
    /**
     * O método modificaNome recebe como argumento uma string, representando o nome do funcionário, 
     * e atualiza o nome encapsulado na classe Funcionario.
     * 
     * @param nome o nome do funcionário
     */
    public void modificaNome(String nome){
        getFuncionário().nome = nome; // atualiza o nome com o arqumento passado
    } // fim do métoodo modificaNome
    
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado;
        resultado = getFuncionário() + "\n"; // chamada implícita ao método toString
        // da classe Pessoa
        resultado = resultado + "Data de admissão:" + getAdmissão() + "\n";
        resultado = resultado + "Salário:" + getSalário() + "\n";
        return resultado;
    }

    /**
     * @return the funcionário
     */
    public Pessoa0 getFuncionário() {
        return funcionário;
    }

    /**
     * @param funcionário the funcionário to set
     */
    public void setFuncionário(Pessoa0 funcionário) {
        this.funcionário = funcionário;
    }

    /**
     * @return the admissão
     */
    public Data getAdmissão() {
        return admissão;
    }

    /**
     * @param admissão the admissão to set
     */
    public void setAdmissão(Data admissão) {
        this.admissão = admissão;
    }

    /**
     * @return the salário
     */
    public float getSalário() {
        return salário;
    }

    /**
     * @param salário the salário to set
     */
    public void setSalário(float salário) {
        this.salário = salário;
    }
} // fim da classe Funcionario0