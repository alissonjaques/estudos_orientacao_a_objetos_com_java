/**
	A classe PrincipalSoma demonstra exemplos de uso da classe
	Soma (uma biblioteca de métodos). Ela possuí um único método,
	que é o método main, este método permite a execução dessa 
	classe.
	
	@author Alisson Jaques
	
*/

import java.util.Scanner; // importação da classe Scanner, esta classe possuí métodos
						  // para entradas de dados pelo usuário (via teclado)

public class PrincipalSoma{ // declaração da classe
	
	/**
		O método main permite a execução dessa classe e da
		exemplos de uso da biblioteca de métodos Soma.
		@param argumentos os argumentos que podem ser passados ao 
		método via linha de comando, mas que nesse caso serão ignorados.	
		
	*/
	public static void main(String[] argumentos){
		
		// declaração de variáveis auxiliares
		int opcao;
		
		float numero1, numero2, numero3, numero4, numero5;
		
		// criamos várias referências a instâncias da classe Scanner
		// para podermos pegar os valores numéricos fornecisdos pelo usuário
		Scanner valor1 = new Scanner(System.in);
		Scanner valor2 = new Scanner(System.in);
		Scanner valor3 = new Scanner(System.in);
		Scanner valor4 = new Scanner(System.in);
		Scanner valor5 = new Scanner(System.in);
		
		// Menu que pedi ao usuário a escolha de uma opção
		System.out.println("Escolha uma das seguintes opções:");
		System.out.println("1 - Somar dois números");               // a opção que soma dois números
		System.out.println("2 - Somar três números");               // a opção que soma três números
		System.out.println("3 - Somar quatro números");             // a opção que soma quatro números
		System.out.println("4 - Somar cinco números");              // a opção que soma cinco números
		System.out.println("5 - Sair");
		
		// criamos uma referência a uma instância da classe Scanner
		// relativa à escolha do usuário
		Scanner escolha = new Scanner(System.in);
		
		/* 
			através do método nextInt() da classe Scanner 
			atribuímos o valor inteiro fornecido pelo usuário
			à variável auxiliar opcao
			
		*/ 
		
		opcao = escolha.nextInt();
		
		/**
			
			O comando com pré condição while permite que o usuário
			encontre diversas somas, contanto que ele informe campos
			válidos. Caso o usuário digite o número 5 (sair) os blocos
			de execução do comando não serão mais executados e o programa
			seguirá seu caminho natural.	
		
		
		*/
		while(opcao!=5){ // enquanto usuário não digitar a opção 5 (sair) faça:
			
			switch(opcao){ // quando opcao
				
				case 1: // for 1 faça:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em variáveis auxiliares
					System.out.println("Informe os dois números:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					
					// mostramos o resultado da soma ao usuário
					System.out.println("A soma dos números informados é:" + Soma.somaDoisValores(numero1,numero2));
					
					// solicitamos que o usuário escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova opção:");
					
					System.out.println("1 - Somar dois números");
					System.out.println("2 - Somar três números");
					System.out.println("3 - Somar quatro números");
					System.out.println("4 - Somar cinco números");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usuário na variável de controle do laço

				break;
				
				case 2: // for 2 faça:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em variáveis auxiliares
					System.out.println("Informe os três números:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					numero3 = valor3.nextFloat();
					
					// mostramos o resultado da soma ao usuário
					System.out.println("A soma dos números informados é:" + Soma.somaTrêsValores(numero1,numero2,numero3));
					
					// solicitamos que o usuário escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova opção:");
					
					System.out.println("1 - Somar dois números");
					System.out.println("2 - Somar três números");
					System.out.println("3 - Somar quatro números");
					System.out.println("4 - Somar cinco números");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usuário na variável de controle do laço

				break;
				
				case 3: // for 3 faça:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em variáveis auxiliares
					System.out.println("Informe os quatros números:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					numero3 = valor3.nextFloat();
					numero4 = valor4.nextFloat();
					
					// mostramos o resultado da soma ao usuário
					System.out.println("A soma dos números informados é:" + Soma.somaQuatroValores(numero1,numero2,numero3,numero4));
					
					// solicitamos que o usuário escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova opção:");
					
					System.out.println("1 - Somar dois números");
					System.out.println("2 - Somar três números");
					System.out.println("3 - Somar quatro números");
					System.out.println("4 - Somar cinco números");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usuário na variável de controle do laço

				break;
				
				case 4: // for 4 faça:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em variáveis auxiliares
					System.out.println("Informe os cinco números:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					numero3 = valor3.nextFloat();
					numero4 = valor4.nextFloat();
					numero5 = valor5.nextFloat();
					
					// mostramos o resultado da soma ao usuário
					System.out.println("A soma dos números informados é:" + Soma.somaCincoValores(numero1,numero2,numero3,numero4,numero5));
					
					// solicitamos que o usuário escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova opção:");
					
					System.out.println("1 - Somar dois números");
					System.out.println("2 - Somar três números");
					System.out.println("3 - Somar quatro números");
					System.out.println("4 - Somar cinco números");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usuário na variável de controle do laço

				break;
				
				default: // se nenhuma das opções for escolhida faça:
					
					// pegamos o valor da nova opção e o armazenamos na variável de controle
					// do laço
					System.out.println("Opção inválida!"+"\n"+"Informe uma opção válida:");
					opcao = escolha.nextInt();
					
				break;
				
			} // fim do comando switch		
		
		} // fim do comando while
		
		// imprime na tela 108
		System.out.println(Soma.somaDoisValores(Soma.somaTrêsValores((int)2,(int)3,(int)4),(int)99));
		
	} // fim do método main
	
} // fim da classe PrincipalSoma