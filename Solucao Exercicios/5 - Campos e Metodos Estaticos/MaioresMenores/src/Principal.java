/**
 *  A classe principal demonstra usos das classes EncontraMaior
 *  e MenorValor. Ela possu� apenas um m�todo, que � o m�todo main.
 *  
 *  @author Alisson Jaques
 * 
 * */
import java.util.Scanner; // importa��o do pacote que cont�m a classe Scanner,
						  // que � utilizada para obter dados fornecidos pelo usu�rio

public class Principal { // declara��o da classe
	
	/**
	 *  O m�todo main permite a execu��o dessa classe. Este 
	 *  m�todo demonstra usos das classes EncontraMaior e
	 *  MenorValor.
	 *  @param argumentos os argumentos que podem ser passados ao m�todo via linha
	 *  de comando, mas que nesse caso ser�o ignorados. 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		/**
		 *  Declara��o de vari�veis auxiliares
		 * 
		 * */
		int numero1, numero2, numero3, numero4, numero5; 							// vari�veis para n�meros inteiros
		double num1, num2, num3, num4, num5;										// vari�veis para n�meros reais
		int quantidade, escolha = 0, controlador = 0;                     			// vari�veis para controle
		
		// declaramos duas refer�ncias a inst�ncias da classe Scanner,
		// uma para obter dados inteiros informados pelo usu�rio, outra
		// para obter dados reais.
		Scanner numeroInteiro = new Scanner(System.in);
		Scanner numeroReal = new Scanner(System.in);
		
		// Solicitamos ao usu�rio uma escolha e armazenamos sua resposta em uma
		// vari�vel auxiliar
		System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
		System.out.println("Optando por 0 voc� escolhe sair.");
		Scanner desejo = new Scanner(System.in);
		quantidade = desejo.nextInt();
		
