package main;

import classes.RoboComMemoria;

/**
 * A classe Main demonstra usos da classe RoboComMemoria.
 * @author Alisson Jaques
 */
public class Main { // declara��o da classe
    /**
     * O m�todo main permite a execu��o desta classe, ele demonstra usos da classe
     * RoboComMemoria.
     * @param argumentos os argumentos que podem ser passados ao m�todo, via linha de comando,
     * mas que neste caso ser� ignorados.
     */
    public static void main(String[] argumentos){
        // declarmos uma inst�ncia da classe RoboComMemoria
        RoboComMemoria robo = new RoboComMemoria("C3PO", (int)5, (int)3, (short)270);
        System.out.println("================ Configura��o Inicial ===================\n");
        System.out.println(robo); // imprimimos a configura��o inicial do rob�
       
        // realizamos alguns movimentos e mudan�as de dire��es
        robo.move((short)400);
        robo.mudaDire��o((short)270);
        robo.mudaDire��o((short)0);
        robo.move(500);
        robo.mudaDire��o((short)180);
        robo.move((int)800);
        System.out.println("\n============== Configura��o Ap�s Mudan�a ================\n");
        System.out.println(robo); // imprimos a configura��o do rob� ap�s as mudan�as
        
        System.out.println("\n================ Configura��o Retorno ===================\n");
        robo.retorna�Origem(); // o rob� refaz o caminho de foram invertida, at� chegar na sua posi��o
                               // inicial.
        System.out.print(robo+ "\n"); // imprimos a configura��o do rob� ap�s o retorno � posi��o inicial
        System.out.println("\n=========================================================\n");
    } // fim do m�todo main
} // fim da clase Main
