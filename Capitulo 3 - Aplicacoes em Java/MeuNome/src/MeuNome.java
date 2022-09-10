import java.util.Scanner; //importa a classe Scanner, que permite armazenamento de dados em java

/**
 * A classe MeuNome � uma classe simples que l� um nome fornecido pelo usu�rio e o imprimi.
 * @author Alisson Jaques
 *  
 * */

public class MeuNome {//declara��o da classe
	/**
	 * A classe MeuNome possu� apenas um m�todo, que � o m�todo main. Esse m�todo permite a execu��o dessa
	 * classe.
	 * @param argumentos os agurmentos que podem ser passados para o m�todo via linha de comando, mas que
	 * neste caso ser�o ignorados
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//Imprimi uma mensagem que solicita o nome do usu�rio
		System.out.println("Informe seu nome: ");
		//Declara��o de uma refer�ncia para uma inst�ncia da classe Scanner
		Scanner scan = new Scanner(System.in);
		//A refer�ncia nome recebe o conte�do fornecido pelo usu�rio
		String nome = scan.nextLine();
		//O nome fornecido pelo usu�rio � impresso na tela com uma mensagem
		System.out.println(nome+" � uma pessoa esfor�ada.");
	}//fim do m�todo main
	
}//fim da classe MeuNome
