import java.util.Scanner;
/**
 *  A classe Principal da exemplos de usos de inst�ncias da classe Pais, ela possu� apenas um m�todo, que � o m�todo main. Este m�todo permite a execu��o do pacote desta aplica��o
 *  @author Alisson Jaques 
 * 
 * */
public class Principal { //declara a classe
	
	/**
	 *  O m�todo main � um m�todo especial que permite a execu��o da nossa aplica��o. Ele cria v�rias inst�ncias da classe Pais, nos dando exemplos de seu uso.
	 *  @param argumentos os argumentos que s�o passados para o m�todo via linha de comando, mas que neste caso ser�o ignorados
	 *  
	 * */
	public static void main(String[] argumentos) {
		
		//declara��o de vari�veis auxiliares para a inicializa��o dos objetos da classe Pais
		String nomePais, linguaPais;
		float areaPais;
		long populacaoPais;
		
		//Solicitamos os dados de um pa�s ao usu�rio, criamos v�rias inst�ncias da classe Scanner e associamos as vari�veis aos m�todos correspondentes dessas inst�ncias
		//assim somos capazes de armazenar nas vari�veis o conte�do digitado pelo usu�rio
		System.out.println("Informe o nome do pa�s: ");
		Scanner nomeS = new Scanner(System.in);
		nomePais = nomeS.nextLine();
		
		System.out.println("Informe a �rea do pa�s em km�: ");
		Scanner areaS = new Scanner(System.in);
		areaPais = areaS.nextFloat();
		
		System.out.println("Informe o n�mero de habitantes do pa�s (popula��o): ");
		Scanner populacaoS = new Scanner(System.in);
		populacaoPais = populacaoS.nextLong();
		
		System.out.println("Informe a l�ngua nativa do pa�s: ");
		Scanner linguaS = new Scanner(System.in);
		linguaPais = linguaS.nextLine();
		
		//damos uma quebra de linha no terminal
		System.out.println();
		
		//s�o criados tr�s refer�ncias a objetos da classe Pais
		Pais alemanha = new Pais();
		Pais brasil = new Pais();
		Pais china = new Pais();
		
		//inicializamos um objeto passando como par�metro os dados fornecidos pelo usu�rio,
		//outro com dados fornecidos diretamente m�todo
		//e outro com a palavra chave null
		brasil.inicializaPais(nomePais, areaPais, populacaoPais, linguaPais);
		alemanha.inicializaPais((String)"Alemanha",(float)357051.00,(long)82800000,(String)"Alem�o");
		china = null;
		
		//verificamos se o objeto informado pelo usu�rio � igual a um outro objeto passado como refer�ncia
		if(brasil.�Igual(alemanha)==true) {//se o objeto informado for igual ao objeto definido
			
			System.out.println("Os pa�ses s�o iguais!"); //imprima: Os objetos s�o iguais
			
		}
		else { //sen�o
			
			System.out.println("Os pa�ses s�o diferentes!"); //imprima: Os objetos s�o diferentes
			
		}
		//damos mais uma quebra de linha, afim de organiza��o
		System.out.println();
		//passamos como argumento um apontador para um objeto, que permitir� que o m�todo println v� at� o m�todo toString da classe pa�s e imprima a string retornada neste m�todo
		System.out.println(brasil);
		System.out.println(alemanha);
		
	}
		
}
