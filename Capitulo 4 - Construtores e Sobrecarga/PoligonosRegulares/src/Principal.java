/**
 * A classe Principal possu� apenas um m�todo, que � o m�todo main, ela demonstra usos da classe PoligonoRegular.
 * @author Alisson Jaques
 * 
 * 
 * */

import java.util.Scanner; //importa��o do biblioteca para utiliza��o da classe Scanner
//import java.io.PrintStream;

public class Principal {//declara��o da classe

	/**
	 * O m�todo main permite a execu��o dessa classe, ele possu� estruturas que d�o exemplos de uso da classe PoligonoRegular.
	 * @param argumentos os argumentos que podem ser passados para o m�todo via linha de comando, mas que nesse caso ser�o ignorados 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//declara��o de vari�veis auxiliares
		byte ladosP;
		double comprimentoLado,area;
		
		//Solicita ao usu�rio que informe o n�mero de lados do pol�gono
		System.out.println("Informe a quantidade de lados do pol�gono (intervalo entre 4 e 10, incluindo estes):");
		//criamos uma ref�ncia para uma inst�ncia da classe Scanner
		Scanner numero = new Scanner(System.in);
		//utilizamos a vari�vel auxiliar para receber o conte�do do m�todo chamado pela refer�ncia acima (guardamos o valor digitado pelo usu�rio na vari�vel auxiliar)
		ladosP = numero.nextByte();
		
		//garantimos com um la�o, que o usu�rio nos informe um pol�gono com lados entre 4 e 10, incluindo estes
		while(ladosP<4 || ladosP>10) {//enquanto os lados n�o estiverem no intervalo desejado fa�a
			
			System.out.println("Informe um valor v�lido!"); //informe ao usu�rio que os dados n�o est�o corretos
			ladosP = numero.nextByte(); //pegue um novo dado e armazene novamente na vari�vel auxiliar
			
		}
		
		//solicitamos que o usu�rio informe o comprimento do lado do pol�gono
		System.out.println("Informe o comprimento de um dos lados do pol�gono:");
		//criamos uma ref�ncia para uma inst�ncia da classe Scanner
		Scanner comprimento = new Scanner(System.in);
		//utilizamos a vari�vel auxiliar para receber o conte�do do m�todo chamado pela refer�ncia acima (guardamos o valor digitado pelo usu�rio na vari�vel auxiliar)
		comprimentoLado = comprimento.nextDouble();
		
		//criamos v�rias referencias a inst�ncias da classe PoligoRegular
		PoligonoRegular umPoligono = new PoligonoRegular(ladosP,comprimentoLado);
		PoligonoRegular pentagono = new PoligonoRegular((byte)5,(double)4);
		PoligonoRegular trianguloEquilateroUnitario = new PoligonoRegular();
		PoligonoRegular triangulo = new PoligonoRegular((double)comprimentoLado);
		PoligonoRegular poligonoUnitario = new PoligonoRegular((byte)ladosP);
		
		//verificamos se o pol�gono passado pelo usu�rio � igual a um passado diretamente por n�s
		if(umPoligono.�Igual(pentagono)==true) {//se os pol�gonos forem iguais
			
			System.out.println("Os pol�gonos s�o iguais!");//imprima s�o iguais
			
		}
		else {//sen�o
			
			System.out.println("Os pol�gonos s�o diferentes!");//imprima s�o diferentes
			
		}
		
		/**
		PrintStream printStream = System.out;
		
		printStream.println("A �rea do pol�gono informado �: "+ umPoligono.calculaArea());
		
		*/
		
		//v�rias informa��es sobre os objetos s�o informadas na tela atrav�s de chamadas a seus m�todos
		System.out.println("A �rea do pol�gono informado �: " + umPoligono.calculaArea());
		System.out.println("A �rea do pol�gono n�o informado �: " + pentagono.calculaArea());
		System.out.println("O n�mero de diagonais do pol�gono infomado �:"+umPoligono.calculaNumeroDiagonais());
		System.out.println("O n�mero de diagonais do pol�gono n�o infomado �:" + pentagono.calculaNumeroDiagonais());
		System.out.println("O nome do pol�gono infomado �: " + umPoligono);
		System.out.println("O nome do pol�gono n�o infomado �: " + pentagono);
		
		System.out.println(trianguloEquilateroUnitario);
		System.out.println(triangulo);
		System.out.println(poligonoUnitario);
		
	} // fim do m�todo main
		
} // fim da classe Principal
