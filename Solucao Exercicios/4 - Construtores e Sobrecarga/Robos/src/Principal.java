/**
 *  A classe principal possu� apenas um m�todo, que � o m�todo main. Este m�todo permite a execu��o dessa classe.
 *  Nesta classe s�o criadas inst�ncias da classe RoboSimples e exemplos de usos da mesmas.
 * 	
 *  @author Alisson Jaques 
 *  
 * */

import java.util.Scanner; // importa��o do classe Scanner para manipula��o de dados, fornecidos pelo usu�rio ao digitar no teclado

public class Principal { // declara��o da classe

	/**
	 *  O m�todo main permite a execu��o dessa classe e mostra exemplos de usos da classe RoboSimples.
	 *  @param argumentos os argumentos que podem ser passados ao m�todo via linha de comando, mas que neste caso
	 *  ser�o ignorados.
	 * 
	 * */
	public static void main(String[] argumentos)throws Exception{
		
		// declara��o de vari�veis auxiliares
		String nome;
		int x, y;
		char direcao;
		
		// solicitamos ao usu�rio que digite um nome para o rob� e guardamos o dado fornecido em uma vari�vel auxiliar de tipo correspondente
		System.out.print("Informe o nome do rob�: ");
		Scanner nomeInformado = new Scanner(System.in);
		nome = nomeInformado.nextLine();
		System.out.println();
		
		// solicitamos ao usu�rio que informe a localiza��o atual do rob� e guardamos os dados fornecidos em vari�veis auxiliares de tipos correspondentes
		System.out.println("Informe a localiza��o do rob� (n�mero inteiro):");
		System.out.print("Posi��o x: ");
		Scanner posicaoX = new Scanner(System.in);
		x = posicaoX.nextInt();
		System.out.println(); // quebra de linha para melhor organiza��o dos dados no terminal
		
		System.out.print("Posi��o y: ");
		Scanner posicaoY = new Scanner(System.in);
		y = posicaoX.nextInt();
		System.out.println();
		
		// solicitamos que o usu�rio informe a dire��o atual do rob� e armazemos esse dado em uma vari�vel auxiliar de tipo correspondente
		System.out.println("Informe a dire��o do rob� (Norte = N, Sul = S, Leste = L, Oeste = O): ");
		direcao = (char)System.in.read(); // O retorno do m�todo read (inteiro) � transformado em um caracter correspondente e atribu�do � vari�vel auxiliar direcao (char)
		System.out.println();
		
		//criamos tr�s refer�ncias � inst�ncias da classe RoboSimples, fornecendo argumentos para as inst�ncia a fim de acionar construtores espec�ficos dessa classe
		RoboSimples c3po = new RoboSimples(nome,x,y,direcao); // aciona o construtor RoboSimples(String,int,int,char)
		RoboSimples r2d2 = new RoboSimples("R2D2"); // aciona o construtor RoboSimples(String)
		RoboSimples legion = new RoboSimples();    // aciona o construtor default RoboSimples()
		
		//v�rias chamadas a m�todos da classe RoboSimples
		c3po.move();
		r2d2.move(53);
		legion.move(1);
		legion.moveParaTras();
		r2d2.moveParaTras(53);
		
		legion.mudaDire��o('O');
		c3po.mudaDire��o('S');
		
		// utilzando o comando de sa�da de dados e o m�todo toString da classe RoboSimples mostramos os campos dos objetos formatados
		System.out.println(c3po);
		System.out.println(r2d2);
		System.out.println(legion);		
		
	} // fim do m�todo main
	
} // fim da classe Principal
