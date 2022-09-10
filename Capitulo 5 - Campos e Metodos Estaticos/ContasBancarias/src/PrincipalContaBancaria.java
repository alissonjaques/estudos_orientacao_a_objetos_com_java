/**
 * A classe PrincipalContaBancaria possuí um único método, que é o método main. Ela da exemplos de usos de instâncias da classe ContaBancariaSimplificada
 * @author Alisson Jaques
 * 
 * */
import java.util.Scanner;//importação do pacote util para utilização da classe Scanner

public class PrincipalContaBancaria {//declaração da classe
	
	/**
	 * O método main permite a execução dessa classe, nele vemos exemplos de usos da classe ContaBancariaSimplificada
	 * @param argumentos os argumentos que são passados ao método via linha de comando, mas que neste casso serão ignorados
	 * 
	 * */	
	public static void main(String[] argumentos) {
		
		//declaração de variáveis auxiliares correspondentes aos dados de duas contas bancárias
		String nomeCorrentista1, nomeCorrentista2;
		double saldoCorrentista1, saldoCorrentista2;
		boolean contaEspecial1, contaEspecial2;
		//solicitamos os dados da conta ao usuário e os guardamos nas variáveis auxiliares, utilizando instâncias da classe Scanner
		System.out.println("Forneça os dados para abertura da conta: ");
		System.out.print("Nome: ");
		Scanner nome1 = new Scanner(System.in);
		nomeCorrentista1 = nome1.nextLine();
		System.out.println();
		System.out.print("Valor Depósito: ");
		Scanner saldo1 = new Scanner(System.in);
		saldoCorrentista1 = saldo1.nextDouble();
		System.out.println();
		System.out.print("A conta é especial? (sim = true, não = false): ");
		Scanner especial1 = new Scanner(System.in);
		contaEspecial1 = especial1.nextBoolean();
		
		System.out.println();//quebra de linha para organização dos dados mostrados no terminal
		
		//solicitamos os dados da conta ao usuário e os guardamos nas variáveis auxiliares, utilizando instâncias da classe Scanner
		System.out.println("Forneça os dados para abertura da conta: ");
		System.out.print("Nome: ");
		Scanner nome2 = new Scanner(System.in);
		nomeCorrentista2 = nome2.nextLine();
		System.out.println();
		System.out.print("Valor Depósito: ");
		Scanner saldo2 = new Scanner(System.in);
		saldoCorrentista2 = saldo2.nextDouble();
		System.out.println();
		System.out.print("A conta é especial? (sim = true, não = false): ");
		Scanner especial2 = new Scanner(System.in);
		contaEspecial2 = especial2.nextBoolean();
		
		System.out.println();//quebra de linha para organização dos dados mostrados no terminal
				
		//declaramos quatro referências à instâncias da classe ContaBancariaSimplificada e passamos argumentos para os construtores de suas instâncias
		ContaBancariaSimplificada cliente1 = new ContaBancariaSimplificada(nomeCorrentista1,saldoCorrentista1,contaEspecial1);
		ContaBancariaSimplificada cliente2 = new ContaBancariaSimplificada(nomeCorrentista2,saldoCorrentista2,contaEspecial2);
		ContaBancariaSimplificada cliente3 = new ContaBancariaSimplificada((String)"Lucas Fernando da Silva");
		ContaBancariaSimplificada cliente4 = new ContaBancariaSimplificada();
		
		//verificamos se as contas fornecidas pelo usuário são iguais
		if(cliente1.éIgual(cliente2)==true) {//se as contas forem iguais
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" são a mesma pessoa!\n");//imprime: as pessoas são iguais!
			
		}
		else {//senão
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" são pessoas diferentes!\n");//imprime: as pessoas são diferentes!
			
		}
		
		//transferência de valor do primeiro correntista informado para o segundo
		cliente1.transferenciaEntreContas(cliente2);
		
		//através dos métodos mostraDados e toString da classe ContaBancariaSimplificada mostramos os dados das quatro contas correntes formatados
		cliente1.mostraDados();
		System.out.println();
		cliente2.mostraDados();
		System.out.println();
		System.out.println(cliente3+"\n");
		System.out.println(cliente4+"\n");
		System.out.println("Quantidade de contas cadastradas no banco: " + ContaBancariaSimplificada.quantidadeDeContasCadastradas());
		
	}//fim do método main
		
}//fim da classe PrincipalContaBancaria