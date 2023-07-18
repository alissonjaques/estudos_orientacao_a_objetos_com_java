/**
	A classe ConversaoDeUnidadesDeVolume é uma biblioteca de métodos, cuja
	finalidade é a de converter unidades de volumes. Todos os métodos dessa 
	classe são públicos e estáticos, permitindo que outras classes os acessem
	diretamente.
	
	@author Alisson Jaques

*/
public class ConversaoDeUnidadesDeVolume{ // declaração da classe
	
	/**
	  O método litrosParaCentímetrosCúbicos converte o valor passado em litros
	  para centímetros cúbicos.
	  @param litros a quantidade de litros a ser convertida
	  @return a quandidade de centímetros cúbicos correspondente a quantidade de 
	  litros passados
	
	*/
	public static double litrosParaCentímetrosCúbicos(double litros){
		
		double centímetrosCúbicos = litros*1000;
		
		return centímetrosCúbicos;
		
	} // fim do método litrosParaCentímetrosCúbicos
	
	/**
	  O método metrosCúbicosParaLitros converte o valor passado em metros
	  cúbicos para litros.
	  @param metrosCúbicos a quantidade de metros cúbicos a ser convertida
	  @return a quandidade de litros correspondente a quantidade de metros
	  cúbicos passados
	
	*/
	public static double metrosCúbicosParaLitros(double metrosCúbicos){
		
		double litros = metrosCúbicos*1000;
		
		return litros;
		
	} // fim do método metrosCúbicosParaLitros
	
	/**
	  O método metrosCúbicosParaPésCúbicos converte o valor passado em metros
	  cúbicos para pés cúbicos.
	  @param metrosCúbicos a quantidade de metros cúbicos a ser convertida
	  @return a quandidade de pés cúbicos correspondente a quantidade de metros
	  cúbicos passados
	
	*/
	public static double metrosCúbicosParaPésCúbicos(double metrosCúbicos){
		
		double pésCúbicos = metrosCúbicos*35.32;
		
		return pésCúbicos;
		
	} // fim do método metrosCúbicosParaPésCúbicos
	
	/**
	  O método galõesAmericanosParaPolegadasCúbicas converte o valor passado em galões
	  americanos para polegadas cúbicas.
	  @param galõesAmericanos a quantidade de galões amaricanos a ser convertida
	  @return a quandidade de polegadas cúbicas correspondente a quantidade de galões
	  americanos passados
	
	*/
	public static double galõesAmericanosParaPolegadasCúbicas(double galõesAmericanos){
		
		double polegadasCúbicas = galõesAmericanos*231;
		
		return polegadasCúbicas;
		
	} // fim do método galõesAmericanosParaPolegadasCúbicas
	
	/**
	  O método galõesAmericanosParaLitros converte o valor passado em galões
	  americanos para litros.
	  @param galõesAmericanos a quantidade de galões amaricanos a ser convertida
	  @return a quandidade de litros correspondente a quantidade de galões
	  americanos passados
	
	*/
	public static double galõesAmericanosParaLitros(double galõesAmericanos){
		
		double litros = galõesAmericanos*3.785;
		
		return litros;
		
	} // fim do método galõesAmericanosParaLitros
	
} // fim da classe ConversaoDeUnidadesDeVolume