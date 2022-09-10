	/**
 	 * A classe RoboSimples representa um rob� que tem uma posi��o qualquer no espa�o
 	 * de duas dimens�es, pode modificar a posi��o e dire��o (se movimentar, somente para
 	 * a frente) e informar a sua posi��o e dire��o. Este rob� � um modelo
 	 * supersimplificado de um pequeno rob� m�vel. Esta classe apresenta melhorias e
 	 * simplifica��es em rela��o � classe RoboSimples0.
 	 */
  	class RoboSimples{ // declara��o da classe
  
  		/**
  		 * Declara��o dos campos da classe
  		 */
  		private String nomeDoRob�;
  		private Ponto2D posi��oAtual;
  		private char dire��oAtual;

  		/**
  		 * O construtor "completo" para a classe RoboSimples, que recebe argumentos para
  		 * inicializar todos os campos da classe.
  		 * @param n o nome do rob�
  		 * @param px a posi��o X atual
  		 * @param py a posi��o Y atual
  		 * @param d a dire��o atual
  		 */
  		RoboSimples(String n,int px,int py,char d){
  
  			nomeDoRob� = n;
  			posi��oAtual = new Ponto2D(px,py);
  			dire��oAtual = d;
  		
  		} // fim do construtor com todos os argumentos
 
  		/**
  		 * O construtor para a classe RoboSimples, que recebe somente o nome do rob� e assume
  		 * que este rob� est� na posi��o (0,0) e dire��o norte.
  		 * @param n o nome do rob�
  		 */
  		RoboSimples(String n){
  			
  			// Chama o construtor completo passando a posi��o e dire��o como constantes.
  			this(n,0,0,'N');
  		
  		} // fim do construtor com somente o nome do rob� como argumento
 
  		/**
  		 * O construtor para a classe RoboSimples, que n�o recebe argumentos e assume que o
  		 * rob� n�o tem nome (String vazia), e que este rob� est� na posi��o (0,0) e dire��o
  		 * norte.
  		 */
  		RoboSimples(){
  
  			// Chama o construtor completo passando o nome como uma String vazia e a posi��o
  			// e dire��o como constantes.
  			this("",0,0,'N'); // Poder�amos escrever tamb�m this("") !
  		
  		} // fim do construtor com somente o nome do rob� como argumento
 
  		/**
  		 * Esta vers�o do m�todo move modifica a posi��o do rob� em uma unidade na dire��o
  		 * em que o rob� est�. Este m�todo n�o recebe argumentos.
  		 */
  		public void move(){
  
  			move(1);
  			
  		} // fim do m�todo move
 
  		/**
  		 * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de unidades na
  		 * dire��o em que o rob� est�.
  		 * @param passos o n�mero de "passos" para o rob�
  		 */
  		public void move(int passos){
  			
  			if (dire��oAtual == 'N') posi��oAtual.modificaY(posi��oAtual.retornaY()+passos);
  			if (dire��oAtual == 'S') posi��oAtual.modificaY(posi��oAtual.retornaY()-passos);
  			if (dire��oAtual == 'E') posi��oAtual.modificaX(posi��oAtual.retornaX()+passos);
  			if (dire��oAtual == 'O') posi��oAtual.modificaX(posi��oAtual.retornaX()-passos);
  
  		} // fim do m�todo move
  		
  		/**
  		 * Este m�todo move o robo n unidades na dire��o oposta em que o rob� est�.
  		 * @param passos o n�mero de "passos" para o rob� 
  		 * 
  		 * */
  		public void moveParaTras(int passos) {
  			
  			move(-(passos));
  			
  		} // fim do m�todo moveParaTras com argumento
  		
  		/**
  		 * Este m�todo sobrecarregado n�o possu� argumentos e move o rob� uma unidade na dire��o
  		 * oposta em que ele est�. Para tanto, ele usa em seu bloco de c�digo uma chamada ao m�todo
  		 * moveParaTras passando o valor constante 1.
  		 * 
  		 * */
  		public void moveParaTras() {
  			
  			moveParaTras(1);
  			
  		} // fim do m�todo moveParaTras sem argumentos
  		
  		/**
  		 * O m�todo mudaDire��o permite que a dire��o do rob� seja mudada depois dele ter
  		 * sido criado.
  		 * @param novaDire��o a nova dire��o para o rob�.
  		 */
  		public void mudaDire��o(char novaDire��o){
  			
  			dire��oAtual = novaDire��o;
  		
  		} // fim do m�todo mudaDire��o

  		/**
  		 * O m�todo toString n�o recebe argumentos, e retorna uma String contendo os valores
  		 * dos campos da classe formatados.
  		 * @return uma String com os valores dos campos formatados.
  		 */
  		public String toString(){
  			
  			String posi��o = "Nome do rob�:"+nomeDoRob�+"\n";
  			posi��o = posi��o+"Posi��o do rob�: "+posi��oAtual+"\n";
  			posi��o = posi��o+"Dire��o do rob�:"+dire��oAtual+"\n";
  			
  			return posi��o;
  		
  		} // fim do m�todo toString

 } // fim da classe RoboSimples