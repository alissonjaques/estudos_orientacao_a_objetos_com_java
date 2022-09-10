/**
	A classe PrincipalSoma demonstra exemplos de uso da classe
	Soma (uma biblioteca de m�todos). Ela possu� um �nico m�todo,
	que � o m�todo main, este m�todo permite a execu��o dessa 
	classe.
	
	@author Alisson Jaques
	
*/

import java.util.Scanner; // importa��o da classe Scanner, esta classe possu� m�todos
						  // para entradas de dados pelo usu�rio (via teclado)

public class PrincipalSoma{ // declara��o da classe
	
	/**
		O m�todo main permite a execu��o dessa classe e da
		exemplos de uso da biblioteca de m�todos Soma.
		@param argumentos os argumentos que podem ser passados ao 
		m�todo via linha de comando, mas que nesse caso ser�o ignorados.	
		
	*/
	public static void main(String[] argumentos){
		
		// declara��o de vari�veis auxiliares
		int opcao;
		
		float numero1, numero2, numero3, numero4, numero5;
		
		// criamos v�rias refer�ncias a inst�ncias da classe Scanner
		// para podermos pegar os valores num�ricos fornecisdos pelo usu�rio
		Scanner valor1 = new Scanner(System.in);
		Scanner valor2 = new Scanner(System.in);
		Scanner valor3 = new Scanner(System.in);
		Scanner valor4 = new Scanner(System.in);
		Scanner valor5 = new Scanner(System.in);
		
		// Menu que pedi ao usu�rio a escolha de uma op��o
		System.out.println("Escolha uma das seguintes op��es:");
		System.out.println("1 - Somar dois n�meros");               // a op��o que soma dois n�meros
		System.out.println("2 - Somar tr�s n�meros");               // a op��o que soma tr�s n�meros
		System.out.println("3 - Somar quatro n�meros");             // a op��o que soma quatro n�meros
		System.out.println("4 - Somar cinco n�meros");              // a op��o que soma cinco n�meros
		System.out.println("5 - Sair");
		
		// criamos uma refer�ncia a uma inst�ncia da classe Scanner
		// relativa � escolha do usu�rio
		Scanner escolha = new Scanner(System.in);
		
		/* 
			atrav�s do m�todo nextInt() da classe Scanner 
			atribu�mos o valor inteiro fornecido pelo usu�rio
			� vari�vel auxiliar opcao
			
		*/ 
		
		opcao = escolha.nextInt();
		
		/**
			
			O comando com pr� condi��o while permite que o usu�rio
			encontre diversas somas, contanto que ele informe campos
			v�lidos. Caso o usu�rio digite o n�mero 5 (sair) os blocos
			de execu��o do comando n�o ser�o mais executados e o programa
			seguir� seu caminho natural.	
		
		
		*/
		while(opcao!=5){ // enquanto usu�rio n�o digitar a op��o 5 (sair) fa�a:
			
			switch(opcao){ // quando opcao
				
				case 1: // for 1 fa�a:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em vari�veis auxiliares
					System.out.println("Informe os dois n�meros:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					
					// mostramos o resultado da soma ao usu�rio
					System.out.println("A soma dos n�meros informados �:" + Soma.somaDoisValores(numero1,numero2));
					
					// solicitamos que o usu�rio escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova op��o:");
					
					System.out.println("1 - Somar dois n�meros");
					System.out.println("2 - Somar tr�s n�meros");
					System.out.println("3 - Somar quatro n�meros");
					System.out.println("4 - Somar cinco n�meros");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usu�rio na vari�vel de controle do la�o

				break;
				
				case 2: // for 2 fa�a:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em vari�veis auxiliares
					System.out.println("Informe os tr�s n�meros:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					numero3 = valor3.nextFloat();
					
					// mostramos o resultado da soma ao usu�rio
					System.out.println("A soma dos n�meros informados �:" + Soma.somaTr�sValores(numero1,numero2,numero3));
					
					// solicitamos que o usu�rio escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova op��o:");
					
					System.out.println("1 - Somar dois n�meros");
					System.out.println("2 - Somar tr�s n�meros");
					System.out.println("3 - Somar quatro n�meros");
					System.out.println("4 - Somar cinco n�meros");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usu�rio na vari�vel de controle do la�o

				break;
				
				case 3: // for 3 fa�a:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em vari�veis auxiliares
					System.out.println("Informe os quatros n�meros:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					numero3 = valor3.nextFloat();
					numero4 = valor4.nextFloat();
					
					// mostramos o resultado da soma ao usu�rio
					System.out.println("A soma dos n�meros informados �:" + Soma.somaQuatroValores(numero1,numero2,numero3,numero4));
					
					// solicitamos que o usu�rio escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova op��o:");
					
					System.out.println("1 - Somar dois n�meros");
					System.out.println("2 - Somar tr�s n�meros");
					System.out.println("3 - Somar quatro n�meros");
					System.out.println("4 - Somar cinco n�meros");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usu�rio na vari�vel de controle do la�o

				break;
				
				case 4: // for 4 fa�a:
					
					// pegamos os valores das parcelas da soma e os armazenamos
					// em vari�veis auxiliares
					System.out.println("Informe os cinco n�meros:");
					numero1 = valor1.nextFloat();
					numero2 = valor2.nextFloat();
					numero3 = valor3.nextFloat();
					numero4 = valor4.nextFloat();
					numero5 = valor5.nextFloat();
					
					// mostramos o resultado da soma ao usu�rio
					System.out.println("A soma dos n�meros informados �:" + Soma.somaCincoValores(numero1,numero2,numero3,numero4,numero5));
					
					// solicitamos que o usu�rio escolha entre continuar ou sair do sistema
					System.out.println("Informe uma nova op��o:");
					
					System.out.println("1 - Somar dois n�meros");
					System.out.println("2 - Somar tr�s n�meros");
					System.out.println("3 - Somar quatro n�meros");
					System.out.println("4 - Somar cinco n�meros");
					System.out.println("5 - Sair");
					opcao = escolha.nextInt(); // armazenamos o valor fornecido pelo usu�rio na vari�vel de controle do la�o

				break;
				
				default: // se nenhuma das op��es for escolhida fa�a:
					
					// pegamos o valor da nova op��o e o armazenamos na vari�vel de controle
					// do la�o
					System.out.println("Op��o inv�lida!"+"\n"+"Informe uma op��o v�lida:");
					opcao = escolha.nextInt();
					
				break;
				
			} // fim do comando switch		
		
		} // fim do comando while
		
		// imprime na tela 108
		System.out.println(Soma.somaDoisValores(Soma.somaTr�sValores((int)2,(int)3,(int)4),(int)99));
		
	} // fim do m�todo main
	
} // fim da classe PrincipalSoma