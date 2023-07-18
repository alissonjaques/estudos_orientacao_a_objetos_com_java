public class ComparavelEstatico {
    
	/**
	 * O método éIgualA retorna o valor booleano true se a referência valor (double)
	 * for igual ao passado como argumento.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 o valor a ser comparado para igualdade
	 * @return true se os valores forem iguais, false se forem diferentes
	 */
	public static boolean éIgualA(double valor, double v1){
		
		if (valor == v1) return true; // comparação de igualdade de valores
		else return false;
	
	} // fim do método éIgualA
	
	/**
	 * O método éIgualA retorna o valor booleano true se a referência valor (double)
	 * for igual aos passados como argumento.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 um valor a ser comparado para igualdade
	 * @param v2 outro valor a ser comparado para igualdade
	 * @return true se os valores forem iguais, false se forem diferentes
	 */
	 public static boolean éIgualA(double valor, double v1,double v2){
		 
		 if ((valor == v1) && (valor == v2)) // ambos os valores são iguais ao encapsulado
			 return true;
		 else return false;
	 
	 } // fim do método éIgualA
	 
	/**
	 * O método éIgualAQualquerUmDe retorna o valor booleano true se a referência valor (double)
	 * for igual a pelo menos um valores passados como argumentos.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 o valor a ser comparado para igualdade
	 * @param v2 outro valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public static boolean éIgualAQualquerUmDe(double valor, double v1, double v2) {
		
		return (valor == v1 || valor == v2 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														   // valores booleanos
		
	} // fim do método éIgualAQualquerUmDe
	
	/**
	 * O método sobrecarregado éIgualAQualquerUmDe retorna o valor booleano 
	 * true se a referência valor (double) for igual a pelo menos um dos 
	 * valores passados como argumentos.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public static boolean éIgualAQualquerUmDe(double valor, double v1, double v2, double v3) {
		
		return (valor == v1 || valor == v2 || valor == v3 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														                  // valores booleanos
		
	} // fim do método sobrecarregado éIgualAQualquerUmDe
	
	/**
	 * O método sobrecarregado éIgualAQualquerUmDe retorna o valor booleano 
	 * true se a referência valor (double) for igual a pelo menos um dos
	 * valores passados como argumentos.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @param v4 quarto valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public static boolean éIgualAQualquerUmDe(double valor, double v1, double v2, double v3, double v4) {
		
		return (valor == v1 || valor == v2 || valor == v3 || valor == v4 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														                                 // valores booleanos
		
	} // fim do método sobrecarregado éIgualAQualquerUmDe
	
	/**
	 * O método sobrecarregado éIgualAQualquerUmDe retorna o valor booleano 
	 * true se a referência valor (double) for igual a pelo menos um dos
	 * valores passados como argumentos.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @param v4 quarto valor a ser comparado para igualdade
	 * @param v5 quinto valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public static boolean éIgualAQualquerUmDe(double valor, double v1, double v2, double v3, double v4, double v5) {
		
		return (valor == v1 || valor == v2 || valor == v3 || valor == v4 || valor == v5 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														                                 	            // valores booleanos
		
	} // fim do método sobrecarregado éIgualAQualquerUmDe
	
	/**
	 * O método éMaiorQue retorna o valor booleano true se a referência valor nesta
	 * classe for maior que o passado como argumento.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 o valor a ser comparado
	 * @return true se a referência valor for maior que o passado como argumento,
	 * false caso contrário
	 */
	 public static boolean éMaiorQue(double valor, double v1){
		 
		 if (valor > v1) return true; // a referência valor é maior que o argumento
		 else return false;
	 
	 } // fim do método éMaiorQue
	
	/**
	 * O método éMaiorQue retorna o valor booleano true se a referência valor nesta
	 * classe for maior que os passados como argumentos.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 um valor a ser comparado
	 * @param v2 outro valor a ser comparado
	 * @return true se a referência valor for maior que os passados como argumentos,
	 * false caso contrário
	 */
	 public static boolean éMaiorQue(double valor, double v1,double v2){
		 
		 if ((valor > v1) && (valor > v2)) // a referência valor é maior que os argumentos
			 return true;
		 else return false;
	 
	 } // fim do método éMaiorQue
	 
	 /**
	  * O método éMaiorOuIgual retorna o valor booleano true se 
	  * a referência valor (double) for maior ou igual ao 
	  * valor passado como argumento. 
	  * @param valor o valor que servirá de base para as comparações
	  * @param v1 o valor para comparação
	  * @return true se a referência valor for maior ou igual ao valor
	  * passado como argumento, false caso contrário 
	  * 
	  */
	 public static boolean éMaiorOuIgual(double valor, double v1) {
		 
		 return (éIgualA(valor,v1) || éMaiorQue(valor,v1) ? true : false); // usamos um operador ternário para obtermos um retorno true ou false,
		 													   // bem como chamadas aos métodos éIgualA e éMaiorQue da própria classe
		 
	 } // fim do método éMaiorOuIgual
	 
	 /**
	  * O método éMenorOuIgual retorna o valor booleano true se 
	  * a referência valor (double) for menor ou igual ao 
	  * valor passado como argumento. 
	  * @param valor o valor que servirá de base para as comparações
	  * @param v1 o valor para comparação
	  * @return true se a referência valor for menor ou igual ao valor
	  * passado como argumento, false caso contrário 
	  * 
	  */
	 public static boolean éMenorOuIgual(double valor, double v1) {
		 
		 return (valor <= v1 ? true : false);	// utilização de um operador ternário para um retorno simples (true ou false)
		 
	 } // fim do método éMenorOuIgual
	 
	 /**
	  * O método éDiferenteDe retorna o valor booleano true se 
	  * a referência valor (double) for diferente do valor
	  * passado como argumento. 
	  * @param valor o valor que servirá de base para as comparações
	  * @param v1 o valor para comparação
	  * @return true se a referência valor for diferente do valor
	  * passado como argumento, false caso contrário 
	  * 
	  */
	 public static boolean éDiferenteDe(double valor, double v1){
		 
		 return ((!(éIgualA(valor,v1))) ? true: false); // usamos o método éIgualA e o operador de negação (!)
		 										  // para avaliarmos a diferença		 
	 } // fim do método éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * a referência valor (double) for diferente dos valores
	  * passados como argumentos. 
	  * @param valor o valor que servirá de base para as comparações
	  * @param v1 o valor para comparação
	  * @param v2 outro valor para comparação
	  * @return true se a referência valor for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public static boolean éDiferenteDe(double valor, double v1, double v2) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(valor,v1) && éDiferenteDe(valor,v2) ? true : false);
		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * a referência valor (double) for diferente dos valores
	  * passados como argumentos. 
	  * @param valor o valor que servirá de base para as comparações
	  * @param v1 primeiro valor para comparação
	  * @param v2 segundo valor para comparação
	  * @param v3 terceiro valor para comparação
	  * @return true se a referência valor for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public static boolean éDiferenteDe(double valor, double v1, double v2, double v3) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(valor,v1,v2) && éDiferenteDe(valor,v3) ? true : false);
		 		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * a referência valor (double) for diferente dos valores
	  * passados como argumentos. 
	  * @param valor o valor que servirá de base para as comparações
	  * @param v1 primeiro valor para comparação
	  * @param v2 segundo valor para comparação
	  * @param v3 terceiro valor para comparação
	  * @param v4 quarto valor para comparação
	  * @return true se a referência valor for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public static boolean éDiferenteDe(double valor, double v1, double v2, double v3, double v4) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(valor,v1,v2,v3) && éDiferenteDe(valor,v4) ? true : false);
		 		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * a referência valor (double) for diferente dos valores
	  * passados como argumentos. 
	  * @param valor o valor que servirá de base para as comparações
	  * @param v1 primeiro valor para comparação
	  * @param v2 segundo valor para comparação
	  * @param v3 terceiro valor para comparação
	  * @param v4 quarto valor para comparação
	  * @param v5 quinto valor para comparação
	  * @return true se a referência valor for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public static boolean éDiferenteDe(double valor, double v1, double v2, double v3, double v4, double v5) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(valor,v1,v2,v3,v4) && éDiferenteDe(valor,v5) ? true : false);
		 		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	/**
	 * O método éMenorQue retorna o valor booleano true se a referência valor nesta
	 * classe for menor que o passado como argumento.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 o valor a ser comparado
	 * @return true se a referência valor for menor que o passado como argumento,
	 * false caso contrário
	 */
	 public static boolean éMenorQue(double valor, double v1){
		 
		 if (valor < v1) return true; // a referência valor é menor que o argumento
		 else return false;
	 
	 } // fim do método éMenorQue
	
	/**
	 * O método éMenorQue retorna o valor booleano true se a referência valor nesta
	 * classe for menor que os passados como argumentos.
	 * @param valor o valor que servirá de base para as comparações
	 * @param v1 um valor a ser comparado
	 * @param v2 outro valor a ser comparado
	 * @return true se a referência valor for menor que os passados como argumentos,
	 * false caso contrário
	 */
	 public static boolean éMenorQue(double valor, double v1,double v2){
		 
		 if ((valor < v1) && (valor < v2)) // a referência valor é menor que os argumentos
			 return true;
		 else return false;
	 
	 } // fim do método éMenorQue

}
