package nível.pkg1;
import java.util.Scanner; // importação da classe Scanner, para manipular dados fornecidos pelo teclado

/**
 * A classe Atividade6 possui um único método, que é o método main. Ela recebe como entrada uma temperatura
 * em graus celsius e fornece como saída essa temperatura em graus fahrenheit.
 * @author Alisson Jaques
 */
public class Atividade6 { // declara a classe
    
    /**
     * O médoto main permite a execução dessa classe. Ele recebe como entrada uma temperatura em graus celsius
     * e imprimi essa temperatura em graus fahrenheit.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){

        double celsius, fahrenheit;            // Variáveis que representam a temperatura em graus celsius e fahrenheit
        Scanner scan = new Scanner(System.in); // Declaração de uma instância da classe Scanner, para obter dados
                                               // fornecidos pelo usuário

        System.out.println("********************** Celsius para Fahrenheit ************************");
        
        // solicita a temperatura em graus celsius e inicializa a variável correspondente, com o dado passado
        System.out.print("\nInforme a temperatura em graus celsius: ");
        celsius = scan.nextDouble();
        scan.close(); // fecha o objeto scan

        fahrenheit = ((9. * celsius) + 160.)/5.; // F = (9*C + 160)/5

        // imprime no terminal a temperatura em graus fahrenheit
        System.out.println("Temperatura correspondente em graus fahrenheit: " + fahrenheit +" °F");
        System.out.println("\n***********************************************************************");

    } // fim do método main
    
} // fim da classe Atividade6