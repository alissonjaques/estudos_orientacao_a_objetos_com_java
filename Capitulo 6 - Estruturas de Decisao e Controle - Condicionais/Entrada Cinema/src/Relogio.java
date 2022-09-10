/**
	A classe Relogio possuí campos e métodos que representam um relógio.
	
	@author Alisson Jaques
	
*/
public class Relogio{ // declaração da classe
	/**
		Declaração dos campos da classe	
	
	*/
	private byte segundos;
	private byte minutos;
	private byte horas;
	
	/**
		O construtor completo para classe Relogio que recebe três argumentos referentes
		a hora, minutos e segundos, respectivamente, e inicializa os campos da classe
		com os mesmos. Caso um dos valores passados como argumento seja negativo o construtor
		icializa os todos os campos da classe com o valor default 0.
		@param hora as horas do relógio
		@param minuto os minutos do relógio
		@param segundo os segundos do relógio
		
	*/
	Relogio(byte hora, byte minuto, byte segundo){
		
		if((hora < 0) || (minuto < 0) || (segundo < 0)){ // se um dos valores, passados como argumento, for negativo
														// inicializa todos os campos da classe com o valor 0
														
			System.out.println("O horário não pode ser registrado, foi criado o horário default."); 
			horas = 0;
			minutos = 0;
			segundos = 0;
		
		}
		else{ // senão
			
			if((hora>=0) && (hora<=24)){ // se 0 <= hora <= 24
				
				horas = hora;
			
			}
			else{ // senão
				
				horas = 0;
			
			} // fim-se
			
			if((minuto>=0) && (minuto<60)){ // se 0<= minuto < 60
				
				minutos = minuto;
			
			}
			else{ // senão
				
				minutos = 0;
			
			} // fim-se
			
			if((segundo>=0) && (segundo<60)){ // se 0<= segundo < 60
				
				segundos = segundo;
			
			}
			else{ // senão
				
				segundos = 0;
			
			} // fim-se
			
		} // fim-se
	} // fim do construtor completo
	
	/**
		Construtor que recebe apenas dois argumentos e chama o construtor completo
		para inicializar os campos da classe. Caso um dos valores, passados como 
		argumento, for negativo todos os campos da classe conterão o valor default
		0.
		@param hora as horas do relógio
		@param minuto os minutos do relógio
		
	*/
	Relogio(byte hora, byte minuto){
		
		this(hora,minuto,(byte)0); // chamada do construtor completo
		
	} // fim do construtor com dois argumentos
	
	/**
		Construtor que recebe apenas um argumento e chama o construtor com dois
		argumentos para inicializar os campos da classe. Caso um dos valores, 
		passados como argumento, for negativo todos os campos da classe conterão 
		o valor default 0.
		@param hora as horas do relógio
		
	*/
	Relogio(byte hora){
		
		this(hora,(byte)0); // chamada em cascata de construtores
		
	} // fim do construtor com um argumento
	
	/**
		O construtor default para a classe Relogio, que não recebe nenhum argumento
		e iniciliaza os campos da classe com 0. Ele realiza esse processo fazendo uma 
		chamadas em cascata de outros construtores dessa classe.
	*/
	Relogio(){
		
		this((byte)0); // inicializa os campos com o valor 0 utilizando o conceito de cascata
		
	} // fim do construtor default
	
	/**
		O método setaHorario, quando chamado, reseta todos os campos da classe
		(atribuí o valor 0 aos mesmos).	
	*/
	public void setaHorario(){
		
		horas = 0;
		minutos = 0;
		segundos = 0;
		
	} // fim do método setaHorario
	
	/**
		O método retornaHoras retorna o conteúdo do campo encapsulado
		horas, ou seja, ele informa as horas armazenadas no objeto.
		@return as horas do relógio
	
	*/
	public byte retornaHoras(){
		
		return horas;
		
	} // fim do método retornaHoras
	
	/**
		O método retornaMinutos retorna o conteúdo do campo encapsulado
		minutos, ou seja, ele informa os minutos armazenados no objeto.
		@return os minutos do relógio
		
	*/
	public byte retornaMinutos(){
		
		return minutos;
		
	} // fim do método retornaMinutos
	
	/**
		O método retornaSegundos retorna o conteúdo do campo encapsulado
		segundos, ou seja, ele informa os segundos armazenados no objeto.
		@return os segundos do relógio
		
	*/
	public byte retornaSegundos(){
		
		return segundos;
		
	} // fim do método retornaSegundos
	
	/**
	 *  O método éIgual recebe como argumento uma instância da própria
	 *  classe Relogio e verifica se essa nova instância possuí os mesmos
	 *  valores, referentes aos campos da classe, do objeto encapsulado.
	 *  @param umRelogio uma instância da própria classe Relogio
	 *  @return true se os objetos forem iguais, false caso contrário
	 * 
	 * */
	public boolean éIgual(Relogio umRelogio) {
		
		if(horas==umRelogio.horas && minutos==umRelogio.minutos && segundos==umRelogio.segundos){ // se os campos encapsulados da classe
																								  // tiverem o mesmo valor dos campos do
																								  // objeto passado como argumento
		
			return true; // retorne verdadeiro
		
		}
		else { // senão
			
			return false; // retorne falso
			
		} // fim-se
	
	} // fim do método éIgual
	
