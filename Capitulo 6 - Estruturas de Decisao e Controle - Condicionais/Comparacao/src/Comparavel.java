
/**
 * A classe Comparavel, que encapsula um valor do tipo double e tem mÈtodos que
 * permitem comparar este valor com outros passados como argumentos de diversas
 * formas, exemplificando o uso dos compadores de Java.
 *
 */
public class Comparavel{ // declaraÁ„o da classe
	
	/**
	 * DeclaraÁ„o dos campos da classe
	 */
	private double valor; // o valor encapsulado, que ser· comparado com outros
	
	/**
	 * O construtor para a classe Comparavel, que recebe um argumento do tipo double
	 * para inicializar o ˙nico campo da classe.
	 * @param v o valor a ser encapsulado
	 */
	Comparavel(double v){
		
		valor = v;
	
	} // fim do construtor com um argumento
	
	/**
	 * O construtor default para a classe Comparavel, que n„o recebe nenhum argumento
	 * e inicializa o campo da classe com o valor 0. 
	 */
	Comparavel(){
		
		valor = 0.0;
		
	} // fim do construtor default
	
	/**
	 * O mÈtodo toString possibilita a impress„o de inst‚ncias desta classe.
	 * @return o valor encapsulado convertido para uma String
	 */
	public String toString(){
		
		return ""+valor; // converte para String via concatenaÁ„o
	
	} // fim do mÈtodo toString
	
	/**
	 * O mÈtodo ÈIgualA retorna o valor booleano true se o valor encapsulado nesta classe
	 * for igual ao passado como argumento.
	 * @param v1 o valor a ser comparado para igualdade
	 * @return true se os valores forem iguais, false se forem diferentes
	 */
	public boolean ÈIgualA(double v1){
		
		if (valor == v1) return true; // comparaÁ„o de igualdade de valores
		else return false;
	
	} // fim do mÈtodo ÈIgualA
	
	/**
	 * O mÈtodo ÈIgualA retorna o valor booleano true se o valor encapsulado nesta classe
	 * for igual aos passados como argumento.
	 * @param v1 um valor a ser comparado para igualdade
	 * @param v2 outro valor a ser comparado para igualdade
	 * @return true se os valores forem iguais, false se forem diferentes
	 */
	 public boolean ÈIgualA(double v1,double v2){
		 
		 if ((valor == v1) && (valor == v2)) // ambos os valores s„o iguais ao encapsulado
			 return true;
		 else return false;
	 
	 } // fim do mÈtodo ÈIgualA
	 
	 /**
	  * O mÈtodo sobrecarregado ÈIgualA retorna o valor booleano true se o conte˙do do campo valor,
	  * encapsulado no objeto atual, for igual ao mesmo conte˙do do campo de um outro objeto, desta
	  * mesma classe, passado como argumento. Caso contr·rio retorna false.
	  * @param umComparavel uma outra inst‚ncia da classe Comparavel
	  * @return true se o campo valor dos objetos forem iguais,
	  * 		false caso contr·rio
	  * 
	  * */
	 public boolean ÈIgualA(Comparavel umComparavel) {
		 
		 return (umComparavel.valor==valor ? true : false);	 
		 
	 } // fim do mÈtodo sobrecarregado ÈIgualA
	 
	 /**
	  * O mÈtodo sobrecarregado ÈIgualA retorna o valor booleano true se o contÈudo do campo valor,
	  * encapsulado no objeto atual, for igual a pelo menos um dos contÈudos dos campos, correspondentes,
	  * de outros dois objetos, desta mesma classe, passados como argumento. Caso contr·rio retorna false.
	  * @param umComparavel uma outra inst‚ncia da classe Comparavel
	  * @param outroComparavel uma outra inst‚ncia da classe Comparavel
	  * @return true se pelo menos um dos campos (campo valor) dos objetos for igual ao conte˙do do campo
	  * valor do objeto atual, false caso contr·rio 
	  * 
	  * */
	 public boolean ÈIgualA(Comparavel umComparavel, Comparavel outroComparavel) {
		 
		 return (umComparavel.valor==valor || outroComparavel.valor == valor ? true : false);		 
		 
	 } // fim do mÈtodo sobrecarregado ÈIgualA
	 
