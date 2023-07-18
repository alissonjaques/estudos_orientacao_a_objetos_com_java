
public class PrincipalData {

	public static void main(String[] argumentos) {
		
		Data hoje = new Data();
		Data amanhã = new Data();
		
		hoje.inicializaData(8,7,2020);
		amanhã.inicializaData(9, 7, 2020);
		
		System.out.println(hoje);
		System.out.println(amanhã);
		
	}
	
	
}
