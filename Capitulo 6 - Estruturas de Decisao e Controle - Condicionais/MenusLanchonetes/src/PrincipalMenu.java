import java.util.Scanner;

public class PrincipalMenu {
    
    public static void main(String[] argumentos){

        byte escolha;

        Scanner opcaoEscolhida = new Scanner(System.in);

        System.out.println("\n*************************Menu Lanchonete*************************\n");
        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
        escolha = opcaoEscolhida.nextByte();

        if(escolha == 0){

            System.out.println("Valor total da Compra: R$"+MenuLanchonete.valorTotalDoPedido);
            System.out.println("Programa encerrado.");            

        }
        else{

            while(escolha!=0){

                switch(escolha){
    
                    case 1:
    
                        MenuLanchonete.imprimeMenu();
                        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
                        escolha = opcaoEscolhida.nextByte();

                        break;
                    
                    case 2:
    
                        MenuLanchonete.fazPedido();
                        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
                        escolha = opcaoEscolhida.nextByte();
    
                        break;
                    
                    default:
    
                        System.out.println("Informe uma opção válida!");
                        System.out.println("Escolha 1 para ver menu, 2 para fazer pedido ou 0 para sair");
                        escolha = opcaoEscolhida.nextByte();
    
    
                }
    
            }

            System.out.println("Valor total da Compra: R$"+MenuLanchonete.valorTotalDoPedido);
            System.out.println("Programa encerrado.");

        }
                
        opcaoEscolhida.close();

    }

}