
public class ExercicioComplementar3_25 {
	
	private String nome;
	private byte idade;
	private float altura;
	private float peso;
	
	public void inicializaPessoa(String umNome, byte umaIdade, float umaAltura, float umPeso){
		
		nome = umNome;
		idade = umaIdade;
		altura = umaAltura;
		peso = umPeso;
		
	}
	
	public boolean ÈIgual(ExercicioComplementar3_25 outraPessoa){
		
		if((nome==outraPessoa.nome)&&(idade==outraPessoa.idade)&&(altura==outraPessoa.altura)&&(peso==outraPessoa.peso)) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}
}
