class DemoReferencias{// declaração da classe
	/**
	 * O método main permite a execução desta classe. Este método contém declarações
	 * de algumas instâncias da classe Data e suas referências.
	 * @param argumentos os argumentos que podem ser passados para o método via linha
	 * de comando, mas que neste caso serão ignorados.
	 */
	public static void main(String[] argumentos){
		
	// Declaramos três referências a instâncias da classe Data, e inicializamos duas
		// com o "valor" null
		Data nascimentoDeEdgarDegas = null; // 19/7/1834
		Data nascimentoDeHerbertMarcuse; // 19/7/1898
		Data jogosOlímpicosEmHelsinki = new Data(); // 19/7/1952
		
		
		// Criamos uma nova instância da classe Data e a associamos à uma das referências
		nascimentoDeEdgarDegas = new Data((byte)30,(byte)1,(short)1948);
		// Copiamos os valores dos campos da instância nascimentoDeEdgarDegas para os campos da instância dataQueAconteceu
		Data dataQueAconteceu = new Data(nascimentoDeEdgarDegas);
		
		// Usamos a referência para mostrar os campos da instância
		nascimentoDeEdgarDegas.mostraData();
		// Dereferenciamos a referência - ela volta a apontar para null
		nascimentoDeEdgarDegas = null;
		
		/**
		// Se o programa pudesse ser compilado, a linha abaixo causaria um erro em tempo de
		// execução que interromperia a execução do programa. A próxima linha causaria o
		// mesmo erro, mas nunca será alcançada.
		nascimentoDeEdgarDegas.mostraData();
		jogosOlímpicosEmHelsinki.mostraData();
 		*/
		// Uma inicialização condicional: a instância nascimentoDeHerbertMarcuse só
		// será inicializada se true for igual a false, ou seja, nunca.
		//if (true == false){
 
				nascimentoDeHerbertMarcuse = new Data((byte)21,(byte)6,(short)1965);
				jogosOlímpicosEmHelsinki.mostraData();
				jogosOlímpicosEmHelsinki = new Data((byte)19,(byte)7,(short)1952);
		//}
		
		// A linha abaixo causa um erro de compilação, já que a referência
		// nascimentoDeHerbertMarcuse pode não ter sido inicializada no bloco acima. O
		// compilador não tem como saber se o bloco será executado, mesmo nos casos mais
		// óbvios.
		
		
		jogosOlímpicosEmHelsinki.mostraData();
		nascimentoDeHerbertMarcuse.mostraData();
		
		System.out.println(nascimentoDeHerbertMarcuse);
		System.out.println(jogosOlímpicosEmHelsinki);
		System.out.println(dataQueAconteceu);
		
 	} // fim do método main

} // fim da classe DemoReferencias
