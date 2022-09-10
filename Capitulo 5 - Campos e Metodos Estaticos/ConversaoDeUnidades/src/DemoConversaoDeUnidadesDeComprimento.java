/**
* A classe DemoConversaoDeUnidadesDeComprimento, que demonstra usos dos métodos
* estáticos da classe ConversaoDeUnidadesDeComprimento.
*/
class DemoConversaoDeUnidadesDeComprimento{ // declaração da classe

	/**
	 * O método main permite a execução desta classe. Este método demonstra o uso de
	 * métodos estáticos da classe ConversaoDeUnidadesDeComprimento, através da criação
	 * de instâncias e através do acesso direto.
	 * @param argumentos os argumentos que podem ser passados para o método via linha
	 * de comando, mas que neste caso serão ignorados.
	 */
	public static void main(String[] argumentos){

		// Criamos uma instância da classe ConversaoDeUnidadesDeComprimento. Como a classe
		// não contém campos e os métodos são estáticos, não existe real diferença entre
		// chamar os métodos de uma ou outra instância da classe.
		ConversaoDeUnidadesDeComprimento conv = new ConversaoDeUnidadesDeComprimento();
		
		// Vamos converter alguns valores:
		System.out.println("vinte pés são "+conv.pésParaCentímetros(20)+" centímetros");
		System.out.println("cinco polegadas são "+conv.polegadasParaCentímetros(5)+" centímetros");

		// É muito mais prático acessar os métodos diretamente a partir da classe:
		System.out.println("vinte pés são "+ConversaoDeUnidadesDeComprimento.pésParaCentímetros(20)+" centímetros");
		System.out.println("cinco polegadas são "+ConversaoDeUnidadesDeComprimento.polegadasParaCentímetros(5)+" centímetros");
		System.out.println("quarenta centímetros são "+ConversaoDeUnidadesDeComprimento.centímetrosParaPolegadas(40)+" polegadas");
		System.out.println("90,5 metros são "+ConversaoDeUnidadesDeComprimento.metrosParaPolegadas(90.5)+" polegadas");
		System.out.println("8 quilômetros são "+ConversaoDeUnidadesDeComprimento.quilômetrosParaMilhas(8)+" milhas");
		
		// Testes para a classe ConversaoDeUnidadesDeArea
		System.out.println();
		System.out.println("Dois acres são "+ConversaoDeUnidadesDeArea.acresParaPésQuadrados(2)+" pés quadrados");
		System.out.println("Cinco metros quadrados são "+ConversaoDeUnidadesDeArea.metrosQuadradosParaPésQuadrados(5)+" pés quadrados");
		System.out.println("Noventa pés quadrados são "+ConversaoDeUnidadesDeArea.pésQuadradosParaCentímetrosQuadrados(90)+" centímetros quadrados");
		System.out.println("Vinte milhas quadradas são "+ConversaoDeUnidadesDeArea.milhasQuadradasParaAcres(20)+" acres");
		
		// Testes para a classe ConversaoDeUnidadesDeVolume
		System.out.println();
		System.out.println("Vinte litros são "+ConversaoDeUnidadesDeVolume.litrosParaCentímetrosCúbicos(20)+" centímetros cúbicos");
		System.out.println("Onze galões americanos são "+ConversaoDeUnidadesDeVolume.galõesAmericanosParaPolegadasCúbicas(11)+" polegadas cúbicas");
		System.out.println("Quatorze metros cúbicos são "+ConversaoDeUnidadesDeVolume.metrosCúbicosParaPésCúbicos(14)+" pés cúbicos");
		
		// Testes para a classe ConversaoDeUnidadesDeVelocidade
		System.out.println();
		System.out.println("Seis milhas por hora são "+ConversaoDeUnidadesDeVelocidade.milhasPorHoraParaQuilômetrosPorHora(6)+" quilômetros por hora");
		System.out.println("Cinco quilômetros por hora são "+ConversaoDeUnidadesDeVelocidade.quilômetrosPorHoraParaPésPorSegundo(5)+" pés por segundo");
		System.out.println("Cem quilômetros por hora são "+ConversaoDeUnidadesDeVelocidade.quilômetrosPorHoraParaMetrosPorSegundo(100)+" metros por segundo");
		System.out.println("Vinte milhas por hora são "+ConversaoDeUnidadesDeVelocidade.milhasPorHoraParaMetrosPorSegundo(20)+" metros por segundo");
		
		// Testes para a classe ConversaoDeUnidadesDeTempo
		System.out.println();
		System.out.println("Dez minutos são "+ConversaoDeUnidadesDeTempo.minutosParaSegundos(10)+" segundos");
		System.out.println("Vinte e quatro horas são "+ConversaoDeUnidadesDeTempo.horasParaMinutos(24)+" minutos");
		System.out.println("72 meses são "+ConversaoDeUnidadesDeTempo.mesesParaDias(72)+" dias");
		
		// Testes para a classe ConversaoDeTemperatura
		System.out.println();
		System.out.println("32° graus celsius são "+ConversaoDeTemperatura.celsiusParaKelvin((double)32)+" kelvins");
		System.out.println("100° graus fahrenheit são "+ConversaoDeTemperatura.fahrenheitParaKelvin((double)100)+" kelvins");
		System.out.println("72° graus celsius são "+ConversaoDeTemperatura.celsiusParaFahrenheit((double)391)+"° fahrenheit");
		
	} // fim do método main

} // fim da classe DemoConversaoDeUnidadesDeComprimento