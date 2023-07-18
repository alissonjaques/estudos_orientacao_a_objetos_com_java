/**
* A classe Data, que contém campos e métodos que permitem a manipulação de datas.
* Esta versão da classe tem os campos protegidos para evitar a sua manipulação
* incorreta - valores dos campos só podem ser acessados através de métodos.
*/
class Data{// declaração da classe

	/**
	 * Declaração dos campos da classe
	 */
	private byte dia,mês; // dia e mês são representados por bytes
	private short ano; // ano é representado por um short
	
	/**
	 *  Um construtor para a classe data que recebe três argumentos referentes ao dia, mês e ano e inicializa os campos
	 *  da classe com esses argumentos se a data for válida, se a mesma não for válida o construtor inicializa os campos
	 *  com o valor 0.
	 *  @param d o valor correspondente ao dia
	 *  @param m o valor correspondente ao mês
	 *  @param a o valor correspondente ao ano 
	 * 
	 * */
	Data(byte d, byte m, short a){
		
		if (dataÉVálida(d,m,a)){// se a data for válida, inicializa os campos com os

			// valores passados como argumentos
 			dia = d; mês = m; ano = a;
 			
		}
		else { // caso contrário, inicializa os campos com zero
 
			dia = 0; mês = 0; ano = 0;
			
		}		
		
	}
	
	/**
	 *  O construtor default para a classe data, que não recebe nenhum argumento
	 *  e inicializa os campos da classe com o valor 0. Ele chama o construtor "Com todos os campos"
	 *  para inicializar os campos da classe.
	 *   
	 * */
	Data(){
		
		this((byte)0,(byte)0,(short)0);
		
	}
	
	/**
	 *  O construtor para a classe Data que recebe como argumento uma instância da própria classe data
	 *  e inicializa os campos do objeto encapsulado copiando os campos da classe passada como argumento.
	 *  @param umaData uma instância da própria classe data
	 * 
	 * */
	Data(Data umaData){
		
		dia = umaData.retornaDia();
		mês = umaData.retornaMês();
		ano = umaData.retornaAno();
		
	} // fim do construtor com um argumento que é um objeto da própria classe Data

	/**
	 * O método inicializaData recebe argumentos para inicializar os campos da classe
	 * Data. Este método chama o método dataÉVálida para verificar se os argumentos
	 * correspondem a uma data válida: se forem, inicializa os campos, caso contrário
	 * inicializa todos os três campos com o valor zero.
	 * @param d o argumento correspondente ao método dia
	 * @param m o argumento correspondente ao método mês
	 * @param a o argumento correspondente ao método ano
	 */
	/**
	public void inicializaData(byte d,byte m,short a){
		if (dataÉVálida(d,m,a)){// se a data for válida, inicializa os campos com os

			// valores passados como argumentos
 			dia = d; mês = m; ano = a;
		}
		else { // caso contrário, inicializa os campos com zero
 
			dia = 0; mês = 0; ano = 0;
		}
	} // fim do método inicializaData
	*/
	
	/**
	 * O método retornaDia retorna o dia da data encapsulada, já que o campo dia, sendo
	 * declarado como private, não poderá ser acessado diretamente de fora da classe.
	 * @return o dia encapsulado pela classe
	 */
	public byte retornaDia() {
		
		return dia;
	
	} // fim do método retornaDia

	/**
	 * O método retornaMês retorna o mês da data encapsulada, já que o campo mês, sendo
	 * declarado como private, não poderá ser acessado diretamente de fora da classe.
	 * @return o mês encapsulado pela classe
	 */
	public byte retornaMês() {

		return mês;
	
	} // fim do método retornaMês

	/**
	 * O método retornaAno retorna o ano da data encapsulada, já que o campo ano, sendo
	 * declarado como private, não poderá ser acessado diretamente de fora da classe.
	 * @return o ano encapsulado pela classe
	 */
	public short retornaAno() {
		
		return ano;
	
	} // fim do método retornaAno

