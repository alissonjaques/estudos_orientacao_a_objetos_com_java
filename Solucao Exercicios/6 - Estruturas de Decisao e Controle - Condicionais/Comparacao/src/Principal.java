/**
 *  A classe Principal tem um �nico m�todo, o m�todo main, que
 *  permite sua execu��o. Ela demonstra usos da classe Comparavel.
 *  
 *  @author Alisson Jaques 
 * 
 * */
public class Principal { // declara��o da classe
	
	/**
	 * O m�todo main, que permite a execu��o dessa classe e mostra
	 * usos da classe Comparavel.
	 * @param args os argumentos que podem ser passados ao m�todo
	 * via linha de comando, mas que nesse caso ser�o ignorados. 
	 * 
	 * */
	public static void main(String args[]) {
		
		/*
		 * V�rios objetos s�o criados, note que para o construtor s�o
		 * passados argumentos que envolvem express�es matem�ticas (que
		 * manipulam o conte�do de outros objetos).
		 * 
		 * */
		Comparavel valor1 = new Comparavel(125);
		Comparavel valor2 = new Comparavel(valor1.retornaValor()-25);
		Comparavel valor3 = new Comparavel(valor2.retornaValor()%2);
		Comparavel valor4 = new Comparavel(); // aciona o construtor default
		Comparavel valor5 = new Comparavel(valor1.retornaValor()+valor2.retornaValor());
		Comparavel valor6 = new Comparavel(564.2);
		Comparavel valor7 = new Comparavel(125);
		
		// V�rios testes para a classe Comparavel:
		System.out.println(valor6.�DiferenteDe(valor1.retornaValor(),valor2.retornaValor(),valor3.retornaValor(),valor4.retornaValor(),valor5.retornaValor())); // imprime true
		System.out.println(valor3.�IgualA(valor4.retornaValor())); // imprime true
		System.out.println(valor1.�IgualA(valor2.retornaValor())); // imprime false
		System.out.println(valor6.�IgualAQualquerUmDe(valor1.retornaValor(), valor2.retornaValor(), valor3.retornaValor(), valor4.retornaValor(), valor5.retornaValor())); // imprime false
		System.out.println(valor6.�MaiorQue(valor5.retornaValor())); // imprime true
		System.out.println(valor1.�IgualA(valor7)); // imprime true
		System.out.println(valor1.�IgualA(valor7,valor6)); // imprime true
		System.out.println(valor1.�IgualA(valor2,valor6)); // imprime false
		
	} // fim do m�todo main
	
} // fim da classe Principal
