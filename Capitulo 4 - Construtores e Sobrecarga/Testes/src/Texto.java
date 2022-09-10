
public class Texto {

	private String nome;
	private String profissão;
	private double saldo;
	
	Texto(String umNome, String umaProfissão, double umSaldo){
		
		nome = umNome;
		profissão = umaProfissão;
		saldo = umSaldo;
		
	}
	
	Texto(String umNome){
		
		nome = umNome;
		profissão = "Desempregado";
		saldo = 0.0;
				
	}
	
	Texto(){
		
		this("");
		
	}
	
	public String toString() {
		
		String texto = nome + "\n";
		texto = texto + profissão + "\n";
		texto = texto + saldo + "\n";
		
		return texto;
		
	}
	
	public String toString(double umSaldo) {
		
		String texto = umSaldo + "\n";
		
		return texto;
		
	}
	
	public String toString(String umNome) {
		
		String texto = umNome;
		
		return texto;
		
	}	
	
}
