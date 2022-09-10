/**
 * A classe Ponto2D, que encapsula um ponto no espa�o cartesiano de duas dimens�es.
 * 
 * */

class Ponto2D { // declara��o da classe 
	/**
	 * Declara��o dos campos da classe
	 */
 	private double x,y,d; // as coordenadas do ponto no espa�o bidimensional

 	/**
 	 * O m�todo inicializaPonto2D recebe dois argumentos para inicializar os respectivos
 	 * campos da classe Ponto2D. N�o existem restri��es aos valores que os dados podem
 	 * receber, ent�o a inicializa��o se limita a copiar os argumentos para os campos.
 	 * @param _x o argumento correspondente � coordenada horizontal
 	 * @param _y o argumento correspondente � coordenada vertical
 	 */
	public void inicializaPonto2D(double _x,double _y){

		x = _x;
		y = _y;
 
	} // fim do m�todo inicializaPonto2D

	/**
	 * O m�todo �Igual recebe uma inst�ncia da pr�pria classe Ponto2D como argumento e
	 * verifica se as coordenadas encapsuladas na classe e na inst�ncia que foi passada
	 * s�o exatamente iguais, e retorna o valor booleano true se forem.
	 * @param outroPonto2D outra inst�ncia da pr�pria classe Ponto2D
	 * @return true se as coordenadas encapsuladas forem exatamente iguais �s
	 * encapsuladas na inst�ncia passada como argumento, false caso contr�rio
	 */
	public boolean �Igual(Ponto2D outroPonto2D) {
		
		if ((x == outroPonto2D.x) && // se as coordenadas horizontais forem iguais E
				(y == outroPonto2D.y)) // se as coordenadas verticais forem iguais ent�o
			return true; // o ponto � igual, retorna true
		else
			return false; // o ponto � diferente, retorna false
	
	} // fim do m�todo �Igual

	/**
	 * O m�todo origem retorna uma nova inst�ncia da classe Ponto2D, que cont�m as
	 * coordenadas (0,0) (origem das coordenadas). Esta inst�ncia � criada por este
	 * m�todo, e pode ser usada diretamente por aplica��es ou classes que executem
	 * este m�todo sem necessidade de usar a palavra-chave new.
	 * @return uma nova inst�ncia da classe Ponto2D representando a coordenada (0,0)
	 */
	public Ponto2D origem() {
 
		Ponto2D tempor�rio = new Ponto2D(); // a inicializa��o da inst�ncia � feita aqui
		tempor�rio.inicializaPonto2D(0,0);
		return tempor�rio; // retornamos a refer�ncia inicializada
	
	} // fim do m�todo origem
	
	/**
	 * O m�todo criaRevertido retorna uma nova inst�ncia da classe Ponto2D, que cont�m as coordenadas com os valores inversos (-x,-y) em rela��o ao objeto atual (x,y)
	 * @return revertido uma nova inst�ncia da classe Ponto2D com os campos inversos em rela��o ao objeto atual 
	 * 
	 * */
	public Ponto2D criaRevertido() {
		
		Ponto2D revertido = new Ponto2D();//declaramos uma inst�ncia auxiliar
		revertido.inicializaPonto2D(-x, -y);
		return revertido;//retornamos a refer�ncia inicializada
		
	}// fim do m�todo criaRevertido
	
	/**
	 * O m�todo clona retorna uma nova inst�ncia da classe Ponto2D, que cont�m as
	 * mesmas coordenadas encapsuladas na classe, ou seja, quando este m�todo for
	 * executado a partir de uma inst�ncia desta classe, ele retornar� uma nova
	 * inst�ncia com os mesmos valores encapsulados.
	 * @return uma nova inst�ncia da classe Ponto2D contendo os valores encapsulados
	 */
	public Ponto2D clona() {
		
		Ponto2D tempor�rio = new Ponto2D(); // a inicializa��o da inst�ncia � feita aqui
		tempor�rio.inicializaPonto2D(x,y); // os valores encapsulados s�o usados
		return tempor�rio; // retornamos a refer�ncia inicializada
	
	} // fim do m�todo clona
	
