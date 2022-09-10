/**
 * 	A classe Teste testa alguns comandos e conceitos de POO em java.
 *  Os testes possuem como embasamento o livro texto do autor Rafael Santos
 *	@author Alisson Jaques 
 *
 * 
 * 
 * */
public class Teste {//declara a classe

	/**
	 * O m�todo main possu� comandos que auxiliam a compreens�o de conceitos de POO em java.
	 * @param argumentos os argumentos passados para o m�todo via linha de comando, 
	 * mas que neste caso ser�o ignorados. 
	 *  
	 * */
	public static void main(String[] argumentos) {
		
		double n = 120;
		double d = 17;
		System.out.println(n+" dividido por "+d+" � "+(n/d));
		System.out.println("O resto da divis�o � "+(n%d));
		System.out.println("7+2 = "+(7+2));
		
		String nome = 5+"+"+6+"i";
		System.out.println(nome);
	}
}
