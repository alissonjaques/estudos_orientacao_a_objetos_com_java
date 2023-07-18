/**
* A classe DemoDataComFabrica, que demonstra usos da classe DataComFabrica.
*/
class DemoDataComFabrica{ // declaração da classe

	/**
	 * O método main permite a execução desta classe. Este método cria algumas
	 * instâncias da classe DataComFabrica usando a fábrica de instâncias desta
	 * classe.
	 * @param argumentos os argumentos que podem ser passados para o método via linha
	 * de comando, mas que neste caso serão ignorados.
	 */
	public static void main(String[] argumentos){

		// Declaramos algumas referências à instâncias da classe DataComFabrica que serão
		// inicializadas através do métodos estáticos da mesma (as fábricas de instâncias).
		DataComFabrica NatalDe1966 = DataComFabrica.Natal((short)1966);
		DataComFabrica NatalDe1970 = DataComFabrica.Natal((short)1970);
		DataComFabrica NatalDe2000 = DataComFabrica.Natal((short)2000);
		DataComFabrica primeiroDeAbril2020 = DataComFabrica.primeiroDeAbril((short)2020);
		DataComFabrica seteSetembro2014 = DataComFabrica.seteDeSetembro((short)2014);
		DataComFabrica primeiroDeMaioDe2011 = DataComFabrica.primeiroDoMês((byte)5,(short)2011);
		DataComFabrica primeiroDeJunhoDe2011 = DataComFabrica.primeiroDoMês((byte)6,(short)2011);
		
		// Imprimimos as datas através da chamada implícita ao método toString
		System.out.println(NatalDe1966);
		System.out.println(NatalDe1970);
		System.out.println(NatalDe2000);
		System.out.println(primeiroDeAbril2020);
		System.out.println(seteSetembro2014);
		System.out.println(primeiroDeMaioDe2011);
		System.out.println(primeiroDeJunhoDe2011);
		
	} // fim do método main

} // fim da classe DemoDataComFabrica