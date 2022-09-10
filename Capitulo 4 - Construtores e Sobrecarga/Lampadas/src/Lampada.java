import java.util.Scanner;

/**
*  
*  A classe Lampada representa uma l�mpada em uso. Ela possu� m�todos para altera��o de seu estado (acesa ou apagada)
*  , mostra o estado no qual se encontra e se � econ�mica ou n�o.
*  
*  @author Alisson Jaques
*  
*/
class Lampada{
	
	//declara os campos da classe
	private boolean estadoDaLampada, estadoInicial = false; //indica se esta ligada ou n�o
	private float potencia; //indica a pot�ncia em watts da l�mpada
	
	//criamos uma refer�ncia para um objeto da classe contador
	Contador registraQuantidade = new Contador();
	
	/**
	 * 	O construtor para a classe Lampada que recebe como argumento o seu estado atual (apagada ou desligada)
	 *  e inicializa os campos do objeto encapsulado com o estado passado como par�metro e a potencia fornecida pelo usu�rio.
	 *  @param _estadoDaLampada um valor booleano que indica se a l�mpada esta acesa ou apagada
	 * 
	 * */
	Lampada(boolean _estadoDaLampada){
		
		estadoDaLampada = _estadoDaLampada;
		
		if(estadoDaLampada==true) {
			
			estadoInicial = true; //guardamos o valor inicial do estado da l�mpada
			  					  //se esse bloco n�o for executado � considerado o valor default false
		
		}
		
		System.out.println("Informe a pot�ncia da l�mpada: "); //solicitamos ao usu�rio da classe que informe o valor da pot�ncia da l�mpada
		Scanner valorPotencia = new Scanner(System.in); //criamos uma refer�ncia a uma inst�ncia da classe Scanner para guardar o valor fornecido
		potencia = valorPotencia.nextFloat(); //inicializamos a vari�vel potencia com o valor informado pelo usu�rio
		
	} // fim do construtor que recebe como argumento o estado da l�mpada 
	
	/**
	 *  O construtor default para a classe Lampada, esse construtor n�o recebe nenhum argumento e inicializa o campo estadoDaLampada com false
	 *  e a vari�vel potencia com 60 utilizando o construtor para o m�todo clona.
	 * 
	 */
	Lampada(){
		
		this((boolean)false, (float)60);
		
	} // fim do construtor sem argumentos
	
	/**
	 *  O construtor para o m�todo clona da l�mpada, ele recebe como argumentos todos os campos da classe l�mpada e inicializa a inst�ncia 
	 *  clone com esses campos.
	 *  @param _estadoDaLampada um valor booleano que indica se a l�mpada esta ligada ou apagada
	 *  @param potencia o valor correspondente � pot�ncia da l�mpada
	 * 
	 * */
	Lampada(boolean _estadoDaLampada, float umaPotencia){
		
		estadoDaLampada = _estadoDaLampada;
		
		if(estadoDaLampada==true) { 
			
			estadoInicial = true; //guardamos o valor inicial do estado da l�mpada
								  //se esse bloco n�o for executado � considerado o valor default false
			
		}
		
		potencia = umaPotencia;
		
	} //fim do construtor para o m�todo clona
	
	/**
	 *  O m�todo acendeLampada recebe como argumento o estado da l�mpada (aceso ou pagado) e o atualiza para aceso.
	 *  @param estadoDaLampada um valor booleano que representa se a l�mpada esta acesa ou apagada
	 *  @return estado da l�mpada aceso 
	 * 
	 */
	
	public boolean acendeLampada(boolean _estadoDaLampada){ //acende a l�mpada (true = aceso)
	
		_estadoDaLampada = true;
		estadoDaLampada = _estadoDaLampada;
		
		//chamamos o m�todo quantidadeLigada(atr�ves do objeto registraQuantidade)
		//para registrar quantas vezes a l�mpada foi ligada
		registraQuantidade.quantidadeLigada(true);
		
		return estadoDaLampada; //retorna o estado da l�mpada como aceso

	}//fim do m�todo acendeLampada
	
	/**
	 *  O m�todo apagaLampada recebe como argumento o estado da l�mpada (aceso ou pagado) e o atualiza para apagado.
	 *  @param estadoDaLampada um valor booleano que representa se a l�mpada esta acesa ou apagada
	 *  @return estado da l�mpada apagado 
	 * 
	 */
	
	public boolean apagaLampada(boolean _estadoDaLampada){ //apaga a l�mpada (false = apagado)
	
		_estadoDaLampada = false;
		estadoDaLampada = _estadoDaLampada;
		
		return estadoDaLampada; //retorna o estado da l�mpada como apagado

	}//fim do m�todo apagaLampada
	
	/**
	 *  O m�todo mostraEstado recebe como argumento o estado da l�mpada e imprime seu estado.
	 *  @param estadoDaLampada um valor booleano que representa se a l�mpada esta acesa ou apagada
	 * 	 
	 */
	public void mostraEstado(boolean estadoDaLampada){ // ostra o estado da l�mpada
		
		if(estadoDaLampada==true){ //se l�mpada esta acesa
			
			System.out.println("A l�mpada esta acesa"); //imprime aceso
			
		}
		else{ //sen�o
			
			System.out.println("A l�mpada esta apagada"); // imprimi apagado
			
		}	
	
	}//fim do m�todo mostraEstado
	
