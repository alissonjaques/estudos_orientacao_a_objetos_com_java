/**
*  
*  A classe Lampada representa uma lâmpada em uso. Ela possuí métodos para alteração de seu estado (acesa ou apagada)
*  , mostra o estado no qual se encontra e se é econômica ou não.
*  
*  @author Alisson Jaques
*  
*/
class Lampada{
	
	//declara os campos da classe
	private boolean estadoDaLampada; //indica se esta ligada ou não
	private float potencia; //indica a potência em watts da lâmpada
	
	/**
	 *  O Método inicializaLampada é responsável por preencher os campos da classe Lampada.
	 *  @param  _estadoDaLampada um valor boolean que representa o estado da lâmpada
	 *  @param _potencia um valor flutuante que representa a potência da lâmpada
	 *   
	 */
	public void inicializaLampada(boolean _estadoDaLampada, float _potencia){
		
		estadoDaLampada = _estadoDaLampada;
		potencia = _potencia;		
		
	}//fim do método inicializaLampada
	
	/**
	 *  O método acendeLampada recebe como argumento o estado da lâmpada (aceso ou pagado) e o atualiza para aceso.
	 *  @param estadoDaLampada um valor booleano que representa se a lâmpada esta acesa ou apagada
	 *  @return estado da lâmpada aceso 
	 * 
	 */
	
	public boolean acendeLampada(boolean estadoDaLampada){ //acende a lâmpada (true = aceso)
	
		estadoDaLampada = true;
		
		return estadoDaLampada; //retorna o estado da lâmpada como aceso

	}//fim do método acendeLampada
	
	/**
	 *  O método apagaLampada recebe como argumento o estado da lâmpada (aceso ou pagado) e o atualiza para apagado.
	 *  @param estadoDaLampada um valor booleano que representa se a lâmpada esta acesa ou apagada
	 *  @return estado da lâmpada apagado 
	 * 
	 */
	
	public boolean apagaLampada(boolean estadoDaLampada){ //apaga a lâmpada (false = apagado)
	
		estadoDaLampada = false;
		
		return estadoDaLampada; //retorna o estado da lâmpada como apagado

	}//fim do método apagaLampada
	
	/**
	 *  O método mostraEstado recebe como argumento o estado da lâmpada e imprime seu estado.
	 *  @param estadoDaLampada um valor booleano que representa se a lâmpada esta acesa ou apagada
	 * 	 
	 */
	public void mostraEstado(boolean estadoDaLampada){ // ostra o estado da lâmpada
		
		if(estadoDaLampada==true){ //se lâmpada esta acesa
			
			System.out.println("A lâmpada esta acesa"); //imprime aceso
			
		}
		else{ //senão
			
			System.out.println("A lâmpada esta apagada"); // imprimi apagado
			
		}	
	
	}//fim do método mostraEstado
	
	/**
	 *  O método estaLigada recebe como argumento o estado da lâmpada e verifica se a mesma esta ligada ou não.
	 *  @param estadoDaLampada um valor booleano que representa se a lâmpada esta acesa ou apagada
	 *  @return true se a lâmpada estiver acesa
	 *  		false se a lâmpada estiver apagada 
	 */
	public boolean estaLigada(boolean estadoDaLampada){//verifica se a lâmpada esta ligada ou não
		
		if(estadoDaLampada==true){//se lâmpada esta acesa 
			
			return true; //retorna ligado
			
		}
		else{//se não
			
			return false; //retorna apagado
			
		}
		
		
	}//fim do método estaLigada
	
	/**
	 *  O método éEconômica recebe como parâmetro a potência da lâmpada e verifica se a mesma é econômica ou não.
	 *  @param potencia a potência em watts da lâmpada
	 *  @return true se a lâmpada for econômica
	 *  	   false se a lâmpada não for econômica
	 *  
	 */	
	public boolean éEconômica(float potencia){//verifica se a lâmpada é econômica ou não
		
		if(potencia<40){ //se a potência da lâmpada for menor do que 40 watts
			
			return true; // retorna lâmpada é econômica
			
		}
		else{ //senão
			
			return false;  //retorna lâmpada não é econômica
			
		}
		
		
	}//fim do método éEconômica
	
	/**
	*	O método éIgual recebe como argumento uma instância da própria classe Lampada e verifica se essa nova instância é igual
	*	à instância atual.
	*	@param um novo objeto da classe Lampada
	*	@return true se o objeto atual é igual ao objeto passado
	*		false caso contrário
	*/
	public boolean éIgual(Lampada novaLampada){
	
		if((estadoDaLampada==novaLampada.estadoDaLampada)&&(potencia==novaLampada.potencia)){//se objeto atual é igual a novo objeto
		
			return true; // então retorna verdadeiro (true)
		}
		else{            //senão
		
		return false;//retorna falso (false)
		
		}	
	}//fim do método éIgual
	
	/**
	 *	O método clona cria uma nova instância com com os mesmos estados da instância atual,
	 *	@return um novo objeto com os mesmos dados do objeto atual
	 */
	public Lampada clona(){
	
		Lampada temporária = new Lampada();                                 //cria uma nova instância da classe Lampada
		temporária.inicializaLampada(estadoDaLampada,potencia);             //copia os dados do objeto atual para o novo objeto
	
		return temporária;                             //retorna uma referência para o novo objeto
	
	}//fim do método clona

	/**
	 *	O método toString não possuí argumentos, ele rotarna uma String que fornece informações sobre os campos da classe.
	 *	@return uma String com uma frase que representa os valores dos campos da classe
	 */

	public String toString(){
		
		Lampada clonar = new Lampada(); //criamos um novo objeto da classe Lampada
		Lampada clone = clonar.clona(); //fazemos a referência clone igual à referencia do objeto duplicado, assim essa refência herda os dados da instância atual
		
		if((estadoDaLampada==true)&&(clone.éEconômica(potencia)==true)){//se a lâmpada esta acesa e é econômica faça:
		
			String resultado = "A lâmpada esta acesa e é econômica"; //String = A lâmpada esta acesa e é econômica
		
			return resultado; //retorna String
		
		}
		else if((estadoDaLampada==false)&&(clone.éEconômica(potencia)==false)){ //mesmo raciocínio da condição anterior...
		
			String resultado = "A lâmpada esta apagada e não é econômica";
		
			return resultado;
		
		}
		else if((estadoDaLampada==false)&&(clone.éEconômica(potencia)==true)){
		
			String resultado = "A lâmpada esta apagada e é econômica";
		
			return resultado;
		
		}
		
		else {
			
			String resultado = "A lâmpada esta acesa e não é econômica";
			
			return resultado;
		}
	}//fim do método toString

}