package nível.pkg5;

import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Atividade55 possui um único método, que é o método main. Esta classe representa um programa de
 * computador que recebe uma frase como entrada e imprimi a mesma no terminal sem os espaços em branco, 
 * bem como a quantidade de espaços em branco da frase.
 * @author Alisson Jaques
 */
public class Atividade55 { // declara a classe
    
    /**
     * O método main permite a execução da classe Atividade55, ele recebe como entrada uma frase (de no máximo 
     * 50 caracteres) e fornece como saída essa frase, sem espaços em branco, assim como a quantidade de espaços em
     * brando da mesma.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){

        String frase;                                         // a frase a ser informada pelo usuário
        int contador = 0;                                     // para armazenar a soma dos espaços em branco
        Scanner scan = new Scanner(System.in, "ISO-8859-1");  // scan é um referência para um objeto da classe Scanner

        System.out.println("**************************** Retorna Frase sem Espaços ****************************");
        // solicita que o usuário entre com uma frase e a armazena na variável correspondente
        System.out.print("\nInforme uma frase (quantidade máxima de carateteres permitidos: 50): ");
        frase = scan.nextLine();
    
        while(frase.length()>50){ // enquanto a frase possuir mais de 50 caracteres, faça:
            // solicita uma frase válida e a armazena na variável correspondente
            System.out.print("\nA frase ultrapassou a quantidade máxima de caracteres permitidos (50).\nPor favor, insira uma frase que atenda aos requisitos mencionados acima:");
            frase = scan.nextLine();
        } // fim while

        scan.close(); // encerra o objeto scan
        
        System.out.print("\nFrase sem espaços em branco: ");
        for(int i=0; i<frase.length(); i++){ // enquanto não percorrer todo o vetor de string, faça:

            if(frase.charAt(i) == ' '){ // se o contéudo for espaço (espaço em branco)
                contador++; // some mais uma unidade no contador
            }
            else{ // senão
                System.out.print(frase.charAt(i)); // imprima o caracter armazenado
            } // fim-se
        
        } // fim do for
        System.out.println("\nQuantidade de espaços em branco da frase: "+ contador); // imprimi a quantidade de espaços em branco
        System.out.println("\n***********************************************************************************");
    } // fim do método main
} // fim da classe Atividade55