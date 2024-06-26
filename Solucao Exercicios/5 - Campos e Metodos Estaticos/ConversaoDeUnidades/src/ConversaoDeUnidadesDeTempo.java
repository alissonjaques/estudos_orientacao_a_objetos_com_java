/**
	A classe ConversaoDeUnidadesDeTempo � uma biblioteca de m�todos cuja 
	finalidade � a de convers�o de unidades de tempo. Todos os m�todos 
	dessa classe s�o p�blicos e est�ticos, assim � poss�vel cham�-los
	diretamente, sem a nescessidade de cria��o de objetos.

	@author Alisson Jaques


*/
public class ConversaoDeUnidadesDeTempo{ // declara��o da classe
	
	/**
		O m�todo minutosParaSegundos converte o valor passado em
		minutos para segundos.
		@param minutos o valor em minutos
		@return o valor em segundos correspondente ao valor em 
		minutos
		
	*/

	public static double minutosParaSegundos(double minutos){
		
		double segundos = minutos*60;
		
		return segundos;		
		
	} // fim do m�todo minutosParaSegundos
	
	/**
		O m�todo horasParaMinutos converte o valor passado em
		horas para minutos.
		@param horas o valor em horas
		@return o valor em minutos correspondente ao valor em 
		horas
		
	*/
	public static double horasParaMinutos(double horas){
		
		double minutos = horas*60;
		
		return minutos;		
		
	} // fim do m�todo horasParaMinutos
	
	/**
		O m�todo diasParaMinutos converte o valor passado em
		dias para minutos. Este m�todo utiliza os m�todos
		diasParaHoras e horasParaMinutos, pertencentes � 
		pr�pria classe ConversaoDeUnidadesDeTempo, para realizar
		essa tarefa.
		@param dias o valor em dias
		@return o valor em minutos correspondente ao valor em 
		dias
	
	*/	
	public static double diasParaMinutos(double dias){
		
		/*
		 * 	Passamos o argumento dias para o m�todo diasParaHoras e
		 *  depois passamos esse m�todo como argumento para o m�todo
		 *  horasParaMinutos, assim obtemos o valor em minutos 
		 *  correspondente ao valor em dias.
		 *  
		 * */
		double minutos = horasParaMinutos(diasParaHoras(dias));   
		
		return minutos;	
		
	} // fim do m�todo diasParaMinutos
	
	/**
		O m�todo diasParaSegundos converte o valor passado em
		dias para segundos. Este m�todo utiliza os m�todos
		diasParaMinutos e minutosParaSegundos, pertencentes � 
		pr�pria classe ConversaoDeUnidadesDeTempo, para realizar
		essa tarefa.
		@param dias o valor em dias
		@return o valor em segundos correspondente ao valor em 
		dias

	 */	
	public static double diasParaSegundos(double dias) {
		
		/*
		 *	Passamos o argumento dias para o m�todo diasParaMinutos
		 *	e depois passamos esse m�todo como argumento para o m�todo
		 *	minutosParaSegundos, assim obtemos o valor em segundos
		 *	correspondente ao valor em dias. 
		 * 
		 * */
		double segundos = minutosParaSegundos(diasParaMinutos(dias));
		
		return segundos;
		
	} // fim do m�todo diasParaSegundos
	
	/**
		O m�todo diasParaHoras converte o valor passado em
		dias para horas.
		@param dias o valor em dias
		@return o valor em horas correspondente ao valor em 
		dias
		
	*/
	public static double diasParaHoras(double dias){
		
		double horas = dias*24;
		
		return horas;		
		
	} // fim do m�todo diasParaHoras
	
	/**
		O m�todo semanasParaDias converte o valor passado em
		semanas para dias.
		@param semanas o valor em semanas
		@return o valor em dias correspondente ao valor em 
		semanas
		
	*/
	public static double semanasParaDias(double semanas){
		
		double dias = semanas*7;
		
		return dias;		
		
	} // fim do m�todo semanasParaDias
	
	/**
		O m�todo mesesParaDias converte o valor passado em
		meses para dias.
		@param meses o valor em meses
		@return o valor em dias correspondente ao valor em 
		meses
		
	*/
	public static double mesesParaDias(double meses){
		
		double dias = meses*30;
		
		return dias;		
		
	} // fim do m�todo mesesParaDias
	
	/**
		O m�todo anosParaDias converte o valor passado em
		anos para dias.
		@param anos o valor em anos
		@return o valor em dias correspondente ao valor em 
		anos	
		
	*/
	public static double anosParaDias(double anos){
		
		double dias = anos*365.25;
		
		return dias;		
		
	} // fim do m�todo anosParaDias
	
} // fim da classe ConversaoDeUnidadesDeTempo