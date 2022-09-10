/**
 * A classe PrincipalComplexo da exemplos de uso de objetos da classe NumeroComplexo.
 * Ela possuí um único método, que o método main, permitindo assim a execução da aplicação.
 * @author Alisson Jaques
 *  
 * */
import java.util.Scanner;//importação de biblioteca que permite manipular a classe Scanner

public class PrincipalComplexo {//declaração da classe

	/**
	 * O método main permite a execução desta classe, ele cria várias instâncias da classe
	 * NumeroComplexo e da exemplos de seu uso.
	 * @param argumentos, os argumentos que podem ser passados ao método via linha de comando
	 * mas que neste caso serão ignorados 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//declaração de variáveis auxiliares referentes a dois números complexos a+bi e c+di
		double realA, realC, imaginarioB, imaginarioD;
		
		//solicitamos que o usuário digite as informações do primeiro número complexo a+bi
		System.out.println("Informe a parte real e imaginária do primeiro número complexo:");
		
		//atráves de instâncias da classe Scanner, e chamadas de métodos da mesma, recebemos o conteúdo informado pelo usuário
		//e os armazenamos nas variáveis correspondentes
		Scanner real1 = new Scanner(System.in);
		realA = real1.nextDouble();
		Scanner imaginario1 = new Scanner(System.in);
		imaginarioB = imaginario1.nextDouble();
		
		//solicitamos que o usuário digite as informações do primeiro número complexo c+di
		System.out.println("Informe a parte real e imaginária do segundo número complexo:");
		
		//atráves de instâncias da classe Scanner, e chamadas de métodos da mesma, recebemos o conteúdo informado pelo usuário
		//e os armazenamos nas variáveis correspondentes
		Scanner real2 = new Scanner(System.in);
		realC = real2.nextDouble();
		Scanner imaginario2 = new Scanner(System.in);
		imaginarioD = imaginario2.nextDouble();
		
		//criamos 4 instâncias da classe NumeroCommplexo, 4 números complexos, manipulando os construtores dessa classe
		NumeroComplexo numero1 = new NumeroComplexo(realA,imaginarioB);
		NumeroComplexo numero2 = new NumeroComplexo(realC,imaginarioD);
		NumeroComplexo realPuro = new NumeroComplexo(realA);
		NumeroComplexo zero = new NumeroComplexo();
	
		//imprimimos na tela o contéudo dos campos dos objetos formatados na forma a+bi
		System.out.println("O primeiro número complexo informado foi: "+numero1);
		System.out.println("O segundo número complexo informado foi: "+numero2);
		System.out.println("Um número real puro é: "+realPuro);
		System.out.println("O número "+zero+" também é um número coplexo");
		
		//verificamos se os dois números complexos informados são iguais
		if(numero1.éIgual(numero2)==true) {//se os números informados forem iguais
			
			System.out.println("Os números complexos informados são iguais!");//retorna mensagem: são iguais!
			
		}
		else {//senão
			
			System.out.println("Os números complexos informados são diferentes!");//retorna mensagem: são diferentes!
			
		}
		//através de chamadas aos métodos da classe NumeroComplexo pelas refências criadas imprimimos a soma, subtração, divisão
		//e multiplicação dos números complexos informados pelo usuário
		System.out.println("A soma dos números complexos é: "+numero1.somaComplexo(numero2));
		System.out.println("A subtração do primeiro número complexo informado pelo segundo é: "+numero1.subtraiComplexo(numero2));
		System.out.println("A multiplicação dos números complexos é: "+numero1.multiplicaComplexo(numero2));
		System.out.println("A divisão do primeiro número complexo pelo segundo é: "+numero1.divideComplexo(numero2));
		System.out.println(realPuro+" * "+zero+" = "+realPuro.multiplicaComplexo(zero));
		
	}//fim do método main
		
} // fim da classe PrincipalComplexo