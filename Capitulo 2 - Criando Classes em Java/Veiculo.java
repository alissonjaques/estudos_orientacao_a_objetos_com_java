/*
*A classe veículo contém campos e métodos que representam a capacidade (se é capaz de voar, andar sobre a água, andar sobre a terra)
 e as características de um veículo qualquer.*
*/
class Veiculo{
	
	//declaração dos campos da classe	
	private String nomeVeiculo;
	private byte tipoVeiculo, numeroDeRodas;
	private short quantidadeMaximaPassageiros;

	//Inicializa simultaneamente os dados do veículo
	public void registraVeiculo(String nome, byte tipo, byte numeroRodas, short quantidaMaxima){
		
		//usa os argumentos passados para inicializar os dados do modelo
		nomeVeiculo = nome;
		tipoVeiculo = tipo;
		numeroDeRodas = numeroRodas;
		quantidadeMaximaPassageiros = quantidaMaxima;	
		
	}
	
	//verifica se o veículo é capaz de andar na terra
	public boolean andarNaTerra(byte tipo){
	
	
		if(tipo==1){ //1 = carro, 2 = moto, etc
		
			return true;
		}
		else{
		
			return false;
		
		}
	}
	
	//verifica se o veículo é capaz de andar na água
	public boolean andarNaAgua(byte tipo){
	
	
		if(tipo==3){ //3 = navio, 4 = lancha, etc
		
			return true;
		}
		else{
		
			return false;
		}	
	}
	
	//verifica se o veículo é capaz de voar
	public boolean voaNoCeu(byte tipo){
	
	
		if(tipo==5){ //5 = avião, 2 = helicóptero, etc
		
			return true;
		}
		else{
			
			return false;
		}			
	}
}