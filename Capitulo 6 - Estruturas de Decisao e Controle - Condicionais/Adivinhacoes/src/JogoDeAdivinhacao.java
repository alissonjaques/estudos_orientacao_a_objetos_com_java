import java.util.Scanner;

/**
* A classe JogoDeAdivinhacao, que implementa um jogo simples de adivinhação de
* números. Um número será escolhido e o usuário deverá adivinhar este número com
* dicas da classe.
* No momento esta classe é bem simples: o valor a ser adivinhado deve ser fornecido
* pelo programa que criar instâncias da classe. Futuramente veremos como usar valores
* aleatórios para isto.
*/
class JogoDeAdivinhacao{ // declaração da classe

	/**
	* Declaração dos campos da classe
	*/
	private int valor; // o valor a ser adivinhado

	/**
	* O construtor da classe simplesmente inicializa o campo privado com o valor
	* passado como argumento.
	* @param val o valor passado para inicialização do campo valor
	*/
	JogoDeAdivinhacao(int val){
		
		valor = val;
	
	} // fim do construtor

	/**
	* O método tenta pergunta ao usuário um valor e mostra se o valor encapsulado é
	* maior ou menor do que o valor passado. A pergunta é feita até que vinte tentativas
	* sejam feitas ou até que o usuário tenha acertado o valor.
	*/
	public void tenta(){
		
	byte tentativas = 20; // o número máximo de tentativas
	byte contador = 1; // o número de tentativas até agora
	Scanner valorDaTentativa = new Scanner(System.in); // declaração de instância para obtenção de dados 
													   // informados pelo usuário
	
	System.out.println("Tente adivinhar o número secreto em "+tentativas+
	" tentativas.");
	do // execute o bloco seguinte...
	{
		System.out.print("Tentativa número "+contador+":");
		int estaTentativa = valorDaTentativa.nextInt();
		if (estaTentativa == valor) // acertou o valor !
			break; // simplesmente sai do laço
		else if (estaTentativa < valor)
			System.out.println("O número "+estaTentativa+" é menor que o número secreto!");
		else
			System.out.println("O número "+estaTentativa+" é maior que o número secreto!");
		contador++;
	}
	while(contador <= tentativas); // enquanto o número de tentativas não for alcançado
	
	// Aqui sabemos que ou o usuário acertou o número ou as tentativas se esgotaram.
	// Basta verificar o valor do contador: se for maior que o número de tentativas,
	// então o usuário não conseguiu adivinhar o número.
	if (contador <= tentativas)
		System.out.println("Parabéns, você acertou o número ("+valor+") !");
	else
		System.out.println("Você não acertou!");
	} // fim do método tenta
	
} // fim da classe JogoDeAdivinhacao