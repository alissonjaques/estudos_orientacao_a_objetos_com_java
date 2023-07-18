/**
 *  A classe SerieLimitada possuí campos e métodos que 
 *  permitem o armazenamento de uma quantidade limitada 
 *  de figuras.
 *  @author Alisson Jaques 
 * 
 * */
public class SerieLimitada{ // declaração da classe
	
	/**
		
		Declaração dos campos da classe.
	
	
	*/
	private int numeroSequencial; 						// campo encapsulado da classe, referente ao número sequencial da figura
	static private int contador = 0;					// campo compartilhado entre os objetos da classe, para controle de instâncias criadas
	final static public int maximoDeInstancias = 10;	// constante pública, referente ao máximo de instâncias que a classe pode criar
	
	/**
		O construtor para a classe SerieLitada que recebe 
		como argumento um número inteiro referente ao número 
		sequencial da figura e inicializa o campo da classe 
		(numeroSequencial) com o mesmo. Caso o usuário da classe
		tenha excedido o uso das instâncias permitidas é atribuído
		ao campo numeroSequencial o valor 0 e informado ao usuário
		da classe a impossibilidade de criar a instância como 
		ele deseja.
		@param sequencial um número inteiro que representa o número sequencial
		de uma figura
	
	*/
	SerieLimitada(int sequencial){
		
		/*
			Toda vez que uma instância for criada
			o conteúdo da variável contador irá 
			receber a soma de seu conteúdo com o 
			valor 1.
			
		*/
		contador = contador + 1;
		
		if(contador<=maximoDeInstancias){ // se o conteúdo do contador for menor do que o número de instâncias permitidas
			
			numeroSequencial = sequencial; // o campo numeroSequencial receberá o valor passado como argumento
			
		}
		else{ // senão
			
			/*
				Informamos ao usuário que não foi possível 
				criar o objeto como ele deseja e atribuímos
				o valor constante 0 ao campo numeroSequencial.	
			
			*/
			System.out.println("Não foi possível armazenar os dados.\nNúmero máximo de notas/figuras atingido.");
			numeroSequencial = 0;
			
		} // fim-se
				
	} // fim do construtor
	
	/**
	
		O construtor default para a classe SerieLimitada
		que não recebe nenhum argumento e inicializa o campo
		numeroSequencial com o valor 0. Se o usuário exceder o 
		número de instância permitido para a classe é dado um
		alerta no terminal indicando essa ocorrência, caso contrário
		o sistema informa ao usuario que o mesmo não inseriu um 
		número sequencial e que esse tera o valor default 0.	
	
	*/
	SerieLimitada(){
		
		/*
			Toda vez que uma instância for criada
			o conteúdo da variável contador irá 
			receber a soma de seu conteúdo com o 
			valor 1.
			
		*/
		contador = contador + 1;
		
		if(contador<=maximoDeInstancias){ // se o conteúdo do contador for menor do que o número de instâncias permitidas
			/*
				Informamos ao usuário que ele não inseriu um número sequencial
				e que, portanto, ele terá o valor 0.
			
			*/
			System.out.println("O número sequencial não foi informado! Foi atribuído a ele o valor 0 (zero).");
			numeroSequencial = 0;
			
		}
		else{
			
			/*
				Informamos ao usuário que não foi possível 
				criar o objeto como ele deseja e atribuímos
				o valor constante 0 ao campo numeroSequencial.	
			
			*/
			System.out.println("Não foi possível armazenar os dados.\nNúmero máximo de notas/figuras atingido.");
			numeroSequencial = 0;
			
		} // fim-se
		
	} // fim do construtor default
	
	/**
		O método fabricaSequencial é uma fabrica de instâncias da classe
		SerieLimitada. Ele recebe como argumento um número sequencial e 
		retorna uma instância encapsulada com esse número (caso o número permitido
		de instâncias da classe não tenha sido atingido, caso contrário retorna uma
		instância com o numero sequencial atribuído com o valor constante 0).
		@param sequencial um valor inteiro correspondente ao número sequencial da figura
		@return uma nova instância com o numero sequencial encapsulado ou uma nova instância com
		o numero sequencial atribuído com o valor constante 0 (zero).
	
	*/
	public static SerieLimitada fabricaSequencial(int sequencial){
		
		return new SerieLimitada(sequencial);	// retornamos uma nova instância da classe SerieLimitada	
		
	} // fim do método fabricaSequencial
	
	/**
	 *  O método éIgual recebe como argumento uma outra instância da classe SerieLimitada
	 *  e verifica se a instância passada como argumento e a encapsulada são iguais (possuem o mesmo
	 *  valor para o campo numeroSequencial). Se forem iguais é retornado o valor booleano verdadeiro,
	 *  caso contrário é retornado o valor booleano falso.
	 *  @param umaFigura um instância da própria classe SerieLimitada
	 *  @return true se as instâncias forem iguais,
	 *  		false caso contrário
	 * 
	 * 
	 * */
	public boolean éIgual(SerieLimitada umaFigura){
		
		if(numeroSequencial==umaFigura.numeroSequencial){ // se o campo numeroSequencial possuir o mesmo valor nas duas instâncias
			
			return true; // retorna verdadeiro
			
		}
		else{ // senão
			
			return false; // retorna falso
			
		} // fim-se
		
	} // fim do método éIgual
	
	/**
	 *  O método clona não recebe nenhum argumento e
	 *  retorna uma nova instância da classe SerieLimitada
	 *  com o campo numeroSequencial igual ao da instância
	 *  encapsulada.
	 *  
	 *  @return uma instância que é um clone da instância encapsulada
	 * 
	 * */
	public SerieLimitada clona(){
		
		return new SerieLimitada(numeroSequencial);
		
	} // fim do método clona
	
	/**
	 * 	O método retornaSequencial não possuí argumentos
	 *  e retorna o numeroSequencial do objeto encapsulado.
	 *  @return o número sequencial do objeto encapsulado 
	 * 
	 * */
	public int retornaSequencial(){
		
		return numeroSequencial;
		
	} // fim do método retornaSequencial
	
	/**
	 * 	O método retornaQuantidadeDeInstancias não possuí nenhum argumento
	 *  e retorna o conteúdo da variável contador (que é compartilhada com 
	 *  todos os objetos dessa classe).
	 *  @return o valor correspondente à quantidade de instâncias criadas
	 * 
	 * */
	public static int retornaQuantidadeDeInstancias(){
		
		return contador;
		
	} // fim do método retornaQuantidadeDeInstâncias
	
	/**
	 * 	O método toString não possuí argumentos e retorna
	 * 	os campos da classe formatados.
	 * 	@return uma string contendo os campos do objeto 
	 *  formatados
	 * 
	 * */
	public String toString(){
		
		String id = "Identificação da Figura: ";
			   id = id + ""+numeroSequencial+"\n";
		
		return id;
			
	} // fim do método toString
	
	/**
	 *  O método retornaQuantidadeMaximaPermitida não possuí
	 *  argumentos e retorna um valor inteiro, correspondente
	 *  ao máximo de instâncias que podem ser criadas pelo
	 *  programador usuário da classe.
	 * 	@return um valor inteiro correspondente
	 * 	ao número máximo de instâncias que podem ser criadas da 
	 *  classe SerieLimitada
	 * 
	 * */
	public static int retornaQuantidadeMaximaPermitida(){
		
		return maximoDeInstancias;
		
	} // fim do método retornaQuantidadeMaximaPermitida
	
} // fim da classe SerieLimitada