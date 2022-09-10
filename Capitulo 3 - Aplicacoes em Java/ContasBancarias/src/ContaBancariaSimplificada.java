/**
 * A classe ContaBancariaSimplifica representa uma conta corrente simplificada.
 * @author Alisson Jaques 
 * 
 * */
import java.util.Scanner;//importa��o do pacote util para utiliza��o da classe Scanner

public class ContaBancariaSimplificada {//declara��o da classe

	//declara��o dos campos da classe
	private String nomeDoCorrentista;
	private double saldo;
	private boolean conta�Especial;
	
	/**
	 * O m�todo abreConta recebe como par�metro valores correspondentes aos campos da classe e inicializa os mesmos.
	 * @param nome o nome do titular da conta
	 * @param deposito o valor de dep�sito inicial
	 * @param especial um valor booleano que representa se a conta � especial ou n�o
	 * 
	 * */
	public void abreConta(String nome, double deposito, boolean especial) {
		
		nomeDoCorrentista = nome;
		saldo = deposito;
		conta�Especial = especial;
		
	}//fim do m�todo abreConta
	
	/**
	 * O m�todo abreContaSimples recebe como argumento o nome do cliente e vai abrir para o mesmo uma conta simples. Esta conta n�o tem dep�sito inicial e n�o � especial.
	 * @param nome o nome do titular da conta 
	 * 
	 * */
	public void abreContaSimples(String nome) {
		
		nomeDoCorrentista = nome;
		saldo = 0.00;
		conta�Especial = false;
		
	}//fim do m�todo abreContaSimples
		
	/**
	 * O m�todo deposita recebe como par�metro um valor e o deposita na conta de um correntista.
	 * @param valor o valor do dep�sito
	 * 
	 * */
	public void deposita(double valor) {
		
		saldo  = saldo + valor;
		
	}//fim do m�todo deposita
	
	/**
	 * O met�do saca recebe como par�metro um valor e pode retirar esse valor da conta do correntista (se tiver saldo)
	 * ou imprimir uma mensagem de que n�o � poss�vel sacar (se n�o tiver saldo).
	 * @param valor o valor do saque
	 * 
	 * */
	public void saca(double valor) {
		
		if(conta�Especial==false) {//se a conta n�o for especial
			
			if(valor <= saldo) {//se o saldo for suficiente
				
				saldo = saldo - valor; //saque o valor da conta do correntista
				
			}
			else{//sen�o
				
				System.out.println("Opera��o n�o realizada! Saldo insuficiente.");//informe que n�o � poss�vel fazer o saque
				
			}
			
		}
		else {//se a conta for especial
			
			saldo = saldo - valor;//saque o valor da conta do correntista
			
		}
				
	}//fim do m�todo saca
	
	/**
	 * 	 * O m�todo �Igual recebe como argumento uma inst�ncia da pr�pria classe ContaBancariaSimplificada e verifica se a conta atual � igual � conta passada como par�metro.
	 * @param outraConta um inst�ncia da pr�pria classe ContaBancariaSimplificada
	 * @return true se as contas forem iguais
	 * 		   false caso contr�rio
	 * 
	 * */
	public boolean �Igual(ContaBancariaSimplificada outraConta) {
		
		if((nomeDoCorrentista==outraConta.nomeDoCorrentista)&&(saldo==outraConta.saldo)&&(conta�Especial==outraConta.conta�Especial)) {//se as conta forem iguais
			
			return true;//retorne s�o iguais
			
		}
		else {//sen�o
			
			return false;//retorne s�o diferentes
			
		}
	}//fim do m�todo �Igual
	
	/**
	 * O m�todo transferenciaEntreContas recebe como argumento uma inst�ncia da pr�pria classe ContaBanc�ria Simplifica e transfere um valor informado pela usu�rio da inst�ncia atual
	 * para a conta do correntista passada como argumento.
	 * @param umaConta uma inst�ncia da pr�pria classe ContaBancariaSimplifica
	 * 	 * 
	 * */
	public void transferenciaEntreContas(ContaBancariaSimplificada umaConta) {
		
		//declara��o de vari�vel auxiliar
		double valorTransferencia;
		
		//solicitamos ao correntista que informe o valor a ser transferido de sua conta e armazenamos esse valor na vari�vel auxiliar
		System.out.println("Informe o valor a ser tr�nsferido: ");
		Scanner valorInformado = new Scanner(System.in);
		valorTransferencia = valorInformado.nextDouble();
		
		if(valorTransferencia>saldo) {//se o valor da transfer�ncia for maior do que o valor do saldo
			
			System.out.println("Transa��o n�o pod� ser efetivada, pois n�o h� saldo suficiente.");//informe ao usu�rio que ele n�o possu� saldo suficiente para a opera��o
		}
		else {//sen�o
		
			saca(valorTransferencia);//saque o valor informado da conta do usu�rio
			umaConta.deposita(valorTransferencia);//tr�nsfira para a conta passada como argumento
		
		}
		
	}//fim do m�todo transferenciaEntreContas
	
	/**
	 * O m�todo toString n�o possu� argumentos, quando chamado retorna uma string contendo os campos da inst�ncia formatados.
	 *  
	 * */
	public String toString() {
		
		String correntista;//declara��o de referencia auxiliar
		
		if(conta�Especial==true) {//se a conta for especial
			
			//a ref�rencia auxiliar recebe os campos do objeto formatados
			correntista = "O nome do correntista �: "+nomeDoCorrentista+"\n"+"Saldo dispon�vel: "+saldo+"\n"+"A conta � especial";
			
			return correntista;//retorna a string com os campos do objeto formatados
			
		}
		else {//sen�o
			
			//a ref�rencia auxiliar recebe os campos do objeto formatados
			correntista = "O nome do correntista �: "+nomeDoCorrentista+"\n"+"Saldo dispon�vel: "+saldo+"\n"+"A conta � comum";
			
			return correntista;//retorna a string com os campos do objeto formatados
	
		}
				
	}//fim do m�todo toString
	
	/**
	 * O m�todo mostraDados n�o possu� argumentos, quando chamado imprime os campos da inst�ncia formatados.
	 *  
	 * */
	public void mostraDados() {
		
		System.out.println("O nome do correntista �: "+nomeDoCorrentista);//imprime o nome do correntista
		System.out.println("Saldo dispon�vel: "+saldo);//imprime o saldo atual
		if(conta�Especial==true) {//se a conta for especial
			
			System.out.println("A conta � especial.");//informe que a conta � especial
			
		}
		else {//sen�o
			
			System.out.println("A conta � comum.");//informe que a conta � comum
	
		}
				
	}//fim do m�todo mostraDados
	
}//fim da classe contaBancariaSimplificada
