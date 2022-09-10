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
	 * O método main possuí comandos que auxiliam a compreensão de conceitos de POO em java.
	 * @param argumentos os argumentos passados para o método via linha de comando, 
	 * mas que neste caso serão ignorados. 
	 *  
	 * */
	public static void main(String[] argumentos) {
		
		double n = 120;
		double d = 17;
		System.out.println(n+" dividido por "+d+" é "+(n/d));
		System.out.println("O resto da divisão é "+(n%d));
		System.out.println("7+2 = "+(7+2));
		
		String nome = 5+"+"+6+"i";
		System.out.println(nome);
	}
}
