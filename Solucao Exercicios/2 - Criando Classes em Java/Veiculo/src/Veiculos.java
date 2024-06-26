/**
 * A classe ve�culo possu� atributos e m�todos que representam um ve�culo qualquer
 *
 * @author Alisson Jaques 
 *
 */
public class Veiculos { //declara a classe
	
	/**
	 *  Declara��o dos campos da classe
	 * 
	 */
	
	private String nomeVeiculo;
	private short quantidadeMaximaPassageiros;
	private String tipoVeiculo;
	private byte numeroDeRodas;
	
	//Inicializa simultaneamente os dados da classe ve�culo
	
	public void registraVeiculo(String nome, short quantidade, String tipo, byte quantidadeRodas) {
		
		nomeVeiculo = nome;
		quantidadeMaximaPassageiros = quantidade;
		tipoVeiculo = tipo;
		numeroDeRodas = quantidadeRodas;		
		
	}
	
	//Verifica se o ve�culo � capaz de andar na terra
	
	public boolean andarNaTerra(String tipo) {
		
		if(tipo == "carro" || tipo == "moto" || tipo == "Caminhao") {
			
			return true;
			
		}
		else {
			
			return false;
		}
				
	}
	
	//Verifica se o ve�culo � capaz de andar na �gua
	
		public boolean andarNaAgua(String tipo) {
			
			if(tipo == "iate" || tipo == "navio" || tipo == "fragata") {
				
				return true;
				
			}
			else {
				
				return false;
			}
					
	}
		
	//Verifica se o ve�culo � capaz de andar na terra
		
	public boolean andarNoC�u(String tipo) {
			
		if(tipo == "aviao" || tipo == "helicoptero" || tipo == "jato") {
			
			return true;
			
		}
		else {
				
			return false;
		}
					
	}
	
}//Fim da classe Veiculos
