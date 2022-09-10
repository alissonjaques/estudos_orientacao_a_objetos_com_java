/**
 *  A classe principal demonstra usos das classes EncontraMaior
 *  e MenorValor. Ela possuí apenas um método, que é o método main.
 *  
 *  @author Alisson Jaques
 * 
 * */
import java.util.Scanner; // importação do pacote que contém a classe Scanner,
						  // que é utilizada para obter dados fornecidos pelo usuário

public class Principal { // declaração da classe
	
	/**
	 *  O método main permite a execução dessa classe. Este 
	 *  método demonstra usos das classes EncontraMaior e
	 *  MenorValor.
	 *  @param argumentos os argumentos que podem ser passados ao método via linha
	 *  de comando, mas que nesse caso serão ignorados. 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		/**
		 *  Declaração de variáveis auxiliares
		 * 
		 * */
		int numero1, numero2, numero3, numero4, numero5; 							// variáveis para números inteiros
		double num1, num2, num3, num4, num5;										// variáveis para números reais
		int quantidade, escolha = 0, controlador = 0;                     			// variáveis para controle
		
		// declaramos duas referências a instâncias da classe Scanner,
		// uma para obter dados inteiros informados pelo usuário, outra
		// para obter dados reais.
		Scanner numeroInteiro = new Scanner(System.in);
		Scanner numeroReal = new Scanner(System.in);
		
		// Solicitamos ao usuário uma escolha e armazenamos sua resposta em uma
		// variável auxiliar
		System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
		System.out.println("Optando por 0 você escolhe sair.");
		Scanner desejo = new Scanner(System.in);
		quantidade = desejo.nextInt();
		
