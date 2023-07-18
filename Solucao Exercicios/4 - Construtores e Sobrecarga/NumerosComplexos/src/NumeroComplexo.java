/**
 * A classe NumeroComplexo possu� campos e m�todos que manipulam n�meros complexos.
 * Nela podemos fazer compara��o, soma, subtra��o, multiplica��o e divis�o entre dois n�meros
 * complexos quaisquer. Podendo ser extendida para mais fun��es.
 * 
 * @author Alisson Jaques 
 * 
 * */
public class NumeroComplexo {//declara��o da classe
	
	//declara��o dos campos da classe
	private double real, imaginario;
	
	/**
	 *  O construtor para a classe NumeroComplexo, que recebe dois argumentos, um sendo um valor flutuante que representa
	 *  a parte real e outro sendo um valor flutuante que representa a parte imagin�ria. O construtor inicializa os campos
	 *  da classe com os valores passados como argumentos.
	 *  @param umReal um valor flutuante que representa a parte real do n�mero complexo
	 *  @param umImaginario um valor flutuante que representa a parte imagin�ria do n�mero complexo 
	 * 
	 * */
	NumeroComplexo(double umReal, double umImaginario){
		
		real  = umReal;
		imaginario = umImaginario;	
		
	} // fim do construtor com todos os argumentos
	
	/**
	 *  O construtor para a classe NumeroComplexo que recebe um argumento referente � parte real do mesmo e 
	 *  inicializa os campos da classe. A parte real recebe o valor passado como argumento e a parte imagin�ria
	 *  recebe o valor default 0. A inicializa��o � feita atrav�s de uma chamada ao construtor com todos os argumentos. 
	 *  @param umReal um valor flutuante que representa a parte real do n�mero complexo 
	 * 
	 * */
	NumeroComplexo(double umReal){
		
		this(umReal,0.0);
		
	} // fim do construtor com somente o argumento real
	
	/**
	 *  O construtor default para a classe NumeroComplexo que n�o possu� argumentos e inicializa os campos da
	 *  classe com o valor 0. A inicializa��o � feita atrav�s de uma chamada ao construtor com apenas um argumento flutuante.
	 * 
	 * */
	NumeroComplexo(){
		
		this(0.0);	
		
	} // fim do construtor default
		
	/**
	 * O m�todo toString n�o possu� argumentos ele � respons�vel por retornar uma String que representa o n�mero complexo encapsulado no objeto.
	 * @return escritaComplexa um texto, na forma a+bi, que representa o n�mero complexo encapsulado no objeto.
	 *  
	 * */
	public String toString() {
		
		//criamos uma inst�ncia da classe String e a inicializamos com um texto formatado seguindo a express�o real+imaginario*i
		String escritaComplexa = real+"+"+"("+imaginario+")"+"i";
				
		//retornamos a String com os campos do objeto formatados
		return escritaComplexa;
		
	}//fim do m�todo toString
		
	/**
	 * O m�todo �Igual recebe como argumento uma pr�pria inst�ncia da classe NumeroComplexo e verifica se o objeto atual � igual ao objeto passado como refer�ncia.
	 * @param outroNumeroComplexo uma inst�ncia da pr�pria classe NumeroComplexo
	 * @return true se os objetos forem iguais
	 *         false caso contr�rio
	 *          
	 * */
	public boolean �Igual(NumeroComplexo outroNumeroComplexo) {
		
		if((real==outroNumeroComplexo.real)&&(imaginario==outroNumeroComplexo.imaginario)) {//se os campos dos objetos forem iguais
			
			return true; //retorna verdadeiro
			
		}
		else {//sen�o
			
			return false;//retorna falso
			
		}
				
	}//fim do m�todo �Igual
	
	/**
	 * O m�todo somaComplexo recebe como argumento um outro objeto da pr�pria classe NumeroComplexo e soma o objeto atual com o passado como referencia.
	 * @param outroNumeroComplexo uma inst�ncia da pr�pria classe NumeroComplexo 
	 * @return soma um texto, na forma a+bi, que representa a soma de dois n�meros complexos
	 * 
	 * */
	public String somaComplexo(NumeroComplexo outroNumeroComplexo) {
		
		String soma = (real+outroNumeroComplexo.real)+"+"+"("+(imaginario+outroNumeroComplexo.imaginario)+")"+"i"; //(a+c)+(b+d)i
		
		return soma;
		
	}//fim do m�tedo somaComplexo
	
