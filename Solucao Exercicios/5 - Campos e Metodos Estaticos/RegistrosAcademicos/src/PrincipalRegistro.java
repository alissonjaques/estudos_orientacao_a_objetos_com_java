import java.util.Scanner; // importação de pacote contendo a classe Scanner (classe que permite manipulação de dados informados pelos usuários, via teclado)

/**
 *  A classe PrincipalRegistro possuí um único método,
 *  que é o método main. Este método permite que essa 
 *  classe seja uma aplicação. Esta classe demonstra
 *  usos da classe RegistroAcademico.
 *  @author Alisson Jaques 
 * 
 * */
public class PrincipalRegistro { // declaração da classe
	
	/**
	 *  O método main permite a execução dessa classe, ele
	 *  demonstra usos da classe RegistroAcademico.
	 *  @param argumentos os argumentos que podem ser passados ao 
	 *  método via linha de comando, mas que neste caso serão 
	 *  ignorados.
	 * 
	 * */
	public static void main(String[] argumentos) {
		
		/**
		 *  Declaração de variáveis auxiliares
		 * 
		 * */
		String nomeAluno; 			// o nome do aluno
		byte códigoCurso; 			// o código do curso
		double percentualCobrança;  // o percentual de desconto
		
		Scanner dadosInformados = new Scanner(System.in); // criamos um objeto da classe Scanner, para obtermos dados fornecidos pelo teclado
		
		/**
		 * 	Solicitamos ao usuário informações sobre o aluno a ser matriculado e
		 *  criamos objetos da classe RegistroAcademico com os dados passados.
		 * 
		 * */
		System.out.println("Informe o nome do aluno:");
		nomeAluno = dadosInformados.nextLine();
		System.out.println("Informe o código do curso do aluno:");
		códigoCurso = dadosInformados.nextByte();
		System.out.println("Informe o percentual de cobrança do aluno:");
		percentualCobrança = dadosInformados.nextDouble();		
		RegistroAcademico aluno1 = new RegistroAcademico(nomeAluno,códigoCurso,percentualCobrança); // criamos um objeto com os dados passados (será acionado o construtor completo)
		
		dadosInformados.nextLine();
		System.out.println("Informe o nome do aluno:");		
		nomeAluno = dadosInformados.nextLine();
		System.out.println("Informe o código do curso do aluno:");
		códigoCurso = dadosInformados.nextByte();
		System.out.println("Informe o percentual de cobrança do aluno:");
		percentualCobrança = dadosInformados.nextDouble();		
		RegistroAcademico aluno2 = new RegistroAcademico(nomeAluno,códigoCurso,percentualCobrança); // criamos um objeto com os dados passados (será acionado o construtor completo)
		
		dadosInformados.nextLine();
		System.out.println("Informe o nome do aluno:");
		nomeAluno = dadosInformados.nextLine();
		System.out.println("Informe o código do curso do aluno:");
		códigoCurso = dadosInformados.nextByte();
		RegistroAcademico aluno3 = new RegistroAcademico(nomeAluno,códigoCurso);					// criamos um objeto com os dados passados (será acionado o construtor com dois argumentos)
		
		dadosInformados.nextLine();
		System.out.println("Informe o nome do aluno:");
		nomeAluno = dadosInformados.nextLine();
		RegistroAcademico aluno4 = new RegistroAcademico(nomeAluno);								// criamos um objeto com os dados passados (será acionado o construtor com um argumento)
		
		RegistroAcademico aluno5 = new RegistroAcademico();											// criamos um objeto (será chamado o construtor default)
		
		System.out.println(); // quebra de linha para organização das informações no terminal
		
		/**
		 *  Atráves do método println informamos os dados dos alunos
		 *  matrículados, passando como argumento a esse método objetos
		 *  da classe RegistroAcademico (os parâmetros serão strings retornadas
		 *  pelo método toString da classe RegistroAcademico).
		 * 
		 * */
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);
		System.out.println(aluno4);
		System.out.println(aluno5);
		
		System.out.println("Quantidade de matrículas efetivadas: " + RegistroAcademico.quantidadeDeMatriculas()); // informamos a quantidade de matrículas existentes		
		
	} // fim do método main
	
} // fim da classe PrincipalRegistro
