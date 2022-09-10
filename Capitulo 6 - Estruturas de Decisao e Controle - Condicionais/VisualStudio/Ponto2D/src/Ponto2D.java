/**
 * A classe Ponto2D, que encapsula um ponto no espaço cartesiano de duas dimensões.
 * 
 * */

class Ponto2D { // declaração da classe 
	/**
	 * Declaração dos campos da classe
	 */
 	private double x,y,d; // as coordenadas do ponto no espaço bidimensional
 	
 	/**
 	 *  O construtor para a classe Ponto2D que rebece dois argumentos flutuantes e inicializa
 	 *  os campos da classe com os mesmos.
 	 *  @param x um número flutuante que representa a coordenada x do ponto
 	 *  @param y um número flutuante que representa a coordenada y do ponto
 	 *  
 	 * */
 	Ponto2D(double _x, double _y){
 		
 		x = _x;
 		y = _y;		
 		
 	} // fim do construtor com todos os argumentos
    
    /**
     *  O construtor para a classe Ponto2D que recebe um único argumento,
     *  referente à ordena x, e inicializa a abscissa com esse valor. A 
     *  ordenada é inicializa com o valor default 0. 
     *  @param _x x um número flutuante que representa a coordenada x do ponto
     * 
     */
    Ponto2D(double _x){

        x = _x;
        y = 0.0;

    } // fim do construtor com apenas um argumento

 	/**
 	 *  O construtor para a classe Ponto2D que não recebe nenhum argumento
 	 *  e inicializa os campos da classe com valores default (0 e 0), ou seja,
 	 *  o ponto representa à origem do plano cartesiano ortogonal. A inicialização
 	 *  é feita através de uma chamada ao construtor com todos os argumentos. 	 * 
 	 * 
 	 * */
 	Ponto2D(){
 		
 		this(0.0,0.0);
 		
 	} // fim do construtor default
 	
	/**
	 * O método éIgual recebe uma instância da própria classe Ponto2D como argumento e
	 * verifica se as coordenadas encapsuladas na classe e na instância que foi passada
	 * são exatamente iguais, e retorna o valor booleano true se forem.
	 * @param outroPonto2D outra instância da própria classe Ponto2D
	 * @return true se as coordenadas encapsuladas forem exatamente iguais às
	 * encapsuladas na instância passada como argumento, false caso contrário
	 */
	public boolean éIgual(Ponto2D outroPonto2D) {
		
		if ((x == outroPonto2D.x) && // se as coordenadas horizontais forem iguais E
				(y == outroPonto2D.y)) // se as coordenadas verticais forem iguais então
			return true; // o ponto é igual, retorna true
		else
			return false; // o ponto é diferente, retorna false
	
	} // fim do método éIgual

	/**
	 * O método origem retorna uma nova instância da classe Ponto2D, que contém as
	 * coordenadas (0,0) (origem das coordenadas). Esta instância é criada por este
	 * método, e pode ser usada diretamente por aplicações ou classes que executem
	 * este método sem necessidade de usar a palavra-chave new. Este método é estático
     * e pode ser acessado por outras classes sem a necessidade de criar instâncias para
     * a classe Ponto2D.
	 * @return uma nova instância da classe Ponto2D representando a coordenada (0,0)
	 */
	public static Ponto2D origem() {
 
		Ponto2D temporário = new Ponto2D(); // a inicialização da instância é feita aqui

		return temporário; // retornamos a referência inicializada (0,0)
	
	} // fim do método origem
	
	/**
	 * O método criaRevertido retorna uma nova instância da classe Ponto2D, que contém as coordenadas com os valores inversos (-x,-y) em relação ao objeto atual (x,y)
	 * @return revertido uma nova instância da classe Ponto2D com os campos inversos em relação ao objeto atual 
	 * 
	 * */
	public Ponto2D criaRevertido() {
		
		Ponto2D revertido = new Ponto2D(-x,-y);//declaramos uma instância auxiliar
	
		return revertido;//retornamos a referência inicializada
		
	}// fim do método criaRevertido
	
	/**
	 * O método clona retorna uma nova instância da classe Ponto2D, que contém as
	 * mesmas coordenadas encapsuladas na classe, ou seja, quando este método for
	 * executado a partir de uma instância desta classe, ele retornará uma nova
	 * instância com os mesmos valores encapsulados.
	 * @return uma nova instância da classe Ponto2D contendo os valores encapsulados
	 */
	public Ponto2D clona() {
		
		Ponto2D temporário = new Ponto2D(x,y); // a inicialização da instância é feita aqui
		
		return temporário; // retornamos a referência inicializada
	
	} // fim do método clona
	
