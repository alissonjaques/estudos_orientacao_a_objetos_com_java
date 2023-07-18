/**
 *  A classe contador possuí campos e métodos que possibilitam incrementar ou zerar um valor qualquer
 *  
 *  @author Alisson Jaques
 *  
 * */

public class Contador {//declaração da classe
	
	//declaração dos campos da classe
	private int valor, numeroInteracoes, registroSim=0;
	private boolean situacao;
	
	/**
	 *  O método inicializaContador recebe como argumentos valores referentes aos campos da classe. Esses valores são simplesmentes copiados para os campos, assim
	 *  os campos da classe ficam encapsulados para os programadores usuários da da classe.
	 *  @param umValor um valor inicial passado pelo usuário
	 *  @param umNumeroInteracoes um valor referente ao número de interações do laço 
	 * 
	 * */
	public void inicializaContador(int umValor, int umNumeroInteracoes) {
		
		valor = umValor;
		numeroInteracoes = umNumeroInteracoes;
		
	}//fim do método inicializaContador
	
	/**
	 *  O método zeraContador recebe como parâmetro a variável valor e a atribuí o valor 0 (zero).
	 *  @param valor o conteúdo referente ao valor inicial
	 *  @return valor a variável valor zerada 
	 * 
	 * */
	public void zeraContador() {
		
		valor = 0;
		
	}//fim do método zeraContador
	
	/**
	 *  O métdo incrementaContador possuí dois argumentos que são o valor inicial e o número de interações. Ele incrementa o valor passado pelo usuário em 1,
	 *  através de um laço, que só para quando a variável controladora indice (i) atinja o valor de interações passado pelo usuário.
	 * 	@param valor o conteúdo referente ao valor inicial
	 *  @param numeroInterações o conteúdo referente ao número de interações
	 *  @return valor o resultado da soma feita nas interações
	 *  
	 * */
	public int incrementaContador() {
		
		int i; //declaração do índice controlador
		
		for(i=1; i<=numeroInteracoes; i++) {//enquanto i <= numeroInteracoes faça:
			
			valor++; //valor = valor +1;
					
					//i = i +1;
					
		}
				
		return valor; //retorna o resultado do somatório

	}//fim do método incrementaContador
	
	/**
	 *  O método quantidadeLigada recebe como argumento um dado booleano e registra mais 1 à variável registrosim toda vez que o estado da variável situação for verdadeiro.
	 *  Assim este método registra a quantidade de vezes que algo foi acionado.
	 *  @param situacao a variável referente a um estado de ligado ou desligado
	 *   
	 * */
	public void quantidadeLigada(boolean situacao) {
		
		if(situacao==true) {//se o estado estiver ligado
			
			registroSim++; // some mais 1 ao registro
			
		}
		
	}
	/**
	 * O métedo quantidadeVezesLigado recebe como argumento o registro e o retorna.
	 * @param registroSim variável que corresponde a um contador de vezes que algo foi acionado
	 * 
	 * */
	public int quantidadeVezesLigado() {
		
		return registroSim;
		
	}
	
	/**
	 * 	O método toString não possuí argumentos, ele transforma o conteúdo inteiro referente ao valor do objeto em uma string e retorna essa string.
	 *  @return resultado o valor inteiro referente ao objeto em forma de texto
	 * 
	 * 
	 * */
	public String toString() {
		
		String resultado = valor+""; //a referencia resultado recebe um número inteiro e o transforma em texto
		
		return resultado; //retorna um texto que representa um número
		
	}	
	
}
