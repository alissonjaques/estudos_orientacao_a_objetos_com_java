package enums;

/**
 *
 * @author Alisson Jaques
 */
public enum StatusDoLivro{
    EMPRESTADO("O livro encontra-se emprestado"), DISPONÍVEL("O livro está disponível"), INDISPONIVEL("Não existe o livro no acervo");

    private String descricao;

    private StatusDoLivro(String descricao) {
        this.descricao = descricao;
    } 
    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
