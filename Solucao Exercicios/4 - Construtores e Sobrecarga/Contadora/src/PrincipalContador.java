/**
 *  A classe PrincipalContator da exemplos de uso da classe Contador.
 *  @author Alisson Jaques
 *  
 * */
import java.util.Scanner; //importa��o do pacote que cont�m a classe Scanner

public class PrincipalContador {//declara a classe

	/**
	 *  O m�todo main permite a execu��o da aplica��o, nele s�o dados exemplos de uso da classe Contador
	 *  @param argumentos os argumentos que podem ser passados via linha de comando, mas que neste caso
	 *  ser�o ignorados.
	 * 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//declara��o de vari�veis auxiliares
		int numero, interacoes, opcao;
		
		//obten��o do valor inicial informado pelo usu�rio (utilizando um objeto da classe Scanner e chamando um m�doto dessa classe)
		System.out.println("Informe um valor inicial:");
		Scanner umNumero = new Scanner(System.in);
		numero = umNumero.nextInt();
		
		//Pedimos ao usu�rio para decidir se quer somar ou zerar o conte�do que ele informou:
		System.out.println("Escolha 1 para zerar ou 2 para contar:");
		Scanner escolha = new Scanner(System.in);
		opcao = escolha.nextInt();
		
		//atr�ves de um la�o, garantimos que o usu�rio escolha uma op��o v�lida
		while(opcao!=1 && opcao!=2) {//enquanto n�o for a op��o esperada fa�a:
			
			System.out.println("Escolha uma op��o v�lida!");//informe ao usu�rio a escolha equivocada
			opcao = escolha.nextInt();//recebe um novo dado do usu�rio
			
		}
		
		//menu que executa blocos de comando de acordo com a op��o escolhida pelo usu�rio
		switch(opcao){
			
			case 1: //caso escolha zerar:
				
				Contador zera = new Contador();//criamos uma refer�ncia a uma inst�ncia da classe Contador
				System.out.println("Resultado: " + zera); //imprimimos o conte�do do objeto pelo m�todo toString da classe Contador (no caso ser� 0)
				
			break;
			
			case 2: //caso escolha somar
		
				System.out.println("Informe um limitador para a contagem:");//solicitamos um valor limite para o n�mero de intera��es
				//pegamos o valor informado pelo usu�rio e o armazenamos em uma das vari�veis auxiliares (interacoes)
				Scanner limitador = new Scanner(System.in);
				interacoes = limitador.nextInt();
				//criamos uma refer�ncia a uma inst�ncia da classe Contador com uma instancia que possu� uma assinatura para um construtor espec�fico
				Contador soma = new Contador(numero,interacoes);
				//atr�ves da refer�ncia usamos o m�todo somat�rio da classe Contador e o colocamos em uma vari�vel auxiliar
				numero = soma.incrementaContador();
				//Imprimimos o valor do somat�rio na tela
				System.out.println("Valor do somat�rio: "+numero);
				//chamamos o m�todo que zera o conte�do
				soma.zeraContador();
				System.out.println("Valor do somat�rio: "+soma); //imprime "Valor do somat�rio: 0"
			
			break;
			
		}
	
	}//fim do m�todo main
		
}