	/**
	 *  O método clona não recebe argumentos e retona um novo objeto,
	 *  cujos campos encapsulados da classe possuem os mesmos valores dos
	 *  campos do objeto atual.
	 *  @return um clone do objeto atual
	 * 
	 * */
	public Relogio clona() {
		
		return new Relogio(horas,minutos,segundos);
		
	} // fim do método clona
	
	/**
	 *  O método fabricaDeRelogios recebe três argumentos referentes
	 *  às horas, minutos e segundos de um relógio e retorna um objeto
	 *  cujos campos são inicializados por esses argumentos. Este método
	 *  é estático, sendo assim não precisa de um objeto da classe para ser
	 *  chamado.
	 *  @param hora as horas do relógio
	 *  @param minuto os minutos do relógio
	 *  @param segundo os segundos do relógio
	 *  @return uma nova instância, com os campos encapsulados inicializados
	 *  com os dados fornecidos no argumento 
	 * 
	 * */
	public static Relogio fabricaDeRelogios(byte hora, byte minuto, byte segundo) {
		
		return new Relogio(hora,minuto,segundo);
		
	} // fim do método fabricaDeRelogios
	
	/**
	 *  O método sobrecarregado fabricaDeRelogios que recebe dois argumentos 
	 *  referentes às horas e os minutos de um relógio e retorna um objeto
	 *  cujos campos são inicializados por esses argumentos (o campo segundos é 
	 *  inicializado com 0). Este método é estático, sendo assim não precisa 
	 *  de um objeto da classe para ser chamado. Este método utiliza o conceito
	 *  de cascata para o desempenho de sua função, utiliza o método fabricaDeRelogios
	 *  com todos os argumentos.
	 *  @param hora as horas do relógio
	 *  @param minuto os minutos do relógio
	 *  @return uma nova instância, com os campos encapsulados inicializados
	 *  com os dados fornecidos no argumento e o campo segundos com o valor 0
	 * 
	 * */
	public static Relogio fabricaDeRelogios(byte hora, byte minuto) {
		
		return fabricaDeRelogios(hora,minuto,(byte)0);
		
	} // fim do método sobrecarregado fabricaDeRelogios com dois argumentos
	
	/**
	 *  O método sobrecarregado fabricaDeRelogios que recebe um argumento 
	 *  referente às hora e retorna um objeto cujo campo horas é inicializado 
	 *  por esse argumento (os campos minutos e segundos são inicializados com 0).
	 *  Este método é estático, sendo assim não precisa de um objeto da classe para
	 *  ser chamado. Este método utiliza o conceito de cascata para o desempenho de 
	 *  sua função, utiliza o método fabricaDeRelogios com dois argumentos.
	 *  @param hora as horas do relógio
	 *  @return uma nova instância, com o campo encapsulado hora inicializado
	 *  com o dado fornecido no argumento e os campos horas e segundos com o valor 0
	 * 
	 * */
	public static Relogio fabricaDeRelogios(byte hora) {
		
		return fabricaDeRelogios(hora,(byte)0);
		
	} // fim do método sobrecarregado fabricaDeRelogios com um argumento
	
	/**
	 *  A fabrica de instâncias default é representada por esse método, que não
	 *  recebe nenhum argumento e retorna uma nova instância da classe Relogio
	 *  com valores default (00:00:00)
	 *  @return um novo objeto com valores default
	 * 
	 * */
	public static Relogio fabricaDeRelogios() {
		
		return new Relogio();
		
	} // fim do método default fabricaDeRelogios
	
	/**
		O método toString não possuí argumentos e retorna o conteúdo do relógio formatado,
		no padrão horas:minutos:segundos.
		@return horario os campos do objeto formatados
	
	*/
	public String toString(){
		
		String horario = ""; // declaração de string auxiliar
		
		if(horas>=0 && horas<10){ // se 0 <= horas < 10
			
			horario += "0"+ horas + ":"; // concatene com 0 à esquerda
		
		}
		else{ // senão
			
			horario += horas + ":"; // apenas concatene com ":"
			
		} // fim-se
		
		if(minutos>=0 && minutos<10){ // se 0 <= minutos < 10
			
			horario += "0"+ minutos + ":"; // concatene com 0 à esquerda
		
		}
		else{ // senão
			
			horario += minutos + ":"; // apenas concatene com ":"
			
		} // fim-se
		
		if(segundos>=0 && segundos<10){ // se 0 <= segundos <10
			
			horario += "0"+ segundos; // concatene com 0 à esquerda
		
		}
		else{ // senão
			
			horario += segundos; // apenas concatene com o conteúdo de segundos
			
		} // fim-se
		
		return horario;
		
	} // fim do método toString
	
} // fim da classe Relogio