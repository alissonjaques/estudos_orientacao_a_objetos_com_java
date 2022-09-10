/**
 *  A classe ConversaoDeUnidadesDeArea é uma biblioteca de métodos que possuí funcionalidades 
 *  para conversão de unidades de área. Todos os seus métodos são estáticos, assim podem ser
 *  acessados diretamente por outras classes.
 *  @author Alisson Jaques
 * 
 * */
public class ConversaoDeUnidadesDeArea {

	/**
	 *  O método metrosQuadradosParaPésQuadrados converte o valor passado em metros quadrados
	 *  para pés quadrados.
	 *  @param metrosQuadrados o número de metros quadrados da área
	 *  @return a quantidade de pés quadrados correspondente ao número de metros quadrados 
	 * 
	 * */
	public static double metrosQuadradosParaPésQuadrados(double metrosQuadrados) {
			
	double pésQuadrados = metrosQuadrados*10.76;
	
	return pésQuadrados;
	
	} // fim do método metrosQuadradosParaPésQuadrados
	
	/**
	 *  O método pésQuadradosParaCentímetrosQuadrados converte o valor passado em pés quadrados
	 *  para centímetros quadrados.
	 *  @param pésQuadrados o número de pés quadrados da área
	 *  @return a quantidade de centímetros quadrados correspondente ao número de pés quadrados 
	 * 
	 * */
	public static double pésQuadradosParaCentímetrosQuadrados(double pésQuadrados) {
			
	double centímetrosQuadrados = pésQuadrados*929;
	
	return centímetrosQuadrados;
	
	} // fim do método pésQuadradosParaCentímetrosQuadrados
	
	/**
	 *  O método milhasQuadradasParaAcres converte o valor passado em milhas quadradas
	 *  para acres.
	 *  @param milhasQuadradas o número de milhas quadradas da área
	 *  @return a quantidade de acres correspondente ao número de milhas quadradas 
	 * 
	 * */
	public static double milhasQuadradasParaAcres(double milhasQuadradas) {
			
		double acres = milhasQuadradas*640;
	
	return acres;
	
	} // fim do método milhasQuadradasParaAcres
	
	/**
	 *  O método acresParaPésQuadrados converte o valor passado em acres para pés
	 *  quadrados.
	 *  @param acres o número de acres da área
	 *  @return a quantidade de pés quadrados correspondente ao número de acres 
	 * 
	 * */
	public static double acresParaPésQuadrados(double acres) {
			
		double pésQuadrados = acres*43560;
	
	return pésQuadrados;
	
	} // fim do método acresParaPésQuadrados
	
	/**
	 *  O método pésQuadradosParaAcres converte o valor passado em pés quadrados para
	 *  acres.
	 *  @param pésQuadrados o número de pés quadrados da área
	 *  @return a quantidade de acres correspondente ao número de pés quadrados 
	 * 
	 * */
	public static double pésQuadradosParaAcres(double pésQuadrados) {
		
		double acres = pésQuadrados/43560;
		
		return acres;
		
	} // fim do método pésQuadradosParaAcres
	
	/**
	 *  O método metrosQuadradosParaCentímetrosQuadrados converte o valor passado em metros
	 *  quadrados para centímetros quadrados.
	 *  @param metrosQuadrados o número de metros quadrados da área
	 *  @return a quantidade de centímetros quadrados correspondente ao número de metros 
	 *  quadrados 
	 * 
	 * */
	public static double metrosQuadradosParaCentímetrosQuadrados(double metrosQuadrados) {
		
		double centímetrosQuadrados = metrosQuadrados*10000;
		
		return centímetrosQuadrados;
		
	} // fim do método metrosQuadradosParaCentímetrosQuadrados
	
} // fim da classe ConversaoDeUnidadesDeArea