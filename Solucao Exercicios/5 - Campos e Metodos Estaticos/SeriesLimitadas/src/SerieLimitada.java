/**
 *  A classe SerieLimitada possu� campos e m�todos que 
 *  permitem o armazenamento de uma quantidade limitada 
 *  de figuras.
 *  @author Alisson Jaques 
 * 
 * */
public class SerieLimitada{ // declara��o da classe
	
	/**
		
		Declara��o dos campos da classe.
	
	
	*/
	private int numeroSequencial; 						// campo encapsulado da classe, referente ao n�mero sequencial da figura
	static private int contador = 0;					// campo compartilhado entre os objetos da classe, para controle de inst�ncias criadas
	final static public int maximoDeInstancias = 10;	// constante p�blica, referente ao m�ximo de inst�ncias que a classe pode criar
	
	/**
		O construtor para a classe SerieLitada que recebe 
		como argumento um n�mero inteiro referente ao n�mero 
		sequencial da figura e inicializa o campo da classe 
		(numeroSequencial) com o mesmo. Caso o usu�rio da classe
		tenha excedido o uso das inst�ncias permitidas � atribu�do
		ao campo numeroSequencial o valor 0 e informado ao usu�rio
		da classe a impossibilidade de criar a inst�ncia como 
		ele deseja.
		@param sequencial um n�mero inteiro que representa o n�mero sequencial
		de uma figura
	
	*/
	SerieLimitada(int sequencial){
		
		/*
			Toda vez que uma inst�ncia for criada
			o conte�do da vari�vel contador ir� 
			receber a soma de seu conte�do com o 
			valor 1.
			
		*/
		contador = contador + 1;
		
		if(contador<=maximoDeInstancias){ // se o conte�do do contador for menor do que o n�mero de inst�ncias permitidas
			
			numeroSequencial = sequencial; // o campo numeroSequencial receber� o valor passado como argumento
			
		}
		else{ // sen�o
			
			/*
				Informamos ao usu�rio que n�o foi poss�vel 
				criar o objeto como ele deseja e atribu�mos
				o valor constante 0 ao campo numeroSequencial.	
			
			*/
			System.out.println("N�o foi poss�vel armazenar os dados.\nN�mero m�ximo de notas/figuras atingido.");
			numeroSequencial = 0;
			
		} // fim-se
				
	} // fim do construtor
	
	/**
	
		O construtor default para a classe SerieLimitada
		que n�o recebe nenhum argumento e inicializa o campo
		numeroSequencial com o valor 0. Se o usu�rio exceder o 
		n�mero de inst�ncia permitido para a classe � dado um
		alerta no terminal indicando essa ocorr�ncia, caso contr�rio
		o sistema informa ao usuario que o mesmo n�o inseriu um 
		n�mero sequencial e que esse tera o valor default 0.	
	
	*/
	SerieLimitada(){
		
		/*
			Toda vez que uma inst�ncia for criada
			o conte�do da vari�vel contador ir� 
			receber a soma de seu conte�do com o 
			valor 1.
			
		*/
		contador = contador + 1;
		
		if(contador<=maximoDeInstancias){ // se o conte�do do contador for menor do que o n�mero de inst�ncias permitidas
			/*
				Informamos ao usu�rio que ele n�o inseriu um n�mero sequencial
				e que, portanto, ele ter� o valor 0.
			
			*/
			System.out.println("O n�mero sequencial n�o foi informado! Foi atribu�do a ele o valor 0 (zero).");
			numeroSequencial = 0;
			
		}
		else{
			
			/*
				Informamos ao usu�rio que n�o foi poss�vel 
				criar o objeto como ele deseja e atribu�mos
				o valor constante 0 ao campo numeroSequencial.	
			
			*/
			System.out.println("N�o foi poss�vel armazenar os dados.\nN�mero m�ximo de notas/figuras atingido.");
			numeroSequencial = 0;
			
		} // fim-se
		
	} // fim do construtor default
	
