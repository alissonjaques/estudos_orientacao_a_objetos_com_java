import java.util.Scanner;

public class SiteNaInternet {
	
	private String nome;
	private String url;
	private Data dataPrimeiroAcesso;
	private Data dataUltimoAcesso;
	private Contador contadora = new Contador(0,1000);
	private Data vetorDeAcessos[] = new Data[1000];
	private byte d, m;
	private short a;
	
	SiteNaInternet(String umNome, String umaUrl) {
		
		nome = umNome;
		url = umaUrl;		
		
	}
	
	SiteNaInternet(String umNome){
		 
		this(umNome,"");
		
	}
	
	SiteNaInternet(){
		
		this("","");
		
	}
	
	public void acessa() {
		
		System.out.println("Informe a data atual (dia, mês, ano):");
		Scanner diaHoje = new Scanner(System.in);
		d = diaHoje.nextByte();
		Scanner mesHoje = new Scanner(System.in);
		m = mesHoje.nextByte();
		Scanner anoHoje = new Scanner(System.in);
		a = anoHoje.nextShort();
		System.out.println();
		
		dataUltimoAcesso = new Data(d,m,a);
		
		contadora.quantidadeLigada(true);

		vetorDeAcessos[contadora.quantidadeVezesLigado()] = dataUltimoAcesso.clonaData();
		
	}
	
	public int encontraUltimaData() {
		
		int i;
		
		
		for(i=1; i<=999; i++) {
			
			if(vetorDeAcessos[i]==null) {
				
				if(i==1) {
				
					return i;
					
				}
				else if(i>1) {
					
					return i-1;
				
				}
			}
		
		}
		
		return i;
		
	}
	
	public void ultimoAcesso() {
		
		dataUltimoAcesso = vetorDeAcessos[encontraUltimaData()];
		
		
	}
	
	public void primeiroAcesso() {
		
		dataPrimeiroAcesso = vetorDeAcessos[1];
		
	}
	
	public String toString() {
		
		primeiroAcesso();
		
		String nomeSite = "Nome do site: " + nome + "\n";
		nomeSite = nomeSite + "URL do site: " + url + "\n";
		nomeSite = nomeSite + "Data Primeiro Acesso: " + dataPrimeiroAcesso + "\n";
		nomeSite = nomeSite + "Data Último Acesso: " + dataUltimoAcesso + "\n";
		nomeSite = nomeSite + "Número de Vezes que o Site foi visitado: " + contadora.quantidadeVezesLigado() + "\n";
		
		return nomeSite;
		
	}
}
