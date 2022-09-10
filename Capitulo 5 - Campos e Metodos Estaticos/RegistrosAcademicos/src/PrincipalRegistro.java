import java.util.Scanner; // importa��o de pacote contendo a classe Scanner (classe que permite manipula��o de dados informados pelos usu�rios, via teclado)

/**
 *  A classe PrincipalRegistro possu� um �nico m�todo,
 *  que � o m�todo main. Este m�todo permite que essa 
 *  classe seja uma aplica��o. Esta classe demonstra
 *  usos da classe RegistroAcademico.
 *  @author Alisson Jaques 
 * 
 * */
public class PrincipalRegistro { // declara��o da classe
	
	/**
	 *  O m�todo main permite a execu��o dessa classe, ele
	 *  demonstra usos da classe RegistroAcademico.
	 *  @param argumentos os argumentos que podem ser passados ao 
	 *  m�todo via linha de comando, mas que neste caso ser�o 
	 *  ignorados.
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		/**
		 *  Declara��o de vari�veis auxiliares
		 * 
		 * */
		String nomeAluno; 			// o nome do aluno
		byte c�digoCurso; 			// o c�digo do curso
		double percentualCobran�a;  // o percentual de desconto
		
		Scanner dadosInformados = new Scanner(System.in); // criamos um objeto da classe Scanner, para obtermos dados fornecidos pelo teclado
		
		/**
		 * 	Solicitamos ao usu�rio informa��es sobre o aluno a ser matriculado e
		 *  criamos objetos da classe RegistroAcademico com os dados passados.
		 * 
		 * */
		System.out.println("Informe o nome do aluno:");
		nomeAluno = dadosInformados.nextLine();
		System.out.println("Informe o c�digo do curso do aluno:");
		c�digoCurso = dadosInformados.nextByte();
		System.out.println("Informe o percentual de cobran�a do aluno:");
		percentualCobran�a = dadosInformados.nextDouble();		
		RegistroAcademico aluno1 = new RegistroAcademico(nomeAluno,c�digoCurso,percentualCobran�a); // criamos um objeto com os dados passados (ser� acionado o construtor completo)
		
		dadosInformados.nextLine();
		System.out.println("Informe o nome do aluno:");		
		nomeAluno = dadosInformados.nextLine();
		System.out.println("Informe o c�digo do curso do aluno:");
		c�digoCurso = dadosInformados.nextByte();
		System.out.println("Informe o percentual de cobran�a do aluno:");
		percentualCobran�a = dadosInformados.nextDouble();		
		RegistroAcademico aluno2 = new RegistroAcademico(nomeAluno,c�digoCurso,percentualCobran�a); // criamos um objeto com os dados passados (ser� acionado o construtor completo)
		
		dadosInformados.nextLine();
		System.out.println("Informe o nome do aluno:");
		nomeAluno = dadosInformados.nextLine();
		System.out.println("Informe o c�digo do curso do aluno:");
		c�digoCurso = dadosInformados.nextByte();
		RegistroAcademico aluno3 = new RegistroAcademico(nomeAluno,c�digoCurso);					// criamos um objeto com os dados passados (ser� acionado o construtor com dois argumentos)
		
		dadosInformados.nextLine();
		System.out.println("Informe o nome do aluno:");
		nomeAluno = dadosInformados.nextLine();
		RegistroAcademico aluno4 = new RegistroAcademico(nomeAluno);								// criamos um objeto com os dados passados (ser� acionado o construtor com um argumento)
		
		RegistroAcademico aluno5 = new RegistroAcademico();											// criamos um objeto (ser� chamado o construtor default)
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		
		/**
		 *  Atr�ves do m�todo println informamos os dados dos alunos
		 *  matr�culados, passando como argumento a esse m�todo objetos
		 *  da classe RegistroAcademico (os par�metros ser�o strings retornadas
		 *  pelo m�todo toString da classe RegistroAcademico).
		 * 
		 * */
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);
		System.out.println(aluno4);
		System.out.println(aluno5);
		
		System.out.println("Quantidade de matr�culas efetivadas: " + RegistroAcademico.quantidadeDeMatriculas()); // informamos a quantidade de matr�culas existentes		
		
	} // fim do m�todo main
	
} // fim da classe PrincipalRegistro
