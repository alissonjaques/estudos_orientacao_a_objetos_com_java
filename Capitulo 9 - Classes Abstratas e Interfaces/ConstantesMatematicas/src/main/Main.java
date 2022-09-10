package main;

import classes.RaizQuadrada;

/**
 * A classe Main demonstra usos da classe RaizQuadrada.
 * @author Alisson Jaques
 */
public class Main {
    /**
     * O m�todo main permite a execu��o dessa classe, ele representa
     * um programa de computador que imprimi algumas raizes quadradas
     * n�o perfeitas.
     * @param argumentos os argurmentos que podem ser passados ao m�todo,
     * via linha de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos){
        RaizQuadrada raizQuadrada = new RaizQuadrada();
        raizQuadrada.imprimeRaizQuadrada();  
    } // fim do m�todo main
} // fim da classe Main
