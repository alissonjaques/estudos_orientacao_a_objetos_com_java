/**
* A classe DemoDataComFabrica, que demonstra usos da classe DataComFabrica.
*/
class DemoDataComFabrica{ // declara��o da classe

	/**
	 * O m�todo main permite a execu��o desta classe. Este m�todo cria algumas
	 * inst�ncias da classe DataComFabrica usando a f�brica de inst�ncias desta
	 * classe.
	 * @param argumentos os argumentos que podem ser passados para o m�todo via linha
	 * de comando, mas que neste caso ser�o ignorados.
	 */
	public static void main(String[] argumentos){

		// Declaramos algumas refer�ncias � inst�ncias da classe DataComFabrica que ser�o
		// inicializadas atrav�s do m�todos est�ticos da mesma (as f�bricas de inst�ncias).
		DataComFabrica NatalDe1966 = DataComFabrica.Natal((short)1966);
		DataComFabrica NatalDe1970 = DataComFabrica.Natal((short)1970);
		DataComFabrica NatalDe2000 = DataComFabrica.Natal((short)2000);
		DataComFabrica primeiroDeAbril2020 = DataComFabrica.primeiroDeAbril((short)2020);
		DataComFabrica seteSetembro2014 = DataComFabrica.seteDeSetembro((short)2014);
		DataComFabrica primeiroDeMaioDe2011 = DataComFabrica.primeiroDoM�s((byte)5,(short)2011);
		DataComFabrica primeiroDeJunhoDe2011 = DataComFabrica.primeiroDoM�s((byte)6,(short)2011);
		
		// Imprimimos as datas atrav�s da chamada impl�cita ao m�todo toString
		System.out.println(NatalDe1966);
		System.out.println(NatalDe1970);
		System.out.println(NatalDe2000);
		System.out.println(primeiroDeAbril2020);
		System.out.println(seteSetembro2014);
		System.out.println(primeiroDeMaioDe2011);
		System.out.println(primeiroDeJunhoDe2011);
		
	} // fim do m�todo main

} // fim da classe DemoDataComFabrica