	/**
	 * O método dataÉVálida recebe três valores como argumentos e verifica de maneira
	 * simples se os dados correspondem a uma data válida. Se a data for válida, retorna
	 * a constante booleana true, caso contrário, retorna a constante booleana false.
	 * Vale a pena notar que este algoritmo é simples e incorreto, um dos exercícios
	 * sugere a implementação do algoritmo correto.
	 * @param d o argumento correspondente ao método dia
	 * @param m o argumento correspondente ao método mês
	 * @param a o argumento correspondente ao método ano
	 * @return true se a data for válida, false se não for válida
	 */
	public boolean dataÉVálida(byte d,byte m,short a) {
	
		if ((d >=1) && // se o dia for maior ou igual a 1 E
				(d <= 31) && // se o dia for menor ou igual a 31 E
				(m >= 1) && // se o mês for maior ou igual a 1 E
				(m <= 12)) // se o mês for menor ou igual a 12 ENTÃO	
			return true; // a data é válida, retorna true
		else
			return false; // a data não é válida, retorna false
 
	} // fim do método dataÉVálida

	/**
	 * O método éIgual recebe uma instância da própria classe Data como argumento e
	 * verifica se a data representada pela classe e pela instância que foi passada é
	 * a mesma. A comparação é feita comparando os campos da data um a um.
	 * @param outraData uma instância da própria classe Data
	 * @return true se a data encapsulada for igual à passada, false caso contrário
	 */
	public boolean éIgual(Data outraData) {
		if ((dia == outraData.dia) && // se os dois dias forem iguais E
				(mês == outraData.mês) && // se os dois meses forem iguais E
				(ano == outraData.ano)) // se os dois anos forem iguais então
				return true; // a data é igual, retorna true
		
		else
			return false; // a data é diferente, retorna false
	} // fim do método éIgual

	/**
	 * 
	 * O método clonaData não possuí argumentos, ele retorna uma nova instância que contêm os mesmos campos da instância atual, ou seja ele cria um clone de um objeto qualquer.
	 * @return clone um novo objeto com os mesmos campos do objeto atual
	 * 
	 * */
	public Data clonaData() {
		
		Data clone = new Data(dia,mês,ano);//criamos uma instância da classe Data com os mesmos campos do objeto encapsulado e a associamos à referência clona
		
		return clone;//retornamos a nova instância com os campos clonados
		
	}//fim do método clonaData
	
	
	/**
	 * O método mostraData não recebe argumentos nem retorna valores. Este método somente
	 * imprime os valores dos campos, formatados de forma que uma barra ("/") seja
	 * impressa entre eles. Quando o valor do ano for impresso, uma quebra de linha
	 * também será impressa.
	 */
	public void mostraData() {
		
		System.out.print(dia);
		System.out.print("/");
		System.out.print(mês);
		System.out.print("/");
		System.out.println(ano);
	
	} // fim do método mostraData
	
	/**
	 * O método toString não possuí argumentos, ele retorna uma string que representa os campos da classe formatados da seguinte maneira: dia de mêsPorExtenso de ano.
	 * @return mes uma string que representa a data encapsulada no objeto com o mês escrito por extenso
	 * 
	 * */
	public String toString() {
		
		String mes;
		
		if(mês==1) {//se o mês for janeiro
			
			mes = dia+" de Janeiro de "+ano;
			
		}
		else if(mês==2) {//se o mês for fevereiro
			
			mes = dia+" de Fevereiro de "+ano;
			
		}
		else if(mês==3) {//se o mês for março
			
			mes = dia+" de Março de "+ano;
			
		}
		else if(mês==4) {//se o mês for abril
			
			mes = dia+" de Abril de "+ano;
			
		}
		else if(mês==5) {//se o mês for maio
	
			mes = dia+" de Maio de "+ano;
			
		}
		else if(mês==6) {//se o mês for junho
	
			mes = dia+" de Junho de "+ano;
			
		}
		else if(mês==7) {//se o mês for julho
	
			mes = dia+" de Julho de "+ano;
			
		}
		else if(mês==8) {//se o mês for agosto
	
			mes = dia+" de Agosto de "+ano;
			
		}
		else if(mês==9) {//se o mês for Setembro
	
			mes = dia+" de Setembro de "+ano;
			
		}
		else if(mês==10) {//se o mês for Outubro
	
			mes = dia+" de Outubro de "+ano;
			
		}
		else if(mês==11) {//se o mês for Novembro
	
			mes = dia+" de Novembro de "+ano;
			
		}
		else{//se o mês for Dezembro
			
			mes = dia+" de Dezembro de "+ano;
			
		}
		
		return mes;//retorna os campos da classe formatados
		
	}//fim do método toString

 } // fim da classe Data