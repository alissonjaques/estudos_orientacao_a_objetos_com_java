/**
 *  A classe encontra maior possuí métodos que permitem achar o maior
 *  número entre uma sequência de números dados. Os métodos dessas classe
 *  são todos públicos e estáticos, o que permite que eles possam ser acessados
 *  diretamente pelas outras classes. Essa classe pode ser extendida para mais 
 *  funções.
 *  
 *  @author Alisson Jaques
 * 
 * */
public class EncontraMaior { // declaração da classe
	
	/**
	 *  O método maiorUmNumero recebe como argumento 
	 *  um número inteiro e o retorna.
	 *  @param a um número inteiro para comparação
	 *  @return o maior número inteiro na sequência
	 * 
	 * */
	public static int maiorUmNumero(int a) {
				
		return a;
				
	} // fim do método maiorUmNumero
	
	/**
	 *  O método sobrecarregado maiorUmNumero recebe 
	 *  como argumento um número flutuante e o retorna.
	 *  @param a um número flutuante para comparação
	 *  @return o maior número flutuante na sequência
	 * 
	 * */
	public static double maiorUmNumero(double a) {
		
		return a;
				
	} // fim do método maiorUmNumero
		
	/**
	 *  O método maiorEntreDoisNumeros recebe como argumento dois
	 *  números inteiros e retorna o maior entre eles.
	 *  @param a um número inteiro para comparação
	 *  @param b um número inteiro para comparação
	 *  @return o maior número inteiro na sequência
	 * 
	 * */
	public static int maiorEntreDoisNumeros(int a, int b) {
		
		if(a>b) { // se a>b
			
			return a; // então retorne a
			
		}
		else { // senão
			
			return b; // retorn b
			
		}
		
	} // fim do método maiorEntreDoisNúmeros
	
	/**
	 *  O método sobrecarregado maiorEntreDoisNumeros recebe como argumento dois
	 *  números flutuantes e retorna o maior entre eles.
	 *  @param a um número flutuante para comparação
	 *  @param b um número flutuante para comparação
	 *  @return o maior número flutuante na sequência
	 * 
	 * */
	public static double maiorEntreDoisNumeros(double a, double b) {
		
		if(a>b) {
			
			return a;
			
		}
		else {
			
			return b;
			
		}		
		
	} // fim do método sobrecarregado maiorEntreDoisNumeros
	
	/**
	 *  O método maiorEntreTresNumeros recebe como argumento três
	 *  números inteiros e retorna o maior entre eles.
	 *  @param a um número inteiro para comparação
	 *  @param b um número inteiro para comparação
	 *  @param c um número inteiro para comparação
	 *  @return o maior número inteiro na sequência
	 * 
	 * */
	public static int maiorEntreTresNumeros(int a, int b, int c) {
		
		// declaramos uma variável auxiliar e atribuímos a ela o conteúdo retornado
		// pelo método maiorEntreDoisNumeros, ao fazer chamadas em cascata otimizamos
		// o código
		int d = maiorEntreDoisNumeros(a,b); 
		
		if(d>c) {
			
			return d;
			
		}
		else {
			
			return c;
			
		}
		
	} // fim do método maiorEntreTrêsNúmeros
	
	/**
	 *  O método sobrecarregado maiorEntreTresNumeros recebe como argumento tres
	 *  números flutuantes e retorna o maior entre eles.
	 *  @param a um número flutuante para comparação
	 *  @param b um número flutuante para comparação
	 *  @param c um número flutuante para comparação
	 *  @return o maior número flutuante na sequência
	 * 
	 * */
	public static double maiorEntreTresNumeros(double a, double b, double c) {
		
		// declaramos uma variável auxiliar e atribuímos a ela o conteúdo retornado
		// pelo método sobrecarregado maiorEntreDoisNumeros, ao fazer chamadas em 
		// cascata otimizamos o código
		double d = maiorEntreDoisNumeros(a,b);
		
		if(d>c) {
			
			return d;
			
		}
		else {
			
			return c;
			
		}
		
	} // fim do método sobrecarregado maiorEntreTresNumeros
	
	/**
	 *  O método maiorEntreQuatroNumeros recebe como argumento quatro
	 *  números inteiros e retorna o maior entre eles.
	 *  @param a um número inteiro para comparação
	 *  @param b um número inteiro para comparação
	 *  @param c um número inteiro para comparação
	 *  @param d um número inteiro para comparação
	 *  @return o maior número inteiro na sequência
	 * 
	 * */
	public static int maiorEntreQuatroNumeros(int a, int b, int c, int d) {
		
		int e = maiorEntreTresNumeros(a,b,c);
		
		if(e>d) {
			
			return e;
			
		}
		else {
			
			return d;
			
		}
		
	} // fim do método maiorEntreQuatroNumeros
	
	/**
	 *  O método sobrecarregado maiorEntreQuatroNumeros recebe como argumento quatro
	 *  números flutuantes e retorna o maior entre eles.
	 *  @param a um número flutuante para comparação
	 *  @param b um número flutuante para comparação
	 *  @param c um número flutuante para comparação
	 *  @param d um número flutuante para comparação
	 *  @return o maior número flutuante na sequência
	 * 
	 * */
	public static double maiorEntreQuatroNumeros(double a, double b, double c, double d) {
		
		double e = maiorEntreTresNumeros(a,b,c);
		
		if(e>d) {
			
			return e;
			
		}
		else {
			
			return d;
			
		}
		
	} // fim do método sobrecarregado maiorEntreQuatroNumeros
	
	/**
	 *  O método maiorEntreCincoNumeros recebe como argumento
	 *  cinco números inteiros e retorna o maior entre eles.
	 *  @param a um número inteiro para comparação
	 *  @param b um número inteiro para comparação
	 *  @param c um número inteiro para comparação
	 *  @param d um número inteiro para comparação
	 *  @param e um número inteiro para comparação
	 *  @return o maior número inteiro na sequência
	 * 
	 * */
	public static int maiorEntreCincoNumeros(int a, int b, int c, int d, int e) {
		
		int f = maiorEntreQuatroNumeros(a,b,c,d);
		
		if(f>e) {
			
			return f;
			
		}
		else {
			
			return e;
			
		}
		
	} // fim do método maiorEntreCincoNumeros
	
	/**
	 *  O método sobrecarregado maiorEntreCincoNumeros recebe como 
	 *  argumento cinco números flutuantes e retorna o maior entre eles.
	 *  @param a um número flutuante para comparação
	 *  @param b um número flutuante para comparação
	 *  @param c um número flutuante para comparação
	 *  @param d um número flutuante para comparação
	 *  @param e um número flutuante para comparação
	 *  @return o maior número flutuante na sequência
	 * 
	 * */
	public static double maiorEntreCincoNumeros(double a, double b, double c, double d, double e) {
		
		double f = maiorEntreQuatroNumeros(a,b,c,d);
		
		if(f>e) {
			
			return f;
			
		}
		else {
			
			return e;
			
		}
		
	} // fim do método sobrecarregado maiorEntreCincoNumeros

} // fim da classe EncontraMaior
