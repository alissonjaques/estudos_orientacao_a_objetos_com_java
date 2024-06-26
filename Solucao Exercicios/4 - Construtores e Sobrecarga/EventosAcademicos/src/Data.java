/**
* A classe Data, que cont�m campos e m�todos que permitem a manipula��o de datas.
* Esta vers�o da classe tem os campos protegidos para evitar a sua manipula��o
* incorreta - valores dos campos s� podem ser acessados atrav�s de m�todos.
*/
class Data{// declara��o da classe

	/**
	 * Declara��o dos campos da classe
	 */
	private byte dia,m�s; // dia e m�s s�o representados por bytes
	private short ano; // ano � representado por um short
	
	/**
	 *  Um construtor para a classe data que recebe tr�s argumentos referentes ao dia, m�s e ano e inicializa os campos
	 *  da classe com esses argumentos se a data for v�lida, se a mesma n�o for v�lida o construtor inicializa os campos
	 *  com o valor 0.
	 *  @param d o valor correspondente ao dia
	 *  @param m o valor correspondente ao m�s
	 *  @param a o valor correspondente ao ano 
	 * 
	 * */
	Data(byte d, byte m, short a){
		
		if (data�V�lida(d,m,a)){// se a data for v�lida, inicializa os campos com os

			// valores passados como argumentos
 			dia = d; m�s = m; ano = a;
 			
		}
		else { // caso contr�rio, inicializa os campos com zero
 
			dia = 0; m�s = 0; ano = 0;
			
		}		
		
	}
	
	/**
	 *  O construtor default para a classe data, que n�o recebe nenhum argumento
	 *  e inicializa os campos da classe com o valor 0. Ele chama o construtor "Com todos os campos"
	 *  para inicializar os campos da classe.
	 *   
	 * */
	Data(){
		
		this((byte)0,(byte)0,(short)0);
		
	}
	
	/**
	 *  O construtor para a classe Data que recebe como argumento uma inst�ncia da pr�pria classe data
	 *  e inicializa os campos do objeto encapsulado copiando os campos da classe passada como argumento.
	 *  @param umaData uma inst�ncia da pr�pria classe data
	 * 
	 * */
	Data(Data umaData){
		
		dia = umaData.retornaDia();
		m�s = umaData.retornaM�s();
		ano = umaData.retornaAno();
		
	} // fim do construtor com um argumento que � um objeto da pr�pria classe Data

	/**
	 * O m�todo inicializaData recebe argumentos para inicializar os campos da classe
	 * Data. Este m�todo chama o m�todo data�V�lida para verificar se os argumentos
	 * correspondem a uma data v�lida: se forem, inicializa os campos, caso contr�rio
	 * inicializa todos os tr�s campos com o valor zero.
	 * @param d o argumento correspondente ao m�todo dia
	 * @param m o argumento correspondente ao m�todo m�s
	 * @param a o argumento correspondente ao m�todo ano
	 */
	/**
	public void inicializaData(byte d,byte m,short a){
		if (data�V�lida(d,m,a)){// se a data for v�lida, inicializa os campos com os

			// valores passados como argumentos
 			dia = d; m�s = m; ano = a;
		}
		else { // caso contr�rio, inicializa os campos com zero
 
			dia = 0; m�s = 0; ano = 0;
		}
	} // fim do m�todo inicializaData
	*/
	
	/**
	 * O m�todo retornaDia retorna o dia da data encapsulada, j� que o campo dia, sendo
	 * declarado como private, n�o poder� ser acessado diretamente de fora da classe.
	 * @return o dia encapsulado pela classe
	 */
	public byte retornaDia() {
		
		return dia;
	
	} // fim do m�todo retornaDia

	/**
	 * O m�todo retornaM�s retorna o m�s da data encapsulada, j� que o campo m�s, sendo
	 * declarado como private, n�o poder� ser acessado diretamente de fora da classe.
	 * @return o m�s encapsulado pela classe
	 */
	public byte retornaM�s() {

		return m�s;
	
	} // fim do m�todo retornaM�s

	/**
	 * O m�todo retornaAno retorna o ano da data encapsulada, j� que o campo ano, sendo
	 * declarado como private, n�o poder� ser acessado diretamente de fora da classe.
	 * @return o ano encapsulado pela classe
	 */
	public short retornaAno() {
		
		return ano;
	
	} // fim do m�todo retornaAno

