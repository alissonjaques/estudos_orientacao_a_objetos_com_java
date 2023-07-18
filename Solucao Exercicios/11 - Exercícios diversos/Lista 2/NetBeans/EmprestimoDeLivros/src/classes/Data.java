
package classes;

/**
* A classe Data, que contém campos e métodos que permitem a manipulação de datas.
* Esta versão da classe tem os campos protegidos para evitar a sua manipulação
* incorreta - valores dos campos só podem ser acessados através de métodos.
* @author Alisson Jaques
*/
public class Data{// declaração da classe

	/**
	 * Declaração dos campos da classe
	 */
	private byte dia,mês; // dia e mês são representados por bytes
	private short ano; // ano é representado por um short
	
	/**
	 *  Um construtor para a classe data que recebe três argumentos referentes ao dia, mês e ano e inicializa os campos
	 *  da classe com esses argumentos se a data for válida, se a mesma não for válida o construtor inicializa os campos
	 *  com o valor 0.
	 *  @param d o valor correspondente ao dia
	 *  @param m o valor correspondente ao mês
	 *  @param a o valor correspondente ao ano 
	 */
	public Data(byte d, byte m, short a){		
		if (dataÉVálida(d,m,a)){// se a data for válida, inicializa os campos com os
			// valores passados como argumentos
 			dia = d; mês = m; ano = a; 			
		} // senão
		else { // caso contrário, inicializa os campos com zero 
			dia = 0; mês = 0; ano = 0;			
                } // fim-se		
	} // fim do construtor
	
	/**
	 *  O construtor default para a classe data, que não recebe nenhum argumento
	 *  e inicializa os campos da classe com o valor 0. Ele chama o construtor "Com todos os campos"
	 *  para inicializar os campos da classe.   
	 */
	public Data(){		
            this((byte)0,(byte)0,(short)0);
	}
	
	/**
	 *  O construtor para a classe Data que recebe como argumento uma instância da própria classe data
	 *  e inicializa os campos do objeto encapsulado copiando os campos da classe passada como argumento.
	 *  @param umaData uma instância da própria classe data 
	 */
	public Data(Data data){		
            dia = data.getDia();
            mês = data.getMês();
            ano = data.getAno();		
	} // fim do construtor com um argumento que é um objeto da própria classe Data

	/**
	 * O método getDia retorna o dia da data encapsulada, já que o campo dia, sendo
	 * declarado como private, não poderá ser acessado diretamente de fora da classe.
	 * @return o dia encapsulado pela classe
	 */
	public byte getDia(){		
            return dia;	
	} // fim do método getDia

	/**
	 * O método getMês retorna o mês da data encapsulada, já que o campo mês, sendo
	 * declarado como private, não poderá ser acessado diretamente de fora da classe.
	 * @return o mês encapsulado pela classe
	 */
	public byte getMês(){
            return mês;	
	} // fim do método getMês

	/**
	 * O método getAno retorna o ano da data encapsulada, já que o campo ano, sendo
	 * declarado como private, não poderá ser acessado diretamente de fora da classe.
	 * @return o ano encapsulado pela classe
	 */
	public short getAno(){		
            return ano;	
	} // fim do método getAno

	/**
	 * O método dataÉVálida recebe três valores como argumentos e verifica de maneira
	 * simples se os dados correspondem a uma data válida. Se a data for válida, retorna
	 * a constante booleana true, caso contrário, retorna a constante booleana false.
	 * @param d o argumento correspondente ao método dia
	 * @param m o argumento correspondente ao método mês
	 * @param a o argumento correspondente ao método ano
	 * @return true se a data for válida, false se não for válida
	 */
	public boolean dataÉVálida(byte d,byte m,short a){            
            if(a>0){ // se o ano for válido
                if(m>=1 && m<=12){ // se o mês for válido
                    switch(m){ // caso o mês seja:
                        case 1:
                            if(d>=1 && d<=31){ // se o dia for válido
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 2:
                            if(d>=1 && d<=28){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 3:
                            if(d>=1 && d<=31){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 4:
                            if(d>=1 && d<=30){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 5:
                            if(d>=1 && d<=31){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 6:
                            if(d>=1 && d<=30){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 7:
                            if(d>=1 && d<=31){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 8:
                            if(d>=1 && d<=31){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 9:
                            if(d>=1 && d<=30){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 10:
                            if(d>=1 && d<=31){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 11:
                            if(d>=1 && d<=30){
                                return true;
                            }
                            else{
                                return false;
                            }
                        case 12:
                            if(d>=1 && d<=31){
                                return true;
                            }
                            else{
                                return false;
                            }
                        default:
                            return false;
                    }
                }
                else{ // senão
                    return false;
                } // fim-se
            } // senão
            else{
                return false;
            } // fim-se
	} // fim do método dataÉVálida
        
        public void setDia(Byte d){
            if (dataÉVálida(d,mês,ano)){// se a data for válida
                dia = d; // seta o dia 			
            }    
        }
        
        public void setMês(Byte m){
            if (dataÉVálida(dia,m,ano)){// se a data for válida
                mês = m; // seta o mês 			
            }    
        }
        
        public void setAno(Short a){
            if (dataÉVálida(dia,mês,a)){// se a data for válida
                ano = a; // seta o ano 			
            }    
        }
        
	/**
	 * O método éIgual recebe uma instância da própria classe Data como argumento e
	 * verifica se a data representada pela classe e pela instância que foi passada é
	 * a mesma. A comparação é feita comparando os campos da data um a um.
	 * @param outraData uma instância da própria classe Data
	 * @return true se a data encapsulada for igual à passada, false caso contrário
	 */
	public boolean éIgual(Data outraData) {
            if ((dia == outraData.dia) && // se os dois dias forem iguais E
                (mês == outraData.mês) && // se os dois meses forem iguais E
		(ano == outraData.ano)) // se os dois anos forem iguais então
            	return true; // a data é igual, retorna true
            else
		return false; // a data é diferente, retorna false
	} // fim do método éIgual

	/** 
	 * O método clonaData não possuí argumentos, ele retorna uma nova instância que contêm os mesmos campos da instância atual, ou seja ele cria um clone de um objeto qualquer.
	 * @return clone um novo objeto com os mesmos campos do objeto atual
	 * */
	public Data clonaData(){		
            Data clone = new Data(dia,mês,ano);//criamos uma instância da classe Data com os mesmos campos do objeto encapsulado e a associamos à referência clona
		
            return clone;//retornamos a nova instância com os campos clonados
	} //fim do método clonaData
		
	/**
	 * O método toString não recebe argumentos nem retorna valores. Este método somente
	 * imprime os valores dos campos, formatados de forma que uma barra ("/") seja
	 * impressa entre eles. Quando o valor do ano for impresso, uma quebra de linha
	 * também será impressa.
         * @return uma string com os campos da classe formatados
	 */
	public String toString(){            
            String data = "";
            data += dia+"/"+mês+"/"+ano+"\n";
            return data;	
	} // fim do método mostraData
 } // fim da classe Data