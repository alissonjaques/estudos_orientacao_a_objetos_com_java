import java.util.Scanner;
/**
 *  A classe principal possuí apenas um método, que é o método main. Este método permite a execução do programa.
 *  A classe principal da exemplos de usos de objetos da classe Lampada.
 *  @author Alisson Jaques
 *  
 */
public class Principal { //declaração a classe

		/**
		 *  O método main permite a execução dessa classe, nele são criadas instâncias da classe Lampada e são chamados métodos dessas instâncias.
		 *  @param argumentos os argumentos passados para o método via linha de comando, mas que nesse caso serão desconsiderados.	 * 
		 *  
		 */
		public static void main(String[] argumentos) {
			
			//Pedimos ao usuário que informe o estado atual da lâmpada (aceso ou apagado)
			System.out.println("Informe o estado da lâmpada(1 para aceso ou 0 para apagado):");
			//criamos um objeto do tipo Scanner e fazemos a variável estado receber o conteúdo de seu método nexInt()
			//assim somos capazes de pegar o dado fornecido pelo usuário e o gravar em uma memória de nossa preferência
			Scanner estado = new Scanner(System.in);
			int estadoLampada = estado.nextInt();
			
			//declaramos uma variável auxiliar do tipo booleano, para que a mesma possa armazenar o estado lógico da lâmpada
			boolean estadoLogicoLampada;
			
			//O laço garante que o usuário irá nos informa um valor válido (0 ou 1), sendo repetido até termos o dado que desejamos
			while( estadoLampada!=1 && estadoLampada!=0){
				
				System.out.println("Informe um valor válido (0 ou 1):");
				estadoLampada = estado.nextInt();
				
			}
			
			//inicializamos à variável lógica (estadoLogicoLampada) associando-a com o dado fornecido pelo usuário
			if(estadoLampada==1) {//se dado fornecido é igual a 1
				
				estadoLogicoLampada = true; //então estado é ligada
				
			}
			else { //senão
				
				estadoLogicoLampada = false; //estado é apagada
				
			}
			
			//Solicitamos ao usuário que informe a potência da lâmpada
			System.out.println("Informe a potência da lâmpada em watts:");
			//criamos um objeto do tipo Scanner e fazemos a variável estado receber o conteúdo de seu método nexFloat()
			//assim somos capazes de pegar o dado fornecido pelo usuário e o gravar em uma memória de nossa preferência
			Scanner pot = new Scanner(System.in);
			float potenciaLampada = pot.nextFloat();
			
			//criamos um objeto da classe Lampada
			Lampada lampadaQualquer = new Lampada();
			
			//vários exemplos de chamadas de métodos da classe Lampada através de uma referência a uma instância dessa classe
			lampadaQualquer.inicializaLampada(estadoLogicoLampada,potenciaLampada);
			
			lampadaQualquer.apagaLampada(estadoLogicoLampada);
			
			lampadaQualquer.mostraEstado(lampadaQualquer.apagaLampada(estadoLogicoLampada));
			
			lampadaQualquer.estaLigada(lampadaQualquer.acendeLampada(estadoLogicoLampada));
			
			System.out.println(lampadaQualquer);	
			
			
		}
	
}
