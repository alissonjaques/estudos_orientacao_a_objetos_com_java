/**
 *  A classe PrincipalRetas possu� apenas um �nico m�todo, que � o m�todo main.
 *  Este m�todo permite a execu��o dessa classe. A PrincipalRetas da exemplos de
 *  usos das classes Ponto2D e RetasNoPlano.
 *  
 *  @author Alisson Jaques 
 * 
 * */
public interface PrincipalRetas { // declara��o da classe

	/**
	 *  O m�todo main permite a execu��o dessa classe. Ele da exemplos de usos
	 *  das classes Ponto2D e RetasNoPlano.
	 *  @param argumentos os argumentos que podem se passados ao m�todo via linha
	 *  de comando, mas que neste caso ser�o ignorados. 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		// declaramos tr�s refer�ncias � inst�ncias da classe Ponto2D
		// e a inicializamos, atrav�s da manipula��o de seus construtores
		Ponto2D pontoA = new Ponto2D(3.00,5.00); //	ponto (3.00,5.00)	
		Ponto2D pontoB = new Ponto2D(1.00,7.00); // ponto (1.00,7.00)
		Ponto2D pontoC = new Ponto2D();          // ponto (0.0)
		
		// declaramos v�rias refer�ncias a inst�ncias da classe RetasNoPlano
		// e as inicializamos com os pontos declarados acima
		RetasNoPlano reta1 = new RetasNoPlano(pontoA,pontoB);        // reta que passa pelos pontos (3.00,5.00) e (1.00,7.00)
		RetasNoPlano reta2 = new RetasNoPlano(pontoA);               // reta que passa pelos pontos (3.00,5.00) e (0.00,0.00)
		RetasNoPlano reta3 = new RetasNoPlano();                     // ponto (0.0)
		RetasNoPlano reta4 = new RetasNoPlano(0.00,6.00,9.00,61.00); // reta que passa pelos pontos (0.00,6.00) e (9.00,61.00)
		RetasNoPlano reta5 = new RetasNoPlano(pontoC,pontoC);        // ponto (0.0)
		
		// atrav�s do m�todo toString da classe RetasNoPlano
		// imprimos a equa��o das retas dos objetos acima
		System.out.println("A equa��o da reta1 �: "+reta1);
		System.out.println("A equa��o da reta2 �: "+reta2);
		System.out.println("A equa��o da reta3 �: "+reta3);
		System.out.println("A equa��o da reta4 �: "+reta4);
		System.out.println("A equa��o da reta5 �: "+reta5);
		
		// utilizando o m�todo comparacaoEntreRetas, da classe RetasNoPlano,
		// fazemos diversas compara��es entre as retas declaradas
		System.out.println("Compara��o entre as retas 1 e 2: "+reta1.comparacaoEntreRetas(reta2));
		System.out.println("Compara��o entre as retas 3 e 3: "+reta3.comparacaoEntreRetas(reta3));
		System.out.println("Compara��o entre as retas 3 e 4: "+reta3.comparacaoEntreRetas(reta4));
		
	} // fim do m�todo main
	
} // fim da classe PrincipalRetas
