/**
 * A classe DataComFabrica, que contém uma fábrica de instâncias da própria classe.
 * Esta classe contém campos que representam uma data e métodos simples para a
 * manipulação destes campos. Esta classe contém também o construtor (que não verifica
 * a validade dos dados) e o método toString.
 */
class DataComFabrica{ // declaração da classe

	/**
	 * Declaração dos campos da classe
	 */
	private byte dia,mês; // dia e mês são representados por bytes
	private short ano; // ano é representado por um short

	/**
	 * O construtor da classe DataComFabrica recebe argumentos para inicializar os campos
	 * da classe. Este construtor não verifica a validade da data para manter a classe
	 * simples.
	 * @param d o argumento correspondente ao método dia
	 * @param m o argumento correspondente ao método mês
	 * @param a o argumento correspondente ao método ano
	 */
	DataComFabrica(byte d,byte m,short a){

		dia = d; mês = m; ano = a;
	
	} // fim do construtor

	/**
	 * O método toString retorna uma String contendo os valores dos campos formatados
	 * @return uma String com a data formatada
	 */
	public String toString(){

		return dia+"/"+mês+"/"+ano;
	
	} // fim do método toString

	/**
	 * O método Natal (uma fábrica de instâncias da classe DataComFabrica) retorna o dia de Natal
	 * para o ano passado como argumento.
	 * @param ano o ano para o qual retornaremos a data de Natal
	 * @return uma instância da classe Data correspondente ao Natal daquele ano
	 */
	public static DataComFabrica Natal(short ano){

		return new DataComFabrica((byte)25,(byte)12,ano);
	
	} // fim do método Natal
	
	/**
	 *  O método primeiroDeAbril, uma fábrica de instâncias da classe DataComFabrica, retorna o dia 
	 *  01 de abril para o ano passado como argumento.
	 *  @param ano o ano para o qual retornaremos a data de 01 de abril
	 *  @return uma instância da classe Data correspondente ao dia 01 de abril daquele ano
	 * 
	 * */
	public static DataComFabrica primeiroDeAbril(short ano) {
		
		return new DataComFabrica((byte)1,(byte)4,ano);
		
	} // fim do método primeiroDeAbril
	
	/**
	 *  O método seteDeSetembro, uma fábrica de instâncias da classe DataComFabrica, retorna o dia
	 *  07 de setembro para o ano passado como argumento.
	 *  @param ano o ano para o qual retornaremos a data de 07 de setembro
	 *  @return uma instância da classe Data correspondente ao dia 07 de setembro daquele ano
	 * 
	 * */
	public static DataComFabrica seteDeSetembro(short ano) {
		
		return new DataComFabrica((byte)7,(byte)9,ano);
		
	} // fim do método seteDeSetembro
	
	/**
	 *  O método primeiroDoMês, uma fábrica de instâncias da classe DataComFabrica, retorna o primeiro
	 *  dia para o mês e o ano passados como argumentos.
	 *  @param mes o mês para o qual retornaremos o primeiro dia
	 *  @param ano o ano para o qual retornaremos o primeiro dia do mês
	 *  @return uma instância da classe DataComFabrica correspondente ao primeiro dia do mês e ano passados
	 *  como argumentos.  
	 * 
	 * */
	public static DataComFabrica primeiroDoMês(byte mes, short ano) {
		
		return new DataComFabrica((byte)1,mes,ano);
		
	} // fim do método primeiroDoMês
	
} // fim da classe DataComFabrica