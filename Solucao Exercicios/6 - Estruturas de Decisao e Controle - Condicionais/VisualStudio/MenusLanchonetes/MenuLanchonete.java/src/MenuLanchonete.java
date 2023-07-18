import java.util.Scanner; // importação da classe Scanner, utilizada para manipular dados informados no teclado
/**
	A classe MenuLanchonete que possuí métodos de impressão de menu e
	informações sobre pedidos de uma lanchonete.
	
	@author Alisson Jaques
*/
public class MenuLanchonete{ // declaração da classe

    static double valorTotalDoPedido = 0;
	
	/**
		O método estático imprimeMenu impreme o menu da lanchonete.
		Este método pode ser chamado sem a necessidade de criação de 
		instânscias da classe MenuLanchonete.	
	*/
	public static void imprimeMenu(){
		
		// declaração de string auxilar
		String menu = "";
		
		menu += "1 - Refrigerante 2 litros - R$9;00\n";
		menu += "2 - Prato Feito - R$12;00\n";
		menu += "3 - Self-service Sem Balança - R$15;00\n";
		menu += "4 - Suco Natural - R$5;00\n";
		menu += "5 - Salgados - R$3;50";
		
		System.out.println(menu); // imprime a string formatada (o menu da lanchonete)
		
	} // fim do método imprimeMenu
	
	/**
		O método fazPedido registra a opção escolhida pelo usuário
		e retorna o valor do item escolhido.
		@return o valor do item escolhido		
	*/
	public static void fazPedido(){
		
		/*
		
			Declaração de variáveis auxiliares
			
		*/
		byte opcaoEscolhida; // A opção escolhida pelo usuário
		
		System.out.println("Informe o número de um dos produtos: "); // Solicitamos ao usuário que informe um item do menu
		Scanner valorEscolhido = new Scanner(System.in); 			 // Criamos um objeto da classe Scanner
		opcaoEscolhida = valorEscolhido.nextByte();					 // com o método nextByte da classe Scanner armazenamos
																	 // o conteúdo informado pelo usuário na variável opcaoEscolhida
           
        // valorEscolhido.close();
		switch(opcaoEscolhida){ // caso opcaoEscolhida seja
			
			case 1: // 1, faça:
				
				System.out.println("R$9;00");
                valorTotalDoPedido += 9.0;
                
				break;
			
			case 2: // 2, faça:
			
                System.out.println("R$12;00");
                valorTotalDoPedido += 12.0;
				
				break;
			
			case 3: // 3, faça:
			
				System.out.println("R$15;00");
                valorTotalDoPedido += 15.0;
                
				break;
			
			case 4: // 4, faça:
			
				System.out.println("R$5;00");
                valorTotalDoPedido += 5.0;
                
				break;
				
			case 5: // 5, faça:
			
				System.out.println("R$3;50");
                valorTotalDoPedido += 3.5;
                
				break;
				
			default: // nenhum valor esperado, faça:
				
				// Informa ao usuário que a opção escolhida não é válida
				System.out.println("O número informado não é válido!");	
			
        } // fim do switch
           
		
    } // fim do método fazPedido
    
    /**
     * 
     *  O método valorTotalDaCompra retorna o valor total de um conjunto de
     *  pedidos realizados pelo cliente.
     *  @return o valor total dos pedidos realizados pelo cliente
     * 
     */
    public double valorTotalDaCompra(){

        return valorTotalDoPedido;

    } // fim do método valorTotalDaCompra
	
} // fim da classe MenuLanchonete