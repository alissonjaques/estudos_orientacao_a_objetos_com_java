/**
 * 	A classe PrincipalSerie possuí um único método,
 *  que é o método main, podendo assim ser executada.
 *  Ela demonstra usos da classe SerieLimitada.
 *  @author Alisson Jaques 
 * 
 * */
public class PrincipalSerie{ // declaração da classe
	
	/**
	 * 	O método main permite a execução dessa classe. Ele
	 *  demonstra usos da classe SerieLimitada.
	 *  @param argumentos os argumentos que podem ser passados ao método
	 *  via linha de comando, mas que neste caso serão ignorados.
	 * 
	 * */
	public static void main(String[] argumentos){
		
		/**
		 *  Criamos vários objetos da classe SerieLimitada.
		 *  Alguns diretamente (pela palavra-chave new), outros
		 *  utilizando alguns métodos dessa classe,
		 * 
		 * */
		SerieLimitada figura1 = new SerieLimitada(101);					 // atribuição direta
		SerieLimitada figura2 = new SerieLimitada(102);
		SerieLimitada figura3 = new SerieLimitada(103);
		SerieLimitada figura4 = new SerieLimitada(104);
		SerieLimitada figura5 = new SerieLimitada(105);
		SerieLimitada figura6 = new SerieLimitada(106);			
		SerieLimitada figura7 = figura6.clona();       					// aqui é chamado o método clona da classe SerieLimitada, assim a figura7 terá o seu campo encapsulado principal igual ao da figura6
		SerieLimitada figura8 = SerieLimitada.fabricaSequencial(108);   // aqui criamos um objeto da classe, utilizando o método estático da classe SerieLimitada
		SerieLimitada figura9 = new SerieLimitada();					// figura9 tera seu campo encapsulado (numeroSequencial) igual a 0
		SerieLimitada figura10 = new SerieLimitada(109);
		SerieLimitada figura11 = new SerieLimitada(110);				// não será armazenado o valor 110 e sim 0, pois o número máximo de instâncias permitidas foi atingido
		SerieLimitada figura12 = figura1.clona();						// não será retornado um objeto clone e sim um objeto com o campo encapsulado (numeroSequencial) igual a 0
		SerieLimitada figura13 = SerieLimitada.fabricaSequencial(107);  // não será retornado um objeto fabricado e sim um objeto com o campo encapsulado (numeroSequencial) igual a 0
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		
		System.out.println("Quantidade de instâncias permitidas para a aplicação: " + SerieLimitada.retornaQuantidadeMaximaPermitida()); // mostramos a quantidade máxima de objetos que podem ser criados da classe SerieLimitada
		System.out.println("Quantidade de instâncias criadas: " + SerieLimitada.retornaQuantidadeDeInstancias());						 // mostramos a quantidade de instâncias criadas pelo programador usuário da classe
		
		if(SerieLimitada.retornaQuantidadeDeInstancias()>=SerieLimitada.retornaQuantidadeMaximaPermitida()){ // se o número de instâncias criados for maior do que o número de instâncias permitido
			
			System.out.println("O número máximo de criação de objetos foi atingido."); // informamos ao usuário que o número máximo de instâncias foi atingido
			
		}
		else{ // senão
			
			System.out.println("O número máximo de criação de objetos não foi atingido."); // informamos ao usuário que o número máximo de instâncias não foi atingido
			
		} // fim-se
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		
		System.out.println("Dados armazenados nas figuras:");
		/**
		 *  Utilizamos o método println da classe System para imprimir
		 *  os objetos criados (através do método toString da classe SerieLimitada,
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

		if(figura9.éIgual(figura11)){ // se a figura9 for igual à figura11
			
			System.out.println("As figuras são iguais!"); // então informe que as figuras são iguais
			
		}
		else{ // senão
			
			System.out.println("As figuras são diferentes!"); // informe que as figuras são diferentes
			
		} // fim-se
	
	} // fim do método main
	
} // fim da classe PrincipalSerie