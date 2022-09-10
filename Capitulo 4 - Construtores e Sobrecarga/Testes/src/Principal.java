
public class Principal {

	public static void main(String[] argumentos) {
		
		Texto alisson = new Texto("Alisson Jaques","Assistente de T.I",(double)1600);
		Texto joao = new Texto("João Silva Fernandes");
		Texto jéssica = new Texto();
		
		System.out.println(alisson);
		System.out.println(joao);
		System.out.println(jéssica);
		
		System.out.println(joao.toString((double)1800));
		System.out.println(jéssica.toString("Jéssica Maria dos Santos"));
		
	}
	
}
