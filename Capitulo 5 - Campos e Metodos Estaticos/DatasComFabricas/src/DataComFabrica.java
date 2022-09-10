/**
 * A classe DataComFabrica, que cont�m uma f�brica de inst�ncias da pr�pria classe.
 * Esta classe cont�m campos que representam uma data e m�todos simples para a
 * manipula��o destes campos. Esta classe cont�m tamb�m o construtor (que n�o verifica
 * a validade dos dados) e o m�todo toString.
 */
class DataComFabrica{ // declara��o da classe

	/**
	 * Declara��o dos campos da classe
	 */
	private byte dia,m�s; // dia e m�s s�o representados por bytes
	private short ano; // ano � representado por um short

	/**
	 * O construtor da classe DataComFabrica recebe argumentos para inicializar os campos
	 * da classe. Este construtor n�o verifica a validade da data para manter a classe
	 * simples.
	 * @param d o argumento correspondente ao m�todo dia
	 * @param m o argumento correspondente ao m�todo m�s
	 * @param a o argumento correspondente ao m�todo ano
	 */
	DataComFabrica(byte d,byte m,short a){

		dia = d; m�s = m; ano = a;
	
	} // fim do construtor

	/**
	 * O m�todo toString retorna uma String contendo os valores dos campos formatados
	 * @return uma String com a data formatada
	 */
	public String toString(){

		return dia+"/"+m�s+"/"+ano;
	
	} // fim do m�todo toString

	/**
	 * O m�todo Natal (uma f�brica de inst�ncias da classe DataComFabrica) retorna o dia de Natal
	 * para o ano passado como argumento.
	 * @param ano o ano para o qual retornaremos a data de Natal
	 * @return uma inst�ncia da classe Data correspondente ao Natal daquele ano
	 */
	public static DataComFabrica Natal(short ano){

		return new DataComFabrica((byte)25,(byte)12,ano);
	
	} // fim do m�todo Natal
	
	/**
	 *  O m�todo primeiroDeAbril, uma f�brica de inst�ncias da classe DataComFabrica, retorna o dia 
	 *  01 de abril para o ano passado como argumento.
	 *  @param ano o ano para o qual retornaremos a data de 01 de abril
	 *  @return uma inst�ncia da classe Data correspondente ao dia 01 de abril daquele ano
	 * 
	 * */
	public static DataComFabrica primeiroDeAbril(short ano) {
		
		return new DataComFabrica((byte)1,(byte)4,ano);
		
	} // fim do m�todo primeiroDeAbril
	
	/**
	 *  O m�todo seteDeSetembro, uma f�brica de inst�ncias da classe DataComFabrica, retorna o dia
	 *  07 de setembro para o ano passado como argumento.
	 *  @param ano o ano para o qual retornaremos a data de 07 de setembro
	 *  @return uma inst�ncia da classe Data correspondente ao dia 07 de setembro daquele ano
	 * 
	 * */
	public static DataComFabrica seteDeSetembro(short ano) {
		
		return new DataComFabrica((byte)7,(byte)9,ano);
		
	} // fim do m�todo seteDeSetembro
	
	/**
	 *  O m�todo primeiroDoM�s, uma f�brica de inst�ncias da classe DataComFabrica, retorna o primeiro
	 *  dia para o m�s e o ano passados como argumentos.
	 *  @param mes o m�s para o qual retornaremos o primeiro dia
	 *  @param ano o ano para o qual retornaremos o primeiro dia do m�s
	 *  @return uma inst�ncia da classe DataComFabrica correspondente ao primeiro dia do m�s e ano passados
	 *  como argumentos.  
	 * 
	 * */
	public static DataComFabrica primeiroDoM�s(byte mes, short ano) {
		
		return new DataComFabrica((byte)1,mes,ano);
		
	} // fim do m�todo primeiroDoM�s
	
} // fim da classe DataComFabrica