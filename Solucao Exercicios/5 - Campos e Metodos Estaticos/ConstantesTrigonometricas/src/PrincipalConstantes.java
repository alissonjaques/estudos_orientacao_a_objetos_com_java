/**
 *  A classe PrincipalConstantes demonstra usos da classe ConstanteTrigonometrica.
 *  
 *  @author Alisson Jaques
 * 
 * */
public class PrincipalConstantes { // declara��o da classe
	
	/**
	 *  O m�todo main permite a execu��o dessa classe. Ele demonstra usos da classe
	 *  ConstanteTrigonom�trica, atr�vez de chamadas aos campos est�ticos da mesma.
	 * 	@param argumentos os argumentos que podem ser passados ao m�todo via linha de comando,
	 *  mas que neste caso ser�o ignorados.
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		// Mostramos o resultado de v�rios valores trigonom�tricos, fazendo chamadas aos
		// m�todos da classe ConstanteTrigonometrica
		System.out.println("O seno de 30� graus � " + ConstanteTrigonometrica.sin30);
		System.out.println("O cosseno de 90� graus � " + ConstanteTrigonometrica.cos90);
		
		if(ConstanteTrigonometrica.tan90==0) { // se a tangente de 90� graus for 0
			
			System.out.println("A tangente de 90� graus � indefinida"); // ent�o ela � indefinida
			
		} // fim-se
		
		System.out.println("A tangente de 30� graus � " + ConstanteTrigonometrica.tan30);
		
	} // fim do m�todo main

} // fim da classe PrincipalConstantes
