/**
 *  A classe Principal tem um único método, o método main, que
 *  permite sua execução. Ela demonstra usos da classe Comparavel.
 *  
 *  @author Alisson Jaques 
 * 
 * */
public class Principal { // declaração da classe
	
	/**
	 * O método main, que permite a execução dessa classe e mostra
	 * usos da classe Comparavel.
	 * @param args os argumentos que podem ser passados ao método
	 * via linha de comando, mas que nesse caso serão ignorados. 
	 * 
	 * */
	public static void main(String args[]) {
		
		/*
		 * Vários objetos são criados, note que para o construtor são
		 * passados argumentos que envolvem expressões matemáticas (que
		 * manipulam o conteúdo de outros objetos).
		 * 
		 * */
		Comparavel valor1 = new Comparavel(125);
		Comparavel valor2 = new Comparavel(valor1.retornaValor()-25);
		Comparavel valor3 = new Comparavel(valor2.retornaValor()%2);
		Comparavel valor4 = new Comparavel(); // aciona o construtor default
		Comparavel valor5 = new Comparavel(valor1.retornaValor()+valor2.retornaValor());
		Comparavel valor6 = new Comparavel(564.2);
		Comparavel valor7 = new Comparavel(125);
		
		// Vários testes para a classe Comparavel:
		System.out.println(valor6.éDiferenteDe(valor1.retornaValor(),valor2.retornaValor(),valor3.retornaValor(),valor4.retornaValor(),valor5.retornaValor())); // imprime true
		System.out.println(valor3.éIgualA(valor4.retornaValor())); // imprime true
		System.out.println(valor1.éIgualA(valor2.retornaValor())); // imprime false
		System.out.println(valor6.éIgualAQualquerUmDe(valor1.retornaValor(), valor2.retornaValor(), valor3.retornaValor(), valor4.retornaValor(), valor5.retornaValor())); // imprime false
		System.out.println(valor6.éMaiorQue(valor5.retornaValor())); // imprime true
		System.out.println(valor1.éIgualA(valor7)); // imprime true
		System.out.println(valor1.éIgualA(valor7,valor6)); // imprime true
		System.out.println(valor1.éIgualA(valor2,valor6)); // imprime false
		
	} // fim do método main
	
} // fim da classe Principal
