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
	 * O m�todo inicializaNumeroComplexo recebe como argumento dois n�meros flutuantes e os copia para as vari�veis complexas correspondentes � estrura de um n�mero complexo.
	 * @param umReal um n�mero flutuante que representa a parte real do n�mero complexo
	 * @param umImaginario um n�mero flutuante que representa a parte imagin�ria do n�mero complexo
	 *  
	 * */
	public void inicializaNumeroComplexo(double umReal, double umImaginario) {
		
		real = umReal;
		imaginario = umImaginario;	
		
	}//fim do m�todo inicializaNumeroComplexo
	
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
	
}
