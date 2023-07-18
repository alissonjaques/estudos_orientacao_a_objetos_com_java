/**
 * A classe NumeroComplexo possuí campos e métodos que manipulam números complexos.
 * Nela podemos fazer comparação, soma, subtração, multiplicação e divisão entre dois números
 * complexos quaisquer. Podendo ser extendida para mais funções.
 * 
 * @author Alisson Jaques 
 * 
 * */
public class NumeroComplexo {//declaração da classe
	
	//declaração dos campos da classe
	private double real, imaginario;
	
	/**
	 *  O construtor para a classe NumeroComplexo, que recebe dois argumentos, um sendo um valor flutuante que representa
	 *  a parte real e outro sendo um valor flutuante que representa a parte imaginária. O construtor inicializa os campos
	 *  da classe com os valores passados como argumentos.
	 *  @param umReal um valor flutuante que representa a parte real do número complexo
	 *  @param umImaginario um valor flutuante que representa a parte imaginária do número complexo 
	 * 
	 * */
	NumeroComplexo(double umReal, double umImaginario){
		
		real  = umReal;
		imaginario = umImaginario;	
		
	} // fim do construtor com todos os argumentos
	
	/**
	 *  O construtor para a classe NumeroComplexo que recebe um argumento referente à parte real do mesmo e 
	 *  inicializa os campos da classe. A parte real recebe o valor passado como argumento e a parte imaginária
	 *  recebe o valor default 0. A inicialização é feita através de uma chamada ao construtor com todos os argumentos. 
	 *  @param umReal um valor flutuante que representa a parte real do número complexo 
	 * 
	 * */
	NumeroComplexo(double umReal){
		
		this(umReal,0.0);
		
	} // fim do construtor com somente o argumento real
	
	/**
	 *  O construtor default para a classe NumeroComplexo que não possuí argumentos e inicializa os campos da
	 *  classe com o valor 0. A inicialização é feita através de uma chamada ao construtor com apenas um argumento flutuante.
	 * 
	 * */
	NumeroComplexo(){
		
		this(0.0);	
		
	} // fim do construtor default
		
	/**
	 * O método toString não possuí argumentos ele é responsável por retornar uma String que representa o número complexo encapsulado no objeto.
	 * @return escritaComplexa um texto, na forma a+bi, que representa o número complexo encapsulado no objeto.
	 *  
	 * */
	public String toString() {
		
		//criamos uma instância da classe String e a inicializamos com um texto formatado seguindo a expressão real+imaginario*i
		String escritaComplexa = real+"+"+"("+imaginario+")"+"i";
				
		//retornamos a String com os campos do objeto formatados
		return escritaComplexa;
		
	}//fim do método toString
		
	/**
	 * O método éIgual recebe como argumento uma própria instância da classe NumeroComplexo e verifica se o objeto atual é igual ao objeto passado como referência.
	 * @param outroNumeroComplexo uma instância da própria classe NumeroComplexo
	 * @return true se os objetos forem iguais
	 *         false caso contrário
	 *          
	 * */
	public boolean éIgual(NumeroComplexo outroNumeroComplexo) {
		
		if((real==outroNumeroComplexo.real)&&(imaginario==outroNumeroComplexo.imaginario)) {//se os campos dos objetos forem iguais
			
			return true; //retorna verdadeiro
			
		}
		else {//senão
			
			return false;//retorna falso
			
		}
				
	}//fim do método éIgual
	
	/**
	 * O método somaComplexo recebe como argumento um outro objeto da própria classe NumeroComplexo e soma o objeto atual com o passado como referencia.
	 * @param outroNumeroComplexo uma instância da própria classe NumeroComplexo 
	 * @return soma um texto, na forma a+bi, que representa a soma de dois números complexos
	 * 
	 * */
	public String somaComplexo(NumeroComplexo outroNumeroComplexo) {
		
		String soma = (real+outroNumeroComplexo.real)+"+"+"("+(imaginario+outroNumeroComplexo.imaginario)+")"+"i"; //(a+c)+(b+d)i
		
		return soma;
		
	}//fim do métedo somaComplexo
	
