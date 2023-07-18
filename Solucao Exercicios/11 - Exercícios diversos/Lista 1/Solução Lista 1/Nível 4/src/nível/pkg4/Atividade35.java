package nível.pkg4;

/**
 * A classe Atividade35 representa um programa de computador que imprimi os 100 primeiros
 * números naturais. Caso o número seja múltiplo de 10 é impresso essa informação na frente
 * do mesmo.
 * @author Alisson Jaques
 */
public class Atividade35 { // declara a classe
    
    /**
    * O método main permite a execução dessa classe, ele imprimi os 100 primeiros números naturais
    * e a informação "- Múltiplo de 10" na frente do número que for múltiplo de 10. 
    * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas
    * que neste caso serão ignorados.
    */
    public static void main(String[] argumentos){

        for(int i = 1; i<=100; i++){

            if(i%10==0){ // se o número for múltiplo de 10
                System.out.println(i+" - Múltiplo de 10");
            }
            else{// senão
                System.out.println(i);
            } // fim-se

        } // fim do laço

    } // fim do método main
} // fim da classe Atividade35
