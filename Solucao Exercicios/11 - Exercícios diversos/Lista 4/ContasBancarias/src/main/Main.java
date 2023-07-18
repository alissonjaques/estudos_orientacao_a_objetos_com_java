package main;

import classes.ContaCorrente;           // importação da classe ContaCorrente
import classes.ContaCorrenteEspecial;   // importação da classe ContaCorrenteEspecial
import classes.ContaPoupanca;           // importação da classe ContaPoupanca
import java.util.Scanner;               // importação da classe Scanner, para manipular dados informados no teclado

/**
 * A classe Main representa um programa de computador que permite o cadastrado e operações
 * de contas bancárias.
 * @author Alisson Jaques
 */
public class Main { // declara a classe
    
    /**
     * O método cadastrarContaCorrente realiza o cadastro de uma conta corrente e 
     * a retorna.
     * @return uma conta corrente cadastrada
     */
    public static ContaCorrente cadastrarContaCorrente(){
        /**
         * Declaração de variáveis auxiliares
         */
        int numeroDaConta;                                 // o númerdo da conta do correntista
        double saldo;                                      // o saldo inicial da conta
        String nome, cpf;                                  // o nome e o CPF do correntista
        ContaCorrente conta;                               // uma referência a uma instância da classe ContaCorrente       
        Scanner scan = new Scanner(System.in,"ISO-8859-1");// scan aponta para uma instância da classe Scanner 
        
        System.out.println("*********************** Cadastro de Conta Corrente ***************************\n");
        // solicita os dados do correntista e inicializa as variáveis correspondentes, com os mesmos
        System.out.print("Entre com o nome: ");
        nome = scan.nextLine();
        System.out.print("Entre com o CPF: ");
        cpf = scan.nextLine();
        scan.reset();
        System.out.print("Entre com o número da conta: ");
        numeroDaConta = scan.nextInt();
        scan.reset();
        System.out.print("Entre com o saldo inicial: ");
        saldo = scan.nextDouble();
        System.out.println("\n******************************************************************************");
        conta = new ContaCorrente(nome,cpf,numeroDaConta,saldo); // conta aponta para um objeto da classe ContaCorrente (criado com os dados informados)
        return conta; // retorna a conta corrente cadastrada
    } // fim do método cadastrarContaCorrente
    
    /**
     * O método cadastrarContaPoupanca realiza o cadastro de uma conta poupança e
     * a retorna.
     * @return uma conta poupança cadastrada
     */
    public static ContaPoupanca cadastrarContaPoupanca(){
        /**
         * Declaração de variáveis auxiliares
         */
        int numeroDaConta;                                 // o número da conta do poupador
        double saldo;                                      // o saldo inicial do poupador
        String nome, cpf;                                  // o nome e o CPF do poupador
        ContaPoupanca conta;                               // uma referência a uma instância da classe ContaPoupanca  
        Scanner scan = new Scanner(System.in,"ISO-8859-1");// scan aponta para uma instância da classe Scanner
        
        System.out.println("*********************** Cadastro de Conta Poupança ***************************\n");
        // solicita os dados do correntista e inicializa as variáveis correspondentes, com os mesmos
        System.out.print("Entre com o nome: ");
        nome = scan.nextLine();
        System.out.print("Entre com o CPF: ");
        cpf = scan.nextLine();
        scan.reset();
        System.out.print("Entre com o número da conta: ");
        numeroDaConta = scan.nextInt();
        scan.reset();
        System.out.print("Entre com o saldo inicial: ");
        saldo = scan.nextDouble();        
        System.out.println("\n******************************************************************************");
        conta = new ContaPoupanca(nome,cpf,numeroDaConta,saldo); // conta aponta para um objeto da classe ContaPoupanca (criado com os dados informados)
        return conta; // retorna a conta poupança cadastrada
    } // fim do método cadastrarContaPoupanca
    
    /**
     * O método cadastrarContaCorrenteEspecial realiza o cadastro de uma conta 
     * corrente especial e a retorna.
     * @return uma conta poupança cadastrada
     */
    public static ContaCorrenteEspecial cadastrarContaCorrenteEspecial(){
        /**
         * Declaração de variáveis auxiliares
         */
        int numeroDaConta;                                  // o númerdo da conta do correntista
        double saldo;                                       // o saldo inicial da conta
        String nome, cpf;                                   // o nome e o CPF do correntista
        ContaCorrenteEspecial conta;                        // uma referência a uma instância da classe ContaCorrenteEspecial  
        Scanner scan = new Scanner(System.in,"ISO-8859-1"); // scan aponta para uma instância da classe Scanner
        
        System.out.println("******************* Cadastro de Conta Corrente Especial **********************\n");
        // solicita os dados do correntista e inicializa as variáveis correspondentes, com os mesmos
        System.out.print("Entre com o nome: ");
        nome = scan.nextLine();
        System.out.print("Entre com o CPF: ");
        cpf = scan.nextLine();
        scan.reset();
        System.out.print("Entre com o número da conta: ");
        numeroDaConta = scan.nextInt();
        scan.reset();
        System.out.print("Entre com o saldo inicial: ");
        saldo = scan.nextDouble();
        System.out.println("\n******************************************************************************");        
        conta = new ContaCorrenteEspecial(nome,cpf,numeroDaConta,saldo); // conta aponta para um objeto da classe ContaCorrenteEspecial (criado com os dados informados)
        return conta; // retorna a conta correntes especial cadastrada
    } // fim do método cadastrarContaCorrenteEspecial
    
