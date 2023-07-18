package nível.pkg2;
import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Atividade14 possui dois métodos, sendo um o método main e outro uma sub-rotina do main. Essa classe
 * representa um programa de computador que recebe dois números flutuantes e retorna a diferença do maior para o
 * menor.
 * @author Alisson Jaques
 */
public class Atividade14 { // declara a classe
    
    /**
     * O método main permite a execução dessa classe, ele recebe como entrada dois números e fornece a diferença 
     * do maior para o menor. Este método utiliza como sub-rotina o método encontraDiferenca(double, double), 
     * responsável por encontrar a diferença e a retornar.
     * @param argumentos
     */
    public static void main(String[] argumentos){

        double numero1, numero2;                 // número 1 e número 2
        Scanner scan = new Scanner(System.in);   // criação de uma referência para um objeto da classe Scanner

        System.out.println("******************** Diferença do Maior para o Menor **********************");

        /*
            É solicitado ao usuário que entre com o primeiro e o segundo número, com os dados obtidos são
            realizados as inicializações das variáveis correspondentes.
        */
        System.out.print("\nInforme o primeiro número: ");
        numero1 = scan.nextDouble();
        scan.reset(); // limpa o objeto scan

        System.out.print("Informe o segundo número: ");
        numero2 = scan.nextDouble();
        scan.close(); // fecha a instância scan
       
        System.out.println("Diferença: " + encontraDiferenca(numero1, numero2)); // imprimi no terminal a diferença, utilizando o método encontraDiferenca(double,double)

        System.out.println("\n***************************************************************************");
        
    } // fim do método main

    /**
     * O método encontraDiferenca recebe como argumento dois números flutuantes e retorna a diferença do maior
     * para o menor.
     * @param num1 um número flutuante
     * @param num2 outro número flutuante
     * @return a diferença do maior número em relação ao menor
     */
    private static double encontraDiferenca(double num1, double num2){

        double diferenca; // variável auxiliar que representa a diferença

        if(num1>=num2){ // se o conteúdo de num1 for maior ou igual ao conteúdo de num2

            diferenca = num1 - num2;

            return diferenca;

        }
        else{ // senão

            diferenca = num2 - num1;

            return diferenca;
            
        } // fim-se
        
    } // fim do método encontraDiferenca

} // fim da classe Atividade14

