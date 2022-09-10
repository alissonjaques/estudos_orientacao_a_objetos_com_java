/**
 * A classe PrincipalContaBancaria possu� um �nico m�todo, que � o m�todo main. Ela da exemplos de usos de inst�ncias da classe ContaBancariaSimplificada
 * @author Alisson Jaques
 * 
 * */
import java.util.Scanner;//importa��o do pacote util para utiliza��o da classe Scanner

public class PrincipalContaBancaria {//declara��o da classe
	
	/**
	 * O m�todo main permite a execu��o dessa classe, nele vemos exemplos de usos da classe ContaBancariaSimplificada
	 * @param argumentos os argumentos que s�o passados ao m�todo via linha de comando, mas que neste casso ser�o ignorados
	 * 
	 * */	
	public static void main(String[] argumentos) {
		
		//declara��o de vari�veis auxiliares correspondentes aos dados de duas contas banc�rias
		String nomeCorrentista1, nomeCorrentista2;
		double saldoCorrentista1, saldoCorrentista2;
		boolean contaEspecial1, contaEspecial2;
		//solicitamos os dados da conta ao usu�rio e os guardamos nas vari�veis auxiliares, utilizando inst�ncias da classe Scanner
		System.out.println("Forne�a os dados para abertura da conta: ");
		System.out.print("Nome: ");
		Scanner nome1 = new Scanner(System.in);
		nomeCorrentista1 = nome1.nextLine();
		System.out.println();
		System.out.print("Valor Dep�sito: ");
		Scanner saldo1 = new Scanner(System.in);
		saldoCorrentista1 = saldo1.nextDouble();
		System.out.println();
		System.out.print("A conta � especial? (sim = true, n�o = false): ");
		Scanner especial1 = new Scanner(System.in);
		contaEspecial1 = especial1.nextBoolean();
		
		System.out.println();//quebra de linha para organiza��o dos dados mostrados no terminal
		
		//solicitamos os dados da conta ao usu�rio e os guardamos nas vari�veis auxiliares, utilizando inst�ncias da classe Scanner
		System.out.println("Forne�a os dados para abertura da conta: ");
		System.out.print("Nome: ");
		Scanner nome2 = new Scanner(System.in);
		nomeCorrentista2 = nome2.nextLine();
		System.out.println();
		System.out.print("Valor Dep�sito: ");
		Scanner saldo2 = new Scanner(System.in);
		saldoCorrentista2 = saldo2.nextDouble();
		System.out.println();
		System.out.print("A conta � especial? (sim = true, n�o = false): ");
		Scanner especial2 = new Scanner(System.in);
		contaEspecial2 = especial2.nextBoolean();
		
		System.out.println();//quebra de linha para organiza��o dos dados mostrados no terminal
				
		//declaramos quatro refer�ncias � inst�ncias da classe ContaBancariaSimplificada e passamos argumentos para os construtores de suas inst�ncias
		ContaBancariaSimplificada cliente1 = new ContaBancariaSimplificada(nomeCorrentista1,saldoCorrentista1,contaEspecial1);
		ContaBancariaSimplificada cliente2 = new ContaBancariaSimplificada(nomeCorrentista2,saldoCorrentista2,contaEspecial2);
		ContaBancariaSimplificada cliente3 = new ContaBancariaSimplificada((String)"Lucas Fernando da Silva");
		ContaBancariaSimplificada cliente4 = new ContaBancariaSimplificada();
		
		//verificamos se as contas fornecidas pelo usu�rio s�o iguais
		if(cliente1.�Igual(cliente2)==true) {//se as contas forem iguais
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" s�o a mesma pessoa!\n");//imprime: as pessoas s�o iguais!
			
		}
		else {//sen�o
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" s�o pessoas diferentes!\n");//imprime: as pessoas s�o diferentes!
			
		}
		
		//transfer�ncia de valor do primeiro correntista informado para o segundo
		cliente1.transferenciaEntreContas(cliente2);
		
		//atrav�s dos m�todos mostraDados e toString da classe ContaBancariaSimplificada mostramos os dados das quatro contas correntes formatados
		cliente1.mostraDados();
		System.out.println();
		cliente2.mostraDados();
		System.out.println();
		System.out.println(cliente3+"\n");
		System.out.println(cliente4+"\n");
		System.out.println("Quantidade de contas cadastradas no banco: " + ContaBancariaSimplificada.quantidadeDeContasCadastradas());
		
	}//fim do m�todo main
		
}//fim da classe PrincipalContaBancaria