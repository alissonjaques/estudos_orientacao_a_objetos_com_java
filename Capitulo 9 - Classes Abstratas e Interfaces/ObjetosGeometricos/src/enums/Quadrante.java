package enums;

/**
 *
 * @author Alisson Jaques
 */
public enum Quadrante {
    PRIMEIRO(1), SEGUNDO(2), TERCEIRO(3), QUARTO(4);
    private final int quadrante;
    
    private Quadrante(int quadrante){
        this.quadrante = quadrante;
    }
    
    public int getQuadrante(){
        return quadrante;
    }
}
