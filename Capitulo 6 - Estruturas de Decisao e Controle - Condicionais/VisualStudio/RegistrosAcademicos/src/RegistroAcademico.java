//import java.util.Scanner; // importação de pacote contendo a classe Scanner (classe que permite manipulação de dados informados pelos usuários, via teclado)

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
		númeroDeMatrícula++;
        
        if(n==""){ // se não for informado um nome
            
            idAluno = 0;
            númeroDeMatrícula--;
        
        }
        else{ // senão
		
            idAluno = númeroDeMatrícula;
        
        } // fim-se
		
		//Scanner curso = new Scanner(System.in);

        /*if(c>=1 && c<=4){ // se o código do curso for válido

            códigoDoCurso = c;

        }
        else{ // senão

            while(c<1 || c>4){ // enquanto o código do curso for inválido

                System.out.println("Informe um código de curso válido (1 a 4):");
                c = curso.nextByte();

            } // fim do while

            códigoDoCurso = c;

        } // fim-se*/
		
		percentualDeCobrança = p;
		
		if(percentualDeCobrança<0) { // se o percentual de cobrança for menor do que 0
			
			percentualDeCobrança = 0; // percentual de cobrança será 0
		
		}
		else { // senão
			
			if(percentualDeCobrança>100){ // se o percentual de cobrança for maior do que 100
			
				percentualDeCobrança = 100; // percentual de cobrança será 100
			
			} // fim-se
				
		} // fim-se

			/*
			A estrutura swtich verifica se o código do curso é válido, caso não 
			seja será considerado o valor default 0.
		*/
        switch(c){

			case 34:     // Ciência da Computação
				códigoDoCurso = c;
				break;
			case 39:	 // Engenharia da Computação
				códigoDoCurso = c;
				break;
			case 41:	 // Arquitetura
				códigoDoCurso = c;
				break;
			case 43:	 // Engenharia Civil
				códigoDoCurso = c;
				break;
			case 45:     // Engenharia Elétrica
				códigoDoCurso = c;
				break;
			default:     // Não seja um valor válido
				códigoDoCurso = 0;
				percentualDeCobrança = 0;
				if(n.length()!=0){ // não conta (realiza matrícula), se o nome for diferente de vazio e o código do curso for inválido
					idAluno = 0;
            		númeroDeMatrícula--;
				}				
				break;
		}

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
		
        if(percentualDeCobrança == 0 || códigoDoCurso==0){ // se o percentualDeCobrança for 0

            mensalidade = 0; // aluno não pagará mensalidade

        }
        else{ // senão é calculada a mensalidade do aluno, considerando o curso e o percentual de cobrança (possível bolsa que
              // o mesmo possa ter)

            switch(códigoDoCurso){

                case 41: // Arquitetura
                    
                    mensalidade = 450.00;
                    mensalidade = mensalidade * (percentualDeCobrança/100);
                    break;

                case 34: // Ciência da Computação

                    mensalidade = 500.00;
                    mensalidade = mensalidade * (percentualDeCobrança/100);
                    break;

                case 39: // Engenharia da Computação
                
                    mensalidade = 550.00;
                    mensalidade = mensalidade * (percentualDeCobrança/100);
                    break;

                case 43: // Engenharia Civil
                
                    mensalidade = 600.00;
                    mensalidade = mensalidade * (percentualDeCobrança/100);
                    break;
				case 45: // Engenharia Elétrica
                
                    mensalidade = 620.00;
                    mensalidade = mensalidade * (percentualDeCobrança/100);
                    break;
            } // fim do switch
        }// fim-se

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
		
		switch(códigoDoCurso){

			case 41: // Arqutetura
				dadosDoAluno = dadosDoAluno + "Curso: Arquitetura\n";
				break;
			case 34: // Ciência da Computação
				dadosDoAluno = dadosDoAluno + "Curso: Ciência da Computação\n";
				break;
			case 39: // Engenharia da Computação
				dadosDoAluno = dadosDoAluno + "Curso: Engenharia da Computação\n";
				break;
			case 43: // Engenharia Civil
				dadosDoAluno = dadosDoAluno + "Curso: Engenharia Civil\n";
				break;
			case 45: // Engenharia Elétrica
				dadosDoAluno = dadosDoAluno + "Curso: Engenharia Elétrica\n";
				break;
			default: // Opção inválida
				dadosDoAluno = dadosDoAluno + "Curso: Nenhum curso informado!\n";
				break;
		} // fim do switch
		
		dadosDoAluno = dadosDoAluno + "Percentual de Cobrança: " + percentualDeCobrança + "\n";
		
		dadosDoAluno = dadosDoAluno + "Mensalidade: " + "R$" + calculaMensalidade() + "\n";
		
		return dadosDoAluno; // retornamos o conteúdo da variável auxiliar (string)
		
	} // fim do método toString

} // fim da classe RegistroAcademicoSemConstrutor