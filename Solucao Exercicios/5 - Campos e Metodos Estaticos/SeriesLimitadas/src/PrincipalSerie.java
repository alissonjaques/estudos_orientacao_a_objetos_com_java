/**
 * 	A classe PrincipalSerie possu� um �nico m�todo,
 *  que � o m�todo main, podendo assim ser executada.
 *  Ela demonstra usos da classe SerieLimitada.
 *  @author Alisson Jaques 
 * 
 * */
public class PrincipalSerie{ // declara��o da classe
	
	/**
	 * 	O m�todo main permite a execu��o dessa classe. Ele
	 *  demonstra usos da classe SerieLimitada.
	 *  @param argumentos os argumentos que podem ser passados ao m�todo
	 *  via linha de comando, mas que neste caso ser�o ignorados.
	 * 
	 * */
	public static void main(String[] argumentos){
		
		/**
		 *  Criamos v�rios objetos da classe SerieLimitada.
		 *  Alguns diretamente (pela palavra-chave new), outros
		 *  utilizando alguns m�todos dessa classe,
		 * 
		 * */
		SerieLimitada figura1 = new SerieLimitada(101);					 // atribui��o direta
		SerieLimitada figura2 = new SerieLimitada(102);
		SerieLimitada figura3 = new SerieLimitada(103);
		SerieLimitada figura4 = new SerieLimitada(104);
		SerieLimitada figura5 = new SerieLimitada(105);
		SerieLimitada figura6 = new SerieLimitada(106);			
		SerieLimitada figura7 = figura6.clona();       					// aqui � chamado o m�todo clona da classe SerieLimitada, assim a figura7 ter� o seu campo encapsulado principal igual ao da figura6
		SerieLimitada figura8 = SerieLimitada.fabricaSequencial(108);   // aqui criamos um objeto da classe, utilizando o m�todo est�tico da classe SerieLimitada
		SerieLimitada figura9 = new SerieLimitada();					// figura9 tera seu campo encapsulado (numeroSequencial) igual a 0
		SerieLimitada figura10 = new SerieLimitada(109);
		SerieLimitada figura11 = new SerieLimitada(110);				// n�o ser� armazenado o valor 110 e sim 0, pois o n�mero m�ximo de inst�ncias permitidas foi atingido
		SerieLimitada figura12 = figura1.clona();						// n�o ser� retornado um objeto clone e sim um objeto com o campo encapsulado (numeroSequencial) igual a 0
		SerieLimitada figura13 = SerieLimitada.fabricaSequencial(107);  // n�o ser� retornado um objeto fabricado e sim um objeto com o campo encapsulado (numeroSequencial) igual a 0
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		
		System.out.println("Quantidade de inst�ncias permitidas para a aplica��o: " + SerieLimitada.retornaQuantidadeMaximaPermitida()); // mostramos a quantidade m�xima de objetos que podem ser criados da classe SerieLimitada
		System.out.println("Quantidade de inst�ncias criadas: " + SerieLimitada.retornaQuantidadeDeInstancias());						 // mostramos a quantidade de inst�ncias criadas pelo programador usu�rio da classe
		
		if(SerieLimitada.retornaQuantidadeDeInstancias()>=SerieLimitada.retornaQuantidadeMaximaPermitida()){ // se o n�mero de inst�ncias criados for maior do que o n�mero de inst�ncias permitido
			
			System.out.println("O n�mero m�ximo de cria��o de objetos foi atingido."); // informamos ao usu�rio que o n�mero m�ximo de inst�ncias foi atingido
			
		}
		else{ // sen�o
			
			System.out.println("O n�mero m�ximo de cria��o de objetos n�o foi atingido."); // informamos ao usu�rio que o n�mero m�ximo de inst�ncias n�o foi atingido
			
		} // fim-se
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		
		System.out.println("Dados armazenados nas figuras:");
		/**
		 *  Utilizamos o m�todo println da classe System para imprimir
		 *  os objetos criados (atrav�s do m�todo toString da classe SerieLimitada,
		 *  retornado para o argumento de println). 
		 * 
		 * */
		System.out.println(figura1);
		System.out.println(figura2);
		System.out.println(figura3);
		System.out.println(figura4);
		System.out.println(figura5);
		System.out.println(figura6);
		System.out.println(figura7);
		System.out.println(figura8);
		System.out.println(figura9);
		System.out.println(figura10);
		System.out.println(figura11);
		System.out.println(figura12);
		System.out.println(figura13);

		if(figura9.�Igual(figura11)){ // se a figura9 for igual � figura11
			
			System.out.println("As figuras s�o iguais!"); // ent�o informe que as figuras s�o iguais
			
		}
		else{ // sen�o
			
			System.out.println("As figuras s�o diferentes!"); // informe que as figuras s�o diferentes
			
		} // fim-se
	
	} // fim do m�todo main
	
} // fim da classe PrincipalSerie