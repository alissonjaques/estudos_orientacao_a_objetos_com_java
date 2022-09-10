import java.util.Scanner;
/**
 *  A classe principal possu� apenas um m�todo, que � o m�todo main. Este m�todo permite a execu��o do programa.
 *  A classe principal da exemplos de usos de objetos da classe Lampada.
 *  @author Alisson Jaques
 *  
 */
public class Principal { //declara��o da classe

		/**
		 *  O m�todo main permite a execu��o dessa classe, nele s�o criadas ins�ncias da classe Lampada e s�o chamados m�todos dessas inst�ncias.
		 *  @param argumentos os argumentos passados para o m�todo via linha de comando, mas que nesse caso ser�o desconsiderados.	 * 
		 *  
		 */
		public static void main(String[] argumentos) {
			
			boolean estadoLogicoLampada;
			
			//Pedimos ao usu�rio que informe o estado atual da l�mpada (aceso ou apagado)
			System.out.println("Informe o estado da l�mpada(true para aceso ou false para apagado):");
			Scanner estadoLampada = new Scanner(System.in);
			estadoLogicoLampada = estadoLampada.nextBoolean();
			
			//criamos objetos da classe Lampada
			Lampada lampadaQualquer = new Lampada(estadoLogicoLampada);
			Lampada outraLampada = lampadaQualquer.clona();
			Lampada lampada = new Lampada();
			
			//v�rios exemplos de chamadas de m�todos da classe Lampada atrav�s de uma refer�ncia a uma inst�ncia dessa classe
			
			lampadaQualquer.apagaLampada(estadoLogicoLampada);
			
			lampadaQualquer.mostraEstado(lampadaQualquer.apagaLampada(estadoLogicoLampada));
			
			lampadaQualquer.estaLigada(lampadaQualquer.acendeLampada(estadoLogicoLampada));
			
			lampadaQualquer.acendeLampada(estadoLogicoLampada);
			
			lampadaQualquer.acendeLampada(estadoLogicoLampada);
			
			System.out.println(lampadaQualquer);
			System.out.println(outraLampada);
			System.out.println(lampada);			
			
		}
	
}
