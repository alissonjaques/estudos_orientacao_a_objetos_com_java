/**
 *  A classe PrincipalContator da exemplos de uso da classe Contador.
 *  @author Alisson Jaques
 *  
 * */
import java.util.Scanner; //importação do pacote que contém a classe Scanner

public class PrincipalContador {//declara a classe

	/**
	 *  O método main permite a execução da aplicação, nele são dados exemplos de uso da classe Contador
	 *  @param argumentos os argumentos que podem ser passados via linha de comando, mas que neste caso
	 *  serão ignorados.
	 * 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//declaração de variáveis auxiliares
		int numero, interacoes, opcao;
		
		//obtenção do valor inicial informado pelo usuário (utilizando um objeto da classe Scanner e chamando um médoto dessa classe)
		System.out.println("Informe um valor inicial:");
		Scanner umNumero = new Scanner(System.in);
		numero = umNumero.nextInt();
		
		//Pedimos ao usuário para decidir se quer somar ou zerar o conteúdo que ele informou:
		System.out.println("Escolha 1 para zerar ou 2 para contar:");
		Scanner escolha = new Scanner(System.in);
		opcao = escolha.nextInt();
		
		//atráves de um laço, garantimos que o usuário escolha uma opção válida
		while(opcao!=1 && opcao!=2) {//enquanto não for a opção esperada faça:
			
			System.out.println("Escolha uma opção válida!");//informe ao usuário a escolha equivocada
			opcao = escolha.nextInt();//recebe um novo dado do usuário
			
		}
		
		//menu que executa blocos de comando de acordo com a opção escolhida pelo usuário
		switch(opcao){
			
			case 1: //caso escolha zerar:
				
				Contador zera = new Contador();//criamos uma referência a uma instância da classe Contador
				System.out.println("Resultado: " + zera); //imprimimos o conteúdo do objeto pelo método toString da classe Contador (no caso será 0)
				
			break;
			
			case 2: //caso escolha somar
		
				System.out.println("Informe um limitador para a contagem:");//solicitamos um valor limite para o número de interações
				//pegamos o valor informado pelo usuário e o armazenamos em uma das variáveis auxiliares (interacoes)
				Scanner limitador = new Scanner(System.in);
				interacoes = limitador.nextInt();
				//criamos uma referência a uma instância da classe Contador com uma instancia que possuí uma assinatura para um construtor específico
				Contador soma = new Contador(numero,interacoes);
				//atráves da referência usamos o método somatório da classe Contador e o colocamos em uma variável auxiliar
				numero = soma.incrementaContador();
				//Imprimimos o valor do somatório na tela
				System.out.println("Valor do somatório: "+numero);
				//chamamos o método que zera o conteúdo
				soma.zeraContador();
				System.out.println("Valor do somatório: "+soma); //imprime "Valor do somatório: 0"
			
			break;
			
		}
	
	}//fim do método main
		
}
