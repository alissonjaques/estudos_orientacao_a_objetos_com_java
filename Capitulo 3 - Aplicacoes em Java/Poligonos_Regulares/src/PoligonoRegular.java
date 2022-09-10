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
	 * O método inicializaPoligonoRegular recebe como parâmetro dados referentes ao comprimento do lado e número de lados do poligono e inicializa os campos da classe com eles.
	 * @param umaQuantidadeLados o número de lados do polígono
	 * @param umLado o comprimento do polígono 
	 * 
	 * */
	public void inicializaPoligoRegular(byte umaQuantidadeLados, double umLado) {
		
		quantidadeLados = umaQuantidadeLados;
		lado = umLado;
		
	}//fim do método inicializaPoligonoRegular
	
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
