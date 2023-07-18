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
		byte valorLogico1, valorLogico2;
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
		System.out.print("A conta � especial? (sim = 1, n�o = 0): ");
		Scanner especial1 = new Scanner(System.in);
		valorLogico1 = especial1.nextByte();
		
		while((valorLogico1!=1)&&(valorLogico1!=0)) {//solicite o dado sobre a conta ser especial ou n�o, enquanto o usu�rio n�o digitar um valor v�lido
			
			System.out.println("Informe um valor v�lido (1 ou 0): ");
			valorLogico1 = especial1.nextByte();
			
		}
		
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
		valorLogico2 = especial2.nextByte();
		while((valorLogico2!=1)&&(valorLogico2!=0)) {//solicite o dado sobre a conta ser especial ou n�o, enquanto o usu�rio n�o digitar um valor v�lido
			
			System.out.println("Informe um valor v�lido (1 ou 0): ");
			valorLogico2 = especial2.nextByte();
			
		}
		
		System.out.println();//quebra de linha para organiza��o dos dados mostrados no terminal
		
		if(valorLogico1==1) {//se a conta do primeiro correntista for especial
			
			contaEspecial1 = true;//a vari�vel contaEspecial1 = true
			
		}
		else {//sen�o
			
			contaEspecial1 = false;//a vari�vel contaEspecial1 = false
			
		}
		
		if(valorLogico2==1) {//se a conta do segundo correntista for especial
			
			contaEspecial2 = true;//a vari�vel contaEspecial2 = true
			
		}
		else {//sen�o
			
			contaEspecial2 = false;//a vari�vel contaEspecial2 = false
			
		}
		
		//declaramos tr�s refer�ncias � inst�ncias da classe ContaBancariaSimplificada
		ContaBancariaSimplificada cliente1 = new ContaBancariaSimplificada();
		ContaBancariaSimplificada cliente2 = new ContaBancariaSimplificada();
		ContaBancariaSimplificada cliente3 = new ContaBancariaSimplificada();
		
		//inicializamos duas refer�ncias com dados fornecidos pelo usu�rio e uma diretamente
		cliente1.abreConta(nomeCorrentista1,saldoCorrentista1,contaEspecial1);
		cliente2.abreConta(nomeCorrentista2,saldoCorrentista2,contaEspecial2);
		cliente3.abreContaSimples((String)"Lucas Fernando da Silva");
		
		//verificamos se as contas fornecidas pelo usu�rio s�o iguais
		if(cliente1.�Igual(cliente2)==true) {//se as contas forem iguais
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" s�o a mesma pessoa!");//imprime: as pessoas s�o iguais!
			
		}
		else {//sen�o
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" s�o pessoas diferentes!");//imprime: as pessoas s�o diferentes!
			
		}
		
		//transfer�ncia de valor do primeiro correntista informado para o segundo
		cliente1.transferenciaEntreContas(cliente2);
		
		//atrav�s do m�todo mostraDados da classe ContaBancariaSimplificada mostramos os dados das tr�s contas correntes informadas formatados
		cliente1.mostraDados();
		System.out.println();
		cliente2.mostraDados();
		System.out.println();
		System.out.println(cliente3);
		
	}//fim do m�todo main
		
}//fim da classe PrincipalContaBancaria
