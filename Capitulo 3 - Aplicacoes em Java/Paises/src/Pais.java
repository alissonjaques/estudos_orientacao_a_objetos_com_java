/** 
 *  A classe Pais possuí campos e métodos que representam um país em nosso mundo.
 *  @author Alisson Jaques
 *   
 * */
public class Pais { //declara a classe
	
	//declaração dos campos da classe
	private String nome, lingua;
	private float area;
	private long populacao;
	
	/**
	 *  O método inicializaPais recebe como argumentos os dados do país e inicializa a classe com esses dados.
	 *  @param umNome um dado relativo ao nome do país
	 *  @param umaArea um dado relatio a área do país
	 *  @param umaPopulacao um dado relativo ao número de habitantes do país
	 *  @param umaLingua um dado relativo à língua nativa do país
	 * 
	 * */
	public void inicializaPais(String umNome, float umaArea, long umaPopulacao, String umaLingua) {
		
		nome = umNome;
		area = umaArea;
		populacao = umaPopulacao;
		lingua = umaLingua;	
		
	}//fim do método inicializaPais
	
	/** 
	 *  O método éIgual recebe como argumento um instância da própria classe Pais e verifica se a instância atual é igual à instância passa no argumento.
	 *  @param umPais uma instância da própria classe Pais
	 *  @return true se os objetos forem iguais
	 *  	   false caso contrário 
	 * 
	 * */
	public boolean éIgual(Pais umPais) {
		
		if((nome==umPais.nome)&&(area==umPais.area)&&(populacao==umPais.populacao)&&(lingua==umPais.lingua)) {//se os dados do objeto atual são iguais ao objeto passado como parâmetro
			
			return true; //então retorna verdadeiro
			
		}
		
		else { //senão
			
			return false; //retorna falso
		
		}
	}//fim do método éIgual
	
	/**
	 *  O método toString não possuí argumentos e retorna uma string contendo os campos do objeto formatados.
	 *  @return dados uma string com os campos do objetos formatados
	 * 
	 * */
	public String toString() {
		
		String dados = "Dados do País:\n"+"Nome: "+nome+"\n"+"Área: "+area+" km²\n"+"População: "+populacao+" habitantes\n"+"Lingua nativa: "+lingua+"\n";
		
		return dados;
		
	}//fim do método toString
	 
}
