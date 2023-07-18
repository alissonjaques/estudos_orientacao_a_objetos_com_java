package nível.pkg5;

import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Atividade45 possui um único método, que é o método main. Esta classe representa um programa de 
 * computador, que recebe uma lista de inteiros como entrada (quantidade de elementos da lista também consiste
 * em uma entrada) e imprimi no terminal os números dessa lista, na
 * ordem inversa da leitura.
 * @author Alisson Jaques
 */
public class Atividade45 { // declara a classe
    /**
     * O método main permite a execução dessa classe. Ele recebe como entrada a quantidade de números da lista, 
     * bem como os números da mesma e fornece como saída a impressão desses números, na ordem inversa da leitura.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){
        
        int quantidade;                         // a quantidade de números da lista (o tamanho do vetor de inteiros)
        int vetor[];                            // o vetor de inteiros
        Scanner scan = new Scanner(System.in);  // scan é uma referência para uma instância da classe Scanner

        System.out.println("**************************** Impressão Inversa da Leitura ****************************");
        /*
            solicita ao usuário que entre com a quantidade de números que a lista deverá ter e inicializa a variável
            correspondente com esse dado.
        */
        System.out.print("\nInforme a quantidade de números: ");
        quantidade = scan.nextInt();
        scan.reset(); // limpa o objeto scan

        while(quantidade<0){ // enquanto a quantidade for absurda
            // solicita uma quantidade válida e a armazena na variável quantidade
            System.out.print("Informe uma quantidade válida: ");
            quantidade = scan.nextInt();
            scan.reset();
        } // fim while

        System.out.println(); // quebra de linha para organização dos dados no terminal

        if(quantidade==0){ // se a quantidade for 0
            System.out.println("Lista vazia. Programa encerrado.");
        }
        else{ // senão
            vetor = new int[quantidade]; // declara o vetor de inteiros, cujo tamanho será a quantidade informada

            for(int i=0; i<quantidade; i++){ // repete n vezes (n = quantidade informada pelo usuário) as instruções abaixo:
                System.out.print("Informe o número: "); // solicita o número
                vetor[i] = scan.nextInt();              // guarda o número informado vetor
                scan.reset();
            } // fim for
            
            // imprimi os elementos do vetor, na ordem inversa da leitura
            System.out.println("\nImpressão Inversa:");
            for(int i=quantidade-1; i>=0; i--){
                System.out.println(vetor[i]);
            }
        } // fim-se

        scan.close(); // encerra o objeto scan
        
        System.out.println("\n**************************************************************************************");
        
    } // fim do método main
} // fim da classe Atividade45
