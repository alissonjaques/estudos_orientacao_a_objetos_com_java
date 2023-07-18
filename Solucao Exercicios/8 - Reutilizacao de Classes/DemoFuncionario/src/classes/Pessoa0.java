package classes;

/**
 * A classe Pessoa0, que encapsula os dados de identificação de uma pessoa. O
 * nome da classe tem um zero pois esta classe ainda deverá ser modificada - no
 * caso, alguns dos campos da classe são públicos, para demonstração do que
 * acontece com os modificadores de acesso quando a classe é reutilizada em
 * outra.
 */
public class Pessoa0{ // declaração da classe
    /**
     * Declaração dos campos da classe
     */
    public String nome; // o nome da pessoa - declarado público propositadamente
    private int identidade; // o número da identidade da pessoa
    private Data nascimento; // a data de nascimento da pessoa

    /**
     * O construtor da classe Pessoa0, que recebe argumentos para inicializar
     * seus campos.
     *
     * @param n o nome da pessoa
     * @param i o número da identidade da pessoa
     * @param d a data de nascimento da pessoa
     */
    public Pessoa0(String n, int i, Data d) {
        nome = n;
        identidade = i;
        nascimento = d;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdentidade:" + getIdentidade()
                + "Data de Nascimento:" + getNascimento();
    }
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the identidade
     */
    public int getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the nascimento
     */
    public Data getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
} // fim da classe Pessoa0
