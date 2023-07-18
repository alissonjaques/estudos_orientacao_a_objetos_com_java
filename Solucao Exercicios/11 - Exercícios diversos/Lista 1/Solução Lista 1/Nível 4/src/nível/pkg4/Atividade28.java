package nível.pkg4;

/**
 * A classe Atividade28 possui um único método, sendo este o método main.
 * Ela representa um programa de computador que imprimi os números ímpares
 * entre 100 e 200.
 * @author Alisson Jaques
 */
public class Atividade28 { // declara a classe
    
    /**
     * O método main permite a execução dessa classe, ele possui uma estrutura
     * de repetição que imprimi os números ímpares entre 100 e 200.
     * @param argumentos os argumentos que podem ser passados ao método, via linha 
     * de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos){

        System.out.println("****************************** Números Ímpares entre 100 e 200 *******************************\n");

        for(int i = 100; i<=200; i++){ // executa o conteúdo do seu escopo 100 vezes

            if(i%2!=0){ // se o número for ímpar
                System.out.println(i); // imprime o conteúdo de i
            } // fim-se
        } // fim do for

        System.out.println("\n**********************************************************************************************");
    } // fim do método main
} // fim da classe Atividade28
