package main;

import classes.Cliente; // importação da classe Cliente
import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe Main demonstra usos da classe Cliente. Ela representa um programa de computador que simula o
 * processo de compra de um cliente no supermercado.
 * @author Alisson Jaques
 */
public class Main { // declara a classe
    /**
     * O método main permite a execução dessa classe. Este método usa a classe Cliente para representar um
     * processo de compra em um supermercado.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste
     * caso serão ignorados.
     */
    public static void main(String[] argumentos){
        String nomeDoCliente;                               // o nome do cliente
        String cpfDoCliente;                                // o CPF do cliente
        String endereco;                                    // o endereço do cliente
        Scanner scan = new Scanner(System.in,"ISO-8859-1"); // scan é um objeto da classe Scanner
        int escolha;                                        // a escolha do usuário
        
        // solicita ao usuário que escolha uma das opções e inicializa a variável correspondente com esse dado
        System.out.println("*********************** Compra no Supermercado **************************");
        System.out.println("=========================================================================");
        System.out.println("\nEscolha uma das seguintes opções: ");
        System.out.println("1 - Fazer compra\n2 - Sair");
        System.out.print("Digite sua escolha: ");
        escolha = scan.nextInt();
        while(escolha!=1 && escolha!=2){ // enquanto a escolha for inválida, faça:
            System.out.println("Você escolheu uma opção inválida.");
            System.out.print("Informe uma opção válida: ");
            escolha = scan.nextInt();        
        } // fim while
        
        scan = new Scanner(System.in,"ISO-8859-1");
        
        if(escolha==1){ // se o usuário escolher fazer compra, faça:            
            System.out.println("\n================================ Seus dados =============================");
            System.out.print("\nInforme seu nome: "); // solicita o dado
            nomeDoCliente = scan.nextLine();
            System.out.print("Informe seu CPF: ");   // solicita o CPF
            cpfDoCliente = scan.nextLine();
            System.out.print("Informe seu endereço: "); // solicita o endereço
            endereco = scan.nextLine();
            scan.reset(); // limpa o objeto scan
            Cliente cliente = new Cliente(nomeDoCliente,cpfDoCliente,endereco); // cria um objeto cliente com os dados informados
            cliente.fazerCompra(); // executa o método fazerCompra do objeto cliente
            System.out.println("=========================================================================");
            System.out.println("************************* Programa encerrado ****************************");
        }
        else{// senão, encerre o programa
            System.out.println("=========================================================================");
            System.out.println("************************* Programa encerrado ****************************");
        } // fim-se        
    } // fim do método main
} // fim da classe Main
