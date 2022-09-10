/**
 *  A classe principal possuí apenas um método, que é o método main. Este método permite a execução dessa classe.
 *  Nesta classe são criadas instâncias da classe RoboSimples e exemplos de usos da mesmas.
 * 	
 *  @author Alisson Jaques 
 *  
 * */

import java.util.Scanner; // importação do classe Scanner para manipulação de dados, fornecidos pelo usuário ao digitar no teclado

public class Principal { // declaração da classe

	/**
	 *  O método main permite a execução dessa classe e mostra exemplos de usos da classe RoboSimples.
	 *  @param argumentos os argumentos que podem ser passados ao método via linha de comando, mas que neste caso
	 *  serão ignorados.
	 * 
	 * */
	public static void main(String[] argumentos)throws Exception{
		
		// declaração de variáveis auxiliares
		String nome;
		int x, y;
		char direcao;
		
		// solicitamos ao usuário que digite um nome para o robô e guardamos o dado fornecido em uma variável auxiliar de tipo correspondente
		System.out.print("Informe o nome do robô: ");
		Scanner nomeInformado = new Scanner(System.in);
		nome = nomeInformado.nextLine();
		System.out.println();
		
		// solicitamos ao usuário que informe a localização atual do robô e guardamos os dados fornecidos em variáveis auxiliares de tipos correspondentes
		System.out.println("Informe a localização do robô (número inteiro):");
		System.out.print("Posição x: ");
		Scanner posicaoX = new Scanner(System.in);
		x = posicaoX.nextInt();
		System.out.println(); // quebra de linha para melhor organização dos dados no terminal
		
		System.out.print("Posição y: ");
		Scanner posicaoY = new Scanner(System.in);
		y = posicaoX.nextInt();
		System.out.println();
		
		// solicitamos que o usuário informe a direção atual do robô e armazemos esse dado em uma variável auxiliar de tipo correspondente
		System.out.println("Informe a direção do robô (Norte = N, Sul = S, Leste = L, Oeste = O): ");
		direcao = (char)System.in.read(); // O retorno do método read (inteiro) é transformado em um caracter correspondente e atribuído à variável auxiliar direcao (char)
		System.out.println();
		
		//criamos três referências à instâncias da classe RoboSimples, fornecendo argumentos para as instância a fim de acionar construtores específicos dessa classe
		RoboSimples c3po = new RoboSimples(nome,x,y,direcao); // aciona o construtor RoboSimples(String,int,int,char)
		RoboSimples r2d2 = new RoboSimples("R2D2"); // aciona o construtor RoboSimples(String)
		RoboSimples legion = new RoboSimples();    // aciona o construtor default RoboSimples()
		
		//várias chamadas a métodos da classe RoboSimples
		c3po.move();
		r2d2.move(53);
		legion.move(1);
		legion.moveParaTras();
		r2d2.moveParaTras(53);
		
		legion.mudaDireção('O');
		c3po.mudaDireção('S');
		
		// utilzando o comando de saída de dados e o método toString da classe RoboSimples mostramos os campos dos objetos formatados
		System.out.println(c3po);
		System.out.println(r2d2);
		System.out.println(legion);		
		
	} // fim do método main
	
} // fim da classe Principal
