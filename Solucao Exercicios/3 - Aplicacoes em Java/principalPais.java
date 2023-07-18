import java.util.Scanner;
/**
 *  A classe Principal da exemplos de usos de instâncias da classe Pais, ela possuí apenas um método, que é o método main. Este método permite a execução do pacote desta aplicação
 *  @author Alisson Jaques 
 * 
 * */
public class Principal { //declara a classe
	
	/**
	 *  O método main é um método especial que permite a execução da nossa aplicação. Ele cria várias instâncias da classe Pais, nos dando exemplos de seu uso.
	 *  @param argumentos os argumentos que são passados para o método via linha de comando, mas que neste caso serão ignorados
	 *  
	 * */
	public static void main(String[] argumentos) {
		
		//declaração de variáveis auxiliares para a inicialização dos objetos da classe Pais
		String nomePais, linguaPais;
		float areaPais;
		long populacaoPais;
		
		//Solicitamos os dados de um país ao usuário, criamos várias instâncias da classe Scanner e associamos as variáveis aos métodos correspondentes dessas instâncias
		//assim somos capazes de armazenar nas variáveis o conteúdo digitado pelo usuário
		System.out.println("Informe o nome do país: ");
		Scanner nomeS = new Scanner(System.in);
		nomePais = nomeS.nextLine();
		
		System.out.println("Informe a área do país em km²: ");
		Scanner areaS = new Scanner(System.in);
		areaPais = areaS.nextFloat();
		
		System.out.println("Informe o número de habitantes do país (população): ");
		Scanner populacaoS = new Scanner(System.in);
		populacaoPais = populacaoS.nextLong();
		
		System.out.println("Informe a língua nativa do país: ");
		Scanner linguaS = new Scanner(System.in);
		linguaPais = linguaS.nextLine();
		
		//damos uma quebra de linha no terminal
		System.out.println();
		
		//são criados três referências a objetos da classe Pais
		Pais alemanha = new Pais();
		Pais brasil = new Pais();
		Pais china = new Pais();
		
		//inicializamos um objeto passando como parâmetro os dados fornecidos pelo usuário,
		//outro com dados fornecidos diretamente método
		//e outro com a palavra chave null
		brasil.inicializaPais(nomePais, areaPais, populacaoPais, linguaPais);
		alemanha.inicializaPais((String)"Alemanha",(float)357051.00,(long)82800000,(String)"Alemão");
		china = null;
		
		//verificamos se o objeto informado pelo usuário é igual a um outro objeto passado como referência
		if(brasil.éIgual(alemanha)==true) {//se o objeto informado for igual ao objeto definido
			
			System.out.println("Os países são iguais!"); //imprima: Os objetos são iguais
			
		}
		else { //senão
			
			System.out.println("Os países são diferentes!"); //imprima: Os objetos são diferentes
			
		}
		//damos mais uma quebra de linha, afim de organização
		System.out.println();
		//passamos como argumento um apontador para um objeto, que permitirá que o método println vá até o método toString da classe país e imprima a string retornada neste método
		System.out.println(brasil);
		System.out.println(alemanha);
		
	}
		
}
