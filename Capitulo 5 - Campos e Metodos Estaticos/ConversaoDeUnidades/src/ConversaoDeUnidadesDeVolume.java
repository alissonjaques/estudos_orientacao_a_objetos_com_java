/**
	A classe ConversaoDeUnidadesDeVolume � uma biblioteca de m�todos, cuja
	finalidade � a de converter unidades de volumes. Todos os m�todos dessa 
	classe s�o p�blicos e est�ticos, permitindo que outras classes os acessem
	diretamente.
	
	@author Alisson Jaques

*/
public class ConversaoDeUnidadesDeVolume{ // declara��o da classe
	
	/**
	  O m�todo litrosParaCent�metrosC�bicos converte o valor passado em litros
	  para cent�metros c�bicos.
	  @param litros a quantidade de litros a ser convertida
	  @return a quandidade de cent�metros c�bicos correspondente a quantidade de 
	  litros passados
	
	*/
	public static double litrosParaCent�metrosC�bicos(double litros){
		
		double cent�metrosC�bicos = litros*1000;
		
		return cent�metrosC�bicos;
		
	} // fim do m�todo litrosParaCent�metrosC�bicos
	
	/**
	  O m�todo metrosC�bicosParaLitros converte o valor passado em metros
	  c�bicos para litros.
	  @param metrosC�bicos a quantidade de metros c�bicos a ser convertida
	  @return a quandidade de litros correspondente a quantidade de metros
	  c�bicos passados
	
	*/
	public static double metrosC�bicosParaLitros(double metrosC�bicos){
		
		double litros = metrosC�bicos*1000;
		
		return litros;
		
	} // fim do m�todo metrosC�bicosParaLitros
	
	/**
	  O m�todo metrosC�bicosParaP�sC�bicos converte o valor passado em metros
	  c�bicos para p�s c�bicos.
	  @param metrosC�bicos a quantidade de metros c�bicos a ser convertida
	  @return a quandidade de p�s c�bicos correspondente a quantidade de metros
	  c�bicos passados
	
	*/
	public static double metrosC�bicosParaP�sC�bicos(double metrosC�bicos){
		
		double p�sC�bicos = metrosC�bicos*35.32;
		
		return p�sC�bicos;
		
	} // fim do m�todo metrosC�bicosParaP�sC�bicos
	
	/**
	  O m�todo gal�esAmericanosParaPolegadasC�bicas converte o valor passado em gal�es
	  americanos para polegadas c�bicas.
	  @param gal�esAmericanos a quantidade de gal�es amaricanos a ser convertida
	  @return a quandidade de polegadas c�bicas correspondente a quantidade de gal�es
	  americanos passados
	
	*/
	public static double gal�esAmericanosParaPolegadasC�bicas(double gal�esAmericanos){
		
		double polegadasC�bicas = gal�esAmericanos*231;
		
		return polegadasC�bicas;
		
	} // fim do m�todo gal�esAmericanosParaPolegadasC�bicas
	
	/**
	  O m�todo gal�esAmericanosParaLitros converte o valor passado em gal�es
	  americanos para litros.
	  @param gal�esAmericanos a quantidade de gal�es amaricanos a ser convertida
	  @return a quandidade de litros correspondente a quantidade de gal�es
	  americanos passados
	
	*/
	public static double gal�esAmericanosParaLitros(double gal�esAmericanos){
		
		double litros = gal�esAmericanos*3.785;
		
		return litros;
		
	} // fim do m�todo gal�esAmericanosParaLitros
	
} // fim da classe ConversaoDeUnidadesDeVolume