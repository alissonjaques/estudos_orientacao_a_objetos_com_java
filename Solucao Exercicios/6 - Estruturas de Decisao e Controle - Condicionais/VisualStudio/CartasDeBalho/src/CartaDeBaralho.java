/**
 * 	A classe CartaDeBaralho encapsula uma carta de baralho,
 * 	ela possuí um método de impressão de seus dados (impressão essa
 * 	formatada).
 * 
 * 	@author Alisson Jaques
 */
public class CartaDeBaralho{ // declara a classe
	
	/*
		Campos da classe
	*/
	byte valor;  // valor da carta (1 a 13)
	byte naipe;  // o naipe da carta (1 a 4)
	
	/**
	 * O construtor para a classe CartaDeBaralho que recebe dois argumentos,
	 * um referente ao valor e outro ao naipe e inicializa os campos do objeto.
	 * 
	 * @param umValor o valor da carta
	 * @param umNaipe o naipe da carta
	 */
	CartaDeBaralho(byte umValor, byte umNaipe){
		
		if(umValor < 1 || umValor > 13){ // se o valor da carta não estiver no intervalo [1,13]
			
			valor = 1;  // o valor da carta receberá um valor default
			
		}
		else{ // senão 
			
			valor = umValor; // inicializa o campo valor do objetivo com o valor passado como argumento
		
		} // fim-se
		
		if(umNaipe < 1 || umNaipe > 4){ // se o naipe da carta não for um naipe válido
			
			naipe = 1; // o naipe será por padrão ouros
			
		}
		else{ // senão
			
			naipe = umNaipe; // a variável naipe receberá o conteúdo passado como argumento
		
		} // fim-se
		
	} // fim do construtor completo
	
	/**
	 * O construtor sobrecarregado da classe CartaDeBaralho que recebe um argumento,
	 * referente ao valor da carta, e inicializa o valor da carta com o mesmo, o valor do naipe
	 * é inicializado com o valor de default (ouros).
	 * 
	 * @param umValor o valor da carta
	 */
	CartaDeBaralho(byte umValor){
		
		this(umValor,(byte)1);	// chamada em cascata ao construtor completo
		
	} // fim do construtor sobrecarregado com apenas um argumento
	
	/**
	 * O construtor default para a classe CarteDeBaralho que não recebe nenhum
	 * argumento e representa a carta às de ouros.
	 */
	CartaDeBaralho(){
		
		this((byte)1);	// chamada em cascata dos outros construtores da classe
		
	} // fim do construtor default
	
	/**
	 *  O método imprimiCarta não possuí argumentos. Este método imprimi os campos
	 *  da classe formatados.
	 * 
	 */
	public void imprimeCarta(){
		
		/** 
		 * Uma série de switch's aninhados com a finalidade de imprimir os campos encapsulados
		 * da classe. A escolha de cada case é baseada no campo valor (1 a 13) e depois no campo
		 * naipe (1 a 4). Por exemplo, se um objeto tiver valor = 2 e naipe = 4 será impresso
		 * "Dois de Espadas" 
		 */
		switch (valor){ 
			
			case 1: 
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Ás de Ouros");
						break;
						
					case 2:
						
						System.out.println("Ás de Paus");
						break;						 
						
					case 3:
						
						System.out.println("Ás de Copas");
						break;
						
					case 4:
						
						System.out.println("Ás de Espadas");
						break;
										
				}
				
				break;

			case 2:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Dois de Ouros");
						break;
						
					case 2:
						
						System.out.println("Dois de Paus");
						break;
												
					case 3:
						
						System.out.println("Dois de Copas");
						break;
												
					case 4:
						
						System.out.println("Dois de Espadas");
						break;
											
				}

				break;
				
			case 3:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Três de Ouros");
						break;
						
					case 2:
						
						System.out.println("Três de Paus");
						break;
						
					case 3:
						
						System.out.println("Três de Copas");
						break;
						
					case 4:
						
						System.out.println("Três de Espadas");
						break;
						
				}
				
				break;

			case 4:
			
				switch(naipe){
					
					case 1:
						
						System.out.println("Quatro de Ouros");
						break;
						
					case 2:
						
						System.out.println("Quatro de Paus");
						break;
						
					case 3:
						
						System.out.println("Quatro de Copas");
						break;
						
					case 4:
						
						System.out.println("Quatro de Espadas");
						break;

				}

				break;
				
			case 5:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Cinco de Ouros");
						break;
						
					case 2:
						
						System.out.println("Cinco de Paus");
						break;
						
					case 3:
						
						System.out.println("Cinco de Copas");
						break;
						
					case 4:
						
						System.out.println("Cinco de Espadas");
						break;
				
				}
				
				break;

			case 6:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Seis de Ouros");
						break;
						
					case 2:
						
						System.out.println("Seis de Paus");
						break;
						
					case 3:
						
						System.out.println("Seis de Copas");
						break;
						
					case 4:
						
						System.out.println("Seis de Espadas");
						break;
				
				}
				
				break;

			case 7:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Sete de Ouros");
						break;
						
					case 2:
						
						System.out.println("Sete de Paus");
						break;
						
					case 3:
					
						System.out.println("Sete de Copas");
						break;
						
					case 4:
						
						System.out.println("Sete de Espadas");
						break;

				}
				
				break;

			case 8:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Oito de Ouros");
						break;
						
					case 2:
						
						System.out.println("Oito de Paus");
						break;
						
					case 3:
						
						System.out.println("Oito de Copas");
						break;
						
					case 4:
						
						System.out.println("Oito de Espadas");
						break;

				}
				
				break;

			case 9:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Nove de Ouros");
						break;
						
					case 2:
						
						System.out.println("Nove de Paus");
						break;
						
					case 3:
						
						System.out.println("Nove de Copas");
						break;
						
					case 4:
						
						System.out.println("Nove de Espadas");
						break;
				
				}
				
				break;

			case 10:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Dez de Ouros");
						break;
						
					case 2:
						
						System.out.println("Dez de Paus");
						break;
						
					case 3:
						
						System.out.println("Dez de Copas");
						break;
						
					case 4:
						
						System.out.println("Dez de Espadas");
						break;
					
				}
				
				break;

			case 11:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Valete de Ouros");
						break;
						
					case 2:
						
						System.out.println("Valete de Paus");
						break;
						
					case 3:
						
						System.out.println("Valete de Copas");
						break;
						
					case 4:
						
						System.out.println("Valete de Espadas");
						break;
				
				}
				
				break;

			case 12:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Dama de Ouros");
						break;
						
					case 2:
						
						System.out.println("Dama de Paus");
						break;

					case 3:
						
						System.out.println("Dama de Copas");
						break;
						
					case 4:
						
						System.out.println("Dama de Espadas");
						break;

				}

				break;
				
			case 13:
				
				switch(naipe){
					
					case 1:
						
						System.out.println("Rei de Ouros");
						break;
						
					case 2:
						
						System.out.println("Rei de Paus");
						break;
						
					case 3:
						
						System.out.println("Rei de Copas");
						break;
						
					case 4:
						
						System.out.println("Rei de Espadas");
						break;

				}
			
				break;
			
		} // fim do switch referente ao valor da carta
		
	} // fim do método imprimiCarta
	
} // fim da classe CartaDeBaralho