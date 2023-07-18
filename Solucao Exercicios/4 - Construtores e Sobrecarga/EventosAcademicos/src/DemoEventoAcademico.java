/**
* A classe DemoEventoAcademico, que demonstra o uso de instâncias da classe
* EventoAcademico.
*/
class DemoEventoAcademico{ // declaração da classe

	/**
	 * O método main permite a execução desta classe. Este método contém declarações de
	 * algumas instâncias da classe EventoAcademico, e demonstra seu uso. Algumas
	 * instâncias da classe Data deverão ser criadas e passadas como argumento para o
	 * construtor da classe EventoAcademico.
	 * @param argumentos os argumentos que podem ser passados para o método via linha
	 * de comando, mas que neste caso serão ignorados.
	 */
	public static void main(String[] argumentos){

		// Declaramos algumas referências a instâncias da classe EventoAcademico
		// mas ainda não as inicializamos
		EventoAcademico SBED1998;
		EventoAcademico ISER1999;

		// Algumas instâncias da classe Data serão úteis para inicializar as instâncias
		// da classe EventoAcademico.
		Data data1 = new Data((byte)20,(byte)4,(short)1998);
		Data data2 = new Data((byte)27,(byte)4,(short)1998);

		SBED1998 = new EventoAcademico("Simpósio Brasileiro de Educação à Distância",
										"Londrina (PR)",
										data1,data2,940);
		
		// Reaproveitando as datas, inicializamos a instância ISER1999
		data1 = new Data((byte)28,(byte)11,(short)1999);
		data2 = new Data((byte)4,(byte)12,(short)1999);
		ISER1999 = new EventoAcademico("International Symposium on Educational Robotics",
										"Taipei, Taiwan",
										data1,data2,1308);
		// Imprimimos os dados das instâncias através de chamadas implícitas ao método
		// toString da classe EventoAcademico
		System.out.println(SBED1998);
		System.out.println(ISER1999);

	} // fim do método main

} // fim da classe DemoEventoAcademico