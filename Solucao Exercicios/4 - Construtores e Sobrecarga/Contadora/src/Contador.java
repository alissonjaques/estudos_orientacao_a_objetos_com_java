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
	 *  O construtor para a classe Contador que recebe dois argumentos, um referente ao valor inicial do contador e o outro ao numero de intera��es do mesmo. Esse m�todo
	 *  inicializa os campos principais do objeto com os valores passados como argumento.
	 *  @param umValor um n�mero inteiro correspondente ao valor inicial da contagem
	 *  @param umNumeroInteracoes um n�mero inteiro correspondente ao n�mero de de unidades que ser�o acrescentadas no valor inicial
	 * 
	 * */
	
	Contador(int umValor, int umNumeroInteracoes){
		
		valor = umValor;
		numeroInteracoes = umNumeroInteracoes;
		
	} //fim do construtor com dois argumentos inteiros
	
	/**
	 *  O construtor default para a classe Contador que n�o recebe argumentos e inicializa os campos principais do objeto com o valor inteiro 0.
	 *   
	 * */
	Contador(){
		
		this((int)0,(int)0); // chamamos o construtor Contador(int,int) para executarmos o construtor Contador()
		
	} // fim do construtor default
	
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
	public int quantidadeVezesLigado(int registroSim) {
		
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
