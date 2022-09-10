class DemoReferencias{// declara��o da classe
	/**
	 * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es
	 * de algumas inst�ncias da classe Data e suas refer�ncias.
	 * @param argumentos os argumentos que podem ser passados para o m�todo via linha
	 * de comando, mas que neste caso ser�o ignorados.
	 */
	public static void main(String[] argumentos){
		
	// Declaramos tr�s refer�ncias a inst�ncias da classe Data, e inicializamos duas
		// com o "valor" null
		Data nascimentoDeEdgarDegas = null; // 19/7/1834
		Data nascimentoDeHerbertMarcuse; // 19/7/1898
		Data jogosOl�mpicosEmHelsinki = null; // 19/7/1952
		
		// Criamos uma nova inst�ncia da classe Data e a associamos � uma das refer�ncias
		nascimentoDeEdgarDegas = new Data();
		
		// Usamos a refer�ncia para inicializar os campos da inst�ncia
		nascimentoDeEdgarDegas.inicializaData((byte)30,(byte)1,(short)1948);
		nascimentoDeEdgarDegas.mostraData();
		// Dereferenciamos a refer�ncia - ela volta a apontar para null
		nascimentoDeEdgarDegas = null;
		/**
		// Se o programa pudesse ser compilado, a linha abaixo causaria um erro em tempo de
		// execu��o que interromperia a execu��o do programa. A pr�xima linha causaria o
		// mesmo erro, mas nunca ser� alcan�ada.
		nascimentoDeEdgarDegas.mostraData();
		jogosOl�mpicosEmHelsinki.mostraData();
 		*/
		// Uma inicializa��o condicional: a inst�ncia nascimentoDeHerbertMarcuse s�
		// ser� inicializada se true for igual a false, ou seja, nunca.
		//if (true == false){
 
				nascimentoDeHerbertMarcuse = new Data();
				nascimentoDeHerbertMarcuse.inicializaData((byte)21,(byte)6,(short)1965);
				jogosOl�mpicosEmHelsinki = new Data();
				jogosOl�mpicosEmHelsinki.inicializaData((byte)19,(byte)7,(short)1952);
		//}
		
		// A linha abaixo causa um erro de compila��o, j� que a refer�ncia
		// nascimentoDeHerbertMarcuse pode n�o ter sido inicializada no bloco acima. O
		// compilador n�o tem como saber se o bloco ser� executado, mesmo nos casos mais
		// �bvios.
		
		nascimentoDeHerbertMarcuse.mostraData();
		jogosOl�mpicosEmHelsinki.mostraData();
		
		System.out.println(nascimentoDeHerbertMarcuse);
		System.out.println(jogosOl�mpicosEmHelsinki);
		
 	} // fim do m�todo main

} // fim da classe DemoReferencias
