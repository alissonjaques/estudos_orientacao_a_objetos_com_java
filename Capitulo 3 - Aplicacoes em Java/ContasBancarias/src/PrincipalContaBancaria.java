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
		byte valorLogico1, valorLogico2;
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
		System.out.print("A conta é especial? (sim = 1, não = 0): ");
		Scanner especial1 = new Scanner(System.in);
		valorLogico1 = especial1.nextByte();
		
		while((valorLogico1!=1)&&(valorLogico1!=0)) {//solicite o dado sobre a conta ser especial ou não, enquanto o usuário não digitar um valor válido
			
			System.out.println("Informe um valor válido (1 ou 0): ");
			valorLogico1 = especial1.nextByte();
			
		}
		
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
		valorLogico2 = especial2.nextByte();
		while((valorLogico2!=1)&&(valorLogico2!=0)) {//solicite o dado sobre a conta ser especial ou não, enquanto o usuário não digitar um valor válido
			
			System.out.println("Informe um valor válido (1 ou 0): ");
			valorLogico2 = especial2.nextByte();
			
		}
		
		System.out.println();//quebra de linha para organização dos dados mostrados no terminal
		
		if(valorLogico1==1) {//se a conta do primeiro correntista for especial
			
			contaEspecial1 = true;//a variável contaEspecial1 = true
			
		}
		else {//senão
			
			contaEspecial1 = false;//a variável contaEspecial1 = false
			
		}
		
		if(valorLogico2==1) {//se a conta do segundo correntista for especial
			
			contaEspecial2 = true;//a variável contaEspecial2 = true
			
		}
		else {//senão
			
			contaEspecial2 = false;//a variável contaEspecial2 = false
			
		}
		
		//declaramos três referências à instâncias da classe ContaBancariaSimplificada
		ContaBancariaSimplificada cliente1 = new ContaBancariaSimplificada();
		ContaBancariaSimplificada cliente2 = new ContaBancariaSimplificada();
		ContaBancariaSimplificada cliente3 = new ContaBancariaSimplificada();
		
		//inicializamos duas referências com dados fornecidos pelo usuário e uma diretamente
		cliente1.abreConta(nomeCorrentista1,saldoCorrentista1,contaEspecial1);
		cliente2.abreConta(nomeCorrentista2,saldoCorrentista2,contaEspecial2);
		cliente3.abreContaSimples((String)"Lucas Fernando da Silva");
		
		//verificamos se as contas fornecidas pelo usuário são iguais
		if(cliente1.éIgual(cliente2)==true) {//se as contas forem iguais
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" são a mesma pessoa!");//imprime: as pessoas são iguais!
			
		}
		else {//senão
			
			System.out.println("Os clientes "+nomeCorrentista1+" e "+nomeCorrentista2+" são pessoas diferentes!");//imprime: as pessoas são diferentes!
			
		}
		
		//transferência de valor do primeiro correntista informado para o segundo
		cliente1.transferenciaEntreContas(cliente2);
		
		//através do método mostraDados da classe ContaBancariaSimplificada mostramos os dados das três contas correntes informadas formatados
		cliente1.mostraDados();
		System.out.println();
		cliente2.mostraDados();
		System.out.println();
		System.out.println(cliente3);
		
	}//fim do método main
		
}//fim da classe PrincipalContaBancaria
