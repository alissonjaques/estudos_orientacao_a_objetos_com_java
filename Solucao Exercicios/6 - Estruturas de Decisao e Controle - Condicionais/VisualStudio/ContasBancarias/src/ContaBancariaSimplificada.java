/**
 * A classe ContaBancariaSimplifica representa uma conta corrente simplificada.
 * @author Alisson Jaques 
 * 
 * */
import java.util.Scanner;//importação do pacote util para utilização da classe Scanner

public class ContaBancariaSimplificada {//declaração da classe

	/**
	 * declaração dos campos da classe 
	 * 
	 * */
	private String nomeDoCorrentista; 						// nome do correntista
	private double saldo;									// saldo atual
	private boolean contaÉEspecial;							// modalidade da conta
	private int numeroDaConta;								// número da conta
	static private int ordemConta = 0;						// quantidade de contas cadastradas
	
	/** O construtor para a classe ContaBancariaSimplifica que recebe valores referentes aos campos da classe e os atribui aos mesmos.
	 *  @param umNome o nome do correntista
	 *  @param umSaldo o saldo inicial
	 *  @param especial um valor booleano que representa se a conta é ou não especial 
	 * 
	 * */
	ContaBancariaSimplificada(String umNome, double umSaldo, boolean especial){
		
		nomeDoCorrentista = umNome;
		ordemConta = ordemConta + 1;
		
		if(nomeDoCorrentista=="") { // se for criado um objeto  default da classe
			
			numeroDaConta = 0;				// o número da conta terá o valor 0
			ordemConta = ordemConta - 1;    // o contador de contas cadastradas não irá contar
			
		}
		else { // senão
			
			numeroDaConta = ordemConta;     // o número da conta é registrado
			
		} // fim-se
		
		saldo = umSaldo;
		contaÉEspecial = especial;		
		
	} // fim do construtor com todos os argumentos
		
	/**
	 *  O construtor para a classe ContaBancariaSimplificada que recebe como único argumento uma string que representa o nome do correntista.
	 *  E inicializa os campos da classe com esse nome passado como argumento, o saldo com o valor constante 0 e característica da conta como não especial (false).
	 *  Utilizando a chamada ao construtor com todos argumentos.
	 * 	@param umNome o nome do correntista 
	 * 
	 * */
	ContaBancariaSimplificada(String umNome){
		
		this(umNome,(double)0.0,(boolean)false);
		
	} // fim do construtor com apenas o argumento string
	
	/**
	 *  O construtor default para a classe ContaBancariaSimplificada que não recebe nenhum argumento e inicializa os campos da classe com valores
	 *  default (nomeDoCorrentista = string vazia, saldo = 0.0, contaÉEspecial = false), chamando os construtores em cascata.
	 * 
	 * */
	ContaBancariaSimplificada(){
		
		this("");
				
	} // fim do construtor default
	
	/**
	 * 	O método quantidadeDeContasCadastradas não possuí
	 * 	argumentos e retorna a quantidade de contas criadas
	 *  por uma classe (ou objeto) usuária. Este método é 
	 *  estático, podendo ser chamado sem a necessidade de
	 *  criação de instâncias da classe ContaBancariaSimplificada. 
	 * 	@param ordemConta um valor inteiro correspondente ao número
	 *  de objetos criados da classe ContaBancariaSimplificada
	 * 
	 * */
	public static int quantidadeDeContasCadastradas() {
		
		
		return ordemConta;
		
	} // fim do método quantidadeDeContasCadastradas
		
	/**
	 * O método deposita recebe como parâmetro um valor e o deposita na conta de um correntista.
	 * @param valor o valor do depósito
	 * 
	 * */
	public void deposita(double valor) {
		
		saldo  = saldo + valor;
		
	}//fim do método deposita
	
	/**
	 * O metódo saca recebe como parâmetro um valor e pode retirar esse valor da conta do correntista (se tiver saldo)
	 * ou imprimir uma mensagem de que não é possível sacar (se não tiver saldo).
	 * @param valor o valor do saque
	 * 
	 * */
	public void saca(double valor) {
		
		if(contaÉEspecial==false) {//se a conta não for especial
			
			if(valor <= saldo) {//se o saldo for suficiente
				
				saldo = saldo - valor; //saque o valor da conta do correntista
				
			}
			else{//senão
				
				System.out.println("Operação não realizada! Saldo insuficiente.");//informe que não é possível fazer o saque
				
			}
			
		}
		else {//se a conta for especial
			
			saldo = saldo - valor;//saque o valor da conta do correntista
            
            if(saldo<-1000.0){

                saldo += valor;
                System.out.println("Não foi possível efetuar o saque, valor de débito ultrapassaria o limite permitido.");

            }
			
		}
				
	}//fim do método saca
	