	/**
	 *	O método temEixoComum possuí como argumento outra instância da classe Ponto2D e analisa se o ponto passado como referência e o encapsulado possuem algum eixo comum.
	 * 	@param outroPonto2D uma instância da própria classe Ponto2D
	 *  @return true se pontos comparados tiverem eixo comum
	 *          false caso contrário
	 * */
	public boolean temEixoComum(Ponto2D outroPonto2D) {
		
		if((x == outroPonto2D.x)||(y == outroPonto2D.y)) { //se as abscissas ou ordenadas dos pontos forem iguais
			
			return true; //retorne verdadeiro
		
		}
		else { //senão
			
			return false; //retorne falso
		
		}
	}// fim do método temEixoComum
	
	/**
	 * 	O método distância calcula a distância euclidiana entre o ponto encapsulado e o ponto passado como argumento(outra instância da classe Ponto2D).
	 * 	@param outroPonto2D uma instância da própria classe Ponto2D
	 *  @return d a distância euclidiana entre o ponto encapsulado e o passado como argumento. 
	 * 
	 * */
	public double distancia(Ponto2D outroPonto2D) {
		
		d = Math.sqrt(((x-outroPonto2D.x)*(x-outroPonto2D.x))+((y-outroPonto2D.y)*(y-outroPonto2D.y))); // d² = ((x1-x2)² + (y1-y2)²)
		
		return d;		
		
	}// fim do método distancia
	
	/**
	 *  O método distânciaDaOrigem não possuí argumentos, ele retorna a distância entre o ponto encapsulado e a origem do sistema cartesiano bidimensional.
	 *  @return distancia(origemDoPlano) um valor flutuante que representa a distância do ponto encapsulado da origem do sistema de coordenadas cartesiano
	 * 
	 * */
	public double distanciaDaOrigem() {
		
		Ponto2D origemDoPlano = origem(); //Criamos uma referência a uma instância da classe Ponto2D e fazemos ela apontar para uma referencia criada pelo método origem (uma referência
		                                  //cujos campos são a origem do eixos coordenados)
		
		return distancia(origemDoPlano); //retornamos a distância entre o ponto encapsulado e a origem chamando o método distância da própria classe 	
		
	}//fim do método distanciaDaOrigem
	
	/**
	 * 	O método éPróximo recebe como argumento uma instância da própria classe Ponto2D e um valor flutuante que representa um limiar e verifica se a distância entre o ponto encapsulado
	 * 	e o ponto passado como argumento é menor do que o limiar informado.
	 * 	@param outroPonto2D uma instância da própria classe Ponto2D
	 * 	@param limiar um número real que representa um limiar
	 *  @return true se a distância entre o ponto encapsulado e o ponto passado como argumento for menor do que o limiar
	 *  		false caso contrário 
	 * 
	 * */	
	public boolean éPróximo(Ponto2D outroPonto2D, double limiar) {
		
		if(distancia(outroPonto2D)<limiar) { //se a distância entre os pontos for menor do que o valor do limiar		
		
			return true; //retorne verdadeiro
		}
		else { //senão
			
			return false; //retorne falso
			
		}
	} //fim do método éPróximo
	
	/**
	 *  O método modifica recebe como argumentos dois números flutuantes e atribuí esses
	 *  valores aos campos da classe, sendo o primeiro atribuído à coordenada x e o segundo
	 *  à coordenada y.
	 *  @param _x um valor flutuante que representa a coordenada x do ponto no plano
	 *  @param _y um valor flutuante que representa a coordenada y do ponto no plano
	 * 
	 * */
	public void modifica(double _x, double _y) {
		
		x = _x;
		y = _y;
		
	} // fim do método modifica com todos os argumentos
	
	/**
	 *  O método modifica sobrecarregado, que recebe um único valor flutuante e atribuí o
	 *  mesmo à coordenada x do ponto no plano.
	 *  @param _x um valor flutuante que representa a coordenada x do ponto no plano
	 * 
	 * */
	public void modifica(double _x) {
		
		modificaX(_x);	
		
	} // fim do método modifica com apenas um argumento flutuante
	
	/**
	 *  O médoto modifica, que não possuí nenhum argumento e nenhum comando em seu interior.
	 *  Quando chamado simplesmente não modifica os campos da classe.
	 * 
	 * */
	public void modifica(){
		
	} // fim do método modifica sem argumentos
	
