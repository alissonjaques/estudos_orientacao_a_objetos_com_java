package classes;
/**
 *
 * @author Alisson Jaques
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private Emprestimo[] emprestimos;
    
    public Pessoa(String nome, String cpf, Emprestimo[] emprestimos){
        this.nome = nome;
        this.cpf = cpf;
        this.emprestimos = emprestimos;
    }
    
    public Pessoa(){
        
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the emprestimos
     */
    public Emprestimo[] getEmprestimos() {
        return emprestimos;
    }

    /**
     * @param emprestimos the emprestimos to set
     */
    public void setEmprestimos(Emprestimo[] emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    public String toString(){
        String descricao = "";
        descricao += "Nome do usuário: " + nome + "\n";
        descricao += "CPF do usuário: " + cpf + "\n";
        for (Emprestimo emprestimo : emprestimos) {
            descricao += "Código identificador do empréstimo: " + emprestimo.getIdDoEmprestimo() + "\n";
            descricao += "Dados do usuário: " + emprestimo.getPessoa();
            descricao += "Data do empréstimo: " + emprestimo.getDataDoEmprestimo();
            descricao += "Data para devolução: \7 dias úteis, a contar da data do empréstimo \n";
            descricao += "Dados do livro: " + emprestimo.getLivro();
        }
        return descricao;
    }
}
