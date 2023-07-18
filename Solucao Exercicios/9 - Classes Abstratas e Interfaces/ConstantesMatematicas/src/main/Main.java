package main;

import classes.RaizQuadrada;

/**
 * A classe Main demonstra usos da classe RaizQuadrada.
 * @author Alisson Jaques
 */
public class Main {
    /**
     * O método main permite a execução dessa classe, ele representa
     * um programa de computador que imprimi algumas raizes quadradas
     * não perfeitas.
     * @param argumentos os argurmentos que podem ser passados ao método,
     * via linha de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos){
        RaizQuadrada raizQuadrada = new RaizQuadrada();
        raizQuadrada.imprimeRaizQuadrada();  
    } // fim do método main
} // fim da classe Main
