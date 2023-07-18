package nível.pkg2;

import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Atividade12 possui um único método, que é o método main. Essa classe recebe como entrada um número inteiro
 * e fornece como saída o módulo desse número.
 * @author Alisson Jaques
 */
public class Atividade12 { // declara a classe

    /**
     * O método  main permite a execução dessa classe, ele recebe um número inteiro como entrada, gera seu módulo e o 
     * imprimi no terminal.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso serão
     * ignorados.
     */
    public static void main(String[] argumentos){

        int numero;                             // número inteiro
        Scanner  scan = new Scanner(System.in); // referência para uma instância da classse Scanner

        System.out.println("******************** Módulo de Um Número Inteiro **********************");

        /*
            É solicitado ao usuário que entre com um número inteiro, o dado fornecido é utilizado para
            inicializar a variável numero.
        */
        System.out.print("\nInforme um número inteiro: ");
        numero = scan.nextInt();
        scan.close(); // fecha o objeto scan

        if(numero>=0){ // se o número for maior ou igual a zero

            System.out.println("|" + numero + "| = " + numero); // |x| = x

        }
        else{ // senão

            System.out.println("|" + numero + "| = " + (-1)*numero); // |x| = -x

        } // fim-se

        System.out.println("\n***********************************************************************");

    } // fim do método main

} // fim da classe Atividade12