	/**
	 *  O m�todo estaLigada recebe como argumento o estado da l�mpada e verifica se a mesma esta ligada ou n�o.
	 *  @param estadoDaLampada um valor booleano que representa se a l�mpada esta acesa ou apagada
	 *  @return true se a l�mpada estiver acesa
	 *  		false se a l�mpada estiver apagada 
	 */
	public boolean estaLigada(boolean estadoDaLampada){//verifica se a l�mpada esta ligada ou n�o
		
		if(estadoDaLampada==true){//se l�mpada esta acesa 
			
			return true; //retorna ligado
			
		}
		else{//se n�o
			
			return false; //retorna apagado
			
		}
		
		
	}//fim do m�todo estaLigada
	
	/**
	 *  O m�todo �Econ�mica recebe como par�metro a pot�ncia da l�mpada e verifica se a mesma � econ�mica ou n�o.
	 *  @param potencia a pot�ncia em watts da l�mpada
	 *  @return true se a l�mpada for econ�mica
	 *  	    false se a l�mpada n�o for econ�mica
	 * 
	 * 
	 * 
	 * */	
	public boolean �Econ�mica(float potencia){//verifica se a l�mpada � econ�mica ou n�o
		
		if(potencia<40){ //se a pot�ncia da l�mpada for menor do que 40 watts
			
			return true; // retorna l�mpada � econ�mica
			
		}
		else{ //sen�o
			
			return false;  //retorna l�mpada n�o � econ�mica
			
		}
		
		
	}//fim do m�todo �Econ�mica
	
	/**
	*	O m�todo �Igual recebe como argumento uma inst�ncia da pr�pria classe Lampada e verifica se essa nova inst�ncia � igual
	*	� inst�ncia atual.
	*	@param um novo objeto da classe Lampada
	*	@return true se o objeto atual � igual ao objeto passado
	*		false caso contr�rio
	*/
	public boolean �Igual(Lampada novaLampada){
	
		if((estadoDaLampada==novaLampada.estadoDaLampada)&&(potencia==novaLampada.potencia)){//se objeto atual � igual a novo objeto
		
			return true; // ent�o retorna verdadeiro (true)
		}
		else{            //sen�o
		
		return false;//retorna falso (false)
		
		}	
	}//fim do m�todo �Igual
	
	/**
	 *	O m�todo clona cria uma nova inst�ncia com com os mesmos estados da inst�ncia atual,
	 *	@return um novo objeto com os mesmos dados do objeto atual
	 *
	 */
	public Lampada clona(){
	
		Lampada tempor�ria = new Lampada(estadoDaLampada,potencia); //cria uma nova inst�ncia da classe Lampada com os mesmos campos do objeto encapsulado
																	//chamando o construtor que recebe todos os argumentos da classe		
		return tempor�ria; //retorna uma refer�ncia para o novo objeto
	
	}//fim do m�todo clona

	/**
	 *	O m�todo toString n�o possu� argumentos, ele rotarna uma String que fornece informa��es sobre os campos da classe.
	 *	@return uma String com uma frase que representa os valores dos campos da classe
	 */

	public String toString(){
		
		Lampada clonar = new Lampada(); //criamos um novo objeto da classe Lampada
		Lampada clone = clonar.clona(); //fazemos a refer�ncia clone igual � referencia do objeto duplicado, assim essa ref�ncia herda os dados da inst�ncia atual
		
		if((estadoDaLampada==true)&&(clone.�Econ�mica(potencia)==true)){//se a l�mpada esta acesa e � econ�mica fa�a:
			
			String resultado;
			
			if(estadoInicial==false) {
			
				resultado = "A l�mpada esta acesa e � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+registraQuantidade.quantidadeVezesLigado(); //String = A l�mpada esta acesa e � econ�mica
			
			}
			else {
			
				resultado = "A l�mpada esta acesa e � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+(registraQuantidade.quantidadeVezesLigado()+1);
			
			}
			
			return resultado; //retorna String
		
		}
		else if((estadoDaLampada==false)&&(clone.�Econ�mica(potencia)==false)){ //mesmo racioc�nio da condi��o anterior...
			
			String resultado;
			
			if(estadoInicial==false) {
			
				resultado = "A l�mpada esta apagada e n�o � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+registraQuantidade.quantidadeVezesLigado();
			
			}
			else {
				
				resultado = "A l�mpada esta apagada e n�o � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+(registraQuantidade.quantidadeVezesLigado()+1);
				
			}
			return resultado;
		
		}
		else if((estadoDaLampada==false)&&(clone.�Econ�mica(potencia)==true)){
			
			String resultado;
			
			if(estadoInicial==false) {
				
				resultado = "A l�mpada esta apagada e � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+registraQuantidade.quantidadeVezesLigado();
			
			}
			else {
				
				resultado = "A l�mpada esta apagada e � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+(registraQuantidade.quantidadeVezesLigado()+1);
				
			}
			
			return resultado;
		
		}
		
		else {
			
			String resultado; 
			
			if(estadoInicial==false) {
			
				resultado = "A l�mpada esta acesa e n�o � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+registraQuantidade.quantidadeVezesLigado();
			
			}
			else {
				
				resultado = "A l�mpada esta acesa e n�o � econ�mica"+"\nQuantidade de vezes que a lampada foi ligada: "+(registraQuantidade.quantidadeVezesLigado()+1);
				
			}
			
			return resultado;
			
		}
		
	}//fim do m�todo toString

}