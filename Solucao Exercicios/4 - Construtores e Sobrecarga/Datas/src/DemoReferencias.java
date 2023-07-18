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
		Data jogosOl�mpicosEmHelsinki = new Data(); // 19/7/1952
		
		
		// Criamos uma nova inst�ncia da classe Data e a associamos � uma das refer�ncias
		nascimentoDeEdgarDegas = new Data((byte)30,(byte)1,(short)1948);
		// Copiamos os valores dos campos da inst�ncia nascimentoDeEdgarDegas para os campos da inst�ncia dataQueAconteceu
		Data dataQueAconteceu = new Data(nascimentoDeEdgarDegas);
		
		// Usamos a refer�ncia para mostrar os campos da inst�ncia
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
 
				nascimentoDeHerbertMarcuse = new Data((byte)21,(byte)6,(short)1965);
				jogosOl�mpicosEmHelsinki.mostraData();
				jogosOl�mpicosEmHelsinki = new Data((byte)19,(byte)7,(short)1952);
		//}
		
		// A linha abaixo causa um erro de compila��o, j� que a refer�ncia
		// nascimentoDeHerbertMarcuse pode n�o ter sido inicializada no bloco acima. O
		// compilador n�o tem como saber se o bloco ser� executado, mesmo nos casos mais
		// �bvios.
		
		
		jogosOl�mpicosEmHelsinki.mostraData();
		nascimentoDeHerbertMarcuse.mostraData();
		
		System.out.println(nascimentoDeHerbertMarcuse);
		System.out.println(jogosOl�mpicosEmHelsinki);
		System.out.println(dataQueAconteceu);
		
 	} // fim do m�todo main

} // fim da classe DemoReferencias
