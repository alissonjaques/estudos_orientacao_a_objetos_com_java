import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 *  A classe Atividade22 representa um programa de computador que recebe um número flutuante e armazena o mesmo
 *  na variável A, se esse número for positivo, ou na B, se esse número for negativo, após o armazemento é impresso,
 *  no terminal, a variável que recebeu o número.
 *  @author Alisson Jaques
 */
public class Atividade22 { // declara a classe
    /**
     * O método main permite a execução dessa classe, ele recebe como entrada um número flutuante e atribui o mesmo
     * ao valor da variável A, se o número for positivo, ou B, se o número for negativo e imprime o conteúdo da 
     * variável que recebeu a atribuição.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){

        double numero, A, B;
        Scanner scan = new Scanner(System.in); // criação de uma referência para um objeto da classe Scanner

        System.out.println("******************** Mostra Resultado **********************");

        /*
            É solicitado ao usuário que entre com um número, o valor informado é utilizado para inicializar
            a variável numero.
        */
        System.out.print("Informe um número: ");
        numero = scan.nextDouble();
        scan.close(); // fecha o objeto scan

        if(numero>=0){ // se o número informado for positivo

            A = numero;                     // A recebe o numero informado
            System.out.println("A = " + A); // Imprime o valor de A

        }
        else{ // senão

            B = numero;                     // A recebe o numero informado
            System.out.println("B = " + B); // Imprime o valor de A

        } // fim-se

        System.out.println("************************************************************");
    
    } // fim do método main
   
} // fim da classe Atividade22
