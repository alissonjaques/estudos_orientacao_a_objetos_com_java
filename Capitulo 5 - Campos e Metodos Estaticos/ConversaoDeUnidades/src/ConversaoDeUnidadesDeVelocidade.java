/**
 *  A classe ConversaoDeUnidadesDeVelocidade é uma biblioteca de métodos, cuja finalidade
 *  é a de conversão de unidades de velocidade. Os métodos dessa classe são todos públicos
 *  e estáticos, assim é possível chamá-los diretamente, sem a necessidade de criação de 
 *  objetos para a classe.
 *  
 *  @author Alisson Jaques
 * 
 * 
 * */
public class ConversaoDeUnidadesDeVelocidade { // declaração da classe
	
	/**
	 *  O método quilômetrosPorHoraParaMetrosPorSegundo converte o valor da velocidade em
	 *  quilômetros por hora para metros por segundo.
	 *  @param quilômetrosPorHora o valor da velocidade em quilômetros por hora
	 *  @return a velocidade em metros por segundo correspondente à velocidade em quilômetros
	 *  por hora 
	 * 
	 * */
	public static double quilômetrosPorHoraParaMetrosPorSegundo(double quilômetrosPorHora) {
		
		double metrosPorSegundo = quilômetrosPorHora*0.2778;
		
		return metrosPorSegundo;		
		
	} // fim do método quilômetrosPorHoraParaMetrosPorSegundo
	
	/**
	 *  O método quilômetrosPorHoraParaMilhasPorHora converte o valor da velocidade em
	 *  quilômetros por hora para milhas por hora.
	 *  @param quilômetrosPorHora o valor da velocidade em quilômetros por hora
	 *  @return a velocidade em milhas por hora correspondente à velocidade em quilômetros
	 *  por hora 
	 * 
	 * */
	public static double quilômetrosPorHoraParaMilhasPorHora(double quilômetrosPorHora) {
		
		double milhasPorHora = quilômetrosPorHora*0.6214;
		
		return milhasPorHora;		
		
	} // fim do método quilômetrosPorHoraParaMilhasPorHora
	
	/**
	 *  O método quilômetrosPorHoraParaPésPorSegundo converte o valor da velocidade em
	 *  quilômetros por hora para pés por segundo.
	 *  @param quilômetrosPorHora o valor da velocidade em quilômetros por hora
	 *  @return a velocidade em pés por segundo correspondente à velocidade em quilômetros
	 *  por hora 
	 * 
	 * */
	public static double quilômetrosPorHoraParaPésPorSegundo(double quilômetrosPorHora) {
	
		double pésPorSegundo = quilômetrosPorHora*0.9113;
	
		return pésPorSegundo;		
	
	} // fim do método quilômetrosPorHoraParaPésPorSegundo
	
	/**
	 *  O método milhasPorHoraParaPésPorSegundo converte o valor da velocidade em
	 *  milhas por hora para pés por segundo.
	 *  @param milhasPorHora o valor da velocidade em milhas por hora
	 *  @return a velocidade em pés por segundo correspondente à velocidade em milhas por
	 *  hora 
	 * 
	 * */
	public static double milhasPorHoraParaPésPorSegundo(double milhasPorHora) {
	
		double pésPorSegundo = milhasPorHora*1.467;
	
		return pésPorSegundo;		
	
	} // fim do método milhasPorHoraParaPésPorSegundo
	
	/**
	 *  O método milhasPorHoraParaQuilômetrosPorHora converte o valor da velocidade em
	 *  milhas por hora para quilômetros por hora.
	 *  @param milhasPorHora o valor da velocidade em milhas por hora
	 *  @return a velocidade em quilômetros por hora correspondente à velocidade em milhas por
	 *  hora 
	 * 
	 * */
	public static double milhasPorHoraParaQuilômetrosPorHora(double milhasPorHora) {
		
		double quilômetrosPorHora = milhasPorHora*1.609;
	
		return quilômetrosPorHora;		
	
	} // fim do método milhasPorHoraParaQuilômetrosPorHora
	
	/**
	 *  O método milhasPorHoraParaMetrosPorSegundo converte o valor da velocidade em
	 *  milhas por hora para metros por segundo.
	 *  @param milhasPorHora o valor da velocidade em milhas por hora
	 *  @return a velocidade em metros por segundo correspondente à velocidade em milhas por
	 *  hora 
	 * 
	 * */
	public static double milhasPorHoraParaMetrosPorSegundo(double milhasPorHora) {
		
		double metrosPorSegundo = milhasPorHora*0.4470;
	
		return metrosPorSegundo;		
	
	} // fim do método milhasPorHoraParaMetrosPorSegundo
	
} // fim da classe ConversaoDeUnidadesDeVelocidade