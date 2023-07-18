package classes;

/**
 *
 * @author Alisson Jaques
 */
public class Emprestimo {
    
    static private int idDoEmprestimo = 0;
    private Pessoa pessoa;
    private Livro livro;
    private Data dataDoEmprestimo;
    
    public Emprestimo(Pessoa pessoa, Livro livro, Data dataDoEmprestimo){
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataDoEmprestimo = dataDoEmprestimo;
    }
    
    public Emprestimo(){
      
    }
    
    public int getIdDoEmprestimo(){
        return idDoEmprestimo;
    }
    
    public void setIdDoEmprestimo(int idDoEmprestimo){
        this.idDoEmprestimo = idDoEmprestimo;
    }
    
    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * @return the dataDoEmprestimo
     */
    public Data getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    /**
     * @param dataDoEmprestimo the dataDoEmprestimo to set
     */
    public void setDataDoEmprestimo(Data dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }
    
    public String toString(){
        String descricao = "";
        descricao += "Código identificador do empréstimo: " + idDoEmprestimo + "\n";
        descricao += "Usuário: " + pessoa.getNome() + "\n";
        descricao += "CPF: " + pessoa.getCpf() + "\n";
        descricao += "Data do empréstimo: " + dataDoEmprestimo.getDia() + "/" + dataDoEmprestimo.getMês() + "/" + dataDoEmprestimo.getAno() + "\n";
        descricao += "Data para devolução: 7 dias úteis a contar da data do empréstimo \n";
        descricao += "Livro: " + livro.getTitulo() + "\n";
        descricao += "Autor: " + livro.getAutor() + "\n";
        descricao += "Código de identificação: " + livro.getCodigoDeIdentificacao() + "\n";
        descricao += "Ano de publicação: " + livro.getAnoDePublicacao() + "\n";
        return descricao;
    }
}
