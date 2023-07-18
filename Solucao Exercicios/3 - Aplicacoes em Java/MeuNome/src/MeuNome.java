import java.util.Scanner; //importa a classe Scanner, que permite armazenamento de dados em java

/**
 * A classe MeuNome é uma classe simples que lê um nome fornecido pelo usuário e o imprimi.
 * @author Alisson Jaques
 *  
 * */

public class MeuNome {//declaração da classe
	/**
	 * A classe MeuNome possuí apenas um método, que é o método main. Esse método permite a execução dessa
	 * classe.
	 * @param argumentos os agurmentos que podem ser passados para o método via linha de comando, mas que
	 * neste caso serão ignorados
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//Imprimi uma mensagem que solicita o nome do usuário
		System.out.println("Informe seu nome: ");
		//Declaração de uma referência para uma instância da classe Scanner
		Scanner scan = new Scanner(System.in);
		//A referência nome recebe o conteúdo fornecido pelo usuário
		String nome = scan.nextLine();
		//O nome fornecido pelo usuário é impresso na tela com uma mensagem
		System.out.println(nome+" é uma pessoa esforçada.");
	}//fim do método main
	
}//fim da classe MeuNome
