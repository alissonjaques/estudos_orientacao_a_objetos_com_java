
/**
 * A classe Comparavel, que encapsula um valor do tipo double e tem métodos que
 * permitem comparar este valor com outros passados como argumentos de diversas
 * formas, exemplificando o uso dos compadores de Java.
 *
 */
public class Comparavel{ // declaração da classe
	
	/**
	 * Declaração dos campos da classe
	 */
	private double valor; // o valor encapsulado, que será comparado com outros
	
	/**
	 * O construtor para a classe Comparavel, que recebe um argumento do tipo double
	 * para inicializar o único campo da classe.
	 * @param v o valor a ser encapsulado
	 */
	Comparavel(double v){
		
		valor = v;
	
	} // fim do construtor com um argumento
	
	/**
	 * O construtor default para a classe Comparavel, que não recebe nenhum argumento
	 * e inicializa o campo da classe com o valor 0. 
	 */
	Comparavel(){
		
		valor = 0.0;
		
	} // fim do construtor default
	
	/**
	 * O método toString possibilita a impressão de instâncias desta classe.
	 * @return o valor encapsulado convertido para uma String
	 */
	public String toString(){
		
		return ""+valor; // converte para String via concatenação
	
	} // fim do método toString
	
	/**
	 * O método éIgualA retorna o valor booleano true se o valor encapsulado nesta classe
	 * for igual ao passado como argumento.
	 * @param v1 o valor a ser comparado para igualdade
	 * @return true se os valores forem iguais, false se forem diferentes
	 */
	public boolean éIgualA(double v1){
		
		if (valor == v1) return true; // comparação de igualdade de valores
		else return false;
	
	} // fim do método éIgualA
	
	/**
	 * O método éIgualA retorna o valor booleano true se o valor encapsulado nesta classe
	 * for igual aos passados como argumento.
	 * @param v1 um valor a ser comparado para igualdade
	 * @param v2 outro valor a ser comparado para igualdade
	 * @return true se os valores forem iguais, false se forem diferentes
	 */
	 public boolean éIgualA(double v1,double v2){
		 
		 if ((valor == v1) && (valor == v2)) // ambos os valores são iguais ao encapsulado
			 return true;
		 else return false;
	 
	 } // fim do método éIgualA
	 
	 /**
	  * O método sobrecarregado éIgualA retorna o valor booleano true se o conteúdo do campo valor,
	  * encapsulado no objeto atual, for igual ao mesmo conteúdo do campo de um outro objeto, desta
	  * mesma classe, passado como argumento. Caso contrário retorna false.
	  * @param umComparavel uma outra instância da classe Comparavel
	  * @return true se o campo valor dos objetos forem iguais,
	  * 		false caso contrário
	  * 
	  * */
	 public boolean éIgualA(Comparavel umComparavel) {
		 
		 return (umComparavel.valor==valor ? true : false);	 
		 
	 } // fim do método sobrecarregado éIgualA
	 
	 /**
	  * O método sobrecarregado éIgualA retorna o valor booleano true se o contéudo do campo valor,
	  * encapsulado no objeto atual, for igual a pelo menos um dos contéudos dos campos, correspondentes,
	  * de outros dois objetos, desta mesma classe, passados como argumento. Caso contrário retorna false.
	  * @param umComparavel uma outra instância da classe Comparavel
	  * @param outroComparavel uma outra instância da classe Comparavel
	  * @return true se pelo menos um dos campos (campo valor) dos objetos for igual ao conteúdo do campo
	  * valor do objeto atual, false caso contrário 
	  * 
	  * */
	 public boolean éIgualA(Comparavel umComparavel, Comparavel outroComparavel) {
		 
		 return (umComparavel.valor==valor || outroComparavel.valor == valor ? true : false);		 
		 
	 } // fim do método sobrecarregado éIgualA
	 