	/**
		O m�todo fabricaSequencial � uma fabrica de inst�ncias da classe
		SerieLimitada. Ele recebe como argumento um n�mero sequencial e 
		retorna uma inst�ncia encapsulada com esse n�mero (caso o n�mero permitido
		de inst�ncias da classe n�o tenha sido atingido, caso contr�rio retorna uma
		inst�ncia com o numero sequencial atribu�do com o valor constante 0).
		@param sequencial um valor inteiro correspondente ao n�mero sequencial da figura
		@return uma nova inst�ncia com o numero sequencial encapsulado ou uma nova inst�ncia com
		o numero sequencial atribu�do com o valor constante 0 (zero).
	
	*/
	public static SerieLimitada fabricaSequencial(int sequencial){
		
		return new SerieLimitada(sequencial);	// retornamos uma nova inst�ncia da classe SerieLimitada	
		
	} // fim do m�todo fabricaSequencial
	
	/**
	 *  O m�todo �Igual recebe como argumento uma outra inst�ncia da classe SerieLimitada
	 *  e verifica se a inst�ncia passada como argumento e a encapsulada s�o iguais (possuem o mesmo
	 *  valor para o campo numeroSequencial). Se forem iguais � retornado o valor booleano verdadeiro,
	 *  caso contr�rio � retornado o valor booleano falso.
	 *  @param umaFigura um inst�ncia da pr�pria classe SerieLimitada
	 *  @return true se as inst�ncias forem iguais,
	 *  		false caso contr�rio
	 * 
	 * 
	 * */
	public boolean �Igual(SerieLimitada umaFigura){
		
		if(numeroSequencial==umaFigura.numeroSequencial){ // se o campo numeroSequencial possuir o mesmo valor nas duas inst�ncias
			
			return true; // retorna verdadeiro
			
		}
		else{ // sen�o
			
			return false; // retorna falso
			
		} // fim-se
		
	} // fim do m�todo �Igual
	
	/**
	 *  O m�todo clona n�o recebe nenhum argumento e
	 *  retorna uma nova inst�ncia da classe SerieLimitada
	 *  com o campo numeroSequencial igual ao da inst�ncia
	 *  encapsulada.
	 *  
	 *  @return uma inst�ncia que � um clone da inst�ncia encapsulada
	 * 
	 * */
	public SerieLimitada clona(){
		
		return new SerieLimitada(numeroSequencial);
		
	} // fim do m�todo clona
	
	/**
	 * 	O m�todo retornaSequencial n�o possu� argumentos
	 *  e retorna o numeroSequencial do objeto encapsulado.
	 *  @return o n�mero sequencial do objeto encapsulado 
	 * 
	 * */
	public int retornaSequencial(){
		
		return numeroSequencial;
		
	} // fim do m�todo retornaSequencial
	
	/**
	 * 	O m�todo retornaQuantidadeDeInstancias n�o possu� nenhum argumento
	 *  e retorna o conte�do da vari�vel contador (que � compartilhada com 
	 *  todos os objetos dessa classe).
	 *  @return o valor correspondente � quantidade de inst�ncias criadas
	 * 
	 * */
	public static int retornaQuantidadeDeInstancias(){
		
		return contador;
		
	} // fim do m�todo retornaQuantidadeDeInst�ncias
	
	/**
	 * 	O m�todo toString n�o possu� argumentos e retorna
	 * 	os campos da classe formatados.
	 * 	@return uma string contendo os campos do objeto 
	 *  formatados
	 * 
	 * */
	public String toString(){
		
		String id = "Identifica��o da Figura: ";
			   id = id + ""+numeroSequencial+"\n";
		
		return id;
			
	} // fim do m�todo toString
	
	/**
	 *  O m�todo retornaQuantidadeMaximaPermitida n�o possu�
	 *  argumentos e retorna um valor inteiro, correspondente
	 *  ao m�ximo de inst�ncias que podem ser criadas pelo
	 *  programador usu�rio da classe.
	 * 	@return um valor inteiro correspondente
	 * 	ao n�mero m�ximo de inst�ncias que podem ser criadas da 
	 *  classe SerieLimitada
	 * 
	 * */
	public static int retornaQuantidadeMaximaPermitida(){
		
		return maximoDeInstancias;
		
	} // fim do m�todo retornaQuantidadeMaximaPermitida
	
} // fim da classe SerieLimitada