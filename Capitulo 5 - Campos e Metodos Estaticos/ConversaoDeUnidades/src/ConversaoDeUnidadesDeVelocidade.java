/**
 *  A classe ConversaoDeUnidadesDeVelocidade � uma biblioteca de m�todos, cuja finalidade
 *  � a de convers�o de unidades de velocidade. Os m�todos dessa classe s�o todos p�blicos
 *  e est�ticos, assim � poss�vel cham�-los diretamente, sem a necessidade de cria��o de 
 *  objetos para a classe.
 *  
 *  @author Alisson Jaques
 * 
 * 
 * */
public class ConversaoDeUnidadesDeVelocidade { // declara��o da classe
	
	/**
	 *  O m�todo quil�metrosPorHoraParaMetrosPorSegundo converte o valor da velocidade em
	 *  quil�metros por hora para metros por segundo.
	 *  @param quil�metrosPorHora o valor da velocidade em quil�metros por hora
	 *  @return a velocidade em metros por segundo correspondente � velocidade em quil�metros
	 *  por hora 
	 * 
	 * */
	public static double quil�metrosPorHoraParaMetrosPorSegundo(double quil�metrosPorHora) {
		
		double metrosPorSegundo = quil�metrosPorHora*0.2778;
		
		return metrosPorSegundo;		
		
	} // fim do m�todo quil�metrosPorHoraParaMetrosPorSegundo
	
	/**
	 *  O m�todo quil�metrosPorHoraParaMilhasPorHora converte o valor da velocidade em
	 *  quil�metros por hora para milhas por hora.
	 *  @param quil�metrosPorHora o valor da velocidade em quil�metros por hora
	 *  @return a velocidade em milhas por hora correspondente � velocidade em quil�metros
	 *  por hora 
	 * 
	 * */
	public static double quil�metrosPorHoraParaMilhasPorHora(double quil�metrosPorHora) {
		
		double milhasPorHora = quil�metrosPorHora*0.6214;
		
		return milhasPorHora;		
		
	} // fim do m�todo quil�metrosPorHoraParaMilhasPorHora
	
	/**
	 *  O m�todo quil�metrosPorHoraParaP�sPorSegundo converte o valor da velocidade em
	 *  quil�metros por hora para p�s por segundo.
	 *  @param quil�metrosPorHora o valor da velocidade em quil�metros por hora
	 *  @return a velocidade em p�s por segundo correspondente � velocidade em quil�metros
	 *  por hora 
	 * 
	 * */
	public static double quil�metrosPorHoraParaP�sPorSegundo(double quil�metrosPorHora) {
	
		double p�sPorSegundo = quil�metrosPorHora*0.9113;
	
		return p�sPorSegundo;		
	
	} // fim do m�todo quil�metrosPorHoraParaP�sPorSegundo
	
	/**
	 *  O m�todo milhasPorHoraParaP�sPorSegundo converte o valor da velocidade em
	 *  milhas por hora para p�s por segundo.
	 *  @param milhasPorHora o valor da velocidade em milhas por hora
	 *  @return a velocidade em p�s por segundo correspondente � velocidade em milhas por
	 *  hora 
	 * 
	 * */
	public static double milhasPorHoraParaP�sPorSegundo(double milhasPorHora) {
	
		double p�sPorSegundo = milhasPorHora*1.467;
	
		return p�sPorSegundo;		
	
	} // fim do m�todo milhasPorHoraParaP�sPorSegundo
	
	/**
	 *  O m�todo milhasPorHoraParaQuil�metrosPorHora converte o valor da velocidade em
	 *  milhas por hora para quil�metros por hora.
	 *  @param milhasPorHora o valor da velocidade em milhas por hora
	 *  @return a velocidade em quil�metros por hora correspondente � velocidade em milhas por
	 *  hora 
	 * 
	 * */
	public static double milhasPorHoraParaQuil�metrosPorHora(double milhasPorHora) {
		
		double quil�metrosPorHora = milhasPorHora*1.609;
	
		return quil�metrosPorHora;		
	
	} // fim do m�todo milhasPorHoraParaQuil�metrosPorHora
	
	/**
	 *  O m�todo milhasPorHoraParaMetrosPorSegundo converte o valor da velocidade em
	 *  milhas por hora para metros por segundo.
	 *  @param milhasPorHora o valor da velocidade em milhas por hora
	 *  @return a velocidade em metros por segundo correspondente � velocidade em milhas por
	 *  hora 
	 * 
	 * */
	public static double milhasPorHoraParaMetrosPorSegundo(double milhasPorHora) {
		
		double metrosPorSegundo = milhasPorHora*0.4470;
	
		return metrosPorSegundo;		
	
	} // fim do m�todo milhasPorHoraParaMetrosPorSegundo
	
} // fim da classe ConversaoDeUnidadesDeVelocidade