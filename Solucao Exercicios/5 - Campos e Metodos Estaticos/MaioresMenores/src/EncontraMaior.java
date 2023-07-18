/**
 *  A classe encontra maior possu� m�todos que permitem achar o maior
 *  n�mero entre uma sequ�ncia de n�meros dados. Os m�todos dessas classe
 *  s�o todos p�blicos e est�ticos, o que permite que eles possam ser acessados
 *  diretamente pelas outras classes. Essa classe pode ser extendida para mais 
 *  fun��es.
 *  
 *  @author Alisson Jaques
 * 
 * */
public class EncontraMaior { // declara��o da classe
	
	/**
	 *  O m�todo maiorUmNumero recebe como argumento 
	 *  um n�mero inteiro e o retorna.
	 *  @param a um n�mero inteiro para compara��o
	 *  @return o maior n�mero inteiro na sequ�ncia
	 * 
	 * */
	public static int maiorUmNumero(int a) {
				
		return a;
				
	} // fim do m�todo maiorUmNumero
	
	/**
	 *  O m�todo sobrecarregado maiorUmNumero recebe 
	 *  como argumento um n�mero flutuante e o retorna.
	 *  @param a um n�mero flutuante para compara��o
	 *  @return o maior n�mero flutuante na sequ�ncia
	 * 
	 * */
	public static double maiorUmNumero(double a) {
		
		return a;
				
	} // fim do m�todo maiorUmNumero
		
	/**
	 *  O m�todo maiorEntreDoisNumeros recebe como argumento dois
	 *  n�meros inteiros e retorna o maior entre eles.
	 *  @param a um n�mero inteiro para compara��o
	 *  @param b um n�mero inteiro para compara��o
	 *  @return o maior n�mero inteiro na sequ�ncia
	 * 
	 * */
	public static int maiorEntreDoisNumeros(int a, int b) {
		
		if(a>b) { // se a>b
			
			return a; // ent�o retorne a
			
		}
		else { // sen�o
			
			return b; // retorn b
			
		}
		
	} // fim do m�todo maiorEntreDoisN�meros
	
	/**
	 *  O m�todo sobrecarregado maiorEntreDoisNumeros recebe como argumento dois
	 *  n�meros flutuantes e retorna o maior entre eles.
	 *  @param a um n�mero flutuante para compara��o
	 *  @param b um n�mero flutuante para compara��o
	 *  @return o maior n�mero flutuante na sequ�ncia
	 * 
	 * */
	public static double maiorEntreDoisNumeros(double a, double b) {
		
		if(a>b) {
			
			return a;
			
		}
		else {
			
			return b;
			
		}		
		
	} // fim do m�todo sobrecarregado maiorEntreDoisNumeros
	
	/**
	 *  O m�todo maiorEntreTresNumeros recebe como argumento tr�s
	 *  n�meros inteiros e retorna o maior entre eles.
	 *  @param a um n�mero inteiro para compara��o
	 *  @param b um n�mero inteiro para compara��o
	 *  @param c um n�mero inteiro para compara��o
	 *  @return o maior n�mero inteiro na sequ�ncia
	 * 
	 * */
	public static int maiorEntreTresNumeros(int a, int b, int c) {
		
		// declaramos uma vari�vel auxiliar e atribu�mos a ela o conte�do retornado
		// pelo m�todo maiorEntreDoisNumeros, ao fazer chamadas em cascata otimizamos
		// o c�digo
		int d = maiorEntreDoisNumeros(a,b); 
		
		if(d>c) {
			
			return d;
			
		}
		else {
			
			return c;
			
		}
		
	} // fim do m�todo maiorEntreTr�sN�meros
	
	/**
	 *  O m�todo sobrecarregado maiorEntreTresNumeros recebe como argumento tres
	 *  n�meros flutuantes e retorna o maior entre eles.
	 *  @param a um n�mero flutuante para compara��o
	 *  @param b um n�mero flutuante para compara��o
	 *  @param c um n�mero flutuante para compara��o
	 *  @return o maior n�mero flutuante na sequ�ncia
	 * 
	 * */
	public static double maiorEntreTresNumeros(double a, double b, double c) {
		
		// declaramos uma vari�vel auxiliar e atribu�mos a ela o conte�do retornado
		// pelo m�todo sobrecarregado maiorEntreDoisNumeros, ao fazer chamadas em 
		// cascata otimizamos o c�digo
		double d = maiorEntreDoisNumeros(a,b);
		
		if(d>c) {
			
			return d;
			
		}
		else {
			
			return c;
			
		}
		
	} // fim do m�todo sobrecarregado maiorEntreTresNumeros
	
	/**
	 *  O m�todo maiorEntreQuatroNumeros recebe como argumento quatro
	 *  n�meros inteiros e retorna o maior entre eles.
	 *  @param a um n�mero inteiro para compara��o
	 *  @param b um n�mero inteiro para compara��o
	 *  @param c um n�mero inteiro para compara��o
	 *  @param d um n�mero inteiro para compara��o
	 *  @return o maior n�mero inteiro na sequ�ncia
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
		
	} // fim do m�todo maiorEntreQuatroNumeros
	
	/**
	 *  O m�todo sobrecarregado maiorEntreQuatroNumeros recebe como argumento quatro
	 *  n�meros flutuantes e retorna o maior entre eles.
	 *  @param a um n�mero flutuante para compara��o
	 *  @param b um n�mero flutuante para compara��o
	 *  @param c um n�mero flutuante para compara��o
	 *  @param d um n�mero flutuante para compara��o
	 *  @return o maior n�mero flutuante na sequ�ncia
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
		
	} // fim do m�todo sobrecarregado maiorEntreQuatroNumeros
	
	/**
	 *  O m�todo maiorEntreCincoNumeros recebe como argumento
	 *  cinco n�meros inteiros e retorna o maior entre eles.
	 *  @param a um n�mero inteiro para compara��o
	 *  @param b um n�mero inteiro para compara��o
	 *  @param c um n�mero inteiro para compara��o
	 *  @param d um n�mero inteiro para compara��o
	 *  @param e um n�mero inteiro para compara��o
	 *  @return o maior n�mero inteiro na sequ�ncia
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
		
	} // fim do m�todo maiorEntreCincoNumeros
	
	/**
	 *  O m�todo sobrecarregado maiorEntreCincoNumeros recebe como 
	 *  argumento cinco n�meros flutuantes e retorna o maior entre eles.
	 *  @param a um n�mero flutuante para compara��o
	 *  @param b um n�mero flutuante para compara��o
	 *  @param c um n�mero flutuante para compara��o
	 *  @param d um n�mero flutuante para compara��o
	 *  @param e um n�mero flutuante para compara��o
	 *  @return o maior n�mero flutuante na sequ�ncia
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
		
	} // fim do m�todo sobrecarregado maiorEntreCincoNumeros

} // fim da classe EncontraMaior
