/**
	A classe MenorValor é uma biblioteca de métodos,
	cujo objetivo é encontrar o menor valor de uma sequência
	fornecida. Seus métodos são todos públicos e estáticos, 
	permitindo chamadas diretas aos mesmos.
	
	@author Alisson Jaques
	
*/
public class MenorValor{ // declaração da classe
	
	/**
		O método default menorValor não recebe nenhum argumento
		e retorna uma mensagem alertando que a sequência
		é nula.
	
	*/
	public static void menorValor(){
		
		System.out.println("Sequência nula!");
		
	} // fim do método default menorValor
	
	/**
		O método sobrecarregado menorValor recebe um
		número inteiro como argumento e retorna esse 
		número.
		
		@param a um valor inteiro da sequência
		@return o menor valor da sequência
	
	*/
	public static int menorValor(int a){
		
		return a;
		
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento dois valores inteiros e retorna o menor
		valor entre os mesmos.		
		
		@param a um valor inteiro da sequência
		@param b um valor inteiro da sequência
		@return o menor valor da sequência
	
	*/
	public static int menorValor(int a, int b){
		
		if(a<b){
			
			return a;
			
		}
		else{
			
			return b;
			
		}
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento três valores inteiros e retorna o menor
		valor entre os mesmos, ele chama o método com 
		assinatura menorValor(int,int) como cascata para 
		realizar essa operação.		
		
		@param a um valor inteiro da sequência
		@param b um valor inteiro da sequência
		@param c um valor inteiro da sequência
		@return o menor valor da sequência
	
	*/
	public static int menorValor(int a, int b, int c){
		
		int d = menorValor(a,b);
		
		if(d<c){
			
			return d;
			
		}
		else{
			
			return c;
			
		}
		
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento quatro valores inteiros e retorna o menor
		valor entre os mesmos, ele chama o método com 
		assinatura menorValor(int,int,int) como cascata para 
		realizar essa operação.		
		
		@param a um valor inteiro da sequência
		@param b um valor inteiro da sequência
		@param c um valor inteiro da sequência
		@param d um valor inteiro da sequência
		@return o menor valor da sequência
	
	*/
	public static int menorValor(int a, int b, int c, int d){
		
		int e = menorValor(a,b,c);
		
		if(e<d){
			
			return e;
			
		}
		else{
			
			return d;
			
		}
		
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento cinco valores inteiros e retorna o menor
		valor entre os mesmos, ele chama o método com 
		assinatura menorValor(int,int,int,int) como cascata para 
		realizar essa operação.		
		
		@param a um valor inteiro da sequência
		@param b um valor inteiro da sequência
		@param c um valor inteiro da sequência
		@param d um valor inteiro da sequência
		@param e um valor inteiro da sequência
		@return o menor valor da sequência
	
	*/
	public static int menorValor(int a, int b, int c, int d, int e){
		
		int f = menorValor(a,b,c,d);
		
		if(f<e){
			
			return f;
			
		}
		else{
			
			return e;
			
		}
		
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe um
		número flutuante como argumento e retorna esse 
		número.
		
		@param a um valor flutuante da sequência
		@return o menor valor da sequência
	
	*/
	public static double menorValor(double a){
		
		return a;
		
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento dois valores flutuantes e retorna o menor
		valor entre os mesmos.		
		
		@param a um valor flutuante da sequência
		@param b um valor flutuante da sequência
		@return o menor valor da sequência
	
	*/
	public static double menorValor(double a, double b){
		
		if(a<b){
			
			return a;
			
		}
		else{
			
			return b;
			
		}
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento três valores flutuantes e retorna o menor
		valor entre os mesmos, ele chama o método com 
		assinatura menorValor(double,double) como cascata para 
		realizar essa operação.		
		
		@param a um valor flutuante da sequência
		@param b um valor flutuante da sequência
		@param c um valor flutuante da sequência
		@return o menor valor da sequência
	
	*/
	public static double menorValor(double a, double b, double c){
		
		double d = menorValor(a,b);
		
		if(d<c){
			
			return d;
			
		}
		else{
			
			return c;
			
		}
		
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento quatro valores flutuantes e retorna o menor
		valor entre os mesmos, ele chama o método com 
		assinatura menorValor(double,double,double) como cascata para 
		realizar essa operação.		
		
		@param a um valor flutuante da sequência
		@param b um valor flutuante da sequência
		@param c um valor flutuante da sequência
		@param d um valor flutuante da sequência
		@return o menor valor da sequência
	
	*/
	public static double menorValor(double a, double b, double c, double d){
		
		double e = menorValor(a,b,c);
		
		if(e<d){
			
			return e;
			
		}
		else{
			
			return d;
			
		}
		
	} // fim do método sobrecarregado menorValor
	
	/**
		O método sobrecarregado menorValor recebe como 
		argumento cinco valores flutuantes e retorna o menor
		valor entre os mesmos, ele chama o método com 
		assinatura menorValor(double,double,double,double) como cascata para 
		realizar essa operação.		
		
		@param a um valor flutuante da sequência
		@param b um valor flutuante da sequência
		@param c um valor flutuante da sequência
		@param d um valor flutuante da sequência
		@param e um valor flutuante da sequência
		@return o menor valor da sequência
	
	*/
	public static double menorValor(double a, double b, double c, double d, double e){
		
		double f = menorValor(a,b,c,d);
		
		if(f<e){
			
			return f;
			
		}
		else{
			
			return e;
			
		}
		
	} // fim do método sobrecarregado menorValor
	
} // fim da classe MenorValor