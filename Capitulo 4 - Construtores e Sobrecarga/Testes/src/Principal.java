
public class Principal {

	public static void main(String[] argumentos) {
		
		Texto alisson = new Texto("Alisson Jaques","Assistente de T.I",(double)1600);
		Texto joao = new Texto("Jo�o Silva Fernandes");
		Texto j�ssica = new Texto();
		
		System.out.println(alisson);
		System.out.println(joao);
		System.out.println(j�ssica);
		
		System.out.println(joao.toString((double)1800));
		System.out.println(j�ssica.toString("J�ssica Maria dos Santos"));
		
	}
	
}
