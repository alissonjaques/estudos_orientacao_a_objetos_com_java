import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Atividade57 possui um único método, o main. Ela recebe como entrada uma frase
 * e imprimi, como saída, as vogais que ocorrem na frase.
 * @author Alisson Jaques
 */
public class Atividade57 { // declara a classe
    /**
     * O main permite a execução dessa classe. Ele recebe como entrada uma frase e imprimi
     * no terminal as vogais dessa frase, na ordem que aparecem. Por exemplo, a frase "Mad World"
     * terá como saída no terminal "a o ".
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando,
     * mas que neste caso serão ignorados
     */
    public static void main(String[] argumentos){

        String frase;                           // a frase a ser informada pelo usuário
        Scanner scan = new Scanner(System.in);  // declaração de uma referência para um objeto da classe Scanner

        System.out.println("****************************** Lê uma Frase e Imprimi as Vogais ****************************");
        // Solicita ao usuário que entre com a frase e armazena a mesma no vetor de String correspondente
        System.out.print("Entre com uma frase: ");
        frase = scan.nextLine();
        scan.close(); // encerra o objeto scan

        System.out.print("\nVogais da frase (na ordem que aparecem): ");
        for(int i=0; i<frase.length(); i++){ // enquanto não percorrer todo o vetor de String, faça:
            switch(frase.charAt(i)){ // caso frase[i] seja
                case 'a': // a, faça:
                    System.out.print("a "); // imprima "a "
                    break;
                case 'e': // e, faça:
                    System.out.print("e "); // imprima "e "
                    break;
                case 'i': // i, faça:
                    System.out.print("i "); // imprima "i "
                    break;
                case 'o': // o, faça:
                    System.out.print("o "); // imprima "o "
                    break;
                case 'u': // u, faça:
                    System.out.print("u "); // imprima "u "
                    break;
                case 'A': // A, faça:
                    System.out.print("A "); // imprima "A "
                    break;
                case 'E': // E, faça:
                    System.out.print("E "); // imprima "E "
                    break;
                case 'I': // I, faça:
                    System.out.print("I "); // imprima "I "
                    break;
                case 'O': // O, faça:
                    System.out.print("O "); // imprima "O "
                    break;
                case 'U': // U, faça:
                    System.out.print("U "); // imprima "U "
                    break;
            } // fun do switch
        } // fim do for
        System.out.println(); // quebra de linha, para melhor organização das informações no terminal
        System.out.println("\n********************************************************************************************");
    } // fim do método main
} // fim da classe Atividade57
