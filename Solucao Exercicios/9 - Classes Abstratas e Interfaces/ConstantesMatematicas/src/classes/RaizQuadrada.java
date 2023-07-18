package classes;

import interfaces.ConstantesMatematicas;

/**
 * A classe RaizQuadrada implementa a interface ConstantesMatematicas,
 * ou seja, ela herda todas as constantes matem�ticas descritas na super
 * classe.
 * @author Alisson Jaques
 */
public class RaizQuadrada implements ConstantesMatematicas{
    /**
     * O m�todo imprimiRaizQuadrada imprime todas as contantes encapsuladas
     * na classe RaizQuadrada.
     */
    public void imprimeRaizQuadrada(){
        System.out.println("Raiz Quadrada de 2: " + RAIZDE2);
        System.out.println("Raiz Quadrada de 3: " + RAIZDE3);
        System.out.println("Raiz Quadrada de 5: " + RAIZDE5);
        System.out.println("Raiz Quadrada de 6: " + RAIZDE6);        
    } // fim do m�todo imprimeRaizQuadrada
} // fim da classe RaizQuadrada
