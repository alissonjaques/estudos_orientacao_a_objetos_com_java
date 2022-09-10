
public class Texto {

	private String nome;
	private String profiss�o;
	private double saldo;
	
	Texto(String umNome, String umaProfiss�o, double umSaldo){
		
		nome = umNome;
		profiss�o = umaProfiss�o;
		saldo = umSaldo;
		
	}
	
	Texto(String umNome){
		
		nome = umNome;
		profiss�o = "Desempregado";
		saldo = 0.0;
				
	}
	
	Texto(){
		
		this("");
		
	}
	
	public String toString() {
		
		String texto = nome + "\n";
		texto = texto + profiss�o + "\n";
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
