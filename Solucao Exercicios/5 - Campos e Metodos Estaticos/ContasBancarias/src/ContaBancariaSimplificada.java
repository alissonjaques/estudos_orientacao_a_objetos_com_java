/**
 * A classe ContaBancariaSimplifica representa uma conta corrente simplificada.
 * @author Alisson Jaques 
 * 
 * */
import java.util.Scanner;//importa��o do pacote util para utiliza��o da classe Scanner

public class ContaBancariaSimplificada {//declara��o da classe

	/**
	 * declara��o dos campos da classe 
	 * 
	 * */
	private String nomeDoCorrentista; 						// nome do correntista
	private double saldo;									// saldo atual
	private boolean conta�Especial;							// modalidade da conta
	private int numeroDaConta;								// n�mero da conta
	static private int ordemConta = 0;						// quantidade de contas cadastradas
	
	/** O construtor para a classe ContaBancariaSimplifica que recebe valores referentes aos campos da classe e os atribui aos mesmos.
	 *  @param umNome o nome do correntista
	 *  @param umSaldo o saldo inicial
	 *  @param especial um valor booleano que representa se a conta � ou n�o especial 
	 * 
	 * */
	ContaBancariaSimplificada(String umNome, double umSaldo, boolean especial){
		
		nomeDoCorrentista = umNome;
		ordemConta = ordemConta + 1;
		
		if(nomeDoCorrentista=="") { // se for criado um objeto  default da classe
			
			numeroDaConta = 0;				// o n�mero da conta ter� o valor 0
			ordemConta = ordemConta - 1;    // o contador de contas cadastradas n�o ir� contar
			
		}
		else { // sen�o
			
			numeroDaConta = ordemConta;     // o n�mero da conta � registrado
			
		} // fim-se
		
		saldo = umSaldo;
		conta�Especial = especial;		
		
	} // fim do construtor com todos os argumentos
		
	/**
	 *  O construtor para a classe ContaBancariaSimplificada que recebe como �nico argumento uma string que representa o nome do correntista.
	 *  E inicializa os campos da classe com esse nome passado como argumento, o saldo com o valor constante 0 e caracter�stica da conta como n�o especial (false).
	 *  Utilizando a chamada ao construtor com todos argumentos.
	 * 	@param umNome o nome do correntista 
	 * 
	 * */
	ContaBancariaSimplificada(String umNome){
		
		this(umNome,(double)0.0,(boolean)false);
		
	} // fim do construtor com apenas o argumento string
	
	/**
	 *  O construtor default para a classe ContaBancariaSimplificada que n�o recebe nenhum argumento e inicializa os campos da classe com valores
	 *  default (nomeDoCorrentista = string vazia, saldo = 0.0, conta�Especial = false), chamando os construtores em cascata.
	 * 
	 * */
	ContaBancariaSimplificada(){
		
		this("");
				
	} // fim do construtor default
	
	/**
	 * 	O m�todo quantidadeDeContasCadastradas n�o possu�
	 * 	argumentos e retorna a quantidade de contas criadas
	 *  por uma classe (ou objeto) usu�ria. Este m�todo � 
	 *  est�tico, podendo ser chamado sem a necessidade de
	 *  cria��o de inst�ncias da classe ContaBancariaSimplificada. 
	 * 	@param ordemConta um valor inteiro correspondente ao n�mero
	 *  de objetos criados da classe ContaBancariaSimplificada
	 * 
	 * */
	public static int quantidadeDeContasCadastradas() {
		
		
		return ordemConta;
		
	} // fim do m�todo quantidadeDeContasCadastradas
		
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
			
			System.out.println("Transa��o n�o pod� ser efetivada, pois n�o h� saldo suficiente.\n");//informe ao usu�rio que ele n�o possu� saldo suficiente para a opera��o
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
			correntista = "O nome do correntista �: "+nomeDoCorrentista+"\n"+"N�mero da conta: "+numeroDaConta+"\n"+"Saldo dispon�vel: "+saldo+"\n"+"A conta � especial";
			
			return correntista;//retorna a string com os campos do objeto formatados
			
		}
		else {//sen�o
			
			//a ref�rencia auxiliar recebe os campos do objeto formatados
			correntista = "O nome do correntista �: "+nomeDoCorrentista+"\n"+"N�mero da conta: "+numeroDaConta+"\n"+"Saldo dispon�vel: "+saldo+"\n"+"A conta � comum";
			
			return correntista;//retorna a string com os campos do objeto formatados
	
		}
				
	}//fim do m�todo toString
	
	/**
	 * O m�todo mostraDados n�o possu� argumentos, quando chamado imprime os campos da inst�ncia formatados.
	 *  
	 * */
	public void mostraDados() {
		
		System.out.println("O nome do correntista �: "+nomeDoCorrentista);//imprime o nome do correntista
		System.out.println("N�mero da conta: "+numeroDaConta);
		System.out.println("Saldo dispon�vel: "+saldo);//imprime o saldo atual
		if(conta�Especial==true) {//se a conta for especial
			
			System.out.println("A conta � especial.");//informe que a conta � especial
			
		}
		else {//sen�o
			
			System.out.println("A conta � comum.");//informe que a conta � comum
	
		}
				
	}//fim do m�todo mostraDados
	
}//fim da classe contaBancariaSimplificada