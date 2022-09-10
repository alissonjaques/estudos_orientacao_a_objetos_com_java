import java.util.Scanner;
/**
 *  A classe principal possu� apenas um m�todo, que � o m�todo main. Este m�todo permite a execu��o do programa.
 *  A classe principal da exemplos de usos de objetos da classe Lampada.
 *  @author Alisson Jaques
 *  
 */
public class Principal { //declara��o a classe

		/**
		 *  O m�todo main permite a execu��o dessa classe, nele s�o criadas ins�ncias da classe Lampada e s�o chamados m�todos dessas inst�ncias.
		 *  @param argumentos os argumentos passados para o m�todo via linha de comando, mas que nesse caso ser�o desconsiderados.	 * 
		 *  
		 */
		public static void main(String[] argumentos) {
			
			//Pedimos ao usu�rio que informe o estado atual da l�mpada (aceso ou apagado)
			System.out.println("Informe o estado da l�mpada(1 para aceso ou 0 para apagado):");
			//criamos um objeto do tipo Scanner e fazemos a vari�vel estado receber o conte�do de seu m�todo nexInt()
			//assim somos capazes de pegar o dado fornecido pelo usu�rio e o gravar em uma mem�ria de nossa prefer�ncia
			Scanner estado = new Scanner(System.in);
			int estadoLampada = estado.nextInt();
			
			//declaramos uma vari�vel auxiliar do tipo booleano, para que a mesma possa armazenar o estado l�gico da l�mpada
			boolean estadoLogicoLampada;
			
			//O la�o garante que o usu�rio ir� nos informa um valor v�lido (0 ou 1), sendo repetido at� termos o dado que desejamos
			while( estadoLampada!=1 && estadoLampada!=0){
				
				System.out.println("Informe um valor v�lido (0 ou 1):");
				estadoLampada = estado.nextInt();
				
			}
			
			//inicializamos � vari�vel l�gica (estadoLogicoLampada) associando-a com o dado fornecido pelo usu�rio
			if(estadoLampada==1) {//se dado fornecido � igual a 1
				
				estadoLogicoLampada = true; //ent�o estado � ligada
				
			}
			else { //sen�o
				
				estadoLogicoLampada = false; //estado � apagada
				
			}
			
			//Solicitamos ao usu�rio que informe a pot�ncia da l�mpada
			System.out.println("Informe a pot�ncia da l�mpada em watts:");
			//criamos um objeto do tipo Scanner e fazemos a vari�vel estado receber o conte�do de seu m�todo nexFloat()
			//assim somos capazes de pegar o dado fornecido pelo usu�rio e o gravar em uma mem�ria de nossa prefer�ncia
			Scanner pot = new Scanner(System.in);
			float potenciaLampada = pot.nextFloat();
			
			//criamos um objeto da classe Lampada
			Lampada lampadaQualquer = new Lampada();
			
			//v�rios exemplos de chamadas de m�todos da classe Lampada atrav�s de uma refer�ncia a uma inst�ncia dessa classe
			lampadaQualquer.inicializaLampada(estadoLogicoLampada,potenciaLampada);
			
			lampadaQualquer.apagaLampada(estadoLogicoLampada);
			
			lampadaQualquer.mostraEstado(lampadaQualquer.apagaLampada(estadoLogicoLampada));
			
			lampadaQualquer.estaLigada(lampadaQualquer.acendeLampada(estadoLogicoLampada));
			
			lampadaQualquer.acendeLampada(estadoLogicoLampada);
			
			lampadaQualquer.acendeLampada(estadoLogicoLampada);
			
			System.out.println(lampadaQualquer);	
			
			
		}
	
}