	/**
	 *	O m�todo temEixoComum possu� como argumento outra inst�ncia da classe Ponto2D e analisa se o ponto passado como refer�ncia e o encapsulado possuem algum eixo comum.
	 * 	@param outroPonto2D uma inst�ncia da pr�pria classe Ponto2D
	 *  @return true se pontos comparados tiverem eixo comum
	 *          false caso contr�rio
	 * */
	public boolean temEixoComum(Ponto2D outroPonto2D) {
		
		if((x == outroPonto2D.x)||(y == outroPonto2D.y)) { //se as abscissas ou ordenadas dos pontos forem iguais
			
			return true; //retorne verdadeiro
		
		}
		else { //sen�o
			
			return false; //retorne falso
		
		}
	}// fim do m�todo temEixoComum
	
	/**
	 * 	O m�todo dist�ncia calcula a dist�ncia euclidiana entre o ponto encapsulado e o ponto passado como argumento(outra inst�ncia da classe Ponto2D).
	 * 	@param outroPonto2D uma inst�ncia da pr�pria classe Ponto2D
	 *  @return d a dist�ncia euclidiana entre o ponto encapsulado e o passado como argumento. 
	 * 
	 * */
	public double distancia(Ponto2D outroPonto2D) {
		
		d = Math.sqrt(((x-outroPonto2D.x)*(x-outroPonto2D.x))+((y-outroPonto2D.y)*(y-outroPonto2D.y))); // d� = ((x1-x2)� + (y1-y2)�)
		
		return d;		
		
	}// fim do m�todo distancia
	
	/**
	 *  O m�todo dist�nciaDaOrigem n�o possu� argumentos, ele retorna a dist�ncia entre o ponto encapsulado e a origem do sistema cartesiano bidimensional.
	 *  @return distancia(origemDoPlano) um valor flutuante que representa a dist�ncia do ponto encapsulado da origem do sistema de coordenadas cartesiano
	 * 
	 * */
	public double distanciaDaOrigem() {
		
		Ponto2D origemDoPlano = origem(); //Criamos uma refer�ncia a uma inst�ncia da classe Ponto2D e fazemos ela apontar para uma referencia criada pelo m�todo origem (uma refer�ncia
		                                  //cujos campos s�o a origem do eixos coordenados)
		
		return distancia(origemDoPlano); //retornamos a dist�ncia entre o ponto encapsulado e a origem chamando o m�todo dist�ncia da pr�pria classe 	
		
	}//fim do m�todo distanciaDaOrigem
	
	/**
	 * 	O m�todo �Pr�ximo recebe como argumento uma inst�ncia da pr�pria classe Ponto2D e um valor flutuante que representa um limiar e verifica se a dist�ncia entre o ponto encapsulado
	 * 	e o ponto passado como argumento � menor do que o limiar informado.
	 * 	@param outroPonto2D uma inst�ncia da pr�pria classe Ponto2D
	 * 	@param limiar um n�mero real que representa um limiar
	 *  @return true se a dist�ncia entre o ponto encapsulado e o ponto passado como argumento for menor do que o limiar
	 *  		false caso contr�rio 
	 * 
	 * */	
	public boolean �Pr�ximo(Ponto2D outroPonto2D, double limiar) {
		
		if(distancia(outroPonto2D)<limiar) { //se a dist�ncia entre os pontos for menor do que o valor do limiar		
		
			return true; //retorne verdadeiro
		}
		else { //sen�o
			
			return false; //retorne falso
			
		}
	} //fim do m�todo �Pr�ximo
	
	/**
	 * O m�todo toString � um m�todo "m�gico" que n�o recebe argumentos, e retorna uma
	 * String contendo os valores dos campos da classe formatados.
	 * @return uma String com os valores dos campos formatados como (x,y)
	 */
	public String toString() {
		
		String resultado = "("+x+","+y+")";
		
		return resultado;
	
	} // fim do m�todo toString

 } // fim da classe Ponto2D
