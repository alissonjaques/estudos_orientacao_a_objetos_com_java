package interfaces;

/**
 * A interface Lampada descreve quais métodos uma classe que represente uma lâmpada
 * deve conter.
 * @author Alisson Jaques
 */
public interface Lampada {
    /**
     *  O método acendeLampada altera o status da lâmpada para 
     *  aceso.
     */
    public void acendeLampada();
    
    /**
     *  O método acendeLampada altera o status da lâmpada para 
     *  apagado.
     */
    public void apagaLampada();
    
    /**
     * O método mostraEstado mostra se a lâmpada está apagada ou acesa. 
     */
    public void mostraEstado();
    
    /*
     * O método clona retona uma instância da interface Lâmpada com os mesmos
     * campos encapsulados no objeto atual.
     */
    public Lampada clona();
}
