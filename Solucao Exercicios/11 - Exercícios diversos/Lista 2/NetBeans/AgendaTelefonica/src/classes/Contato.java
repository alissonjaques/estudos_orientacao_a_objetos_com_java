package classes;

/**
 * A classe Contato possui campos e métodos que representam um contato, de uma
 * agenda telefônica.
 * @author Alisson Jaques
 */
public class Contato { // declara a classe
    
    /*
        Campos da classe
    */
    private String nome;        // o nome do contato
    private String telefone;    // o número de telefone do contato
    private String endereco;    // o endereço do contato
    private String email;       // o e-mail do contato
    
    /**
     * O construtor completo para classe Contato que recebe como argumentos o nome,
     * telefone, endereço e e-mail, inicializando os campos da classe com os mesmos.
     * @param nome o nome do contato
     * @param telefone o telefone do contato
     * @param endereco o endereço do contato
     * @param email o e-mail do contato
     */
    public Contato(String nome, String telefone, String endereco, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    } // fim do construtor completo
    
    /**
     * O construtor default para a classe Contato, que não recebe nenhum argumento
     * e inicializa os campos da classe com valores default.
     */
    public Contato(){

    } // fim do construtor default
    
    /**
     * O método setNome recebe como argumento um nome de contato e atualiza o
     * nome encapsulado na classe.
     * @param nome o nome para o set
     */
    public void setNome(String nome){
        this.nome = nome;
    } // fim do método setNome
    
    /**
     * O método getNome não possui argumentos e retorna o nome encapsulado na
     * classe.
     * @return nome o nome do contato encapsulado no objeto
     */
    public String getNome(){
        return nome;
    } // fim do método getNome
    
    /**
     * O método setTelefone recebe como argumento um número de telefone (string)
     * e seta o número de telefone, encapsulado na classe, com o mesmo.
     * @param telefone o novo número de telefone
     */
    public void setTelefone(String telefone){
        this.telefone = telefone;
    } // fim do método setTelefone
    
    /**
     * O método getTelefone não possui argumentos e retorna o número de telefone
     * encapsulado.
     * @return o número de telefone encapsulado no objeto
     */
    public String getTelefone(){
        return telefone;
    } // fim do método getTelefone
    
    /**
     * O método setEndereco recebe como argumento um endereço e seta o campo endereço
     * da classe com o mesmo.
     * @param endereco o endereço para o set
     */
    public void setEndereco(String endereco){
        this.endereco = endereco;
    } // fim do método setEndereco
    
    /**
     * O método getEndereco retorna o endereço encapsulado no objeto da classe
     * Contato.
     * @return o endereço encapsulado no objeto
     */
    public String getEndereco(){
        return endereco;
    } // fim do método getEndereco
    
    /**
     * O método setEmail recebe como argumento uma string, que representa um email,
     * e seta o campo correspondente da classe com esse dado.
     * @param email o e-mail para o set
     */
    public void setEmail(String email){
        this.email = email;
    } // fim do método setEmail
    
    /**
     * O método getEmail retorna o e-mail encapsulado no objeto da classe.
     * @return o e-mail do contato
     */
    public String getEmail(){
        return email;
    } // fim do método getEmail
    
    /**
     * O método toString não possui argumentos e retorna uma string, contendo
     * os campos do objeto formatados.
     * @return uma string com os campos do objeto formatados
     */
    public String toString(){
        String descricao = "";
        descricao += "Nome: " + nome + "\n";
        descricao += "Telefone: " + telefone + "\n";
        descricao += "Endereço: " + endereco + "\n";
        descricao += "E-mail: " + email + "\n\n";
        return descricao;
    } // fim do método toString
} // fim da classe Contato