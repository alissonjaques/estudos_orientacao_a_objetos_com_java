package interfaces;

/**
 * A interface Lampada descreve quais m�todos uma classe que represente uma l�mpada
 * deve conter.
 * @author Alisson Jaques
 */
public interface Lampada {
    /**
     *  O m�todo acendeLampada altera o status da l�mpada para 
     *  aceso.
     */
    public void acendeLampada();
    
    /**
     *  O m�todo acendeLampada altera o status da l�mpada para 
     *  apagado.
     */
    public void apagaLampada();
    
    /**
     * O m�todo mostraEstado mostra se a l�mpada est� apagada ou acesa. 
     */
    public void mostraEstado();
    
    /*
     * O m�todo clona retona uma inst�ncia da interface L�mpada com os mesmos
     * campos encapsulados no objeto atual.
     */
    public Lampada clona();
}
