/**
 *  A classe PrincipalRetas possuí apenas um único método, que é o método main.
 *  Este método permite a execução dessa classe. A PrincipalRetas da exemplos de
 *  usos das classes Ponto2D e RetasNoPlano.
 *  
 *  @author Alisson Jaques 
 * 
 * */
public interface PrincipalRetas { // declaração da classe

	/**
	 *  O método main permite a execução dessa classe. Ele da exemplos de usos
	 *  das classes Ponto2D e RetasNoPlano.
	 *  @param argumentos os argumentos que podem se passados ao método via linha
	 *  de comando, mas que neste caso serão ignorados. 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		// declaramos três referências à instâncias da classe Ponto2D
		// e a inicializamos, através da manipulação de seus construtores
		Ponto2D pontoA = new Ponto2D(3.00,5.00); //	ponto (3.00,5.00)	
		Ponto2D pontoB = new Ponto2D(1.00,7.00); // ponto (1.00,7.00)
		Ponto2D pontoC = new Ponto2D();          // ponto (0.0)
		
		// declaramos várias referências a instâncias da classe RetasNoPlano
		// e as inicializamos com os pontos declarados acima
		RetasNoPlano reta1 = new RetasNoPlano(pontoA,pontoB);        // reta que passa pelos pontos (3.00,5.00) e (1.00,7.00)
		RetasNoPlano reta2 = new RetasNoPlano(pontoA);               // reta que passa pelos pontos (3.00,5.00) e (0.00,0.00)
		RetasNoPlano reta3 = new RetasNoPlano();                     // ponto (0.0)
		RetasNoPlano reta4 = new RetasNoPlano(0.00,6.00,9.00,61.00); // reta que passa pelos pontos (0.00,6.00) e (9.00,61.00)
		RetasNoPlano reta5 = new RetasNoPlano(pontoC,pontoC);        // ponto (0.0)
		
		// através do método toString da classe RetasNoPlano
		// imprimos a equação das retas dos objetos acima
		System.out.println("A equação da reta1 é: "+reta1);
		System.out.println("A equação da reta2 é: "+reta2);
		System.out.println("A equação da reta3 é: "+reta3);
		System.out.println("A equação da reta4 é: "+reta4);
		System.out.println("A equação da reta5 é: "+reta5);
		
		// utilizando o método comparacaoEntreRetas, da classe RetasNoPlano,
		// fazemos diversas comparações entre as retas declaradas
		System.out.println("Comparação entre as retas 1 e 2: "+reta1.comparacaoEntreRetas(reta2));
		System.out.println("Comparação entre as retas 3 e 3: "+reta3.comparacaoEntreRetas(reta3));
		System.out.println("Comparação entre as retas 3 e 4: "+reta3.comparacaoEntreRetas(reta4));
		
	} // fim do método main
	
} // fim da classe PrincipalRetas
