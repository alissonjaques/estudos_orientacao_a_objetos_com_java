	/**
 *  A classe ConversaoDeTemperatura � uma biblioteca de m�todos, seus
 *  m�todos possibilitam a convers�o entre diferentes escalas de temperatura,
 *  sendo todos est�ticos e p�blicos, facilitando o uso por outras classes.
 * 	
 * 	@author Alisson Jaques 
 * 
 * */
public class ConversaoDeTemperatura { // declara��o da classe
	
	/**
	 * 	O m�todo celsiusParaFahrenheit converte o valor passado em graus
	 *  celsius para graus fahrenheit.
	 *  @param celsius a temperatura em graus celsius
	 *  @return o valor em graus fahrenheit correspondente ao valor em 
	 *  graus celsius
	 * 
	 * */
	 public static double celsiusParaFahrenheit(double celsius) {
		 
		 double fahrenheit = ((9/5)*(celsius)) + 32;
		 
		 return fahrenheit;		 
		 
	 } // fim do m�todo celsiusParaFahrenheit
	 
	 /**
	  *  O m�todo celsiusParaKelvin converte o valor passado em graus
	  *  celsius para kelvin.
   	  *  @param celsius a temperatura em graus celsius
	  *  @return o valor em kelvin correspondente ao valor em 
      *  graus celsius
      * 
	  * */
	 public static double celsiusParaKelvin(double celsius) {
		 
		 double kelvin = celsius + 273.15;
		 
		 return kelvin;
		 		 
	 } // fim do m�todo celsiusParaKelvin
	
	 /**
	  *  O m�todo fahrenheitParaCelsius converte o valor passado em graus
	  *  fahrenheit para graus celsius.
	  *  @param fahrenheit a temperatura em graus fahrenheit
	  *  @return o valor em graus celsius correspondente ao valor em 
	  *  graus fahrenheit
	  * 
	  * */
	 public static double fahrenheitParaCelsius(double fahrenheit) {
		 
		 double celsius = 32 + ((9/5)*fahrenheit);
		 
		 return celsius; 
		 
	 } // fim do m�todo fahrenheitParaCelsius
	 
	 /**
	  *  O m�todo kelvinParaCelsius converte o valor passado em kelvin
	  *  para graus celsius.
	  *  @param kelvin a temperatura em kelvin
	  *  @return o valor em graus celsius correspondente ao valor em 
	  *  kelvin
	  * 
	  * */
	 public static double kelvinParaCelsius(double kelvin) {
		 
		 double celsius = kelvin + 273.15;
		 
		 return celsius;
		 
	 } // fim do m�todo kelvinParaCelsius
	 
	 /**
	  *  O m�todo fahrenheitParaKelvin converte o valor passado em graus
	  *  fahrenheit para em kelvin.
	  *  @param fahrenheit a temperatura em graus fahrenheit
	  *  @return o valor em kelvin correspondente ao valor em graus
	  *  fahrenheit
	  * 
	  * */
	 public static double fahrenheitParaKelvin(double fahrenheit) {
		 
		 double kelvin = ((9/5)*fahrenheit) - 459.67;
		 
		 return kelvin;
		 
	 } // fim do m�todo fahrenheitParaKelvin
	 
	 /**
	  *  O m�todo kelvinParaFahrenheit converte o valor passado em kelvin
	  *  para graus fahrenheit.
	  *  @param kelvin a temperatura em kelvin
	  *  @return o valor em graus fahrenheit correspondente ao valor em 
	  *  kelvin
	  * 
	  * */
	 public static double kelvinParaFahrenheit(double kelvin) {
		 
		 double fahrenheit = (5/9)*(kelvin + 459.67);
		 
		 return fahrenheit;
		 
	 } // fim do m�todo kelvinParaFahrenheit
	 
} // fim da classe ConversaoDeTemperatura