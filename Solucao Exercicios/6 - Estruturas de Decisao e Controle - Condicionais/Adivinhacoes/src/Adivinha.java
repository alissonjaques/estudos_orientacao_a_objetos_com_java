/**
 *  A classe Adivinha implementa uma aplicação de jogo
 *  de advinhação. O objetivo do jogo é advinhar um número inteiro
 *  encapsulado em um objeto da classe JogoDeAdivinhacao.
 * 
 * 	@author Alisson Jaques 
 * 
 * */
public class Adivinha { // declaração da classe
	
	/**
	 *  O método main permite a execução dessa classe, ele demonstra usos
	 *  da classe JogoDeAdivinhacao.
	 *  @param args os argumentos que podem ser passados ao método via linha
	 *  de comando, mas que neste caso serão ignorados.
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
		
		trinta.tenta(); 			// O jogo de adivinhação para o valor 30
		System.out.println();		// Quebra de linha para organização dos dados no terminal
		noventaECinco.tenta();		// O jogo de adivinhação para o valor 95
				
	} // fim do método main
	
} // fim da classe Adivinha