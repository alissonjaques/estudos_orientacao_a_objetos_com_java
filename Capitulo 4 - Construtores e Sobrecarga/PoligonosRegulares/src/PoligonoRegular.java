/**
 * A classe PoligonoRegular possuí campos e métodos que representam um polígono regular com número de lados entre 4 e 10, podendo ser extendidos, caso se julgue nescessário.
 * 
 * @author Alisson jaques 
 * 
 * */
public class PoligonoRegular {//declaração da classe
	
	//declara os campos da classe
	private byte quantidadeLados;
	private double lado;
	
	/**
	 *  O construtor com todos argumentos para a classe PoligonoRegular, que inicializa os campos da classe com os argumentos passados como parâmetros.
	 *  @param umaQuantidadeLados um valor inteiro que representa a quantidade de lados do polígono
	 *  @param umLado um valor flutuante que representada o tamanho dos lados do polígono
	 * 
	 * */
	PoligonoRegular(byte umaQuantidadeLados, double umLado){
		
		quantidadeLados = umaQuantidadeLados;
		lado = umLado;
		
	} // fim do construtor com todos os argumentos
	
	/**
	 * O construtor que possuí como único argumento um valor inteiro, que é a quantidade de lados do polígono, ele chama o construtor com todos argumentos
	 * passando o valor em seu argumento e um valor flutuante (1) que representa um tamanho default (polígono regular com tamanho de lados igual a 1).
	 * @param umaQuantidadeLados um valor inteiro que representa a quantidade de lados do polígono
	 * 
	 * */
	PoligonoRegular(byte umaQuantidadeLados){
		
		this(umaQuantidadeLados,(double)1); //chamamos o construtor com assinatura PoligonoRegular(byte,double)
		
	} // fim do construtor com apenas o argumento referente à quantidade de lados
	
	/**
	 *  O construtor para a classe PoligonoRegular que recebe um valor flutuante como único argumento, ele chama o construtor com todos os argumentos passando
	 *  o valor em seu argumento e um falor byte (3) que representa o número de lados defalt (triângulo equilátero com um comprimento de lados qualquer).
	 * 
	 * */
	PoligonoRegular(double umLado){
		
		this((byte)3,umLado);
		
	} // fim do construtor com apena o argumento referente ao tamanho dos lados
	
	/**
	 *  O construtor default para a classe PoligonoRegular que não recebe nenhum argumento, ele chama vários construtores em cascata e representa um objeto 
	 *  cujos campos formam um triângulo equilátero de comprimento de lados igual 1.
	 * 
	 * */
	PoligonoRegular(){
		
		this((double)1);
		
	} // fim do construtor default
	
	/**
	 * O método inicializaPoligonoRegular recebe como parâmetro dados referentes ao comprimento do lado e número de lados do poligono e inicializa os campos da classe com eles.
	 * @param umaQuantidadeLados o número de lados do polígono
	 * @param umLado o comprimento do polígono 
	 * 
	 * */
	
	/**
	public void inicializaPoligoRegular(byte umaQuantidadeLados, double umLado) {
		
		quantidadeLados = umaQuantidadeLados;
		lado = umLado;
		
	}//fim do método inicializaPoligonoRegular
	*/
	
	/**
	 * O método é igual recebe como argumento um objeto da própria classe PolígoRegular e verifica se o objeto passado como refência e o atual são iguais.
	 * @param outroPoligonoRegular um referência a uma instância da própria classe PoligoRegular
	 * @return true se os objetos forem iguais
	 * 		   false caso contrário 
	 * 
	 * */
	public boolean éIgual(PoligonoRegular outroPoligonoRegular) {
		
		if((quantidadeLados==outroPoligonoRegular.quantidadeLados)&&(lado==outroPoligonoRegular.lado)) {
			
			return true;
		
		}
		else {
			
			return false;
		
		}
	}//fim do método éIgual
	
	/**
	 *  O método calculaNumeroDiagonais não possuí argumentos, ele utiliza um expressão que determina o número de diagonais do polígono de acordo com o número
	 *  de lados dados no objeto.
	 *  @return numeroDiagonais o número de diagonais do polígono 
	 * 
	 * */
	public int calculaNumeroDiagonais() {
		
		//declaração de variável auxiliar
		int numeroDiagonais;
		
		numeroDiagonais = (quantidadeLados*(quantidadeLados-3))/2;//expressão para cálculo da diagonal: diagonal = (numeroDeLados*(numeroDeLados-3))/2
		
		return numeroDiagonais;
		
	}//fim do método calculaNumeroDiagonais
	
	/**
	 *  O método calculaArea não possuí argumentos, ele utiliza o comprimento do lado do polígono para, atráves de uma expressão, calcular a área do mesmo.
	 *  @return area a área do polígono 
	 * 
	 * */
	public double calculaArea() {
		
		//declaração de variáveis auxiliares
		double area, apotema;
		
		apotema = lado/(2*Math.tan((Math.PI)/(double)quantidadeLados)); //expressão para o cálculo da apótema: apótema = comprimentoDoLado/(2*tg(180°/numeroDeLados)
		
		area = (quantidadeLados*lado*apotema)/2; //expressão para o cálculo da área: área = (numeroDeLados*comprimentoDoLado*apótema)/2
		
		return area;
		
	}//fim do método calculaArea
	
	/**
	 * O método toString não possuí argumentos, ele verifica o conteúdo da variável correspondente à quantidade de lados e, através deste dado, imprime o nome do polígono.
	 * @return nomePoligono o nome do polígono de acordo com o número de lados do mesmo 
	 * 
	 * */
	public String toString() {
		
		//declaração de referência auxiliar
		String nomePoligono;
		
		if(quantidadeLados==3) {//se quantidade de lados for igual a 3
			
			nomePoligono = "Triângulo"; //array de strings recebe "Triângulo"
			
			return nomePoligono; //retorna array de strings
			
		}
		else if(quantidadeLados==4) {//raciocínio igual ao anterior, considerar para todos da mesma natureza (subsequentes)
			
			nomePoligono = "Quadrado";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==5) {
			
			nomePoligono = "Pentágono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==6) {
			
			nomePoligono = "Hexágono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==7) {
			
			nomePoligono = "Heptágono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==8) {
			
			nomePoligono = "Octógono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==9) {
			
			nomePoligono = "Eneágono";
			
			return nomePoligono;
	
		}
		else{
			
			nomePoligono = "Decágono";
			
			return nomePoligono;
	
		}
				
		
	}//fim do método toString
	
}//fim da classe PoligonoRegular
