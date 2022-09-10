/**
 *  A classe ConversaoDeUnidadesDeArea � uma biblioteca de m�todos que possu� funcionalidades 
 *  para convers�o de unidades de �rea. Todos os seus m�todos s�o est�ticos, assim podem ser
 *  acessados diretamente por outras classes.
 *  @author Alisson Jaques
 * 
 * */
public class ConversaoDeUnidadesDeArea {

	/**
	 *  O m�todo metrosQuadradosParaP�sQuadrados converte o valor passado em metros quadrados
	 *  para p�s quadrados.
	 *  @param metrosQuadrados o n�mero de metros quadrados da �rea
	 *  @return a quantidade de p�s quadrados correspondente ao n�mero de metros quadrados 
	 * 
	 * */
	public static double metrosQuadradosParaP�sQuadrados(double metrosQuadrados) {
			
	double p�sQuadrados = metrosQuadrados*10.76;
	
	return p�sQuadrados;
	
	} // fim do m�todo metrosQuadradosParaP�sQuadrados
	
	/**
	 *  O m�todo p�sQuadradosParaCent�metrosQuadrados converte o valor passado em p�s quadrados
	 *  para cent�metros quadrados.
	 *  @param p�sQuadrados o n�mero de p�s quadrados da �rea
	 *  @return a quantidade de cent�metros quadrados correspondente ao n�mero de p�s quadrados 
	 * 
	 * */
	public static double p�sQuadradosParaCent�metrosQuadrados(double p�sQuadrados) {
			
	double cent�metrosQuadrados = p�sQuadrados*929;
	
	return cent�metrosQuadrados;
	
	} // fim do m�todo p�sQuadradosParaCent�metrosQuadrados
	
	/**
	 *  O m�todo milhasQuadradasParaAcres converte o valor passado em milhas quadradas
	 *  para acres.
	 *  @param milhasQuadradas o n�mero de milhas quadradas da �rea
	 *  @return a quantidade de acres correspondente ao n�mero de milhas quadradas 
	 * 
	 * */
	public static double milhasQuadradasParaAcres(double milhasQuadradas) {
			
		double acres = milhasQuadradas*640;
	
	return acres;
	
	} // fim do m�todo milhasQuadradasParaAcres
	
	/**
	 *  O m�todo acresParaP�sQuadrados converte o valor passado em acres para p�s
	 *  quadrados.
	 *  @param acres o n�mero de acres da �rea
	 *  @return a quantidade de p�s quadrados correspondente ao n�mero de acres 
	 * 
	 * */
	public static double acresParaP�sQuadrados(double acres) {
			
		double p�sQuadrados = acres*43560;
	
	return p�sQuadrados;
	
	} // fim do m�todo acresParaP�sQuadrados
	
	/**
	 *  O m�todo p�sQuadradosParaAcres converte o valor passado em p�s quadrados para
	 *  acres.
	 *  @param p�sQuadrados o n�mero de p�s quadrados da �rea
	 *  @return a quantidade de acres correspondente ao n�mero de p�s quadrados 
	 * 
	 * */
	public static double p�sQuadradosParaAcres(double p�sQuadrados) {
		
		double acres = p�sQuadrados/43560;
		
		return acres;
		
	} // fim do m�todo p�sQuadradosParaAcres
	
	/**
	 *  O m�todo metrosQuadradosParaCent�metrosQuadrados converte o valor passado em metros
	 *  quadrados para cent�metros quadrados.
	 *  @param metrosQuadrados o n�mero de metros quadrados da �rea
	 *  @return a quantidade de cent�metros quadrados correspondente ao n�mero de metros 
	 *  quadrados 
	 * 
	 * */
	public static double metrosQuadradosParaCent�metrosQuadrados(double metrosQuadrados) {
		
		double cent�metrosQuadrados = metrosQuadrados*10000;
		
		return cent�metrosQuadrados;
		
	} // fim do m�todo metrosQuadradosParaCent�metrosQuadrados
	
} // fim da classe ConversaoDeUnidadesDeArea