	/**
	 * 	 * O método éIgual recebe como argumento uma instância da própria classe ContaBancariaSimplificada e verifica se a conta atual é igual à conta passada como parâmetro.
	 * @param outraConta um instância da própria classe ContaBancariaSimplificada
	 * @return true se as contas forem iguais
	 * 		   false caso contrário
	 * 
	 * */
	public boolean éIgual(ContaBancariaSimplificada outraConta) {
		
		if((nomeDoCorrentista==outraConta.nomeDoCorrentista)&&(saldo==outraConta.saldo)&&(contaÉEspecial==outraConta.contaÉEspecial)) {//se as conta forem iguais
			
			return true;//retorne são iguais
			
		}
		else {//senão
			
			return false;//retorne são diferentes
			
		}
	}//fim do método éIgual
	
	/**
	 * O método transferenciaEntreContas recebe como argumento uma instância da própria classe ContaBancária Simplifica e transfere um valor informado pela usuário da instância atual
	 * para a conta do correntista passada como argumento.
	 * @param umaConta uma instância da própria classe ContaBancariaSimplifica
	 * 	 * 
	 * */
	public void transferenciaEntreContas(ContaBancariaSimplificada umaConta) {
		
		//declaração de variável auxiliar
		double valorTransferencia;
		
		//solicitamos ao correntista que informe o valor a ser transferido de sua conta e armazenamos esse valor na variável auxiliar
		System.out.println("Informe o valor a ser trânsferido: ");
		Scanner valorInformado = new Scanner(System.in);
		valorTransferencia = valorInformado.nextDouble();
        valorInformado.close();
		
		if(valorTransferencia>saldo) {//se o valor da transferência for maior do que o valor do saldo
			
            if(saldo>=0){ // se o saldo for positivo
                
                if(contaÉEspecial==false){ // se a conta não for especial
                
                    System.out.println("Transação não podê ser efetivada, pois não há saldo suficiente.\n"); //informe ao usuário que ele não possuí saldo suficiente para a operação
                
                }
                else{ // se a conta for especial

                    if(valorTransferencia>saldo+1000.0){ // se o valor da transferência ultrapassar o valor permitido

                        System.out.println("Transação não podê ser efetivada, pois não há saldo suficiente.\n"); // informe ao usuário que ele não possuí saldo suficiente para a operação

                    }
                    else{ // senão

                        saca(valorTransferencia); //saque o valor informado da conta do usuário
                        umaConta.deposita(valorTransferencia); //trânsfira para a conta passada como argumento
                    
                    } // fim-se

                } // fim-se
            }
            else{ // se saldo for negativo

                if((saldo-valorTransferencia<-1000.0) || (contaÉEspecial == false)){ // se a conta não for especial ou o valor da transferência ultrapassar
                                                                                     // o débito permitido
                
                    System.out.println("Não foi possível efetuar o saque, valor de débito ultrapassaria o limite permitido."); // informa a impossibilidade de efetuar a transferência
                
                }
                else{ // senão
                    
                    saca(valorTransferencia);//saque o valor informado da conta do usuário
                    umaConta.deposita(valorTransferencia);//trânsfira para a conta passada como argumento
                
                }

            } // fim-se
        }
		else {//senão
                
            saca(valorTransferencia);//saque o valor informado da conta do usuário
            umaConta.deposita(valorTransferencia);//trânsfira para a conta passada como argumento			
		
		} // fim-se
		
	}//fim do método transferenciaEntreContas
	
	/**
	 * O método toString não possuí argumentos, quando chamado retorna uma string contendo os campos da instância formatados.
	 *  
	 * */
	public String toString() {
		
		String correntista;//declaração de referencia auxiliar
		
		if(contaÉEspecial==true) {//se a conta for especial
			
			//a refêrencia auxiliar recebe os campos do objeto formatados
			correntista = "O nome do correntista é: "+nomeDoCorrentista+"\n"+"Número da conta: "+numeroDaConta+"\n"+"Saldo disponível: "+saldo+"\n"+"A conta é especial";
			
			return correntista;//retorna a string com os campos do objeto formatados
			
		}
		else {//senão
			
			//a refêrencia auxiliar recebe os campos do objeto formatados
			correntista = "O nome do correntista é: "+nomeDoCorrentista+"\n"+"Número da conta: "+numeroDaConta+"\n"+"Saldo disponível: "+saldo+"\n"+"A conta é comum";
			
			return correntista;//retorna a string com os campos do objeto formatados
	
		}
				
	}//fim do método toString
	
	/**
	 * O método mostraDados não possuí argumentos, quando chamado imprime os campos da instância formatados.
	 *  
	 * */
	public void mostraDados() {
		
		System.out.println("O nome do correntista é: "+nomeDoCorrentista);//imprime o nome do correntista
		System.out.println("Número da conta: "+numeroDaConta);
		System.out.println("Saldo disponível: "+saldo);//imprime o saldo atual
		if(contaÉEspecial==true) {//se a conta for especial
			
			System.out.println("A conta é especial.");//informe que a conta é especial
			
		}
		else {//senão
			
			System.out.println("A conta é comum.");//informe que a conta é comum
	
		}
				
	}//fim do método mostraDados
	
}//fim da classe contaBancariaSimplificada