package enums;

/**
 *
 * @author ericd
 */
public enum Titulacao {
    
    ESPECIALIZACAO("Especialização"), MESTRADO("Mestrado"), DOUTORADO("Doutorado");
    
    private final String descricao;

    private Titulacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
