import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * <p>A classe Atividade23 representa uma calcularadora simples, ela possui um único método, que é o método main.
 * Essa classe recebe como entrada dois números e a apção escolhida, fornecendo como saída umas das seguintes 
 * operações fundamentais: adição, subtração, multiplicação e divisão.</p>
 * @author Alisson Jaques
 */
public class Atividade23{ // declara a classe

    /**
     * <p>O método main permite a execução dessa classe, ele recebe como entrada dois números e uma opção (somar, subtrair
     * , multiplicar e dividir), como saída ele fornece o resultado da operação fundamental escolhida.</p>
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso serão 
     * ignorados.
     */
    public static void main(String[] argumentos){


        double numero1, numero2, resultado;     // os números de entrada e o resultado da operação
        byte opcao;                             // variável que representa a escolha do usuário
        Scanner scan = new Scanner(System.in);  // criação de uma referência para um objeto da classe Scanner
        

        System.out.println("******************** Calculadora Simples **********************");
        System.out.print("\nEscolha uma das seguintes opções:\n 1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n"); // solicita ao usuário a escolha de uma operação
        System.out.print("Opção escolhida: ");
        opcao = scan.nextByte(); // inicializa a variável opcao com o valor fornecido pelo teclado
        scan.reset();            // limpa o objeto scan

        switch(opcao){// caso opcao seja:

            case 1: // 1, faça:
                    
                    /*
                        Solicita ao usuário que entre com os dois números e inicializa as variáveis
                        correspondentes com os mesmos.
                    */
                    System.out.print("Informe o primeiro número: ");
                    numero1 = scan.nextDouble();
                    scan.reset();
            
                    System.out.print("Informe o segundo número: ");
                    numero2 = scan.nextDouble();
                    scan.close(); // encerra o objeto scan
            
                    resultado = numero1 + numero2;
            
                    System.out.println("Resultado da adição: " + resultado); // mostra o resultado da adição
    
                    break;
            case 2: // 2, faça:
                    System.out.print("Informe o primeiro número: ");
                    numero1 = scan.nextDouble();
                    scan.reset();
            
                    System.out.print("Informe o segundo número: ");
                    numero2 = scan.nextDouble();
                    scan.close();
            
                    resultado = numero1 - numero2;
            
                    System.out.println("Resultado da subtração: " + resultado); // mostra o resultado da subração

                    break;
            case 3: // 3, faça:
                    System.out.print("Informe o primeiro número: ");
                    numero1 = scan.nextDouble();
                    scan.reset();
            
                    System.out.print("Informe o segundo número: ");
                    numero2 = scan.nextDouble();
                    scan.close();
            
                    resultado = numero1 * numero2;
            
                    System.out.println("Resultado da multiplicação: " + resultado); // mostra o resultado da multiplicação
                    break;
            case 4: // 4, faça:
                    System.out.print("Informe o primeiro número: ");
                    numero1 = scan.nextDouble();
                    scan.reset();
            
                    System.out.print("Informe o segundo número: ");
                    numero2 = scan.nextDouble();
                    scan.close();
            
                    resultado = numero1 / numero2;
            
                    System.out.println("Resultado da divisão: " + resultado); // mostra o resultado da divisão
                    break;
            default: // nenhuma das opções válidas, faça:
                    scan.close();
                    System.out.println("Opção inválida! Programa encerrado. "); // informa que a opção escolhida é inválida e que o programa encerrou
        }

        System.out.println("\n***************************************************************");
    } // fim do método main

} // fim da classe Atividade23