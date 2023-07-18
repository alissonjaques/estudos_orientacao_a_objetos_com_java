package enums;

/**
 *
 * @author Alisson Jaques
 */
public enum StatusDoItem {

    /**
     *
     */
    EMPRESTADO("O item encontra-se emprestado"), DISPONÍVEL("O item está disponível"), INDISPONIVEL("Não existe o item no acervo");

    private String descricao;

    private StatusDoItem(String descricao) {
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
