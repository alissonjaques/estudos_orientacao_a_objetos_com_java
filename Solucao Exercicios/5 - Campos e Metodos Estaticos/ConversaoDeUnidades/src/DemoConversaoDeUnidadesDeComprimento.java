/**
* A classe DemoConversaoDeUnidadesDeComprimento, que demonstra usos dos m�todos
* est�ticos da classe ConversaoDeUnidadesDeComprimento.
*/
class DemoConversaoDeUnidadesDeComprimento{ // declara��o da classe

	/**
	 * O m�todo main permite a execu��o desta classe. Este m�todo demonstra o uso de
	 * m�todos est�ticos da classe ConversaoDeUnidadesDeComprimento, atrav�s da cria��o
	 * de inst�ncias e atrav�s do acesso direto.
	 * @param argumentos os argumentos que podem ser passados para o m�todo via linha
	 * de comando, mas que neste caso ser�o ignorados.
	 */
	public static void main(String[] argumentos){

		// Criamos uma inst�ncia da classe ConversaoDeUnidadesDeComprimento. Como a classe
		// n�o cont�m campos e os m�todos s�o est�ticos, n�o existe real diferen�a entre
		// chamar os m�todos de uma ou outra inst�ncia da classe.
		ConversaoDeUnidadesDeComprimento conv = new ConversaoDeUnidadesDeComprimento();
		
		// Vamos converter alguns valores:
		System.out.println("vinte p�s s�o "+conv.p�sParaCent�metros(20)+" cent�metros");
		System.out.println("cinco polegadas s�o "+conv.polegadasParaCent�metros(5)+" cent�metros");

		// � muito mais pr�tico acessar os m�todos diretamente a partir da classe:
		System.out.println("vinte p�s s�o "+ConversaoDeUnidadesDeComprimento.p�sParaCent�metros(20)+" cent�metros");
		System.out.println("cinco polegadas s�o "+ConversaoDeUnidadesDeComprimento.polegadasParaCent�metros(5)+" cent�metros");
		System.out.println("quarenta cent�metros s�o "+ConversaoDeUnidadesDeComprimento.cent�metrosParaPolegadas(40)+" polegadas");
		System.out.println("90,5 metros s�o "+ConversaoDeUnidadesDeComprimento.metrosParaPolegadas(90.5)+" polegadas");
		System.out.println("8 quil�metros s�o "+ConversaoDeUnidadesDeComprimento.quil�metrosParaMilhas(8)+" milhas");
		
		// Testes para a classe ConversaoDeUnidadesDeArea
		System.out.println();
		System.out.println("Dois acres s�o "+ConversaoDeUnidadesDeArea.acresParaP�sQuadrados(2)+" p�s quadrados");
		System.out.println("Cinco metros quadrados s�o "+ConversaoDeUnidadesDeArea.metrosQuadradosParaP�sQuadrados(5)+" p�s quadrados");
		System.out.println("Noventa p�s quadrados s�o "+ConversaoDeUnidadesDeArea.p�sQuadradosParaCent�metrosQuadrados(90)+" cent�metros quadrados");
		System.out.println("Vinte milhas quadradas s�o "+ConversaoDeUnidadesDeArea.milhasQuadradasParaAcres(20)+" acres");
		
		// Testes para a classe ConversaoDeUnidadesDeVolume
		System.out.println();
		System.out.println("Vinte litros s�o "+ConversaoDeUnidadesDeVolume.litrosParaCent�metrosC�bicos(20)+" cent�metros c�bicos");
		System.out.println("Onze gal�es americanos s�o "+ConversaoDeUnidadesDeVolume.gal�esAmericanosParaPolegadasC�bicas(11)+" polegadas c�bicas");
		System.out.println("Quatorze metros c�bicos s�o "+ConversaoDeUnidadesDeVolume.metrosC�bicosParaP�sC�bicos(14)+" p�s c�bicos");
		
		// Testes para a classe ConversaoDeUnidadesDeVelocidade
		System.out.println();
		System.out.println("Seis milhas por hora s�o "+ConversaoDeUnidadesDeVelocidade.milhasPorHoraParaQuil�metrosPorHora(6)+" quil�metros por hora");
		System.out.println("Cinco quil�metros por hora s�o "+ConversaoDeUnidadesDeVelocidade.quil�metrosPorHoraParaP�sPorSegundo(5)+" p�s por segundo");
		System.out.println("Cem quil�metros por hora s�o "+ConversaoDeUnidadesDeVelocidade.quil�metrosPorHoraParaMetrosPorSegundo(100)+" metros por segundo");
		System.out.println("Vinte milhas por hora s�o "+ConversaoDeUnidadesDeVelocidade.milhasPorHoraParaMetrosPorSegundo(20)+" metros por segundo");
		
		// Testes para a classe ConversaoDeUnidadesDeTempo
		System.out.println();
		System.out.println("Dez minutos s�o "+ConversaoDeUnidadesDeTempo.minutosParaSegundos(10)+" segundos");
		System.out.println("Vinte e quatro horas s�o "+ConversaoDeUnidadesDeTempo.horasParaMinutos(24)+" minutos");
		System.out.println("72 meses s�o "+ConversaoDeUnidadesDeTempo.mesesParaDias(72)+" dias");
		
		// Testes para a classe ConversaoDeTemperatura
		System.out.println();
		System.out.println("32� graus celsius s�o "+ConversaoDeTemperatura.celsiusParaKelvin((double)32)+" kelvins");
		System.out.println("100� graus fahrenheit s�o "+ConversaoDeTemperatura.fahrenheitParaKelvin((double)100)+" kelvins");
		System.out.println("72� graus celsius s�o "+ConversaoDeTemperatura.celsiusParaFahrenheit((double)391)+"� fahrenheit");
		
	} // fim do m�todo main

} // fim da classe DemoConversaoDeUnidadesDeComprimento