	/**
	 *  O método modificaX recebe como argumento um valor flutuante e o atribuí 
	 *  à coordenada x do ponto encapsulado.
	 *  @param _x um valor flutuante que representa a coordenada x do ponto no plano
	 * 
	 * */
	public void modificaX(double _x) {
		
		x = _x;
		
	} // fim do método modificaX com todos os argumentos
	
	/**
	 *  O método modificaX sem argumentos e sem comandos em seu interior.
	 *  Que não modifica o campo x, quando é chamado.
	 * 
	 * */
	public void modificaX() {
		
		
	} // fim do método modificaX sem argumentos
	
	/**
	 *  O método modificaY recebe como argumento um valor flutuante e o atribuí 
	 *  à coordenada y do ponto encapsulado.
	 *  @param _y um valor flutuante que representa a coordenada y do ponto no plano
	 * 
	 * */
	public void modificaY(double _y) {
		
		y = _y;
		
	} // fim do método modificaY com todos os argumentos
	
	/**
	 *  O método modificaY sem argumentos e sem comandos em seu interior.
	 *  Que não modifica o campo y, quando é chamado.
	 * 
	 * */
	public void modificaY() {
		
	} // fim do método modificaY sem argumentos
	
	/**
	 *  O método retornaY não possuí argumentos e retorna o valor
	 *  guardado no campo y do objeto encapsulado.
	 *  @return y um valor flutuante correspondente à coordenada y 
	 *  do ponto encapsulado
	 * 
	 * */
	public double retornaY() {
		
		return y;
		
	} // fim do método retornaY
	
	/**
	 *  O método retornaX não possuí argumentos e retorna o valor
	 *  guardado no campo x do objeto encapsulado.
	 *  @return x um valor flutuante correspondente à coordenada x 
	 *  do ponto encapsulado
	 * 
	 * */
	public double retornaX() {
		
		return x;
		
	} // fim do método retornaX
    
    /**
	 *  O método estáAcimaDe recebe como argumento uma outra instância da classe
	 *  Ponto2D e retorna true se o ponto encapsulado estiver acima do ponto
	 *  passado como argumento.
	 *  @param outroPonto2D uma outra instância da classe Ponto2D
	 *  @return true se o ponto encapsulado estiver acima do ponto passado como
	 *  argumento, false caso contrário
	 * 
	 * */
	public boolean estáAcimaDe(Ponto2D outroPonto2D) {
		
		return (y > outroPonto2D.y ? true : false);	// uso do operador ternário para simplificação
		
	} // fim do método estáAcimaDe
	
	/**
	 *  O método estáAbaixoDe recebe como argumento uma outra instância da classe
	 *  Ponto2D e retorna true se o ponto encapsulado estiver abaixo do ponto
	 *  passado como argumento.
	 *  @param outroPonto2D uma outra instância da classe Ponto2D
	 *  @return true se o ponto encapsulado estiver abaixo do ponto passado como
	 *  argumento, false caso contrário
	 */
	public boolean estáAbaixoDe(Ponto2D outroPonto2D) {
		
		return (y < outroPonto2D.y ? true : false);		
		
	} // fim do método estáAbaixoDe
	
	/**
	 *  O método estáÀEsquerdaDe recebe como argumento uma outra instância da classe
	 *  Ponto2D e retorna true se o ponto encapsulado estiver à esquerda do ponto
	 *  passado como argumento.
	 *  @param outroPonto2D uma outra instância da classe Ponto2D
	 *  @return true se o ponto encapsulado estiver à esquerda do ponto passado como
	 *  argumento, false caso contrário
	 */
	public boolean estáÀEsquerdaDe(Ponto2D outroPonto2D) {
		
		return (x < outroPonto2D.x ? true : false);		
		
	} // fim do método estáÀEsquerdaDe
	
	/**
	 *  O método estáÀDireitaDe recebe como argumento uma outra instância da classe
	 *  Ponto2D e retorna true se o ponto encapsulado estiver à direita do ponto
	 *  passado como argumento.
	 *  @param outroPonto2D uma outra instância da classe Ponto2D
	 *  @return true se o ponto encapsulado estiver à direita do ponto passado como
	 *  argumento, false caso contrário
	 */
	public boolean estáÀDireitaDe(Ponto2D outroPonto2D) {
		
		return (x > outroPonto2D.x ? true : false);		
		
    } // fim do método estáÀDireitaDe
    
	/**
	 * O método toString é um método "mágico" que não recebe argumentos, e retorna uma
	 * String contendo os valores dos campos da classe formatados.
	 * @return uma String com os valores dos campos formatados como (x,y)
	 */
	public String toString() {
		
		String resultado = "("+x+","+y+")";
		
		return resultado;
	
	} // fim do método toString

 } // fim da classe Ponto2D