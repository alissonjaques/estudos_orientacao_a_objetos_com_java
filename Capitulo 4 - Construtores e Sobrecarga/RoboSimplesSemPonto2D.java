	/**
 	 * A classe RoboSimples representa um robô que tem uma posição qualquer no espaço
 	 * de duas dimensões, pode modificar a posição e direção (se movimentar, somente para
 	 * a frente) e informar a sua posição e direção. Este robô é um modelo
 	 * supersimplificado de um pequeno robô móvel. Esta classe apresenta melhorias e
 	 * simplificações em relação à classe RoboSimples0.
 	 */
  	class RoboSimples{ // declaração da classe
  
  		/**
  		 * Declaração dos campos da classe
  		 */
  		private String nomeDoRobô;
  		private int posiçãoXAtual,posiçãoYAtual;
  		private char direçãoAtual;

  		/**
  		 * O construtor "completo" para a classe RoboSimples, que recebe argumentos para
  		 * inicializar todos os campos da classe.
  		 * @param n o nome do robô
  		 * @param px a posição X atual
  		 * @param py a posição Y atual
  		 * @param d a direção atual
  		 */
  		RoboSimples(String n,int px,int py,char d){
  
  			nomeDoRobô = n;
  			posiçãoXAtual = px;
  			posiçãoYAtual = py;
  			direçãoAtual = d;
  		
  		} // fim do construtor com todos os argumentos
 
  		/**
  		 * O construtor para a classe RoboSimples, que recebe somente o nome do robô e assume
  		 * que este robô está na posição (0,0) e direção norte.
  		 * @param n o nome do robô
  		 */
  		RoboSimples(String n){
  			
  			// Chama o construtor completo passando a posição e direção como constantes.
  			this(n,0,0,'N');
  		
  		} // fim do construtor com somente o nome do robô como argumento
 
  		/**
  		 * O construtor para a classe RoboSimples, que não recebe argumentos e assume que o
  		 * robô não tem nome (String vazia), e que este robô está na posição (0,0) e direção
  		 * norte.
  		 */
  		RoboSimples(){
  
  			// Chama o construtor completo passando o nome como uma String vazia e a posição
  			// e direção como constantes.
  			this("",0,0,'N'); // Poderíamos escrever também this("") !
  		
  		} // fim do construtor com somente o nome do robô como argumento
 
  		/**
  		 * Esta versão do método move modifica a posição do robô em uma unidade na direção
  		 * em que o robô está. Este método não recebe argumentos.
  		 */
  		public void move(){
  
  			move(1);
  			
  		} // fim do método move
 
  		/**
  		 * Esta versão do método move modifica a posição do robô em um número de unidades na
  		 * direção em que o robô está.
  		 * @param passos o número de "passos" para o robô
  		 */
  		public void move(int passos){
  			
  			if (direçãoAtual == 'N') posiçãoYAtual = posiçãoYAtual+passos;
  			if (direçãoAtual == 'S') posiçãoYAtual = posiçãoYAtual-passos;
  			if (direçãoAtual == 'E') posiçãoXAtual = posiçãoXAtual+passos;
  			if (direçãoAtual == 'O') posiçãoXAtual = posiçãoXAtual-passos;
  
  		} // fim do método move
  		
  		/**
  		 * Este método move o robo n unidades na direção oposta em que o robô está.
  		 * @param passos o número de "passos" para o robô 
  		 * 
  		 * */
  		public void moveParaTras(int passos) {
  			
  			move(-(passos));
  			
  		} // fim do método moveParaTras com argumento
  		
  		/**
  		 * Este método sobrecarregado não possuí argumentos e move o robô uma unidade na direção
  		 * oposta em que ele está. Para tanto, ele usa em seu bloco de código uma chamada ao método
  		 * moveParaTras passando o valor constante 1.
  		 * 
  		 * */
  		public void moveParaTras() {
  			
  			moveParaTras(1);
  			
  		} // fim do método moveParaTras sem argumentos
  		
  		/**
  		 * O método mudaDireção permite que a direção do robô seja mudada depois dele ter
  		 * sido criado.
  		 * @param novaDireção a nova direção para o robô.
  		 */
  		public void mudaDireção(char novaDireção){
  			
  			direçãoAtual = novaDireção;
  		
  		} // fim do método mudaDireção

  		/**
  		 * O método toString não recebe argumentos, e retorna uma String contendo os valores
  		 * dos campos da classe formatados.
  		 * @return uma String com os valores dos campos formatados.
  		 */
  		public String toString(){
  			
  			String posição = "Nome do robô:"+nomeDoRobô+"\n";
  			posição = posição+"Posição do robô: ("+posiçãoXAtual+","+
  			posiçãoYAtual+")\n";
  			posição = posição+"Direção do robô:"+direçãoAtual+"\n";
  			
  			return posição;
  		
  		} // fim do método toString

 } // fim da classe RoboSimples