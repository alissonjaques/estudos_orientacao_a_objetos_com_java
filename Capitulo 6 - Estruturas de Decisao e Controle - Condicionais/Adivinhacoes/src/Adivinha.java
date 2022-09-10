/**
 *  A classe Adivinha implementa uma aplica��o de jogo
 *  de advinha��o. O objetivo do jogo � advinhar um n�mero inteiro
 *  encapsulado em um objeto da classe JogoDeAdivinhacao.
 * 
 * 	@author Alisson Jaques 
 * 
 * */
public class Adivinha { // declara��o da classe
	
	/**
	 *  O m�todo main permite a execu��o dessa classe, ele demonstra usos
	 *  da classe JogoDeAdivinhacao.
	 *  @param args os argumentos que podem ser passados ao m�todo via linha
	 *  de comando, mas que neste caso ser�o ignorados.
	 *   
	 * */
	public static void main(String[] args){
		
		/*
		 * Declaramos dois objetos da classe JogoDeAdivinhacao e instanciamos seus
		 * campos encapsulados passando valores inteiros como argumentos para o 
		 * construtor dessa classe.
		 * */
		JogoDeAdivinhacao trinta = new JogoDeAdivinhacao(30);
		JogoDeAdivinhacao noventaECinco = new JogoDeAdivinhacao(95);
		
		trinta.tenta(); 			// O jogo de adivinha��o para o valor 30
		System.out.println();		// Quebra de linha para organiza��o dos dados no terminal
		noventaECinco.tenta();		// O jogo de adivinha��o para o valor 95
				
	} // fim do m�todo main
	
} // fim da classe Adivinha