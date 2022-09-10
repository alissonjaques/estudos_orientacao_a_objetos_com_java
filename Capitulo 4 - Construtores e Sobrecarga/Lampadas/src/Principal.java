import java.util.Scanner;
/**
 *  A classe principal possuí apenas um método, que é o método main. Este método permite a execução do programa.
 *  A classe principal da exemplos de usos de objetos da classe Lampada.
 *  @author Alisson Jaques
 *  
 */
public class Principal { //declaração da classe

		/**
		 *  O método main permite a execução dessa classe, nele são criadas insâncias da classe Lampada e são chamados métodos dessas instâncias.
		 *  @param argumentos os argumentos passados para o método via linha de comando, mas que nesse caso serão desconsiderados.	 * 
		 *  
		 */
		public static void main(String[] argumentos) {
			
			boolean estadoLogicoLampada;
			
			//Pedimos ao usuário que informe o estado atual da lâmpada (aceso ou apagado)
			System.out.println("Informe o estado da lâmpada(true para aceso ou false para apagado):");
			Scanner estadoLampada = new Scanner(System.in);
			estadoLogicoLampada = estadoLampada.nextBoolean();
			
			//criamos objetos da classe Lampada
			Lampada lampadaQualquer = new Lampada(estadoLogicoLampada);
			Lampada outraLampada = lampadaQualquer.clona();
			Lampada lampada = new Lampada();
			
			//vários exemplos de chamadas de métodos da classe Lampada através de uma referência a uma instância dessa classe
			
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
