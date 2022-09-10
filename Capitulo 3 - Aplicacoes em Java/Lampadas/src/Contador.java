/**
 *  A classe contador possu� campos e m�todos que possibilitam incrementar ou zerar um valor qualquer
 *  
 *  @author Alisson Jaques
 *  
 * */

public class Contador {//declara��o da classe
	
	//declara��o dos campos da classe
	private int valor, numeroInteracoes, registroSim=0;
	private boolean situacao;
	
	/**
	 *  O m�todo inicializaContador recebe como argumentos valores referentes aos campos da classe. Esses valores s�o simplesmentes copiados para os campos, assim
	 *  os campos da classe ficam encapsulados para os programadores usu�rios da da classe.
	 *  @param umValor um valor inicial passado pelo usu�rio
	 *  @param umNumeroInteracoes um valor referente ao n�mero de intera��es do la�o 
	 * 
	 * */
	public void inicializaContador(int umValor, int umNumeroInteracoes) {
		
		valor = umValor;
		numeroInteracoes = umNumeroInteracoes;
		
	}//fim do m�todo inicializaContador
	
	/**
	 *  O m�todo zeraContador recebe como par�metro a vari�vel valor e a atribu� o valor 0 (zero).
	 *  @param valor o conte�do referente ao valor inicial
	 *  @return valor a vari�vel valor zerada 
	 * 
	 * */
	public void zeraContador() {
		
		valor = 0;
		
	}//fim do m�todo zeraContador
	
	/**
	 *  O m�tdo incrementaContador possu� dois argumentos que s�o o valor inicial e o n�mero de intera��es. Ele incrementa o valor passado pelo usu�rio em 1,
	 *  atrav�s de um la�o, que s� para quando a vari�vel controladora indice (i) atinja o valor de intera��es passado pelo usu�rio.
	 * 	@param valor o conte�do referente ao valor inicial
	 *  @param numeroIntera��es o conte�do referente ao n�mero de intera��es
	 *  @return valor o resultado da soma feita nas intera��es
	 *  
	 * */
	public int incrementaContador() {
		
		int i; //declara��o do �ndice controlador
		
		for(i=1; i<=numeroInteracoes; i++) {//enquanto i <= numeroInteracoes fa�a:
			
			valor++; //valor = valor +1;
					
					//i = i +1;
					
		}
				
		return valor; //retorna o resultado do somat�rio

	}//fim do m�todo incrementaContador
	
	/**
	 *  O m�todo quantidadeLigada recebe como argumento um dado booleano e registra mais 1 � vari�vel registrosim toda vez que o estado da vari�vel situa��o for verdadeiro.
	 *  Assim este m�todo registra a quantidade de vezes que algo foi acionado.
	 *  @param situacao a vari�vel referente a um estado de ligado ou desligado
	 *   
	 * */
	public void quantidadeLigada(boolean situacao) {
		
		if(situacao==true) {//se o estado estiver ligado
			
			registroSim++; // some mais 1 ao registro
			
		}
		
	}
	/**
	 * O m�tedo quantidadeVezesLigado recebe como argumento o registro e o retorna.
	 * @param registroSim vari�vel que corresponde a um contador de vezes que algo foi acionado
	 * 
	 * */
	public int quantidadeVezesLigado() {
		
		return registroSim;
		
	}
	
	/**
	 * 	O m�todo toString n�o possu� argumentos, ele transforma o conte�do inteiro referente ao valor do objeto em uma string e retorna essa string.
	 *  @return resultado o valor inteiro referente ao objeto em forma de texto
	 * 
	 * 
	 * */
	public String toString() {
		
		String resultado = valor+""; //a referencia resultado recebe um n�mero inteiro e o transforma em texto
		
		return resultado; //retorna um texto que representa um n�mero
		
	}	
	
}