	/**
	 * O m�todo subtraiComplexo recebe como argumento um outro objeto da pr�pria classe NumeroComplexo e subtrai do objeto atual o passado como referencia.
	 * @param outroNumeroComplexo uma inst�ncia da pr�pria classe NumeroComplexo 
	 * @return subtrai um texto, na forma a+bi, que representa a subtra��o de dois n�meros complexos
	 * 
	 * */	
	public String subtraiComplexo(NumeroComplexo outroNumeroComplexo) {
		
		
		String subtrai = (real-outroNumeroComplexo.real)+"+"+"("+(imaginario-outroNumeroComplexo.imaginario)+")"+"i";//(a-c)+(b-d)i
		
		return subtrai;
		
	}//fim do m�todo subtraiComplexo
	
	/**
	 * O m�todo multiplicaComplexo recebe como argumento um outro objeto da pr�pria classe NumeroComplexo e multiplica o objeto atual com o passado como referencia.
	 * @param outroNumeroComplexo uma inst�ncia da pr�pria classe NumeroComplexo 
	 * @return multiplica um texto, na forma a+bi, que representa a multiplica��o de dois n�meros complexos
	 * 
	 * */	
	public String multiplicaComplexo(NumeroComplexo outroNumeroComplexo) {
		
		String multiplica = ((real*outroNumeroComplexo.real)-(imaginario*outroNumeroComplexo.imaginario))+"+"+"("+((real*outroNumeroComplexo.imaginario)+(imaginario*outroNumeroComplexo.real))+")"+"i";//(ac-bd)+(ad+bc)i
		
		return multiplica;
		
	}//fim do m�todo multiplicaComplexo
	
	/**
	 * O m�todo divideComplexo recebe como argumento um outro objeto da pr�pria classe NumeroComplexo e divide do objeto atual o passado como referencia.
	 * @param outroNumeroComplexo uma inst�ncia da pr�pria classe NumeroComplexo 
	 * @return divide um texto, na forma a+bi, que representa a divis�o entre dois n�meros complexos
	 * 
	 * */
	public String divideComplexo(NumeroComplexo outroNumeroComplexo) {
		
		//((ac+bd)/(c�+d�))+((bc-ad)/(c�+d�))i
		String divide = (((real*outroNumeroComplexo.real)+(imaginario*outroNumeroComplexo.imaginario)))/(((outroNumeroComplexo.real*outroNumeroComplexo.real)+(outroNumeroComplexo.imaginario*outroNumeroComplexo.imaginario)))+"+"+"("+(((imaginario*outroNumeroComplexo.real)-(real*outroNumeroComplexo.imaginario)))/(((outroNumeroComplexo.real*outroNumeroComplexo.real)+(outroNumeroComplexo.imaginario*outroNumeroComplexo.imaginario)))+")"+"i";
				
		return divide;
		
	}//fim do m�todo divideComplexo
	
	/**
	 *  O m�todo modulo n�o possu� argumentos. Ele manipula uma inst�ncia da classe Ponto2D
	 *  e retorna a dist�ncia da origem do ponto complexo encapsulado.
	 * 
	 * */
	public double modulo() {
		
		Ponto2D pontoComplexo = new Ponto2D(real,imaginario); // criamos uma inst�ncia da classe Ponto2D que � o ponto complexo correspondente
		                                                      // ao n�mero complexo encapsulado
				
		return pontoComplexo.distanciaDaOrigem(); // retornamos a dist�ncia do ponto complexo encapsulado da origem (m�dulo) chamando o m�todo
		                                          // distanciaDaOrigem da classe Ponto2D
	
	} // fim do m�todo m�dulo
	
	/**
	 *  O m�todo argumentoComplexo n�o possu� argumentos e retorna o �ngulo correspondente ao argumento do n�mero 
	 *  complexo encapsulado. Para tanto, a express�o arctg(x) � modelada atrav�s da classe nativa Math e do m�todo
	 *  modulo da pr�pria classe NumeroComplexo.
	 * 
	 * */
	public double argumentoComplexo() {
		
		return Math.tan((Math.cos((real)/(modulo())))/(Math.sin((imaginario)/(modulo())))); // retorna o �ngulo do n�mero complexo ( arctg(x) = tg-�(x) )
		
	} // fim do m�todo argumentoComplexo
	
} // fim da classe NumeroComplexo