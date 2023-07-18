/**
 * A classe Principal possuí apenas um método, que é o método main, ela demonstra usos da classe PoligonoRegular.
 * @author Alisson Jaques
 * 
 * 
 * */

import java.util.Scanner; //importação do biblioteca para utilização da classe Scanner
//import java.io.PrintStream;

public class Principal {//declaração da classe

	/**
	 * O método main permite a execução dessa classe, ele possuí estruturas que dão exemplos de uso da classe PoligonoRegular.
	 * @param argumentos os argumentos que podem ser passados para o método via linha de comando, mas que nesse caso serão ignorados 
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		//declaração de variáveis auxiliares
		byte ladosP;
		double comprimentoLado,area;
		
		//Solicita ao usuário que informe o número de lados do polígono
		System.out.println("Informe a quantidade de lados do polígono (intervalo entre 4 e 10, incluindo estes):");
		//criamos uma refência para uma instância da classe Scanner
		Scanner numero = new Scanner(System.in);
		//utilizamos a variável auxiliar para receber o conteúdo do método chamado pela referência acima (guardamos o valor digitado pelo usuário na variável auxiliar)
		ladosP = numero.nextByte();
		
		//garantimos com um laço, que o usuário nos informe um polígono com lados entre 4 e 10, incluindo estes
		while(ladosP<4 || ladosP>10) {//enquanto os lados não estiverem no intervalo desejado faça
			
			System.out.println("Informe um valor válido!"); //informe ao usuário que os dados não estão corretos
			ladosP = numero.nextByte(); //pegue um novo dado e armazene novamente na variável auxiliar
			
		}
		
		//solicitamos que o usuário informe o comprimento do lado do polígono
		System.out.println("Informe o comprimento de um dos lados do polígono:");
		//criamos uma refência para uma instância da classe Scanner
		Scanner comprimento = new Scanner(System.in);
		//utilizamos a variável auxiliar para receber o conteúdo do método chamado pela referência acima (guardamos o valor digitado pelo usuário na variável auxiliar)
		comprimentoLado = comprimento.nextDouble();
		
		//criamos várias referencias a instâncias da classe PoligoRegular
		PoligonoRegular umPoligono = new PoligonoRegular(ladosP,comprimentoLado);
		PoligonoRegular pentagono = new PoligonoRegular((byte)5,(double)4);
		PoligonoRegular trianguloEquilateroUnitario = new PoligonoRegular();
		PoligonoRegular triangulo = new PoligonoRegular((double)comprimentoLado);
		PoligonoRegular poligonoUnitario = new PoligonoRegular((byte)ladosP);
		
		//verificamos se o polígono passado pelo usuário é igual a um passado diretamente por nós
		if(umPoligono.éIgual(pentagono)==true) {//se os polígonos forem iguais
			
			System.out.println("Os polígonos são iguais!");//imprima são iguais
			
		}
		else {//senão
			
			System.out.println("Os polígonos são diferentes!");//imprima são diferentes
			
		}
		
		/**
		PrintStream printStream = System.out;
		
		printStream.println("A área do polígono informado é: "+ umPoligono.calculaArea());
		
		*/
		
		//várias informações sobre os objetos são informadas na tela através de chamadas a seus métodos
		System.out.println("A área do polígono informado é: " + umPoligono.calculaArea());
		System.out.println("A área do polígono não informado é: " + pentagono.calculaArea());
		System.out.println("O número de diagonais do polígono infomado é:"+umPoligono.calculaNumeroDiagonais());
		System.out.println("O número de diagonais do polígono não infomado é:" + pentagono.calculaNumeroDiagonais());
		System.out.println("O nome do polígono infomado é: " + umPoligono);
		System.out.println("O nome do polígono não infomado é: " + pentagono);
		
		System.out.println(trianguloEquilateroUnitario);
		System.out.println(triangulo);
		System.out.println(poligonoUnitario);
		
	} // fim do método main
		
} // fim da classe Principal
