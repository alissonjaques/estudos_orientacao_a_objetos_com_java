/**
 *  A classe PrincipalConstantes demonstra usos da classe ConstanteTrigonometrica.
 *  
 *  @author Alisson Jaques
 * 
 * */
public class PrincipalConstantes { // declaração da classe
	
	/**
	 *  O método main permite a execução dessa classe. Ele demonstra usos da classe
	 *  ConstanteTrigonométrica, atrávez de chamadas aos campos estáticos da mesma.
	 * 	@param argumentos os argumentos que podem ser passados ao método via linha de comando,
	 *  mas que neste caso serão ignorados.
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		// Mostramos o resultado de vários valores trigonométricos, fazendo chamadas aos
		// métodos da classe ConstanteTrigonometrica
		System.out.println("O seno de 30° graus é " + ConstanteTrigonometrica.sin30);
		System.out.println("O cosseno de 90° graus é " + ConstanteTrigonometrica.cos90);
		
		if(ConstanteTrigonometrica.tan90==0) { // se a tangente de 90° graus for 0
			
			System.out.println("A tangente de 90° graus é indefinida"); // então ela é indefinida
			
		} // fim-se
		
		System.out.println("A tangente de 30° graus é " + ConstanteTrigonometrica.tan30);
		
	} // fim do método main

} // fim da classe PrincipalConstantes
