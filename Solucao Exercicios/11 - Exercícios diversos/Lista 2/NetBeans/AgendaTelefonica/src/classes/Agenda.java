package classes;
/**
 * A classe Agenda possui campos e métodos que representam uma agenda telefônica.
 * @author Alisson Jaques
 */
public class Agenda { // declara a classe
    /*
        Campos da classe
    */
    private String nome;       // o nome da agenda
    private Contato contatos[];// a lista de contatos da agenda
    
    /**
     * O construtor completo para a classe Agenda, que recebe como argumento
     * o nome e a lista de contatos e inicializa os campos da classes com os
     * mesmos.
     * @param nome o nome da agenda
     * @param contatos o vetor de contatos
     */
    public Agenda(String nome, Contato[] contatos){
        this.nome = nome;
        this.contatos = contatos;
    } // fim do construtor completo
    
    /**
     * O construtor default para a Classe Agenda, não recebe nenhum argumento
     * e inicializa os campos da classe com valores default.
     */
    public Agenda(){

    } // fim do construtor default
    
    /**
     * O método setNome recebe como argumento um nome de agenda e seta o nome
     * da agenda, encapsulada na classe.
     * @param nome o nome da agenda, para o set
     */
    public void setNome(String nome){
        this.nome = nome;
    } // fim do método setNome
    
    /**
     *  O método getNome não possui argumentos e retorna o conteúdo enpasulado
     *  do campo nome, da classe Agenda.
     *  @return o nome encapsulado no objeto
     */
    public String getNome(){
        return nome;
    } // fim do método getNome
    
    /**
     * O método setContatos recebe como argumento uma lista de contatos e atualiza
     * a lista de contatos, encapsulada, do objeto.
     * @param contatos a lista de contatos para a alteração
     */
    public void setContatos(Contato[] contatos){
        this.contatos  = contatos;
    } // fim do método setContatos
    
    /**
     * O método getContatos retorna a lista de contatos encapsulada no objeto.
     * @return a lista de contatos encapsulada no objeto de Agenda
     */
    public Contato[] getContatos(){
        return contatos;
    } // fim do método getContatos
    
    /**
     * O método toString não possui argumentos e retorna uma string, com os campos
     * da classe formatados.
     * @return uma string com os campos da classe formatados
     */
    public String toString(){
        String descricao = "";
        descricao += "************************ "+ nome +" ****************************\n\n";
        for(Contato contato: contatos){ // enquanto não percorrer todo o vetor de contatos, faça:
            descricao += contato.toString();
        }
        return descricao;
    } // fim do método toString
} // fim da classe Agenda