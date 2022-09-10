import java.util.Scanner;
/**
* A classe EntradaDeCinema, que calcula o pre�o de uma entrada de cinema usando um
* m�todo est�tico.
*/
class EntradaDeCinema{ // declara��o da classe
	
	/**
	* O m�todo main permite a execu��o desta classe. Este m�todo pergunta alguns
	* dados ao usu�rio e os passa como argumentos para um m�todo que calcula e retorna
	* o pre�o a ser pago por uma entrada de cinema.
	* @param argumentos os argumentos que podem ser passados para o m�todo via linha
	* de comando, mas que neste caso ser�o ignorados.
	*/
	public static void main(String[] argumentos){
		
		/*
		  Criamos uma refer�ncia a um objeto da classe Scanner,
		  para obtermos informa��es do usu�rio do programa.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		
		// Algumas vari�veis que servir�o para c�lculo do pre�o da entrada
		short idade;
		byte diaDaSemana;
		byte horas;
		byte minutos;
		byte segundos;
		
		// Perguntamos os dados ao operador do programa (usu�rio)
		System.out.print("Entre a idade do comprador:");
		idade = entradaUsuario.nextShort();
		System.out.print("Entre o dia da semana (1=domingo, 2=segunda,..., 7=s�bado):");
		diaDaSemana = entradaUsuario.nextByte();
		System.out.println("Informe o hor�rio (formato horas:minutos:segundos): ");
		System.out.print("horas:");
		horas = entradaUsuario.nextByte();
		System.out.print("minutos:");
		minutos = entradaUsuario.nextByte();
		System.out.print("segundos:");
		segundos = entradaUsuario.nextByte();
		
		// criamos uma inst�ncia da classe Relogio, passando como argumentos
		// os dados fornecidos pelo usu�rio
		Relogio horario = new Relogio(horas,minutos,segundos);
		
		// Chama o m�todo para calcular o pre�o
		float pre�o = calculaPre�o(idade,diaDaSemana,horario);
		// Imprime o resultado
		System.out.println("O pre�o da entrada �s "+ horario + " � " + pre�o + " reais");
	
	} // fim do m�todo main

	/**
	* O m�todo calculaPre�o calcula o pre�o da entrada de cinema usando o seguinte
	* algoritmo:
	* - Se a pessoa tem menos de 14 anos ou mais de 65 anos, paga meia entrada
	* (4 reais), caso contr�rio paga oito reais
	* - Se o dia da semana for ter�a, quarta ou quinta (3, 4 ou 5), todos podem pagar
	* meia entrada, independente da idade.
	* @param idade a idade do comprador
	* @param diaDaSemana o dia da semana, entre 1 (domingo) e 7 (s�bado).
	* @return o pre�o da entrada do cinema.
	*/
	public static float calculaPre�o(short idade, byte diaDaSemana, Relogio horario){
		
		float pre�o; // armazenar� o pre�o calculado
		
		if((idade<14) || (idade>65)){ // Se a idade for menor do que ou 14 anos ou maior do que 65 anos,
									  // dever� ser pago meio entrada			
			pre�o = 4;
			
		}
		else{ // sen�o
			
			if((diaDaSemana >= 3) && (diaDaSemana <= 5)){ // Se o dia da semana � entre 3 e 5, todo mundo paga meia entrada
				
				pre�o = 4;
			}
			else{ // ent�o � outro dia da semana, todo mundo paga inteira
				
				pre�o = 8;
				
			} // fim-se
		
		} // fim-se
		
		if(horario.retornaHoras() < 16) { // se o hor�rio for antes das 16:00:00 hrs
			
			pre�o = 4; // todos pagame meia
			
		} // fim-se
		
		return pre�o;
		
	} // fim do m�todo calculaPre�o
	
} // fim da classe EntradaDeCinema