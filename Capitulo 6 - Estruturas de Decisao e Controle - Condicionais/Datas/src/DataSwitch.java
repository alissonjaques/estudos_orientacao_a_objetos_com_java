/**
* A classe DataSwitch, que contém campos e métodos que permitem a manipulação de
* datas. Esta versão da classe não tem métodos que seriam úteis para seu uso, somente
* contém o construtor (que não verifica a validade dos dados) e dois métodos que
* demonstram a instrução switch (objetivo desta classe).
*/
class DataSwitch{// declaração da classe

	/**
	 * Declaração dos campos da classe
	 */
	private byte dia,mês; // dia e mês são representados por bytes
	private short ano; // ano é representado por um short

	/**
	 * O construtor da classe DataSwitch recebe argumentos para inicializar os campos da
	 * classe. Este construtor não verifica a validade da data, veja o comentário no
	 * início da classe para maiores informações.
	 * @param d o argumento correspondente ao método dia
	 * @param m o argumento correspondente ao método mês
	 * @param a o argumento correspondente ao método ano
	 */
	DataSwitch(byte d,byte m,short a){
	
		dia = d; mês = m; ano = a;
	
	} // fim do construtor
	
	/**
	 * O método toString retorna uma String contendo os valores dos campos formatados
	 * (ou seja, a data com o mês por extenso)
	 * @return uma String com a data formatada
	 */
	public String toString(){
		
		String resultado = ""+dia;
		resultado += " de ";
		switch(mês){// dependendo do valor do campo mês, concatena um dos nomes abaixo.
		
			case 1: resultado += "Janeiro"; break;
			case 2: resultado += "Fevereiro"; break;
			case 3: resultado += "Março"; break;
			case 4: resultado += "Abril"; break;
			case 5: resultado += "Maio"; break;
			case 6: resultado += "Junho"; break;
			case 7: resultado += "Julho"; break;
			case 8: resultado += "Agosto"; break;
			case 9: resultado += "Setembro"; break;
			case 10: resultado += "Outubro"; break;
			case 11: resultado += "Novembro"; break;
			case 12: resultado += "Dezembro"; break;
		
		}
		
		resultado += " de "+ano;
		
		return resultado;
	
	} // fim do método toString

	/**
	 * O método diasNoMês retorna o número de dias que existe no mês encapsulado nesta
	 * classe. O algoritmo simplifica, assumindo que o ano não é bissexto.
	 * @return o número de dias no mês da data encapsulada
	 */
	public byte diasNoMês(){
	
		byte númeroDeDias;
		
		if(mês==2){ // dependendo do valor do campo mês, armazenamos um número de dias
			
			númeroDeDias = 28;
			
		}
		else{
			
			if(mês == 4 || mês == 6 || mês == 9 || mês == 11) {
				
				númeroDeDias = 30;
				
			}
			else {
				
				númeroDeDias = 31;
				
			}
			
		}
			
		return númeroDeDias;
	
	} // fim do método diasNoMês
	
} // fim da classe DataSwitch