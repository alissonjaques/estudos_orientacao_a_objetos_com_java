/**
	A classe mudancaEscalaDeTemperatura é uma biblioteca
	de métodos que possibilitada a obtenção de diferentes
	escalas de temperatura, tendo uma conhecida. Seus métodos
	são todos estáticos, o que permite que sejam chamados
	diretamente por classes usuárias.
	@author Alisson Jaques
	
*/
public class MudancaEscalaDeTemperatura{ // declaração da classe
	
	/**
		O método celsiusParaKelvin converte o valor passado
		em graus celsius para kelvin.
		@param celsius o valor da temperatura em graus celsius
		@return o valor da temperatura em kelvin
	
	*/
	public static double celsiusParaKelvin(double celsius){
		
		double kelvin = celsius + 273;
		
		return kelvin;	
		
	} // fim do método celsiusParaKelvin
	
	/**
		O método kelvinParaCelsius converte o valor passado
		em kelvin para graus celsius.
		@param kelvin o valor da temperatura em kelvin
		@return o valor da temperatura em graus celsius
	
	*/
	public static double kelvinParaCelsius(double kelvin){
		
		double celsius = kelvin - 273;
		
		return celsius;	
		
	} // fim do método kelvinParaCelsius
	
	/**
		O método celsiusParaFahrenheit converte o valor passado
		em graus celsius para graus fahrenheit.
		@param celsius o valor da temperatura em graus celsius
		@return o valor da temperatura em graus fahrenheit
	
	*/
	public static double celsiusParaFahrenheit(double celsius){
		
		double fahrenheit = (1.8*celsius) + 32;
		
		return fahrenheit;
		
	} // fim do método celsiusParaFahrenheit
	
	/**
		O método fahrenheitParaCelsius converte o valor passado
		em graus fahrenheit para graus celsius.
		@param fahrenheit o valor da temperatura em graus fahrenheit
		@return o valor da temperatura em graus celsius
	
	*/
	public static double fahrenheitParaCelsius(double fahrenheit){
		
		double celsius = (fahrenheit - 32)/1.8;
		
		return celsius;
		
	} // fim do método fahrenheitParaCelsius
	
	/**
		O método kelvinParaFahrenheit converte o valor passado
		em kelvin para graus fahrenheit. Para tanto, ele chama em
		cascata o método kelvinParaCelsius, passando o argumento kelvin
		para o mesmo, e depois passa esse método como argumento para o 
		método celsiusParaFahrenheit (ambos os métodos pertencem à própria
		classe mudancaEscalaDeTemperatura).
		@param kelvin o valor da temperatura em kelvin
		@return o valor da temperatura em graus fahrenheit	
	
	*/
	public static double kelvinParaFahrenheit(double kelvin){
		
		double fahrenheit = celsiusParaFahrenheit(kelvinParaCelsius(kelvin));
		
		return fahrenheit;
		
	} // fim do método kelvinParaFahrenheit
	
	/**
		O método fahrenheitParaKelvin converte o valor passado
		em graus fahrenheit para kelvin. Para tanto, ele chama em
		cascata o método fahrenheitParaCelsius, passando o argumento fahrenheit
		para o mesmo, e depois passa esse método como argumento para o 
		método celsiusParaKelvin (ambos os métodos pertencem à própria
		classe mudancaEscalaDeTemperatura).
		@param fahrenheit o valor da temperatura em graus fahrenheit
		@return o valor da temperatura em kelvin	
	
	*/
	public static double fahrenheitParaKelvin(double fahrenheit){
		
		double kelvin = celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit));
		
		return kelvin;
		
	} // fim do método fahrenheitParaKelvin
	
} // fim da classe mudancaEscalaDeTemperatura