	/**
	 * O mÈtodo ÈIgualAQualquerUmDe retorna o valor booleano true se o valor encapsulado nesta classe
	 * for igual a pelo menos um valores passados como argumentos.
	 * @param v1 o valor a ser comparado para igualdade
	 * @param v2 outro valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public boolean ÈIgualAQualquerUmDe(double v1, double v2) {
		
		return (valor == v1 || valor == v2 ? true: false); // utilizamos o operador tern·rio para o retorno simples de dois
														   // valores booleanos
		
	} // fim do mÈtodo ÈIgualAQualquerUmDe
	
	/**
	 * O mÈtodo sobrecarregado ÈIgualAQualquerUmDe retorna o valor booleano 
	 * true se o valor encapsulado nesta classe for igual a pelo menos um dos 
	 * valores passados como argumentos.
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public boolean ÈIgualAQualquerUmDe(double v1, double v2, double v3) {
		
		return (valor == v1 || valor == v2 || valor == v3 ? true: false); // utilizamos o operador tern·rio para o retorno simples de dois
														                  // valores booleanos
		
	} // fim do mÈtodo sobrecarregado ÈIgualAQualquerUmDe
	
	/**
	 * O mÈtodo sobrecarregado ÈIgualAQualquerUmDe retorna o valor booleano 
	 * true se o valor encapsulado nesta classe for igual a pelo menos um dos
	 * valores passados como argumentos.
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @param v4 quarto valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public boolean ÈIgualAQualquerUmDe(double v1, double v2, double v3, double v4) {
		
		return (valor == v1 || valor == v2 || valor == v3 || valor == v4 ? true: false); // utilizamos o operador tern·rio para o retorno simples de dois
														                                 // valores booleanos
		
	} // fim do mÈtodo sobrecarregado ÈIgualAQualquerUmDe
	
	/**
	 * O mÈtodo sobrecarregado ÈIgualAQualquerUmDe retorna o valor booleano 
	 * true se o valor encapsulado nesta classe for igual a pelo menos um dos
	 * valores passados como argumentos.
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @param v4 quarto valor a ser comparado para igualdade
	 * @param v5 quinto valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public boolean ÈIgualAQualquerUmDe(double v1, double v2, double v3, double v4, double v5) {
		
		return (valor == v1 || valor == v2 || valor == v3 || valor == v4 || valor == v5 ? true: false); // utilizamos o operador tern·rio para o retorno simples de dois
														                                 	            // valores booleanos
		
	} // fim do mÈtodo sobrecarregado ÈIgualAQualquerUmDe
	
	/**
	 * O mÈtodo ÈMaiorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for maior que o passado como argumento.
	 * @param v1 o valor a ser comparado
	 * @return true se o valor encapsulado for maior que o passado como argumento,
	 * false caso contr·rio
	 */
	 public boolean ÈMaiorQue(double v1){
		 
		 if (valor > v1) return true; // o valor encapsulado È maior que o argumento
		 else return false;
	 
	 } // fim do mÈtodo ÈMaiorQue
	
	 /**
	  * O mÈtodo retornaValor n„o recebe nenhum
	  * argumento e retorna o valor contido no 
	  * campo encapsulado da classe.
	  * @return o valor do campo encapsulado da
	  * classe 
	  * */
	 public double retornaValor() {
		 
		 return valor;
		 
	 } // fim do mÈtodo retornaValor
	 
	/**
	 * O mÈtodo ÈMaiorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for maior que os passados como argumentos.
	 * @param v1 um valor a ser comparado
	 * @param v2 outro valor a ser comparado
	 * @return true se o valor encapsulado for maior que os passados como argumentos,
	 * false caso contr·rio
	 */
	 public boolean ÈMaiorQue(double v1,double v2){
		 
		 if ((valor > v1) && (valor > v2)) // o valor encapsulado È maior que os argumentos
			 return true;
		 else return false;
	 
	 } // fim do mÈtodo ÈMaiorQue
	 
	 /**
	  * O mÈtodo ÈMaiorOuIgual retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for maior ou igual ao 
	  * valor passado como argumento. 
	  * @param v1 o valor para comparaÁ„o
	  * @return true se o valor encapsulado for maior ou igual ao valor
	  * passado como argumento, false caso contr·rio 
	  * 
	  */
	 public boolean ÈMaiorOuIgual(double v1) {
		 
		 return (ÈIgualA(v1) || ÈMaiorQue(v1) ? true : false); // usamos um operador tern·rio para obtermos um retorno true ou false,
		 													   // bem como chamadas aos mÈtodos ÈIgualA e ÈMaiorQue da prÛpria classe
		 
	 } // fim do mÈtodo ÈMaiorOuIgual
	 
	 /**
	  * O mÈtodo ÈMenorOuIgual retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for menor ou igual ao 
	  * valor passado como argumento. 
	  * @param v1 o valor para comparaÁ„o
	  * @return true se o valor encapsulado for menor ou igual ao valor
	  * passado como argumento, false caso contr·rio 
	  * 
	  */
	 public boolean ÈMenorOuIgual(double v1) {
		 
		 return (valor <= v1 ? true : false);	// utilizaÁ„o de um operador tern·rio para um retorno simples (true ou false)
		 
	 } // fim do mÈtodo ÈMenorOuIgual
	 