	/**
	 * O m�todo data�V�lida recebe tr�s valores como argumentos e verifica de maneira
	 * simples se os dados correspondem a uma data v�lida. Se a data for v�lida, retorna
	 * a constante booleana true, caso contr�rio, retorna a constante booleana false.
	 * Vale a pena notar que este algoritmo � simples e incorreto, um dos exerc�cios
	 * sugere a implementa��o do algoritmo correto.
	 * @param d o argumento correspondente ao m�todo dia
	 * @param m o argumento correspondente ao m�todo m�s
	 * @param a o argumento correspondente ao m�todo ano
	 * @return true se a data for v�lida, false se n�o for v�lida
	 */
	public boolean data�V�lida(byte d,byte m,short a) {
	
		if ((d >=1) && // se o dia for maior ou igual a 1 E
				(d <= 31) && // se o dia for menor ou igual a 31 E
				(m >= 1) && // se o m�s for maior ou igual a 1 E
				(m <= 12)) // se o m�s for menor ou igual a 12 ENT�O	
			return true; // a data � v�lida, retorna true
		else
			return false; // a data n�o � v�lida, retorna false
 
	} // fim do m�todo data�V�lida

	/**
	 * O m�todo �Igual recebe uma inst�ncia da pr�pria classe Data como argumento e
	 * verifica se a data representada pela classe e pela inst�ncia que foi passada �
	 * a mesma. A compara��o � feita comparando os campos da data um a um.
	 * @param outraData uma inst�ncia da pr�pria classe Data
	 * @return true se a data encapsulada for igual � passada, false caso contr�rio
	 */
	public boolean �Igual(Data outraData) {
		if ((dia == outraData.dia) && // se os dois dias forem iguais E
				(m�s == outraData.m�s) && // se os dois meses forem iguais E
				(ano == outraData.ano)) // se os dois anos forem iguais ent�o
				return true; // a data � igual, retorna true
		
		else
			return false; // a data � diferente, retorna false
	} // fim do m�todo �Igual

	/**
	 * 
	 * O m�todo clonaData n�o possu� argumentos, ele retorna uma nova inst�ncia que cont�m os mesmos campos da inst�ncia atual, ou seja ele cria um clone de um objeto qualquer.
	 * @return clone um novo objeto com os mesmos campos do objeto atual
	 * 
	 * */
	public Data clonaData() {
		
		Data clone = new Data(dia,m�s,ano);//criamos uma inst�ncia da classe Data com os mesmos campos do objeto encapsulado e a associamos � refer�ncia clona
		
		return clone;//retornamos a nova inst�ncia com os campos clonados
		
	}//fim do m�todo clonaData
	
	
	/**
	 * O m�todo mostraData n�o recebe argumentos nem retorna valores. Este m�todo somente
	 * imprime os valores dos campos, formatados de forma que uma barra ("/") seja
	 * impressa entre eles. Quando o valor do ano for impresso, uma quebra de linha
	 * tamb�m ser� impressa.
	 */
	public void mostraData() {
		
		System.out.print(dia);
		System.out.print("/");
		System.out.print(m�s);
		System.out.print("/");
		System.out.println(ano);
	
	} // fim do m�todo mostraData
	
	/**
	 * O m�todo toString n�o possu� argumentos, ele retorna uma string que representa os campos da classe formatados da seguinte maneira: dia de m�sPorExtenso de ano.
	 * @return mes uma string que representa a data encapsulada no objeto com o m�s escrito por extenso
	 * 
	 * */
	public String toString() {
		
		String mes;
		
		if(m�s==1) {//se o m�s for janeiro
			
			mes = dia+" de Janeiro de "+ano;
			
		}
		else if(m�s==2) {//se o m�s for fevereiro
			
			mes = dia+" de Fevereiro de "+ano;
			
		}
		else if(m�s==3) {//se o m�s for mar�o
			
			mes = dia+" de Mar�o de "+ano;
			
		}
		else if(m�s==4) {//se o m�s for abril
			
			mes = dia+" de Abril de "+ano;
			
		}
		else if(m�s==5) {//se o m�s for maio
	
			mes = dia+" de Maio de "+ano;
			
		}
		else if(m�s==6) {//se o m�s for junho
	
			mes = dia+" de Junho de "+ano;
			
		}
		else if(m�s==7) {//se o m�s for julho
	
			mes = dia+" de Julho de "+ano;
			
		}
		else if(m�s==8) {//se o m�s for agosto
	
			mes = dia+" de Agosto de "+ano;
			
		}
		else if(m�s==9) {//se o m�s for Setembro
	
			mes = dia+" de Setembro de "+ano;
			
		}
		else if(m�s==10) {//se o m�s for Outubro
	
			mes = dia+" de Outubro de "+ano;
			
		}
		else if(m�s==11) {//se o m�s for Novembro
	
			mes = dia+" de Novembro de "+ano;
			
		}
		else{//se o m�s for Dezembro
			
			mes = dia+" de Dezembro de "+ano;
			
		}
		
		return mes;//retorna os campos da classe formatados
		
	}//fim do m�todo toString

 } // fim da classe Data