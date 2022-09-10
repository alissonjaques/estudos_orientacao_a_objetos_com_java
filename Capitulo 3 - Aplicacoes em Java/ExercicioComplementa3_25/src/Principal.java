
public class Principal {

	public static void main(String[] argumentos) {
	
	ExercicioComplementar3_25 alisson = new ExercicioComplementar3_25();
	ExercicioComplementar3_25 einstein = new ExercicioComplementar3_25();
	ExercicioComplementar3_25 galileu = new ExercicioComplementar3_25();
	
	alisson.inicializaPessoa((String)"Alisson Jaques",(byte) 29, (float) 1.66, (float) 70.00);	
	einstein.inicializaPessoa((String)"Albert Einstein",(byte) 25, (float) 1.74, (float) 80.00);
	
	System.out.println(alisson);
	System.out.println(einstein);
	System.out.println(galileu);
	
	}
		
}
