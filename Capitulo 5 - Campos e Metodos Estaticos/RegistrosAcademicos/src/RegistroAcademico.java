/**
*  A classe RegistroAcademico, que contém campos para representar
*  dados simples sobre um registro acadêmico.
*  @author Alisson Jaques
* 
*/
public class RegistroAcademico{ // declaração da classe

	/**
	 *  Declaração dos campos da classe
	 * 
	 */
	private String nomeDoAluno; // O nome do aluno
	static private int númeroDeMatrícula = 0; // O número de matrícula, campo compartilhado entre os objetos da classe
	private int idAluno;// o número de matrícula do aluno
	private byte códigoDoCurso; // O código do curso do aluno (1..4)
	private double percentualDeCobrança; // O percentual a ser cobrado do aluno, 0 a 100%
	
	/**
	 * 	O construtor completo para a classe RegistroAcademico,
	 *  que recebe argumentos e inicializa os campos do objeto 
	 *  com os mesmos.
	 *  @param n o nome do aluno
	 *  @param c o código do curso do aluno
	 *  @param p o percentual de cobrança da mensalidade do curso 
	 * 
	 * */
	RegistroAcademico(String n, byte c, double p){
		
		nomeDoAluno = n;
		númeroDeMatrícula = númeroDeMatrícula + 1;
		idAluno = númeroDeMatrícula;
		códigoDoCurso = c;
		percentualDeCobrança = p;
		
		if(percentualDeCobrança<0) { // se o percentual de cobrança for menor do que 0
			
			percentualDeCobrança = 0; // percentual de cobrança será 0
		
		}
		else { // senão
			
			if(percentualDeCobrança>100){ // se o percentual de cobrança for maior do que 100
			
				percentualDeCobrança = 100; // percentual de cobrança será 100
			
			} // fim-se
				
		} // fim-se
		
	} // fim do construtor completo
	
	/**
	 *  O construtor sobrecarregado da classe RegistroAcademico,
	 *  que recebe apenas dois argumentos, referentes ao nome do aluno
	 *  e o código do seu curso. Ele inicializa os campos do objeto com
	 *  os respectivos argumentos passados, os outros com valores default.
	 *  Ele chama outro construtor, em cascata, para realizar esse processo.
	 *  @param n o nome do aluno
	 *  @param c o código do curso do aluno 
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
	 *  que não recebe nenhum argumento e inicializa o campos
	 *  do objeto com valores default. Este construtor chama 
	 *  outro construtor, em cascata, para realizar esse processo.
	 * 
	 * */
	RegistroAcademico(){
		
		this("");		
		
	} // fim do construtor default

	/**
	 * O método calculaMensalidade calcula e retorna a mensalidade do aluno usando
	 * o código do seu curso e o percentual de cobrança.
	 * @return o valor da mensalidade do aluno
	 */
	public double calculaMensalidade(){
		
		double mensalidade = 0; // valor deve ser inicializado
		// Primeiro, dependendo do curso do aluno, determina a mensalidade básica
		if (códigoDoCurso == 1) // Arquitetura
			mensalidade = 450.00;
		if (códigoDoCurso == 2) // Ciência da Computação
			mensalidade = 500.00;
		if (códigoDoCurso == 3) // Engenharia da Computação
			mensalidade = 550.00;
		if (códigoDoCurso == 4) // Zootecnia
			mensalidade = 380.00;

		// Agora calcula o desconto com o percentual de cobrança. Se o percentual de
		// cobrança for zero, a mensalidade também o será.
		if (percentualDeCobrança == 0) mensalidade = 0;
		// Senão, calculamos com uma fórmula simples.
		else mensalidade = mensalidade * (percentualDeCobrança/100);

		return mensalidade;
	} // fim do método calculaMensalidade
	
	public static int quantidadeDeMatriculas() {
		
		return númeroDeMatrícula;
		
	}	
	
	/**
	 *  O método toString não possuí argumentos e retorna uma string
	 *  contendo os campos da classe formatados. 
	 * 
	 * */
	public String toString() {
		
		// declaramos uma variável auxiliar e fazemos atribuíções sucessivas utilizando o conceito de somatório
		String dadosDoAluno = "";
		dadosDoAluno = dadosDoAluno + "Nome do Aluno: " + nomeDoAluno + "\n";
		dadosDoAluno = dadosDoAluno + "Número de Matrícula: " + idAluno + "\n";
		
		if(códigoDoCurso == 1) { // Arquitetura
			
			dadosDoAluno = dadosDoAluno + "Curso: Arquitetura\n";
		
		}
		else { // senão
			
			if(códigoDoCurso==2){ // Ciência Da Computação
				
				dadosDoAluno = dadosDoAluno + "Curso: Ciência da Computação\n";
				
			}
			else { // senão
				
				if(códigoDoCurso==3){ // Engenharia da Computação
					
					dadosDoAluno = dadosDoAluno + "Curso: Engenharia da Computação\n";
					
				}
				else { // senão
					
					dadosDoAluno = dadosDoAluno + "Curso: Zootecnia\n"; // Zootecnia
					
				} // fim-se
				
			} // fim-se
			
		} // fim-se
		
		dadosDoAluno = dadosDoAluno + "Percentual de Cobrança: " + percentualDeCobrança + "\n";
		
		dadosDoAluno = dadosDoAluno + "Mensalidade: " + "R$" + calculaMensalidade() + "\n";
		
		return dadosDoAluno; // retornamos o conteúdo da variável auxiliar (string)
		
	} // fim do método toString

} // fim da classe RegistroAcademicoSemConstrutor