	/**
	 * O método éIgualAQualquerUmDe retorna o valor booleano true se o valor encapsulado nesta classe
	 * for igual a pelo menos um valores passados como argumentos.
	 * @param v1 o valor a ser comparado para igualdade
	 * @param v2 outro valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public boolean éIgualAQualquerUmDe(double v1, double v2) {
		
		return (valor == v1 || valor == v2 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														   // valores booleanos
		
	} // fim do método éIgualAQualquerUmDe
	
	/**
	 * O método sobrecarregado éIgualAQualquerUmDe retorna o valor booleano 
	 * true se o valor encapsulado nesta classe for igual a pelo menos um dos 
	 * valores passados como argumentos.
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public boolean éIgualAQualquerUmDe(double v1, double v2, double v3) {
		
		return (valor == v1 || valor == v2 || valor == v3 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														                  // valores booleanos
		
	} // fim do método sobrecarregado éIgualAQualquerUmDe
	
	/**
	 * O método sobrecarregado éIgualAQualquerUmDe retorna o valor booleano 
	 * true se o valor encapsulado nesta classe for igual a pelo menos um dos
	 * valores passados como argumentos.
	 * @param v1 primeiro valor a ser comparado para igualdade
	 * @param v2 segundo valor a ser comparado para igualdade
	 * @param v3 terceiro valor a ser comparado para igualdade
	 * @param v4 quarto valor a ser comparado para igualdade
	 * @return true se pelo um dos valores for igual, false se forem diferentes
	 * 
	 */
	public boolean éIgualAQualquerUmDe(double v1, double v2, double v3, double v4) {
		
		return (valor == v1 || valor == v2 || valor == v3 || valor == v4 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														                                 // valores booleanos
		
	} // fim do método sobrecarregado éIgualAQualquerUmDe
	
	/**
	 * O método sobrecarregado éIgualAQualquerUmDe retorna o valor booleano 
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
	public boolean éIgualAQualquerUmDe(double v1, double v2, double v3, double v4, double v5) {
		
		return (valor == v1 || valor == v2 || valor == v3 || valor == v4 || valor == v5 ? true: false); // utilizamos o operador ternário para o retorno simples de dois
														                                 	            // valores booleanos
		
	} // fim do método sobrecarregado éIgualAQualquerUmDe
	
	/**
	 * O método éMaiorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for maior que o passado como argumento.
	 * @param v1 o valor a ser comparado
	 * @return true se o valor encapsulado for maior que o passado como argumento,
	 * false caso contrário
	 */
	 public boolean éMaiorQue(double v1){
		 
		 if (valor > v1) return true; // o valor encapsulado é maior que o argumento
		 else return false;
	 
	 } // fim do método éMaiorQue
	
	 /**
	  * O método retornaValor não recebe nenhum
	  * argumento e retorna o valor contido no 
	  * campo encapsulado da classe.
	  * @return o valor do campo encapsulado da
	  * classe 
	  * */
	 public double retornaValor() {
		 
		 return valor;
		 
	 } // fim do método retornaValor
	 
	/**
	 * O método éMaiorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for maior que os passados como argumentos.
	 * @param v1 um valor a ser comparado
	 * @param v2 outro valor a ser comparado
	 * @return true se o valor encapsulado for maior que os passados como argumentos,
	 * false caso contrário
	 */
	 public boolean éMaiorQue(double v1,double v2){
		 
		 if ((valor > v1) && (valor > v2)) // o valor encapsulado é maior que os argumentos
			 return true;
		 else return false;
	 
	 } // fim do método éMaiorQue
	 
	 /**
	  * O método éMaiorOuIgual retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for maior ou igual ao 
	  * valor passado como argumento. 
	  * @param v1 o valor para comparação
	  * @return true se o valor encapsulado for maior ou igual ao valor
	  * passado como argumento, false caso contrário 
	  * 
	  */
	 public boolean éMaiorOuIgual(double v1) {
		 
		 return (éIgualA(v1) || éMaiorQue(v1) ? true : false); // usamos um operador ternário para obtermos um retorno true ou false,
		 													   // bem como chamadas aos métodos éIgualA e éMaiorQue da própria classe
		 
	 } // fim do método éMaiorOuIgual
	 
	 /**
	  * O método éMenorOuIgual retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for menor ou igual ao 
	  * valor passado como argumento. 
	  * @param v1 o valor para comparação
	  * @return true se o valor encapsulado for menor ou igual ao valor
	  * passado como argumento, false caso contrário 
	  * 
	  */
	 public boolean éMenorOuIgual(double v1) {
		 
		 return (valor <= v1 ? true : false);	// utilização de um operador ternário para um retorno simples (true ou false)
		 
	 } // fim do método éMenorOuIgual
	 
	 /**
	  * O método éDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente do valor
	  * passado como argumento. 
	  * @param v1 o valor para comparação
	  * @return true se o valor encapsulado for diferente do valor
	  * passado como argumento, false caso contrário 
	  * 
	  */
	 public boolean éDiferenteDe(double v1){
		 
		 return ((!(éIgualA(v1))) ? true: false); // usamos o método éIgualA e o operador de negação (!)
		 										  // para avaliarmos a diferença		 
	 } // fim do método éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 o valor para comparação
	  * @param v2 outro valor para comparação
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public boolean éDiferenteDe(double v1, double v2) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(v1) && éDiferenteDe(v2) ? true : false);
		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 primeiro valor para comparação
	  * @param v2 segundo valor para comparação
	  * @param v3 terceiro valor para comparação
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public boolean éDiferenteDe(double v1, double v2, double v3) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(v1,v2) && éDiferenteDe(v3) ? true : false);
		 		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 primeiro valor para comparação
	  * @param v2 segundo valor para comparação
	  * @param v3 terceiro valor para comparação
	  * @param v4 quarto valor para comparação
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public boolean éDiferenteDe(double v1, double v2, double v3, double v4) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(v1,v2,v3) && éDiferenteDe(v4) ? true : false);
		 		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	 /**
	  * O método sobrecarregado éDiferenteDe retorna o valor booleano true se 
	  * o valor encapsulado nesta classe for diferente dos valores
	  * passados como argumentos. 
	  * @param v1 primeiro valor para comparação
	  * @param v2 segundo valor para comparação
	  * @param v3 terceiro valor para comparação
	  * @param v4 quarto valor para comparação
	  * @param v5 quinto valor para comparação
	  * @return true se o valor encapsulado for diferente dos valores
	  * passados como argumentos, false caso contrário 
	  * 
	  */
	 public boolean éDiferenteDe(double v1, double v2, double v3, double v4, double v5) {
		 
		 /*
		  * O operador ternário possuí em sua condição chamadas ao método éDiferenteDe
		  * com assinatura inferior (menor quantidade de argumentos). Ou seja, ele utiliza
		  * o conceito de cascata para simplificar a estrutura do código.
		  *
		  **/
		 return (éDiferenteDe(v1,v2,v3,v4) && éDiferenteDe(v5) ? true : false);
		 		 
	 } // fim do método sobrecarregado éDiferenteDe
	 
	/**
	 * O método éMenorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for menor que o passado como argumento.
	 * @param v1 o valor a ser comparado
	 * @return true se o valor encapsulado for menor que o passado como argumento,
	 * false caso contrário
	 */
	 public boolean éMenorQue(double v1){
		 
		 if (valor < v1) return true; // o valor encapsulado é menor que o argumento
		 else return false;
	 
	 } // fim do método éMenorQue
	
	/**
	 * O método éMenorQue retorna o valor booleano true se o valor encapsulado nesta
	 * classe for menor que os passados como argumentos.
	 * @param v1 um valor a ser comparado
	 * @param v2 outro valor a ser comparado
	 * @return true se o valor encapsulado for menor que os passados como argumentos,
	 * false caso contrário
	 */
	 public boolean éMenorQue(double v1,double v2){
		 
		 if ((valor < v1) && (valor < v2)) // o valor encapsulado é menor que os argumentos
			 return true;
		 else return false;
	 
	 } // fim do método éMenorQue
	
} // fim da classe Comparavel