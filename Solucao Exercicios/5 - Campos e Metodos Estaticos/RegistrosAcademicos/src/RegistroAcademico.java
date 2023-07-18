/**
*  A classe RegistroAcademico, que cont�m campos para representar
*  dados simples sobre um registro acad�mico.
*  @author Alisson Jaques
* 
*/
public class RegistroAcademico{ // declara��o da classe

	/**
	 *  Declara��o dos campos da classe
	 * 
	 */
	private String nomeDoAluno; // O nome do aluno
	static private int n�meroDeMatr�cula = 0; // O n�mero de matr�cula, campo compartilhado entre os objetos da classe
	private int idAluno;// o n�mero de matr�cula do aluno
	private byte c�digoDoCurso; // O c�digo do curso do aluno (1..4)
	private double percentualDeCobran�a; // O percentual a ser cobrado do aluno, 0 a 100%
	
	/**
	 * 	O construtor completo para a classe RegistroAcademico,
	 *  que recebe argumentos e inicializa os campos do objeto 
	 *  com os mesmos.
	 *  @param n o nome do aluno
	 *  @param c o c�digo do curso do aluno
	 *  @param p o percentual de cobran�a da mensalidade do curso 
	 * 
	 * */
	RegistroAcademico(String n, byte c, double p){
		
		nomeDoAluno = n;
		n�meroDeMatr�cula = n�meroDeMatr�cula + 1;
		idAluno = n�meroDeMatr�cula;
		c�digoDoCurso = c;
		percentualDeCobran�a = p;
		
		if(percentualDeCobran�a<0) { // se o percentual de cobran�a for menor do que 0
			
			percentualDeCobran�a = 0; // percentual de cobran�a ser� 0
		
		}
		else { // sen�o
			
			if(percentualDeCobran�a>100){ // se o percentual de cobran�a for maior do que 100
			
				percentualDeCobran�a = 100; // percentual de cobran�a ser� 100
			
			} // fim-se
				
		} // fim-se
		
	} // fim do construtor completo
	
	/**
	 *  O construtor sobrecarregado da classe RegistroAcademico,
	 *  que recebe apenas dois argumentos, referentes ao nome do aluno
	 *  e o c�digo do seu curso. Ele inicializa os campos do objeto com
	 *  os respectivos argumentos passados, os outros com valores default.
	 *  Ele chama outro construtor, em cascata, para realizar esse processo.
	 *  @param n o nome do aluno
	 *  @param c o c�digo do curso do aluno 
	 * 
	 * */
	RegistroAcademico(String n,byte c){
		
		this(n,c,(double)100);		
		
	} // fim do construtor com dois argumentos
	
	/**
	 *  O construtor sobrecarregado da classe RegistroAcademico,
	 *  que recebe apenas um argumento, referente ao nome do aluno. 
	 *  Ele inicializa os campos do objeto com o respectivo argumento 
	 *  passado, os outros com valores default. Este construtor chama
	 *  outro construtor, em cascata, para realizar esse processo.
	 *  @param n o nome do aluno
	 *   
	 * */
	RegistroAcademico(String n){
		
		this(n,(byte)1);		
		
	} // fim do construtor com apenas um argumento
		
	/**
	 *  O construtor default para a classe RegistroAcademico
	 *  que n�o recebe nenhum argumento e inicializa o campos
	 *  do objeto com valores default. Este construtor chama 
	 *  outro construtor, em cascata, para realizar esse processo.
	 * 
	 * */
	RegistroAcademico(){
		
		this("");		
		
	} // fim do construtor default

	/**
	 * O m�todo calculaMensalidade calcula e retorna a mensalidade do aluno usando
	 * o c�digo do seu curso e o percentual de cobran�a.
	 * @return o valor da mensalidade do aluno
	 */
	public double calculaMensalidade(){
		
		double mensalidade = 0; // valor deve ser inicializado
		// Primeiro, dependendo do curso do aluno, determina a mensalidade b�sica
		if (c�digoDoCurso == 1) // Arquitetura
			mensalidade = 450.00;
		if (c�digoDoCurso == 2) // Ci�ncia da Computa��o
			mensalidade = 500.00;
		if (c�digoDoCurso == 3) // Engenharia da Computa��o
			mensalidade = 550.00;
		if (c�digoDoCurso == 4) // Zootecnia
			mensalidade = 380.00;

		// Agora calcula o desconto com o percentual de cobran�a. Se o percentual de
		// cobran�a for zero, a mensalidade tamb�m o ser�.
		if (percentualDeCobran�a == 0) mensalidade = 0;
		// Sen�o, calculamos com uma f�rmula simples.
		else mensalidade = mensalidade * (percentualDeCobran�a/100);

		return mensalidade;
	} // fim do m�todo calculaMensalidade
	
	public static int quantidadeDeMatriculas() {
		
		return n�meroDeMatr�cula;
		
	}	
	
	/**
	 *  O m�todo toString n�o possu� argumentos e retorna uma string
	 *  contendo os campos da classe formatados. 
	 * 
	 * */
	public String toString() {
		
		// declaramos uma vari�vel auxiliar e fazemos atribu���es sucessivas utilizando o conceito de somat�rio
		String dadosDoAluno = "";
		dadosDoAluno = dadosDoAluno + "Nome do Aluno: " + nomeDoAluno + "\n";
		dadosDoAluno = dadosDoAluno + "N�mero de Matr�cula: " + idAluno + "\n";
		
		if(c�digoDoCurso == 1) { // Arquitetura
			
			dadosDoAluno = dadosDoAluno + "Curso: Arquitetura\n";
		
		}
		else { // sen�o
			
			if(c�digoDoCurso==2){ // Ci�ncia Da Computa��o
				
				dadosDoAluno = dadosDoAluno + "Curso: Ci�ncia da Computa��o\n";
				
			}
			else { // sen�o
				
				if(c�digoDoCurso==3){ // Engenharia da Computa��o
					
					dadosDoAluno = dadosDoAluno + "Curso: Engenharia da Computa��o\n";
					
				}
				else { // sen�o
					
					dadosDoAluno = dadosDoAluno + "Curso: Zootecnia\n"; // Zootecnia
					
				} // fim-se
				
			} // fim-se
			
		} // fim-se
		
		dadosDoAluno = dadosDoAluno + "Percentual de Cobran�a: " + percentualDeCobran�a + "\n";
		
		dadosDoAluno = dadosDoAluno + "Mensalidade: " + "R$" + calculaMensalidade() + "\n";
		
		return dadosDoAluno; // retornamos o conte�do da vari�vel auxiliar (string)
		
	} // fim do m�todo toString

} // fim da classe RegistroAcademicoSemConstrutor