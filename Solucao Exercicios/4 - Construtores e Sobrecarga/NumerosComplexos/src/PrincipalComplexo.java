/**
 * A classe PrincipalComplexo da exemplos de uso de objetos da classe NumeroComplexo.
 * Ela possu� um �nico m�todo, que o m�todo main, permitindo assim a execu��o da aplica��o.
 * @author Alisson Jaques
 *  
 * */
import java.util.Scanner;//importa��o de biblioteca que permite manipular a classe Scanner

public class PrincipalComplexo {//declara��o da classe

	/**
	 * O m�todo main permite a execu��o desta classe, ele cria v�rias inst�ncias da classe
	 * NumeroComplexo e da exemplos de seu uso.
	 * @param argumentos, os argumentos que podem ser passados ao m�todo via linha de comando
	 * mas que neste caso ser�o ignorados 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//declara��o de vari�veis auxiliares referentes a dois n�meros complexos a+bi e c+di
		double realA, realC, imaginarioB, imaginarioD;
		
		//solicitamos que o usu�rio digite as informa��es do primeiro n�mero complexo a+bi
		System.out.println("Informe a parte real e imagin�ria do primeiro n�mero complexo:");
		
		//atr�ves de inst�ncias da classe Scanner, e chamadas de m�todos da mesma, recebemos o conte�do informado pelo usu�rio
		//e os armazenamos nas vari�veis correspondentes
		Scanner real1 = new Scanner(System.in);
		realA = real1.nextDouble();
		Scanner imaginario1 = new Scanner(System.in);
		imaginarioB = imaginario1.nextDouble();
		
		//solicitamos que o usu�rio digite as informa��es do primeiro n�mero complexo c+di
		System.out.println("Informe a parte real e imagin�ria do segundo n�mero complexo:");
		
		//atr�ves de inst�ncias da classe Scanner, e chamadas de m�todos da mesma, recebemos o conte�do informado pelo usu�rio
		//e os armazenamos nas vari�veis correspondentes
		Scanner real2 = new Scanner(System.in);
		realC = real2.nextDouble();
		Scanner imaginario2 = new Scanner(System.in);
		imaginarioD = imaginario2.nextDouble();
		
		//criamos 4 inst�ncias da classe NumeroCommplexo, 4 n�meros complexos, manipulando os construtores dessa classe
		NumeroComplexo numero1 = new NumeroComplexo(realA,imaginarioB);
		NumeroComplexo numero2 = new NumeroComplexo(realC,imaginarioD);
		NumeroComplexo realPuro = new NumeroComplexo(realA);
		NumeroComplexo zero = new NumeroComplexo();
	
		//imprimimos na tela o cont�udo dos campos dos objetos formatados na forma a+bi
		System.out.println("O primeiro n�mero complexo informado foi: "+numero1);
		System.out.println("O segundo n�mero complexo informado foi: "+numero2);
		System.out.println("Um n�mero real puro �: "+realPuro);
		System.out.println("O n�mero "+zero+" tamb�m � um n�mero coplexo");
		
		//verificamos se os dois n�meros complexos informados s�o iguais
		if(numero1.�Igual(numero2)==true) {//se os n�meros informados forem iguais
			
			System.out.println("Os n�meros complexos informados s�o iguais!");//retorna mensagem: s�o iguais!
			
		}
		else {//sen�o
			
			System.out.println("Os n�meros complexos informados s�o diferentes!");//retorna mensagem: s�o diferentes!
			
		}
		//atrav�s de chamadas aos m�todos da classe NumeroComplexo pelas ref�ncias criadas imprimimos a soma, subtra��o, divis�o
		//e multiplica��o dos n�meros complexos informados pelo usu�rio
		System.out.println("A soma dos n�meros complexos �: "+numero1.somaComplexo(numero2));
		System.out.println("A subtra��o do primeiro n�mero complexo informado pelo segundo �: "+numero1.subtraiComplexo(numero2));
		System.out.println("A multiplica��o dos n�meros complexos �: "+numero1.multiplicaComplexo(numero2));
		System.out.println("A divis�o do primeiro n�mero complexo pelo segundo �: "+numero1.divideComplexo(numero2));
		System.out.println(realPuro+" * "+zero+" = "+realPuro.multiplicaComplexo(zero));
		
	}//fim do m�todo main
		
} // fim da classe PrincipalComplexo