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
		Data jogosOlímpicosEmHelsinki = null; // 19/7/1952
		
		// Criamos uma nova instância da classe Data e a associamos à uma das referências
		nascimentoDeEdgarDegas = new Data();
		
		// Usamos a referência para inicializar os campos da instância
		nascimentoDeEdgarDegas.inicializaData((byte)30,(byte)1,(short)1948);
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
 
				nascimentoDeHerbertMarcuse = new Data();
				nascimentoDeHerbertMarcuse.inicializaData((byte)21,(byte)6,(short)1965);
				jogosOlímpicosEmHelsinki = new Data();
				jogosOlímpicosEmHelsinki.inicializaData((byte)19,(byte)7,(short)1952);
		//}
		
		// A linha abaixo causa um erro de compilação, já que a referência
		// nascimentoDeHerbertMarcuse pode não ter sido inicializada no bloco acima. O
		// compilador não tem como saber se o bloco será executado, mesmo nos casos mais
		// óbvios.
		
		nascimentoDeHerbertMarcuse.mostraData();
		jogosOlímpicosEmHelsinki.mostraData();
		
		System.out.println(nascimentoDeHerbertMarcuse);
		System.out.println(jogosOlímpicosEmHelsinki);
		
 	} // fim do método main

} // fim da classe DemoReferencias