		if(quantidade==0) { // se a primeira escolhas for o valor 0
			
			System.out.println("Você saiu da aplicação."); 						   // informe que o usuário optou por sair da aplicação
			controlador = 1;													   // atribuia o valor 1 à variável controlador
			
		}
		else { // senão
			
			// solicitamos ao usuário que escolha entre comparar números 
			// reais ou comparar números inteiros e armazenamos sua resposta
			// em uma variável auxiliar
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Para números inteiros");
			System.out.println("2 - Para números reais");
			Scanner opcao = new Scanner(System.in);
			escolha = opcao.nextInt();
	
		} // fim-se
		
		
		if(escolha==1) { // se a escolha for de comparar números inteiros, faça:
		
			while(quantidade!=0) { // enquanto a quantidade informada for diferente de 0, faça:
				
				switch(quantidade) { // caso a quantidade
				
					case 1: // for 1, faça:
						
						// solicitamos ao usuário que informe o número
						System.out.println("Informe o número:");
						numero1 = numeroInteiro.nextInt();
						
						// mostramos ao usuário o maior e o menor número da sequência tendo como
						// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior número da sequência: " + EncontraMaior.maiorUmNumero(numero1));
						System.out.println("Menor número da sequência: " + MenorValor.menorValor(numero1));
						
						// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
						// a aplicação (aqui só serão feitas comparações entre inteiros)
						System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 você escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
					
					case 2: // for 2, faça:
						
						// solicitamos ao usuário que informe os números
						System.out.println("Informe os dois números:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						
						// mostramos ao usuário o maior e o menor número da sequência tendo como
						// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreDoisNumeros(numero1,numero2));
						System.out.println("Menor número da sequência: " + MenorValor.menorValor(numero1,numero2));
						
						// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
						// a aplicação (aqui só serão feitas comparações entre inteiros)
						System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 você escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
					
					case 3: // for 3, faça:
						
						// solicitamos ao usuário que informe os números
						System.out.println("Informe os três números:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						numero3 = numeroInteiro.nextInt();
						
						// mostramos ao usuário o maior e o menor número da sequência tendo como
						// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreTresNumeros(numero1,numero2,numero3));
						System.out.println("Menor número da sequência: " + MenorValor.menorValor(numero1,numero2,numero3));
						
						// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
						// a aplicação (aqui só serão feitas comparações entre inteiros)
						System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 você escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
					
					case 4: // for 4, faça:
						
						// solicitamos ao usuário que informe os números
						System.out.println("Informe os quatro números:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						numero3 = numeroInteiro.nextInt();
						numero4 = numeroInteiro.nextInt();
						
						// mostramos ao usuário o maior e o menor número da sequência tendo como
						// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreQuatroNumeros(numero1,numero2,numero3,numero4));
						System.out.println("Menor número da sequência: " + MenorValor.menorValor(numero1,numero2,numero3,numero4));
						
						// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
						// a aplicação (aqui só serão feitas comparações entre inteiros)
						System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 você escolhe sair.");
						quantidade = desejo.nextInt();
					
						break;
						
					case 5: // for 5, faça:
						
						// solicitamos ao usuário que informe os números
						System.out.println("Informe os cinco números:");
						numero1 = numeroInteiro.nextInt();
						numero2 = numeroInteiro.nextInt();
						numero3 = numeroInteiro.nextInt();
						numero4 = numeroInteiro.nextInt();
						numero5 = numeroInteiro.nextInt();
						
						// mostramos ao usuário o maior e o menor número da sequência tendo como
						// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
						// MenorValor
						System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreCincoNumeros(numero1,numero2,numero3,numero4,numero5));
						System.out.println("Menor número da sequência: " + MenorValor.menorValor(numero1,numero2,numero3,numero4,numero5));
						
						// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
						// a aplicação (aqui só serão feitas comparações entre inteiros)
						System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
						System.out.println("Optando por 0 você escolhe sair.");
						quantidade = desejo.nextInt();
						
						break;
						
					default: // não for nenhum dos valores anteriores, faça:
						
						// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
						// a aplicação (aqui só serão feitas comparações entre inteiros)
						System.out.println("Informe uma quantidade válida: (0 a 5)");
						System.out.println("Optando por 0 você escolhe sair.");
						quantidade = desejo.nextInt();
						
				} // fim do switch
												
			} // fim do while		
			
		}
		else { // senão
			
			if(escolha==2) { // se a escolha for de comparar números reais, faça:
				
				while(quantidade!=0) {
			
					switch(quantidade) { // caso quantidade
				
						case 1: // for 1, faça:
					
							// solicitamos ao usuário que informe o número
							System.out.println("Informe o número:");
							num1 = numeroReal.nextDouble();
					
							// mostramos ao usuário o maior e o menor número da sequência tendo como
							// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior número da sequência: " + EncontraMaior.maiorUmNumero(num1));
							System.out.println("Menor número da sequência: " + MenorValor.menorValor(num1));
					
							// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
							// a aplicação (aqui só serão feitas comparações entre reais)
							System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 você escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
				
						case 2: // for 2, faça:
					
							// solicitamos ao usuário que informe os números
							System.out.println("Informe os dois números:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
					
							// mostramos ao usuário o maior e o menor número da sequência tendo como
							// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreDoisNumeros(num1,num2));
							System.out.println("Menor número da sequência: " + MenorValor.menorValor(num1,num2));
					
							// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
							// a aplicação (aqui só serão feitas comparações entre reais)
							System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 você escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
				
						case 3: // for 3, faça:
					
							// solicitamos ao usuário que informe os números
							System.out.println("Informe os três números:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
							num3 = numeroReal.nextDouble();
					
							// mostramos ao usuário o maior e o menor número da sequência tendo como
							// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreTresNumeros(num1,num2,num3));
							System.out.println("Menor número da sequência: " + MenorValor.menorValor(num1,num2,num3));
					
							// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
							// a aplicação (aqui só serão feitas comparações entre reais)
							System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 você escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
				
						case 4: // for 4, faça:
					
							// solicitamos ao usuário que informe os números
							System.out.println("Informe os quatro números:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
							num3 = numeroReal.nextDouble();
							num4 = numeroReal.nextDouble();
					
							// mostramos ao usuário o maior e o menor número da sequência tendo como
							// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreQuatroNumeros(num1,num2,num3,num4));
							System.out.println("Menor número da sequência: " + MenorValor.menorValor(num1,num2,num3,num4));
					
							// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
							// a aplicação (aqui só serão feitas comparações entre reais)
							System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 você escolhe sair.");
							quantidade = desejo.nextInt();
				
							break;
					
						case 5: // for 5, faça:
					
							// solicitamos ao usuário que informe os números
							System.out.println("Informe os cinco números:");
							num1 = numeroReal.nextDouble();
							num2 = numeroReal.nextDouble();
							num3 = numeroReal.nextDouble();
							num4 = numeroReal.nextDouble();
							num5 = numeroReal.nextDouble();
					
							// mostramos ao usuário o maior e o menor número da sequência tendo como
							// auxílio chamadas aos métodos estáticos das classes EncontraMaior e
							// MenorValor
							System.out.println("Maior número da sequência: " + EncontraMaior.maiorEntreCincoNumeros(num1,num2,num3,num4,num5));
							System.out.println("Menor número da sequência: " + MenorValor.menorValor(num1,num2,num3,num4,num5));
					
							// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
							// a aplicação (aqui só serão feitas comparações entre reais)
							System.out.println("Quantos números deseja informar? (Escolher entre 0 a 5)");
							System.out.println("Optando por 0 você escolhe sair.");
							quantidade = desejo.nextInt();
					
							break;
					
						default: // não for nenhuma das opções anteriores, faça:
					
							// reniciamos a plicação, solicitando que o usuário escolha entre continuar ou encerrar
							// a aplicação (aqui só serão feitas comparações entre reais)
							System.out.println("Informe uma quantidade válida: (0 a 5)");
							System.out.println("Optando por 0 você escolhe sair.");
							quantidade = desejo.nextInt();
					
					} // fim do switch
					
				} // fim do while
				
			}
			else { // senão (a pessoa informar um número diferente de 1 ou 2)
				
				if(controlador==0) { // se a primeira opção da pessoa não for sair da aplicação
					
					// informamos à pessoa que ela escolheu comparar números, mas não escolheu
					// um conjunto adequado
					System.out.println("Conjunto não informado, aplicação encerrada.");
				
				} // fim-se
				
			} // fim-se
		
		} // fim-se
				
		if(quantidade==0 && controlador==0) { // se a primeira opção da pessoa foi sair da aplicação
			
			// informamos que a aplicação encerrou
			System.out.println("Você saiu da aplicação.");
			
		} // fim-se
	
	} // fim do método main		
	
} // fim da classe Principal