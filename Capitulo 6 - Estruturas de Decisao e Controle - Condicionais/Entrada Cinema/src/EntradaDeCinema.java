import java.util.Scanner;
/**
* A classe EntradaDeCinema, que calcula o preço de uma entrada de cinema usando um
* método estático.
*/
class EntradaDeCinema{ // declaração da classe
	
	/**
	* O método main permite a execução desta classe. Este método pergunta alguns
	* dados ao usuário e os passa como argumentos para um método que calcula e retorna
	* o preço a ser pago por uma entrada de cinema.
	* @param argumentos os argumentos que podem ser passados para o método via linha
	* de comando, mas que neste caso serão ignorados.
	*/
	public static void main(String[] argumentos){
		
		/*
		  Criamos uma referência a um objeto da classe Scanner,
		  para obtermos informações do usuário do programa.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		
		// Algumas variáveis que servirão para cálculo do preço da entrada
		short idade;
		byte diaDaSemana;
		byte horas;
		byte minutos;
		byte segundos;
		
		// Perguntamos os dados ao operador do programa (usuário)
		System.out.print("Entre a idade do comprador:");
		idade = entradaUsuario.nextShort();
		System.out.print("Entre o dia da semana (1=domingo, 2=segunda,..., 7=sábado):");
		diaDaSemana = entradaUsuario.nextByte();
		System.out.println("Informe o horário (formato horas:minutos:segundos): ");
		System.out.print("horas:");
		horas = entradaUsuario.nextByte();
		System.out.print("minutos:");
		minutos = entradaUsuario.nextByte();
		System.out.print("segundos:");
		segundos = entradaUsuario.nextByte();
		
		// criamos uma instância da classe Relogio, passando como argumentos
		// os dados fornecidos pelo usuário
		Relogio horario = new Relogio(horas,minutos,segundos);
		
		// Chama o método para calcular o preço
		float preço = calculaPreço(idade,diaDaSemana,horario);
		// Imprime o resultado
		System.out.println("O preço da entrada às "+ horario + " é " + preço + " reais");
	
	} // fim do método main

	/**
	* O método calculaPreço calcula o preço da entrada de cinema usando o seguinte
	* algoritmo:
	* - Se a pessoa tem menos de 14 anos ou mais de 65 anos, paga meia entrada
	* (4 reais), caso contrário paga oito reais
	* - Se o dia da semana for terça, quarta ou quinta (3, 4 ou 5), todos podem pagar
	* meia entrada, independente da idade.
	* @param idade a idade do comprador
	* @param diaDaSemana o dia da semana, entre 1 (domingo) e 7 (sábado).
	* @return o preço da entrada do cinema.
	*/
	public static float calculaPreço(short idade, byte diaDaSemana, Relogio horario){
		
		float preço; // armazenará o preço calculado
		
		if((idade<14) || (idade>65)){ // Se a idade for menor do que ou 14 anos ou maior do que 65 anos,
									  // deverá ser pago meio entrada			
			preço = 4;
			
		}
		else{ // senão
			
			if((diaDaSemana >= 3) && (diaDaSemana <= 5)){ // Se o dia da semana é entre 3 e 5, todo mundo paga meia entrada
				
				preço = 4;
			}
			else{ // então é outro dia da semana, todo mundo paga inteira
				
				preço = 8;
				
			} // fim-se
		
		} // fim-se
		
		if(horario.retornaHoras() < 16) { // se o horário for antes das 16:00:00 hrs
			
			preço = 4; // todos pagame meia
			
		} // fim-se
		
		return preço;
		
	} // fim do método calculaPreço
	
} // fim da classe EntradaDeCinema