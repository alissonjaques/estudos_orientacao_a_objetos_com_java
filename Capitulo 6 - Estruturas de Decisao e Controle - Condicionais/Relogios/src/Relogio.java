/**
	A classe Relogio possu� campos e m�todos que representam um rel�gio.
	
	@author Alisson Jaques
	
*/
public class Relogio{ // declara��o da classe
	/**
		Declara��o dos campos da classe	
	
	*/
	private byte segundos;
	private byte minutos;
	private byte horas;
	
	/**
		O construtor completo para classe Relogio que recebe tr�s argumentos referentes
		a hora, minutos e segundos, respectivamente, e inicializa os campos da classe
		com os mesmos. Caso um dos valores passados como argumento seja negativo o construtor
		icializa os todos os campos da classe com o valor default 0.
		@param hora as horas do rel�gio
		@param minuto os minutos do rel�gio
		@param segundo os segundos do rel�gio
		
	*/
	Relogio(byte hora, byte minuto, byte segundo){
		
		if((hora < 0) || (minuto < 0) || (segundo < 0)){ // se um dos valores, passados como argumento, for negativo
														// inicializa todos os campos da classe com o valor 0
														
			System.out.println("O hor�rio n�o pode ser registrado, foi criado o hor�rio default."); 
			horas = 0;
			minutos = 0;
			segundos = 0;
		
		}
		else{ // sen�o
			
			if((hora>=0) && (hora<=24)){ // se 0 <= hora <= 24
				
				horas = hora;
			
			}
			else{ // sen�o
				
				horas = 0;
			
			} // fim-se
			
			if((minuto>=0) && (minuto<60)){ // se 0<= minuto < 60
				
				minutos = minuto;
			
			}
			else{ // sen�o
				
				minutos = 0;
			
			} // fim-se
			
			if((segundo>=0) && (segundo<60)){ // se 0<= segundo < 60
				
				segundos = segundo;
			
			}
			else{ // sen�o
				
				segundos = 0;
			
			} // fim-se
			
		} // fim-se
	} // fim do construtor completo
	
	/**
		Construtor que recebe apenas dois argumentos e chama o construtor completo
		para inicializar os campos da classe. Caso um dos valores, passados como 
		argumento, for negativo todos os campos da classe conter�o o valor default
		0.
		@param hora as horas do rel�gio
		@param minuto os minutos do rel�gio
		
	*/
	Relogio(byte hora, byte minuto){
		
		this(hora,minuto,(byte)0); // chamada do construtor completo
		
	} // fim do construtor com dois argumentos
	
	/**
		Construtor que recebe apenas um argumento e chama o construtor com dois
		argumentos para inicializar os campos da classe. Caso um dos valores, 
		passados como argumento, for negativo todos os campos da classe conter�o 
		o valor default 0.
		@param hora as horas do rel�gio
		
	*/
	Relogio(byte hora){
		
		this(hora,(byte)0); // chamada em cascata de construtores
		
	} // fim do construtor com um argumento
	
	/**
		O construtor default para a classe Relogio, que n�o recebe nenhum argumento
		e iniciliaza os campos da classe com 0. Ele realiza esse processo fazendo uma 
		chamadas em cascata de outros construtores dessa classe.
	*/
	Relogio(){
		
		this((byte)0); // inicializa os campos com o valor 0 utilizando o conceito de cascata
		
	} // fim do construtor default
	
	/**
		O m�todo setaHorario, quando chamado, reseta todos os campos da classe
		(atribu� o valor 0 aos mesmos).	
	*/
	public void setaHorario(){
		
		horas = 0;
		minutos = 0;
		segundos = 0;
		
	} // fim do m�todo setaHorario
	
	/**
		O m�todo retornaHoras retorna o conte�do do campo encapsulado
		horas, ou seja, ele informa as horas armazenadas no objeto.
		@return as horas do rel�gio
	
	*/
	public byte retornaHoras(){
		
		return horas;
		
	} // fim do m�todo retornaHoras
	
	/**
		O m�todo retornaMinutos retorna o conte�do do campo encapsulado
		minutos, ou seja, ele informa os minutos armazenados no objeto.
		@return os minutos do rel�gio
		
	*/
	public byte retornaMinutos(){
		
		return minutos;
		
	} // fim do m�todo retornaMinutos
	
	/**
		O m�todo retornaSegundos retorna o conte�do do campo encapsulado
		segundos, ou seja, ele informa os segundos armazenados no objeto.
		@return os segundos do rel�gio
		
	*/
	public byte retornaSegundos(){
		
		return segundos;
		
	} // fim do m�todo retornaSegundos
	
	/**
	 *  O m�todo �Igual recebe como argumento uma inst�ncia da pr�pria
	 *  classe Relogio e verifica se essa nova inst�ncia possu� os mesmos
	 *  valores, referentes aos campos da classe, do objeto encapsulado.
	 *  @param umRelogio uma inst�ncia da pr�pria classe Relogio
	 *  @return true se os objetos forem iguais, false caso contr�rio
	 * 
	 * */
	public boolean �Igual(Relogio umRelogio) {
		
		if(horas==umRelogio.horas && minutos==umRelogio.minutos && segundos==umRelogio.segundos){ // se os campos encapsulados da classe
																								  // tiverem o mesmo valor dos campos do
																								  // objeto passado como argumento
		
			return true; // retorne verdadeiro
		
		}
		else { // sen�o
			
			return false; // retorne falso
			
		} // fim-se
	
	} // fim do m�todo �Igual
	