	 /**
	  * O mÈtodo ÈDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente do valor
	  * passado como argumento. 
	  * @param v1 o valor para comparaÁ„o
	  * @return true se o valor encapsulado for diferente do valor
	  * passado como argumento, false caso contr·rio 
	  * 
	  */
	 public boolean ÈDiferenteDe(double v1){
		 
		 return ((!(ÈIgualA(v1))) ? true: false); // usamos o mÈtodo ÈIgualA e o operador de negaÁ„o (!)
		 										  // para avaliarmos a diferenÁa		 
	 } // fim do mÈtodo ÈDiferenteDe
	 
	 /**
	  * O mÈtodo sobrecarregado ÈDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 o valor para comparaÁ„o
	  * @param v2 outro valor para comparaÁ„o
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contr·rio 
	  * 
	  */
	 public boolean ÈDiferenteDe(double v1, double v2) {
		 
		 /*
		  * O operador tern·rio possuÌ em sua condiÁ„o chamadas ao mÈtodo ÈDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do cÛdigo.
		  *
		  **/
		 return (ÈDiferenteDe(v1) && ÈDiferenteDe(v2) ? true : false);
		 
	 } // fim do mÈtodo sobrecarregado ÈDiferenteDe
	 
	 /**
	  * O mÈtodo sobrecarregado ÈDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 primeiro valor para comparaÁ„o
	  * @param v2 segundo valor para comparaÁ„o
	  * @param v3 terceiro valor para comparaÁ„o
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contr·rio 
	  * 
	  */
	 public boolean ÈDiferenteDe(double v1, double v2, double v3) {
		 
		 /*
		  * O operador tern·rio possuÌ em sua condiÁ„o chamadas ao mÈtodo ÈDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do cÛdigo.
		  *
		  **/
		 return (ÈDiferenteDe(v1,v2) && ÈDiferenteDe(v3) ? true : false);
		 		 
	 } // fim do mÈtodo sobrecarregado ÈDiferenteDe
	 
	 /**
	  * O mÈtodo sobrecarregado ÈDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 primeiro valor para comparaÁ„o
	  * @param v2 segundo valor para comparaÁ„o
	  * @param v3 terceiro valor para comparaÁ„o
	  * @param v4 quarto valor para comparaÁ„o
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contr·rio 
	  * 
	  */
	 public boolean ÈDiferenteDe(double v1, double v2, double v3, double v4) {
		 
		 /*
		  * O operador tern·rio possuÌ em sua condiÁ„o chamadas ao mÈtodo ÈDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do cÛdigo.
		  *
		  **/
		 return (ÈDiferenteDe(v1,v2,v3) && ÈDiferenteDe(v4) ? true : false);
		 		 
	 } // fim do mÈtodo sobrecarregado ÈDiferenteDe
	 
	 /**
	  * O mÈtodo sobrecarregado ÈDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 primeiro valor para comparaÁ„o
	  * @param v2 segundo valor para comparaÁ„o
	  * @param v3 terceiro valor para comparaÁ„o
	  * @param v4 quarto valor para comparaÁ„o
	  * @param v5 quinto valor para comparaÁ„o
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contr·rio 
	  * 
	  */
	 public boolean ÈDiferenteDe(double v1, double v2, double v3, double v4, double v5) {
		 
		 /*
		  * O operador tern·rio possuÌ em sua condiÁ„o chamadas ao mÈtodo ÈDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do cÛdigo.
		  *
		  **/
		 return (ÈDiferenteDe(v1,v2,v3,v4) && ÈDiferenteDe(v5) ? true : false);
		 		 
	 } // fim do mÈtodo sobrecarregado ÈDiferenteDe
	 
	/**
	 * O mÈtodo ÈMenorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for menor que o passado como argumento.
	 * @param v1 o valor a ser comparado
	 * @return true se o valor encapsulado for menor que o passado como argumento,
	 * false caso contr·rio
	 */
	 public boolean ÈMenorQue(double v1){
		 
		 if (valor < v1) return true; // o valor encapsulado È menor que o argumento
		 else return false;
	 
	 } // fim do mÈtodo ÈMenorQue
	
	/**
	 * O mÈtodo ÈMenorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for menor que os passados como argumentos.
	 * @param v1 um valor a ser comparado
	 * @param v2 outro valor a ser comparado
	 * @return true se o valor encapsulado for menor que os passados como argumentos,
	 * false caso contr·rio
	 */
	 public boolean ÈMenorQue(double v1,double v2){
		 
		 if ((valor < v1) && (valor < v2)) // o valor encapsulado È menor que os argumentos
			 return true;
		 else return false;
	 
	 } // fim do mÈtodo ÈMenorQue
	
} // fim da classe Comparavel