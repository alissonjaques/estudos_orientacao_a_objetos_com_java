/** 
 *  A classe Pais possu� campos e m�todos que representam um pa�s em nosso mundo.
 *  @author Alisson Jaques
 *   
 * */
public class Pais { //declara a classe
	
	//declara��o dos campos da classe
	private String nome, lingua;
	private float area;
	private long populacao;
	
	/**
	 *  O m�todo inicializaPais recebe como argumentos os dados do pa�s e inicializa a classe com esses dados.
	 *  @param umNome um dado relativo ao nome do pa�s
	 *  @param umaArea um dado relatio a �rea do pa�s
	 *  @param umaPopulacao um dado relativo ao n�mero de habitantes do pa�s
	 *  @param umaLingua um dado relativo � l�ngua nativa do pa�s
	 * 
	 * */
	public void inicializaPais(String umNome, float umaArea, long umaPopulacao, String umaLingua) {
		
		nome = umNome;
		area = umaArea;
		populacao = umaPopulacao;
		lingua = umaLingua;	
		
	}//fim do m�todo inicializaPais
	
	/** 
	 *  O m�todo �Igual recebe como argumento um inst�ncia da pr�pria classe Pais e verifica se a inst�ncia atual � igual � inst�ncia passa no argumento.
	 *  @param umPais uma inst�ncia da pr�pria classe Pais
	 *  @return true se os objetos forem iguais
	 *  	   false caso contr�rio 
	 * 
	 * */
	public boolean �Igual(Pais umPais) {
		
		if((nome==umPais.nome)&&(area==umPais.area)&&(populacao==umPais.populacao)&&(lingua==umPais.lingua)) {//se os dados do objeto atual s�o iguais ao objeto passado como par�metro
			
			return true; //ent�o retorna verdadeiro
			
		}
		
		else { //sen�o
			
			return false; //retorna falso
		
		}
	}//fim do m�todo �Igual
	
	/**
	 *  O m�todo toString n�o possu� argumentos e retorna uma string contendo os campos do objeto formatados.
	 *  @return dados uma string com os campos do objetos formatados
	 * 
	 * */
	public String toString() {
		
		String dados = "Dados do Pa�s:\n"+"Nome: "+nome+"\n"+"�rea: "+area+" km�\n"+"Popula��o: "+populacao+" habitantes\n"+"Lingua nativa: "+lingua+"\n";
		
		return dados;
		
	}//fim do m�todo toString
	 
}
