import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Atividade34 representa um programa de computador que lê um conjunto de números positivos e, ao ser
 * informado um número negativo, imprimi no terminal o maior e o menor número positivo do conjunto. Esta classe
 * possui um único método, que é o método main.
 * @author Alisson Jaques
 */
public class Atividade34 { // declara a classe
    
    /**
     * O método main permite a execução dessa classe. Ele recebe um conjunto de números positivos e um número negativo como entrada, 
     * ou penas um número negativo (quando não é informado o conjunto de positivos), este método fornece como saída o maior e o menor
     * número positivo do conjunto ou a mensagem de que não foi inseridos números positivos.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos){

        int numero, maior, menor;               // variáveis que representam o numero informado, o maior número e o menor número
        Scanner scan = new Scanner(System.in);  // declaração de um objeto da classe Scanner

        System.out.println("************************** Maior e Menor Número de uma Lista Positiva *****************************");
        System.out.println("Informe os números positivos ou um número negativo para parar:");
        /*
            Solicita o primeiro número e inicializa as variáveis maior e menor com o mesmo.
        */
        System.out.print("\nInforme o número: ");
        numero = scan.nextInt();
        scan.reset(); // limpa o objeto scan
        maior = numero;
        menor = numero;

        while(numero>=0){ // enquanto o conteúdo de numero for positivo, faça:

            if(numero>maior){ // se o número informado for maior que o maior atual
                maior = numero; // atualize o maior
            }
            
            if(numero<menor){ // se o número informado for menor que o menor atual
                menor = numero; // atualize o menor
            }

            // solicita o próximo número do conjunto e o armazena na variável numero
            System.out.print("Informe o número: ");
            numero = scan.nextInt();
            scan.reset();
        } // fim while

        scan.close(); // encerra o objeto scan

        if(maior<0){ // se o primeiro número informado for negativo
            // informa que não foi inserido um conjunto de positivos
            System.out.println("\nNão foram informados números positivos. Programa encerrado.");
        }
        else{ // senão
            // imprime o maior e o menor número do conjunto
            System.out.println("\nMaior número informado: " + maior);
            System.out.println("Menor número informado: " + menor);
        } // fim-se
        
        System.out.println("***************************************************************************************************");
    } // fim do método main
} // fim da classe Atividade34
