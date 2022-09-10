/**
	A classe ConversaoDeUnidadesDeTempo é uma biblioteca de métodos cuja 
	finalidade é a de conversão de unidades de tempo. Todos os métodos 
	dessa classe são públicos e estáticos, assim é possível chamá-los
	diretamente, sem a nescessidade de criação de objetos.

	@author Alisson Jaques


*/
public class ConversaoDeUnidadesDeTempo{ // declaração da classe
	
	/**
		O método minutosParaSegundos converte o valor passado em
		minutos para segundos.
		@param minutos o valor em minutos
		@return o valor em segundos correspondente ao valor em 
		minutos
		
	*/

	public static double minutosParaSegundos(double minutos){
		
		double segundos = minutos*60;
		
		return segundos;		
		
	} // fim do método minutosParaSegundos
	
	/**
		O método horasParaMinutos converte o valor passado em
		horas para minutos.
		@param horas o valor em horas
		@return o valor em minutos correspondente ao valor em 
		horas
		
	*/
	public static double horasParaMinutos(double horas){
		
		double minutos = horas*60;
		
		return minutos;		
		
	} // fim do método horasParaMinutos
	
	/**
		O método diasParaHoras converte o valor passado em
		dias para horas.
		@param dias o valor em dias
		@return o valor em horas correspondente ao valor em 
		dias
		
	*/
	public static double diasParaHoras(double dias){
		
		double horas = dias*24;
		
		return horas;		
		
	} // fim do método diasParaHoras
	
	/**
		O método semanasParaDias converte o valor passado em
		semanas para dias.
		@param semanas o valor em semanas
		@return o valor em dias correspondente ao valor em 
		semanas
		
	*/
	public static double semanasParaDias(double semanas){
		
		double dias = semanas*7;
		
		return dias;		
		
	} // fim do método semanasParaDias
	
	/**
		O método mesesParaDias converte o valor passado em
		meses para dias.
		@param meses o valor em meses
		@return o valor em dias correspondente ao valor em 
		meses
		
	*/
	public static double mesesParaDias(double meses){
		
		double dias = meses*30;
		
		return dias;		
		
	} // fim do método mesesParaDias
	
	/**
		O método anosParaDias converte o valor passado em
		anos para dias.
		@param anos o valor em anos
		@return o valor em dias correspondente ao valor em 
		anos	
		
	*/
	public static double anosParaDias(double anos){
		
		double dias = anos*365.25;
		
		return dias;		
		
	} // fim do método anosParaDias
	
} // fim da classe ConversaoDeUnidadesDeTempo