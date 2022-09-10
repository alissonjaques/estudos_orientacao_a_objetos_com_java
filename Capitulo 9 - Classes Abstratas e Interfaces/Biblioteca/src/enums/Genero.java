package enums;

/**
 *
 * @author Alisson Jaques
 */
public enum Genero {
    ACAO("Ação"), FICCAO("Ficção"), FANTASIA("Fantasia"), HORROR("Horror"), TERROR("Terror");
    
    private String descricao;
    
    private Genero(String descricao){
        this.descricao = descricao;
    }
    
    public String getGenero(){
        return descricao;
    }
}
