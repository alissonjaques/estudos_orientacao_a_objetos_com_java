package main;

import classes.RoboComMemoria;

/**
 * A classe Main demonstra usos da classe RoboComMemoria.
 * @author Alisson Jaques
 */
public class Main { // declaração da classe
    /**
     * O método main permite a execução desta classe, ele demonstra usos da classe
     * RoboComMemoria.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando,
     * mas que neste caso serã ignorados.
     */
    public static void main(String[] argumentos){
        // declarmos uma instância da classe RoboComMemoria
        RoboComMemoria robo = new RoboComMemoria("C3PO", (int)5, (int)3, (short)270);
        System.out.println("================ Configuração Inicial ===================\n");
        System.out.println(robo); // imprimimos a configuração inicial do robô
       
        // realizamos alguns movimentos e mudanças de direções
        robo.move((short)400);
        robo.mudaDireção((short)270);
        robo.mudaDireção((short)0);
        robo.move(500);
        robo.mudaDireção((short)180);
        robo.move((int)800);
        System.out.println("\n============== Configuração Após Mudança ================\n");
        System.out.println(robo); // imprimos a configuração do robô após as mudanças
        
        System.out.println("\n================ Configuração Retorno ===================\n");
        robo.retornaÀOrigem(); // o robô refaz o caminho de foram invertida, até chegar na sua posição
                               // inicial.
        System.out.print(robo+ "\n"); // imprimos a configuração do robô após o retorno à posição inicial
        System.out.println("\n=========================================================\n");
    } // fim do método main
} // fim da clase Main