	/**
	 * O método subtraiComplexo recebe como argumento um outro objeto da própria classe NumeroComplexo e subtrai do objeto atual o passado como referencia.
	 * @param outroNumeroComplexo uma instância da própria classe NumeroComplexo 
	 * @return subtrai um texto, na forma a+bi, que representa a subtração de dois números complexos
	 * 
	 * */	
	public String subtraiComplexo(NumeroComplexo outroNumeroComplexo) {
		
		
		String subtrai = (real-outroNumeroComplexo.real)+"+"+"("+(imaginario-outroNumeroComplexo.imaginario)+")"+"i";//(a-c)+(b-d)i
		
		return subtrai;
		
	}//fim do método subtraiComplexo
	
	/**
	 * O método multiplicaComplexo recebe como argumento um outro objeto da própria classe NumeroComplexo e multiplica o objeto atual com o passado como referencia.
	 * @param outroNumeroComplexo uma instância da própria classe NumeroComplexo 
	 * @return multiplica um texto, na forma a+bi, que representa a multiplicação de dois números complexos
	 * 
	 * */	
	public String multiplicaComplexo(NumeroComplexo outroNumeroComplexo) {
		
		String multiplica = ((real*outroNumeroComplexo.real)-(imaginario*outroNumeroComplexo.imaginario))+"+"+"("+((real*outroNumeroComplexo.imaginario)+(imaginario*outroNumeroComplexo.real))+")"+"i";//(ac-bd)+(ad+bc)i
		
		return multiplica;
		
	}//fim do método multiplicaComplexo
	
	/**
	 * O método divideComplexo recebe como argumento um outro objeto da própria classe NumeroComplexo e divide do objeto atual o passado como referencia.
	 * @param outroNumeroComplexo uma instância da própria classe NumeroComplexo 
	 * @return divide um texto, na forma a+bi, que representa a divisão entre dois números complexos
	 * 
	 * */
	public String divideComplexo(NumeroComplexo outroNumeroComplexo) {
		
		//((ac+bd)/(c²+d²))+((bc-ad)/(c²+d²))i
		String divide = (((real*outroNumeroComplexo.real)+(imaginario*outroNumeroComplexo.imaginario)))/(((outroNumeroComplexo.real*outroNumeroComplexo.real)+(outroNumeroComplexo.imaginario*outroNumeroComplexo.imaginario)))+"+"+"("+(((imaginario*outroNumeroComplexo.real)-(real*outroNumeroComplexo.imaginario)))/(((outroNumeroComplexo.real*outroNumeroComplexo.real)+(outroNumeroComplexo.imaginario*outroNumeroComplexo.imaginario)))+")"+"i";
				
		return divide;
		
	}//fim do método divideComplexo
	
	/**
	 *  O método modulo não possuí argumentos. Ele manipula uma instância da classe Ponto2D
	 *  e retorna a distância da origem do ponto complexo encapsulado.
	 * 
	 * */
	public double modulo() {
		
		Ponto2D pontoComplexo = new Ponto2D(real,imaginario); // criamos uma instância da classe Ponto2D que é o ponto complexo correspondente
		                                                      // ao número complexo encapsulado
				
		return pontoComplexo.distanciaDaOrigem(); // retornamos a distância do ponto complexo encapsulado da origem (módulo) chamando o método
		                                          // distanciaDaOrigem da classe Ponto2D
	
	} // fim do método módulo
	
	/**
	 *  O método argumentoComplexo não possuí argumentos e retorna o ângulo correspondente ao argumento do número 
	 *  complexo encapsulado. Para tanto, a expressão arctg(x) é modelada através da classe nativa Math e do método
	 *  modulo da própria classe NumeroComplexo.
	 * 
	 * */
	public double argumentoComplexo() {
		
		return Math.tan((Math.cos((real)/(modulo())))/(Math.sin((imaginario)/(modulo())))); // retorna o ângulo do número complexo ( arctg(x) = tg-¹(x) )
		
	} // fim do método argumentoComplexo
	
} // fim da classe NumeroComplexo