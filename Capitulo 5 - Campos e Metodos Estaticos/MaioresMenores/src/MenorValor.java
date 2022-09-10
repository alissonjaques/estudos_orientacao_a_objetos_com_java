/**
	A classe MenorValor � uma biblioteca de m�todos,
	cujo objetivo � encontrar o menor valor de uma sequ�ncia
	fornecida. Seus m�todos s�o todos p�blicos e est�ticos, 
	permitindo chamadas diretas aos mesmos.
	
	@author Alisson Jaques
	
*/
public class MenorValor{ // declara��o da classe
	
	/**
		O m�todo default menorValor n�o recebe nenhum argumento
		e retorna uma mensagem alertando que a sequ�ncia
		� nula.
	
	*/
	public static void menorValor(){
		
		System.out.println("Sequ�ncia nula!");
		
	} // fim do m�todo default menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe um
		n�mero inteiro como argumento e retorna esse 
		n�mero.
		
		@param a um valor inteiro da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static int menorValor(int a){
		
		return a;
		
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento dois valores inteiros e retorna o menor
		valor entre os mesmos.		
		
		@param a um valor inteiro da sequ�ncia
		@param b um valor inteiro da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static int menorValor(int a, int b){
		
		if(a<b){
			
			return a;
			
		}
		else{
			
			return b;
			
		}
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento tr�s valores inteiros e retorna o menor
		valor entre os mesmos, ele chama o m�todo com 
		assinatura menorValor(int,int) como cascata para 
		realizar essa opera��o.		
		
		@param a um valor inteiro da sequ�ncia
		@param b um valor inteiro da sequ�ncia
		@param c um valor inteiro da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static int menorValor(int a, int b, int c){
		
		int d = menorValor(a,b);
		
		if(d<c){
			
			return d;
			
		}
		else{
			
			return c;
			
		}
		
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento quatro valores inteiros e retorna o menor
		valor entre os mesmos, ele chama o m�todo com 
		assinatura menorValor(int,int,int) como cascata para 
		realizar essa opera��o.		
		
		@param a um valor inteiro da sequ�ncia
		@param b um valor inteiro da sequ�ncia
		@param c um valor inteiro da sequ�ncia
		@param d um valor inteiro da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static int menorValor(int a, int b, int c, int d){
		
		int e = menorValor(a,b,c);
		
		if(e<d){
			
			return e;
			
		}
		else{
			
			return d;
			
		}
		
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento cinco valores inteiros e retorna o menor
		valor entre os mesmos, ele chama o m�todo com 
		assinatura menorValor(int,int,int,int) como cascata para 
		realizar essa opera��o.		
		
		@param a um valor inteiro da sequ�ncia
		@param b um valor inteiro da sequ�ncia
		@param c um valor inteiro da sequ�ncia
		@param d um valor inteiro da sequ�ncia
		@param e um valor inteiro da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static int menorValor(int a, int b, int c, int d, int e){
		
		int f = menorValor(a,b,c,d);
		
		if(f<e){
			
			return f;
			
		}
		else{
			
			return e;
			
		}
		
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe um
		n�mero flutuante como argumento e retorna esse 
		n�mero.
		
		@param a um valor flutuante da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static double menorValor(double a){
		
		return a;
		
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento dois valores flutuantes e retorna o menor
		valor entre os mesmos.		
		
		@param a um valor flutuante da sequ�ncia
		@param b um valor flutuante da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static double menorValor(double a, double b){
		
		if(a<b){
			
			return a;
			
		}
		else{
			
			return b;
			
		}
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento tr�s valores flutuantes e retorna o menor
		valor entre os mesmos, ele chama o m�todo com 
		assinatura menorValor(double,double) como cascata para 
		realizar essa opera��o.		
		
		@param a um valor flutuante da sequ�ncia
		@param b um valor flutuante da sequ�ncia
		@param c um valor flutuante da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static double menorValor(double a, double b, double c){
		
		double d = menorValor(a,b);
		
		if(d<c){
			
			return d;
			
		}
		else{
			
			return c;
			
		}
		
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento quatro valores flutuantes e retorna o menor
		valor entre os mesmos, ele chama o m�todo com 
		assinatura menorValor(double,double,double) como cascata para 
		realizar essa opera��o.		
		
		@param a um valor flutuante da sequ�ncia
		@param b um valor flutuante da sequ�ncia
		@param c um valor flutuante da sequ�ncia
		@param d um valor flutuante da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static double menorValor(double a, double b, double c, double d){
		
		double e = menorValor(a,b,c);
		
		if(e<d){
			
			return e;
			
		}
		else{
			
			return d;
			
		}
		
	} // fim do m�todo sobrecarregado menorValor
	
	/**
		O m�todo sobrecarregado menorValor recebe como 
		argumento cinco valores flutuantes e retorna o menor
		valor entre os mesmos, ele chama o m�todo com 
		assinatura menorValor(double,double,double,double) como cascata para 
		realizar essa opera��o.		
		
		@param a um valor flutuante da sequ�ncia
		@param b um valor flutuante da sequ�ncia
		@param c um valor flutuante da sequ�ncia
		@param d um valor flutuante da sequ�ncia
		@param e um valor flutuante da sequ�ncia
		@return o menor valor da sequ�ncia
	
	*/
	public static double menorValor(double a, double b, double c, double d, double e){
		
		double f = menorValor(a,b,c,d);
		
		if(f<e){
			
			return f;
			
		}
		else{
			
			return e;
			
		}
		
	} // fim do m�todo sobrecarregado menorValor
	
} // fim da classe MenorValor