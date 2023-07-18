import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

 /**
     * <p>A classe Atividade24 representa um programa de computador, tal programa tem como entrada dois números e como
     * saída umas das seguintes opções:<p> 
     * <p>- Verificar se um dos números lidos é ou não múltiplo do outro </p>
     * <p>- Verificar se os dois números lidos são pares </p>
     * <p>- Verificar se a média dos dois números lidos é maior ou igual a 7 </p>
     * <p>- Sair</p>
     * @author Alisson Jaques
     */
public class Atividade24 { // declara a classe
    
    /**
     * O método main permite que essa classe seja um programa de computador, ele representa um menu que recebe
     * dois números como entrada e solicita uma de quatro operações (comparar se os números são múltiplos um do outro,
     * se eles são pares, se a média dos dois é maior ou igual a 7 e sair) e fornece, como saída, o resultado da opção 
     * escolhida.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso serão
     * ignorados.
     */
    public static void main(String[] argumentos){
        
        int numero1, numero2;    // os dois números de entrada
        double media;            // a média
        byte escolha;            // a opção escolhida pelo usuário
        Scanner scan = new Scanner(System.in); // scan é um objeto da classe Scanner

        /*
            Imprimi o menu e inicializa a variável escolha com a opção escolhida pelo usuário.
        */
        System.out.println("******************** Informações Sobre Dois Números **********************");
        System.out.println("\nEscolha uma das seguintes opções:");
        System.out.println("1 - Verificar se um dos números lidos é ou não múltiplo do outro");
        System.out.println("2 - Verificar se os dois números lidos são pares");
        System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
        System.out.println("4 - Sair");
        System.out.print("Opção escolhida: ");
        escolha = scan.nextByte();
        scan.reset(); // limpa o objeto scan

        switch(escolha){ // caso escolha seja

            case 1: //1 , faça:

                /*
                    Solicita os dois números e inicializa as variáveis correspondentes com
                    os mesmos.
                */
                System.out.print("Informe o primeiro número: ");
                numero1 = scan.nextInt();
                scan.reset();
                System.out.print("Informe o segundo número: ");
                numero2 = scan.nextInt();
                scan.close(); // encerra o objeto scan
                /*
                    É considerado aqui o conceito de resto de divisão, para identificar se um número é ou não
                    múltiplo do outro. Se a/b possui resto 0, diz-se que a é múltiplo de b e vice versa. No caso
                    especial, onde b = 0, é dito que a não é múltiplo de b, exceto se a = 0 (isso se deve ao fato
                    de que o número 0 é múltiplo de todos os números, mas possui apenas ele mesmo como múltiplo).                
                */
                if(numero1==0){ // se o númerador for 0
                    System.out.println("O número " + numero1 + " é múltiplo do número " + numero2 + ".");
                }
                else if(numero2==0){ // senão, se o denominador for 0
                    System.out.println("O número " + numero1 + " não é múltiplo do número " + numero2 + ".");
                }
                else if(numero1%numero2==0){ // numero1/numero2 possui resto 0 (a instrução abaixo sempre ocorrerá se os números forem iguais)
                    System.out.println("O número " + numero1 + " é múltiplo do número " + numero2 + ".");
                }
                else{ // senão
                    System.out.println("O número " + numero1 + " não é múltiplo do número " + numero2 + ".");
                } // fim-se

                // aqui segue-se o mesmo raciocínio anterior, porém tem-se b/a ao invés de a/b
                if(numero2==0 && numero1!=0){ // se o númerador for zero e o denominador for diferente de 0
                    System.out.println("O número " + numero2 + " é múltiplo do número " + numero1 + ".");
                }
                else if(numero1==numero2){ // se os números forem iguais
                    // instrução vazia, para não repetir informações
                }
                else if(numero1==0){ // se o denomidador for 0
                    System.out.println("O número " + numero2 + " não é múltiplo do número " + numero1 + ".");
                }
                else if(numero2%numero1==0){ // numero2/numero1 possui resto 0
                    System.out.println("O número " + numero2 + " é múltiplo do número " + numero1 + ".");
                }
                else{ // senão
                    System.out.println("O número " + numero2 + " não é múltiplo do número " + numero1 + ".");
                } // fim-se
                
                break;            
            case 2: // 2, faça:
                /*
                    Solicita os dois números e inicializa as variáveis correspondentes com
                    os mesmos.
                */
                System.out.print("Informe o primeiro número: ");
                numero1 = scan.nextInt();
                scan.reset();
                System.out.print("Informe o segundo número: ");
                numero2 = scan.nextInt();
                scan.close();

                if(numero1%2==0){ // se o resto da divisão de numero1 for 0
                    System.out.println("O número " + numero1 + " é par."); // o número será par
                }
                else{ // senão
                    System.out.println("O número " + numero1 + " é ímpar."); // o número será ímpar
                } // fim-se

                if(numero2%2==0){
                    System.out.println("O número " + numero2 + " é par.");
                }
                else{
                    System.out.println("O número " + numero2 + " é ímpar.");
                }

                break;
            case 3: // 3, faça:
                /*
                    Solicita os dois números e inicializa as variáveis correspondentes com
                    os mesmos.
                */
                System.out.print("Informe o primeiro número: ");
                numero1 = scan.nextInt();
                scan.reset();
                System.out.print("Informe o segundo número: ");
                numero2 = scan.nextInt();
                scan.close();

                media = (numero1+numero2)/2;

                if(media>=7){ // se a média for maior ou igual a 7
                    System.out.println("A média dos números informados é maior do que ou igual a 7.");
                }
                else{ // senão
                    System.out.println("A média dos números informados é menor do 7.");
                } // fim-se

                break;
            case 4: // 4, faça:
                System.out.println("Programa encerrado."); // informa que o programa será encerrado
                break;
            default: // nenhuma das opções do menu, faça: 
                System.out.println("Opção inválida!");     // informa que a opção escolhida é inválida
                System.out.println("Programa encerrado."); // informa que o programa será encerrado     

        } // fim do switch

        System.out.println("\n**************************************************************************");

    } // fim do método main

} // fim da classe Atividade24
