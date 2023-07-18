package main;

import classes.Agenda;  // importação da classe Agenda
import classes.Contato; // importação da classe Contato
import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

/**
 * A classe AgendaTelefonica representa uma aplicação que permite criar agendas telônicas e cadastrar 
 * contatos na mesma. O número máximo de agendas paralelas permitidas é 10 e cada agenda pode ter no máximo
 * 30 contatos.
 * @author Alisson Jaques
 */
public class AgendaTelefonica { // deckara a classe
    /**
     * O método cadastrarAgenda é uma sub-rotina para o método main. Este método
     * permite o cadastro de agendas e o preenchimento de contatos nas agendas.
     * @return uma lista de agendas cadastradas
     */
    public static Agenda[] cadastrarAgenda(){
        Agenda agendas[];   // a lista de agendas para retorno
        Contato contatos[]; // a lista de contato para cada agenda
        byte escolha;       // a escolha do usuário
        Scanner scan = new Scanner(System.in); // scan é um objeto da classe Scanner
        
        System.out.println("**************************  Cadastro de Agendas *******************************");
        System.out.print("\nInforme o número de agendas a serem cadastradas (valor máximo permitido é 10): ");
        escolha = scan.nextByte();
        while(escolha>10 || escolha<1){ // enquanto o número de agendas for inválido, faça:
            System.out.println("Quantidade não permitida. Por favor insira um valor inteiro entre 1 e 10, incluindo estes: ");
            escolha = scan.nextByte();
        }
        
        agendas = new Agenda[escolha]; // o número de agendas que o usuário irá cadastrar

        for(int i=0; i<agendas.length; i++){ // enquanto não cadastrar todas as agendas, faça:
            Agenda agenda = new Agenda();
            scan = new Scanner(System.in,"ISO-8859-1");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("\nInforme o nome da agenda: ");
            agenda.setNome(scan.nextLine());
            System.out.print("Informe a quantidade de contatos da agenda "+ agenda.getNome() + " (valor máximo permitido é 30): ");
            scan.reset();            
            escolha = scan.nextByte();
            while(escolha>30 || escolha<1){ // enquanto a quantidade de contatos for inválida, faça:
                System.out.print("Quantidade não permitida. Por favor insira um valor inteiro entre 1 e 30, incluindo estes: ");
                escolha = scan.nextByte();
            }
            
            System.out.println("\n*************************  Cadastro de Contatos *******************************");
            contatos = new Contato[escolha];
            for(int j=0; j<contatos.length; j++){ // enquanto não cadastrar todos os contatos da agenda, faça:
                Contato contato = cadastrarContato();
                contatos[j] = contato;
            }
            System.out.println();
            agenda.setContatos(contatos); // atualiza os contatos da agenda
            agendas[i] = agenda; // preenche o vetor de agendas
        }
        
        return agendas; // retorna o vetor de agendas
    } // fim do método cadastrarAgenda
    
    /**
     * O método cadastrarContato é uma sub-rotina para o método cadastrarAgenda.
     * Ele permite o cadastro de um contato e o retorna, quando chamado.
     * @return o contato cadastrado
     */
    public static Contato cadastrarContato(){
        Contato contato = new Contato();        
        Scanner scan = new Scanner(System.in,"ISO-8859-1");

        System.out.print("\nInforme o nome: ");
        contato.setNome(scan.nextLine());
        System.out.print("Informe o telefone: ");
        contato.setTelefone(scan.nextLine());
        System.out.print("Informe o endereço: ");
        contato.setEndereco(scan.nextLine());
        System.out.print("Informe o e-mail: ");
        contato.setEmail(scan.nextLine());
        
        return contato;
    } // fim do método cadastrarContato
    
    /**
     * O método main permite a execução dessa classe. Ele representa um programa de computador que 
     * permite o cadastro de agendas telefônicas, bem como o preenchimento de contatos nas mesmas.
     * Ele faz uso da sub-rotina cadastrarAgenda, para realizar parte de suas instruções.
     * @param args os argumentos que podem ser passados ao método, via linha de comando, mas que neste
     * caso serão ignorados.
     */
    public static void main(String[] args){
        Agenda agendas[];
               
        System.out.println("***************************  Agenda Telefônica ********************************");
        System.out.println("===============================================================================");
        agendas = cadastrarAgenda();
        System.out.println("**************************  Agendas Cadastradas *******************************\n");
        for(int i=0; i<agendas.length;i++){ // enquanto não percorrer todo o vetor de agendas, faça:
            System.out.print(agendas[i].toString());    
        }
        System.out.println("===============================================================================");
        System.out.println("***************************  Programa Encerrado *******************************");                
    } // fim do método main
} // fim da classe AgendaTelefonica