    /**
     * O método main permite a execução dessa classe e fornece exemplos de usos das classes
     * ContaCorrente, ContaCorrenteEspecial e ContaPoupanca.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando,
     * mas que neste caso serão ignorados
     */
    public static void main(String[] argumentos){
        /**
         * Declaração de referências e variáveis auxiliares
         */
        ContaCorrente correntista;                 // uma conta corrente
        ContaCorrenteEspecial correntistaEspecial; // uma conta correnteEspecial
        ContaPoupanca poupador;                    // uma conta poupança
        Scanner scan = new Scanner(System.in);     // um objeto da classe Scanner
        byte escolha;                              // a escolha do usuário
        boolean controlador = true;                // um botão controlador de laço
        double valor;                              // valor para depósito e saque
        
        System.out.println("**************************** Contas Bancárias ********************************");
        System.out.println("==============================================================================\n");
        
        System.out.println("****************************  Menu Principal *********************************\n");
        // solicita ao usuário a escolha de um cadastro (conta corrente, conta poupança ou conta corrente especial) ou o encerramento da aplicação
        System.out.println("Escolha uma das seguintes opções: \n1 - Cadastrar Conta Corrente\n2 - Cadastrar Conta Corrente Especial\n3 - Cadastrar Conta Poupança\n4 - Sair");
        System.out.print("Digite aqui sua escolha: ");
        escolha = scan.nextByte();
        System.out.println(); // quebra de linha, para organização dos dados no terminal
        while(escolha!=1 && escolha!=2 && escolha!=3 && escolha!=4){ // emquanto a escolha for inválida, faça:
            System.out.print("Opção inválida! Por favor, forneça uma opção válida (1,2,3 ou 4): ");
            escolha = scan.nextByte();
        }
        
        switch(escolha){// caso escolha seja:
            case 1: // cadastrar conta corrente, faça:
                correntista = cadastrarContaCorrente(); // inicia o cadastro de um novo correntista e inicializa o objeto com a conta corrente retornada
                
                do{ // faça:
                    System.out.println("**************************** Caixa Eletrônico ********************************\n");
                    // solicita ao usuário a escolha entre, sacar, depositar, consultar saldo, imprimir dados da conta ou sair
                    System.out.println("Escolha uma das seguintes opções: \n1 - Sacar\n2 - Depositar\n3 - Consultar Saldo\n4 - Imprimir Dados da Conta\n5 - Sair");
                    System.out.print("Digite aqui sua escolha: ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2 && escolha!=3 && escolha!=4 && escolha!=5){ // enquanto a escolha for inválida, faça:
                        System.out.print("Opção inválida! Por favor, forneça uma opção válida (1,2,3,4 ou 5): ");
                        escolha = scan.nextByte();
                    }
                    scan.reset(); // limpa o objeto scan
                    
                    switch(escolha){ // caso escolha seja:
                        case 1: // sacar, faça:
                            System.out.print("\nInforme o valor para saque: "); // solicita o valor para saque
                            valor = scan.nextDouble(); // guarda o valor informado na variável valor
                            correntista.sacar(valor); // saca o valor da conta (se for possível)
                            System.out.println();
                            break;
                        case 2: // depositar, faça:
                            System.out.print("\nInforme o valor para depósito: "); // solicita o valor para depósito
                            valor = scan.nextDouble();
                            correntista.depositar(valor); // deposita o valor da conta (se for possível)
                            System.out.println();
                            break;
                        case 3: // consultar saldo, faça:
                            System.out.println("\nSaldo disponível: R$" + correntista.consultaSaldo() +"\n"); // imprimi o saldo no terminal
                            break;
                        case 4: // imprimir dados da conta, faça:
                            System.out.println("\n***************************** Dados da Conta *********************************\n");
                            System.out.println(correntista); // imprimi as informações da conta, no terminal
                            System.out.println("******************************************************************************");
                            break;
                        case 5: // encerrar programa, faça:
                            System.out.println("**************************  Programa Encerrado *******************************");                
                            System.out.println("==============================================================================\n");
                            controlador = false;
                            break;                    
                    }
                }while(controlador); // enquanto controlador for true
                break;
            case 2: // cadastrar conta corrente especial, faça:
                correntistaEspecial = cadastrarContaCorrenteEspecial(); // inicia o cadastro de um novo correntista especial e inicializa o objeto com a conta corrente retornada
                
                do{ // faça:
                    System.out.println("**************************** Caixa Eletrônico ********************************\n");
                    // solicita ao usuário a escolha entre, sacar, depositar, consultar saldo, imprimir dados da conta ou sair
                    System.out.println("Escolha uma das seguintes opções: \n1 - Sacar\n2 - Depositar\n3 - Consultar Saldo\n4 - Imprimir Dados da Conta\n5 - Sair");
                    System.out.print("Digite aqui sua escolha: ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2 && escolha!=3 && escolha!=4 && escolha!=5){ // enquanto a escolha for inválida, faça:
                        System.out.print("Opção inválida! Por favor, forneça uma opção válida (1,2,3,4 ou 5): ");
                        escolha = scan.nextByte();
                    }
                    scan.reset();
                    
                    switch(escolha){ // caso escolha seja:
                        case 1: // sacar, faça:
                            System.out.print("\nInforme o valor para saque: "); // solicita o valor para saque
                            valor = scan.nextDouble();
                            correntistaEspecial.sacar(valor); // saca o valor do correntista especial (se for possível)
                            System.out.println();
                            break;
                        case 2: // depositar, faça:
                            System.out.print("\nInforme o valor para depósito: "); // solicita o valor para depósito
                            valor = scan.nextDouble();
                            correntistaEspecial.depositar(valor); // deposita o valor na conta do correntista especial
                            System.out.println();
                            break;
                        case 3: // consultar saldo, faça:
                            System.out.println("\nSaldo disponível: R$" + correntistaEspecial.consultaSaldo()+"\n"); // imprime o valor do saldo no terminal
                            break;
                        case 4: // imprimir dados da conta, faça:
                            System.out.println("\n***************************** Dados da Conta *********************************\n");
                            System.out.println(correntistaEspecial); // imprimi os dados da conta no terminal
                            System.out.println("******************************************************************************");                            
                            break;
                        case 5: // encerra programa, faça:
                            System.out.println("**************************  Programa Encerrado *******************************");                
                            System.out.println("==============================================================================\n");
                            controlador = false;
                            break;                    
                    }
                }while(controlador); // enquanto controlador for true
                break;
            case 3: // cadastrar conta poupança, faça:
                poupador = cadastrarContaPoupanca(); // inicia o cadastro de um novo poupador e inicializa o objeto com a conta poupança retornada
                
                do{
                    System.out.println("**************************** Caixa Eletrônico ********************************\n");
                    // solicita ao usuário a escolha entre, sacar, depositar, consultar saldo, imprimir dados da conta ou sair
                    System.out.println("Escolha uma das seguintes opções: \n1 - Sacar\n2 - Depositar\n3 - Consultar Saldo\n4 - Imprimir Dados da Conta\n5 - Sair");
                    System.out.print("Digite aqui sua escolha: ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2 && escolha!=3 && escolha!=4 && escolha!=5){ // enquanto a escolha for inválida, faça:
                        System.out.print("Opção inválida! Por favor, forneça uma opção válida (1,2,3,4 ou 5): ");
                        escolha = scan.nextByte();
                    }
                    scan.reset();
                    
                    switch(escolha){ // caso escolha seja:
                        case 1: // sacar, faça:
                            System.out.print("\nInforme o valor para saque: "); // solicita o valor para saque
                            valor = scan.nextDouble();
                            poupador.sacar(valor); // saca o valor da conta do poupador (se for possível)
                            System.out.println();
                            break;
                        case 2: // depositar, faça:
                            System.out.print("\nInforme o valor para depósito: "); // solicita o valor para depósito
                            valor = scan.nextDouble();
                            poupador.depositar(valor); // deposita o valor na conta do poupador
                            System.out.println();
                            break;
                        case 3: // consultar saldo, faça:
                            System.out.println("\nSaldo disponível: R$" + poupador.consultaSaldo()+"\n"); // imprimi no terminal o saldo do poupador
                            break;
                        case 4: // imprimir dados da conta, faça:
                            System.out.println("\n***************************** Dados da Conta *********************************\n");
                            System.out.println(poupador); // imprimi os dados da conta, no terminal
                            System.out.println("******************************************************************************");
                            break;
                        case 5: // encerrar programa, faça:
                            boolean opcao;
                            System.out.print("\nA poupança fez aniversário? Informe true para sim ou false para não: "); // pergunta ao usuario se a poupança fez aniversário
                            opcao = scan.nextBoolean();
                            if(opcao){ // se a poupança fazer aniversário, faça:
                                poupador.fazAniversario(opcao); // chama o método faz aniversário
                                System.out.println("Saldo atualizado com a bonificação: R$" + poupador.consultaSaldo()); // informa o saldo, atualizado com a bonificação
                            }
                            System.out.println("**************************  Programa Encerrado *******************************");                
                            System.out.println("==============================================================================\n");
                            controlador = false;
                            break;                    
                    }
                }while(controlador); // enquanto controlador for true               
                break;
            case 4: // sair, faça:
                System.out.println("**************************  Programa Encerrado *******************************");                
                System.out.println("==============================================================================\n");
                break;
                
        } // fim do switch
    } // fim do método main
} // fim da classe Main