		if(quantidade==0) { // se a primeira escolhas for o valor 0
			
			System.out.println("Voc� saiu da aplica��o."); 						   // informe que o usu�rio optou por sair da aplica��o
			controlador = 1;													   // atribuia o valor 1 � vari�vel controlador
			
		}
		else { // sen�o
			
			// solicitamos ao usu�rio que escolha entre comparar n�meros 
			// reais ou comparar n�meros inteiros e armazenamos sua resposta
			// em uma vari�vel auxiliar
			System.out.println("Escolha uma das op��es abaixo:");
			System.out.println("1 - Para n�meros inteiros");
			System.out.println("2 - Para n�meros reais");
			Scanner opcao = new Scanner(System.in);
			escolha = opcao.nextInt();
	
		} // fim-se
		
		
		if(escolha==1) { // se a escolha for de comparar n�meros inteiros, fa�a:
		
			while(quantidade!=0) { // enquanto a quantidade informada for diferente de 0, fa�a:
				
				switch(quantidade) { // caso a quantidade
				
					case 1: // for 1, fa�a:
						
						// solicitamos ao usu�rio que informe o n�mero
						System.out.println("Informe o n�mero:");
						numero1 = numeroInteiro.nextInt();
						
						// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
						// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorUmNumero(numero1));
						System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(numero1));
						
						// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
						// a aplica��o (aqui s� ser�o feitas compara��es entre inteiros)
						System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 voc� escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
					
					case 2: // for 2, fa�a:
						
						// solicitamos ao usu�rio que informe os n�meros
						System.out.println("Informe os dois n�meros:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						
						// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
						// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreDoisNumeros(numero1,numero2));
						System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(numero1,numero2));
						
						// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
						// a aplica��o (aqui s� ser�o feitas compara��es entre inteiros)
						System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 voc� escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
					
					case 3: // for 3, fa�a:
						
						// solicitamos ao usu�rio que informe os n�meros
						System.out.println("Informe os tr�s n�meros:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						numero3 = numeroInteiro.nextInt();
						
						// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
						// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreTresNumeros(numero1,numero2,numero3));
						System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(numero1,numero2,numero3));
						
						// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
						// a aplica��o (aqui s� ser�o feitas compara��es entre inteiros)
						System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 voc� escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
					
					case 4: // for 4, fa�a:
						
						// solicitamos ao usu�rio que informe os n�meros
						System.out.println("Informe os quatro n�meros:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						numero3 = numeroInteiro.nextInt();
						numero4 = numeroInteiro.nextInt();
						
						// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
						// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreQuatroNumeros(numero1,numero2,numero3,numero4));
						System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(numero1,numero2,numero3,numero4));
						
						// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
						// a aplica��o (aqui s� ser�o feitas compara��es entre inteiros)
						System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 voc� escolhe sair.");
						quantidade = desejo.nextInt();
					
						break;
						
					case 5: // for 5, fa�a:
						
						// solicitamos ao usu�rio que informe os n�meros
						System.out.println("Informe os cinco n�meros:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						numero3 = numeroInteiro.nextInt();
						numero4 = numeroInteiro.nextInt();
						numero5 = numeroInteiro.nextInt();
						
						// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
						// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreCincoNumeros(numero1,numero2,numero3,numero4,numero5));
						System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(numero1,numero2,numero3,numero4,numero5));
						
						// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
						// a aplica��o (aqui s� ser�o feitas compara��es entre inteiros)
						System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 voc� escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
						
					default: // n�o for nenhum dos valores anteriores, fa�a:
						
						// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
						// a aplica��o (aqui s� ser�o feitas compara��es entre inteiros)
						System.out.println("Informe uma quantidade v�lida: (0 a 5)");
						System.out.println("Optando por 0 voc� escolhe sair.");
						quantidade = desejo.nextInt();
						
				} // fim do switch
												
			} // fim do while		
			
		}
		else { // sen�o
			
			if(escolha==2) { // se a escolha for de comparar n�meros reais, fa�a:
				
				while(quantidade!=0) {
			
					switch(quantidade) { // caso quantidade
				
						case 1: // for 1, fa�a:
					
							// solicitamos ao usu�rio que informe o n�mero
							System.out.println("Informe o n�mero:");
							num1 = numeroReal.nextDouble();
					
							// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
							// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorUmNumero(num1));
							System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(num1));
					
							// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
							// a aplica��o (aqui s� ser�o feitas compara��es entre reais)
							System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 voc� escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
				
						case 2: // for 2, fa�a:
					
							// solicitamos ao usu�rio que informe os n�meros
							System.out.println("Informe os dois n�meros:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
					
							// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
							// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreDoisNumeros(num1,num2));
							System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(num1,num2));
					
							// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
							// a aplica��o (aqui s� ser�o feitas compara��es entre reais)
							System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 voc� escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
				
						case 3: // for 3, fa�a:
					
							// solicitamos ao usu�rio que informe os n�meros
							System.out.println("Informe os tr�s n�meros:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
							num3 = numeroReal.nextDouble();
					
							// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
							// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreTresNumeros(num1,num2,num3));
							System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(num1,num2,num3));
					
							// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
							// a aplica��o (aqui s� ser�o feitas compara��es entre reais)
							System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 voc� escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
				
						case 4: // for 4, fa�a:
					
							// solicitamos ao usu�rio que informe os n�meros
							System.out.println("Informe os quatro n�meros:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
							num3 = numeroReal.nextDouble();
							num4 = numeroReal.nextDouble();
					
							// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
							// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreQuatroNumeros(num1,num2,num3,num4));
							System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(num1,num2,num3,num4));
					
							// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
							// a aplica��o (aqui s� ser�o feitas compara��es entre reais)
							System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 voc� escolhe sair.");
							quantidade = desejo.nextInt();
				
							break;
					
						case 5: // for 5, fa�a:
					
							// solicitamos ao usu�rio que informe os n�meros
							System.out.println("Informe os cinco n�meros:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
							num3 = numeroReal.nextDouble();
							num4 = numeroReal.nextDouble();
							num5 = numeroReal.nextDouble();
					
							// mostramos ao usu�rio o maior e o menor n�mero da sequ�ncia tendo como
							// aux�lio chamadas aos m�todos est�ticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior n�mero da sequ�ncia: " + EncontraMaior.maiorEntreCincoNumeros(num1,num2,num3,num4,num5));
							System.out.println("Menor n�mero da sequ�ncia: " + MenorValor.menorValor(num1,num2,num3,num4,num5));
					
							// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
							// a aplica��o (aqui s� ser�o feitas compara��es entre reais)
							System.out.println("Quantos n�meros deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 voc� escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
					
						default: // n�o for nenhuma das op��es anteriores, fa�a:
					
							// reniciamos a plica��o, solicitando que o usu�rio escolha entre continuar ou encerrar
							// a aplica��o (aqui s� ser�o feitas compara��es entre reais)
							System.out.println("Informe uma quantidade v�lida: (0 a 5)");
							System.out.println("Optando por 0 voc� escolhe sair.");
							quantidade = desejo.nextInt();
					
					} // fim do switch
					
				} // fim do while
				
			}
			else { // sen�o (a pessoa informar um n�mero diferente de 1 ou 2)
				
				if(controlador==0) { // se a primeira op��o da pessoa n�o for sair da aplica��o
					
					// informamos � pessoa que ela escolheu comparar n�meros, mas n�o escolheu
					// um conjunto adequado
					System.out.println("Conjunto n�o informado, aplica��o encerrada.");
				
				} // fim-se
				
			} // fim-se
		
		} // fim-se
				
		if(quantidade==0 && controlador==0) { // se a primeira op��o da pessoa foi sair da aplica��o
			
			// informamos que a aplica��o encerrou
			System.out.println("Voc� saiu da aplica��o.");
			
		} // fim-se
	
	} // fim do m�todo main		
	
} // fim da classe Principal