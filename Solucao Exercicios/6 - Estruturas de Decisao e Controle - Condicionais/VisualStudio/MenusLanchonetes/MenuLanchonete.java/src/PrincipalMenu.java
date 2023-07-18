import java.util.Scanner; // Importação da classe Scanner, utilizada para manipular dados fornecidos pelo usuário

/**
 * A classe PrincipalMenu demonstra exemplos de utilização da classe MenuLanchonete,
 * ela representa um programa, no qual é possível realizar pedidos em uma lanchonete e ver
 * o valor final do pedido.
 * Dados de entrada: números de 0 a 5.
 * Saída: valor total da compra
 * @author Alisson Jaques 
 */

public class PrincipalMenu { // declaração da classe
    
    /**
     * O método main permite a execução dessa classe, ele demonstra usos da classe MenuLanchonete.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas
     * que neste caso serão ignorados.
     */
    public static void main(String[] argumentos){

        byte escolha; // escolha do usuário

        Scanner opcaoEscolhida = new Scanner(System.in);  // instância da classe Scanner

        System.out.println("\n*************************Menu Lanchonete*************************\n"); // título do menu
        // solicitação de dado ao usuário e inicialização da variável escolha com o mesmo
        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
        escolha = opcaoEscolhida.nextByte();

        if(escolha == 0){ // se a primeira escolha for 0

            // imprime o valor default da compra e a mensagem de programa encerrado
            System.out.println("Valor total da Compra: R$"+MenuLanchonete.valorTotalDoPedido);
            System.out.println("Programa encerrado.");            

        }
        else{ // senão

            while(escolha!=0){ // enquanto a escolha não for 0

                switch(escolha){ // caso escolha seja
    
                    case 1: // 1, faça
    
                        MenuLanchonete.imprimeMenu(); // chamada do método imprimiMenu() da classe MenuLanchonet
                        // solicita ao usário a escolha de uma opção e armazena a mesma na variável escolha
                        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
                        escolha = opcaoEscolhida.nextByte();

                        break;
                    
                    case 2: // 2, faça
    
                        MenuLanchonete.fazPedido(); // chamada do método fazPedido() da classe MenuLanchonete
                        // solicita ao usário a escolha de uma opção e armazena a mesma na variável escolha
                        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
                        escolha = opcaoEscolhida.nextByte();
    
                        break;
                    
                    default: // não seja nem 1 e nem 21, faça

                        System.out.println("Informe uma opção válida!"); // informa ao usuário que a opção escolhida não foi válida
                        // solicita ao usário a escolha de uma opção e armazena a mesma na variável escolha
                        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
                        escolha = opcaoEscolhida.nextByte();
        
                } // fim do switch
    
            } // fim do while

            // imprime o valor total da compra e mensagem de programa encerrado
            System.out.println("Valor total da Compra: R$"+MenuLanchonete.valorTotalDoPedido);
            System.out.println("Programa encerrado.");

        }
                
        opcaoEscolhida.close(); // encerra o objeto opcaoEscolhida

    } // fim do método main

} // fim da classe PrincipalMenu