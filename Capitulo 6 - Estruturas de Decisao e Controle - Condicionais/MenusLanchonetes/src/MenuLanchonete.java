import java.util.Scanner; // importa��o da classe Scanner, utilizada para manipular dados informados no teclado
/**
	A classe MenuLanchonete que possu� m�todos de impress�o de menu e
	informa��es sobre pedidos de uma lanchonete.
	
	@author Alisson Jaques
*/
public class MenuLanchonete{ // declara��o da classe

    static double valorTotalDoPedido = 0;
	
	/**
		O m�todo est�tico imprimeMenu impreme o menu da lanchonete.
		Este m�todo pode ser chamado sem a necessidade de cria��o de 
		inst�nscias da classe MenuLanchonete.	
	*/
	public static void imprimeMenu(){
		
		// declara��o de string auxilar
		String menu = "";
		
		menu += "1 - Refrigerante 2 litros - R$9;00\n";
		menu += "2 - Prato Feito - R$12;00\n";
		menu += "3 - Self-service Sem Balan�a - R$15;00\n";
		menu += "4 - Suco Natural - R$5;00\n";
		menu += "5 - Salgados - R$3;50";
		
		System.out.println(menu); // imprime a string formatada (o menu da lanchonete)
		
	} // fim do m�todo imprimeMenu
	
	/**
		O m�todo fazPedido registra a op��o escolhida pelo usu�rio
		e retorna o valor do item escolhido.
		@return o valor do item escolhido		
	*/
	public static void fazPedido(){
		
		/*
		
			Declara��o de vari�veis auxiliares
			
		*/
		byte opcaoEscolhida; // A op��o escolhida pelo usu�rio
		
		System.out.println("Informe o n�mero de um dos produtos: "); // Solicitamos ao usu�rio que informe um item do menu
		Scanner valorEscolhido = new Scanner(System.in); 			 // Criamos um objeto da classe Scanner
		opcaoEscolhida = valorEscolhido.nextByte();					 // com o m�todo nextByte da classe Scanner armazenamos
																	 // o conte�do informado pelo usu�rio na vari�vel opcaoEscolhida
           
        // valorEscolhido.close();
		switch(opcaoEscolhida){ // caso opcaoEscolhida seja
			
			case 1: // 1, fa�a:
				
				System.out.println("R$9;00");
                valorTotalDoPedido += 9.0;
                
				break;
			
			case 2: // 2, fa�a:
			
                System.out.println("R$12;00");
                valorTotalDoPedido += 12.0;
				
				break;
			
			case 3: // 3, fa�a:
			
				System.out.println("R$15;00");
                valorTotalDoPedido += 15.0;
                
				break;
			
			case 4: // 4, fa�a:
			
				System.out.println("R$5;00");
                valorTotalDoPedido += 5.0;
                
				break;
				
			case 5: // 5, fa�a:
			
				System.out.println("R$3;50");
                valorTotalDoPedido += 3.5;
                
				break;
				
			default: // nenhum valor esperado, fa�a:
				
				// Informa ao usu�rio que a op��o escolhida n�o � v�lida
				System.out.println("O n�mero informado n�o � v�lido!");	
			
        } // fim do switch
           
		
    } // fim do m�todo fazPedido
    
    /**
     * 
     *  O m�todo valorTotalDaCompra retorna o valor total de um conjunto de
     *  pedidos realizados pelo cliente.
     *  @return o valor total dos pedidos realizados pelo cliente
     * 
     */
    public double valorTotalDaCompra(){

        return valorTotalDoPedido;

    } // fim do m�todo valorTotalDaCompra
	
} // fim da classe MenuLanchonete