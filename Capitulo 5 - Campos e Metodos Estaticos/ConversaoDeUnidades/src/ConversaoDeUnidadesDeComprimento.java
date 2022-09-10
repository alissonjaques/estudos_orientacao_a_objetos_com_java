/**
* A classe ConversaoDeUnidadesDeComprimento, cont�m v�rios m�todos est�ticos que
* convertem unidades de comprimento. Esta classe n�o tem campos, e todos os seus
* m�todos s�o declarados como static, assim n�o � necess�rio criar inst�ncias desta
* classe para usar os m�todos. Para que os m�todos possam ser acessados de qualquer
* outra classe eles s�o declarados como public.
*/
class ConversaoDeUnidadesDeComprimento{// declara��o da classe

	/**
	 * O m�todo polegadasParaCent�metros converte o valor passado em polegadas para
	 * cent�metros.
	 * @param polegadas o n�mero de polegadas
	 * @return o n�mero de cent�metros correspondente ao n�mero de polegadas
	 */
	public static double polegadasParaCent�metros(double polegadas){
		
		double cent�metros = polegadas*2.54;

		return cent�metros;

	} // fim do m�todo polegadasParaCent�metros
	
	/**
	 * O m�todo cent�metrosParaPolegadas converte o valor passado em cent�metros para
	 * polegadas.
	 * @param cent�metros o n�mero de cent�metros
	 * @return o n�mero de polegadas correspondente ao n�mero de cent�metros 
	 * 
	 * */
	public static double cent�metrosParaPolegadas(double cent�metros){
		
		double polegadas = cent�metros*0.3937;
		
		return polegadas;
		
	} // fim do m�todo cent�metrosParaPolegadas
	
	/**
	 * O m�todo metrosParaPolegadas converte o valor passado em metros para
	 * polegadas.
	 * @param metros o n�mero de metros
	 * @return o n�mero de polegadas correspondente ao n�mero de metros 
	 * 
	 * */
	public static double metrosParaPolegadas(double metros) {
		
		double polegadas = metros*39.37;
		
		return polegadas;
		
	} // fim do m�todo metroParaPolegadas
	
	/**
	 * O m�todo quil�metrosParaMilhas converte o valor passado em quil�metros para
	 * milhas.
	 * @param quil�metros o n�mero de quil�metros
	 * @return o n�mero de milhas correspondente ao n�mero de quil�metros 
	 * 
	 * */
	public static double quil�metrosParaMilhas(double quil�metros) {
		
		double milhas = quil�metros*0.6214;
		
		return milhas;
		
	} // fim do m�todo quil�metrosParaMilhas
	
	
	/**
	 * O m�todo p�sParaCent�metros converte o valor passado em p�s para cent�metros.
	 * @param p�s o n�mero de p�s
	 * @return o n�mero de cent�metros correspondente ao n�mero de p�s
	 */
	public static double p�sParaCent�metros(double p�s){
		
		double cent�metros = p�s*30.48;

		return cent�metros;

	}

	/**
	 * O m�todo milhasParaQuil�metros converte o valor passado em milhas para quil�metros.
	 * @param milhas o n�mero de milhas
	 * @return o n�mero de quil�metros correspondente ao n�mero de milhas
	 */
	public static double milhasParaQuil�metros(double milhas){

		double quil�metros = milhas*1.609;

		return quil�metros;

	} // fim do m�todo milhasParaQuil�metros
		
	/**
	 * O m�todo quil�metrosParaP�s converte o valor passado em quil�metros para p�s.
	 * @param quil�metros o n�mero de quil�metros
	 * @return o n�mero de p�s correspondente ao n�mero de quil�metros
	 */
	public static double quil�metrosParaP�s(double quil�metros) {
		
		double p�s = quil�metros*3280.8;
		
		return p�s;
			
	} // fim do m�todo quil�metrosParaP�s

} // fim da classe ConversaoDeUnidadesDeComprimento