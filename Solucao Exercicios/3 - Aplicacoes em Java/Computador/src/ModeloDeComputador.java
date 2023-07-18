
public class ModeloDeComputador {

	
	private float placaMae = 800, valor;
	private byte discoRigido, tamanhoMonitor;
	private short processador, memoria;
	
	public void inicializaComputador(byte umDiscoRigido, byte umTamanhoMonitor, short umProcessador, short umaMemoria) {
		
		discoRigido = umDiscoRigido;
		tamanhoMonitor = umTamanhoMonitor;
		processador = umProcessador;
		memoria = umaMemoria;
		
	}
	
	public float calculaPreco() {
		
		valor=0;
		
		if(processador==600) {
			
			valor = valor + 700;
			
		}
		else if(processador==800) {
			
			valor = valor + 830;
			
		}
		else {
			
			valor = valor + 910;
			
		}
		
		if(memoria == 128) {
			
			valor = valor + 350;
			
		}
		else if(memoria == 256) {
			
			valor = valor + (2*350);
			
		}
		else if(memoria == 384) {
			
			valor = valor + (3*350);
			
		}
		else {
			
			valor = valor + (4*350);
			
		}
		
		if(discoRigido==20) {
			
			valor = valor + 300;
			
		}
		else if(processador==40) {
			
			valor = valor + 420;
			
		}
		else {
			
			valor = valor + 500;
			
		}
		
		if(tamanhoMonitor==15) {
			
			valor = valor + 320;
			
		}
		else {
			
			valor = valor + 520;
			
		}
		
		valor = valor + placaMae;
		
		return valor;
		
	}
	
	public boolean éIgual(ModeloDeComputador outroComputador) {
		
		if((processador==outroComputador.processador)&&(memoria==outroComputador.memoria)&&(discoRigido==outroComputador.discoRigido)&&(tamanhoMonitor==outroComputador.tamanhoMonitor)) {
			
			return true;
			
		}
		else {
		
			return false;
			
		}
		
	}
	
	public String toString() {
		
		String modelo;
		
		modelo = "Configurações do Computador Escolhido:\n"+"Processador: "+processador+" Mhz\n"+"Memória: "+memoria+" Mb\n"+"Disco Rígido: "+discoRigido+" Gb\n"+"Tamanho da Tela: "+tamanhoMonitor+" polegadas\n"+"Placa-Mãe genérica\n"+"Valor do Computador: "+"R$"+ calculaPreco()+"\n";
		
		return modelo;
				
	}
		
}