	/**
	 *  O m�todo clona n�o recebe argumentos e retona um novo objeto,
	 *  cujos campos encapsulados da classe possuem os mesmos valores dos
	 *  campos do objeto atual.
	 *  @return um clone do objeto atual
	 * 
	 * */
	public Relogio clona() {
		
		return new Relogio(horas,minutos,segundos);
		
	} // fim do m�todo clona
	
	/**
	 *  O m�todo fabricaDeRelogios recebe tr�s argumentos referentes
	 *  �s horas, minutos e segundos de um rel�gio e retorna um objeto
	 *  cujos campos s�o inicializados por esses argumentos. Este m�todo
	 *  � est�tico, sendo assim n�o precisa de um objeto da classe para ser
	 *  chamado.
	 *  @param hora as horas do rel�gio
	 *  @param minuto os minutos do rel�gio
	 *  @param segundo os segundos do rel�gio
	 *  @return uma nova inst�ncia, com os campos encapsulados inicializados
	 *  com os dados fornecidos no argumento 
	 * 
	 * */
	public static Relogio fabricaDeRelogios(byte hora, byte minuto, byte segundo) {
		
		return new Relogio(hora,minuto,segundo);
		
	} // fim do m�todo fabricaDeRelogios
	
	/**
	 *  O m�todo sobrecarregado fabricaDeRelogios que recebe dois argumentos 
	 *  referentes �s horas e os minutos de um rel�gio e retorna um objeto
	 *  cujos campos s�o inicializados por esses argumentos (o campo segundos � 
	 *  inicializado com 0). Este m�todo � est�tico, sendo assim n�o precisa 
	 *  de um objeto da classe para ser chamado. Este m�todo utiliza o conceito
	 *  de cascata para o desempenho de sua fun��o, utiliza o m�todo fabricaDeRelogios
	 *  com todos os argumentos.
	 *  @param hora as horas do rel�gio
	 *  @param minuto os minutos do rel�gio
	 *  @return uma nova inst�ncia, com os campos encapsulados inicializados
	 *  com os dados fornecidos no argumento e o campo segundos com o valor 0
	 * 
	 * */
	public static Relogio fabricaDeRelogios(byte hora, byte minuto) {
		
		return fabricaDeRelogios(hora,minuto,(byte)0);
		
	} // fim do m�todo sobrecarregado fabricaDeRelogios com dois argumentos
	
	/**
	 *  O m�todo sobrecarregado fabricaDeRelogios que recebe um argumento 
	 *  referente �s hora e retorna um objeto cujo campo horas � inicializado 
	 *  por esse argumento (os campos minutos e segundos s�o inicializados com 0).
	 *  Este m�todo � est�tico, sendo assim n�o precisa de um objeto da classe para
	 *  ser chamado. Este m�todo utiliza o conceito de cascata para o desempenho de 
	 *  sua fun��o, utiliza o m�todo fabricaDeRelogios com dois argumentos.
	 *  @param hora as horas do rel�gio
	 *  @return uma nova inst�ncia, com o campo encapsulado hora inicializado
	 *  com o dado fornecido no argumento e os campos horas e segundos com o valor 0
	 * 
	 * */
	public static Relogio fabricaDeRelogios(byte hora) {
		
		return fabricaDeRelogios(hora,(byte)0);
		
	} // fim do m�todo sobrecarregado fabricaDeRelogios com um argumento
	
	/**
	 *  A fabrica de inst�ncias default � representada por esse m�todo, que n�o
	 *  recebe nenhum argumento e retorna uma nova inst�ncia da classe Relogio
	 *  com valores default (00:00:00)
	 *  @return um novo objeto com valores default
	 * 
	 * */
	public static Relogio fabricaDeRelogios() {
		
		return new Relogio();
		
	} // fim do m�todo default fabricaDeRelogios
	
	/**
		O m�todo toString n�o possu� argumentos e retorna o conte�do do rel�gio formatado,
		no padr�o horas:minutos:segundos.
		@return horario os campos do objeto formatados
	
	*/
	public String toString(){
		
		String horario = ""; // declara��o de string auxiliar
		
		if(horas>=0 && horas<10){ // se 0 <= horas < 10
			
			horario += "0"+ horas + ":"; // concatene com 0 � esquerda
		
		}
		else{ // sen�o
			
			horario += horas + ":"; // apenas concatene com ":"
			
		} // fim-se
		
		if(minutos>=0 && minutos<10){ // se 0 <= minutos < 10
			
			horario += "0"+ minutos + ":"; // concatene com 0 � esquerda
		
		}
		else{ // sen�o
			
			horario += minutos + ":"; // apenas concatene com ":"
			
		} // fim-se
		
		if(segundos>=0 && segundos<10){ // se 0 <= segundos <10
			
			horario += "0"+ segundos; // concatene com 0 � esquerda
		
		}
		else{ // sen�o
			
			horario += segundos; // apenas concatene com o conte�do de segundos
			
		} // fim-se
		
		return horario;
		
	} // fim do m�todo toString
	
} // fim da classe Relogio