package main;

import classes.Emprestimo;
import classes.Data;
import classes.Livro;
import classes.Pessoa;
import enums.StatusDoLivro;
import static enums.StatusDoLivro.DISPONÍVEL;
import java.util.Scanner;

/**
 *
 * @author Alisson Jaques
 */
public class Main {
    
    public static Livro[] cadastrarLivro(){
        System.out.println("************************* Cadastro de Livros ****************************");
        Livro livros[];
        int quantidade;
        Scanner scan = new Scanner(System.in);
        StatusDoLivro status = StatusDoLivro.DISPONÍVEL;
        
        System.out.print("Insira a quantidade de livros a serem cadastrados: ");
        quantidade = scan.nextInt();
        while(quantidade<0){
            System.out.print("Valor inválido, entre com um valor válido para a quantidade: ");
            quantidade = scan.nextInt();
        }
        if(quantidade==0){
            System.out.println("Nenhuma quantidade informada. Não serão registrados livros.");
            livros = new Livro[1];
            Livro livro = new Livro();
            livros[1] = livro;
            return livros;
        }
        else{
            livros = new Livro[quantidade];
            for(int i=0; i<livros.length; i++){
                Livro livro = new Livro();
                scan = new Scanner(System.in,"ISO-8859-1");                
                
                System.out.print("\nInforme o título: ");
                livro.setTitulo(scan.nextLine());
                System.out.print("Informe o autor: ");
                livro.setAutor(scan.nextLine());
                System.out.print("Informe o código de identificação: ");
                livro.setCodigoDeIdentificacao(scan.nextLine());
                scan.reset();
                System.out.print("Informe o ano de publicação: ");
                livro.setAnoDePublicacao(scan.nextInt());
                livro.setStatus(status);
                
                livros[i] = livro;
            }
            System.out.println("Livros cadastrados com sucesso!");
            return livros;
        }
    }
    
    public static Pessoa cadastrarPessoa(){
        Pessoa usuario = new Pessoa();
        Scanner scan = new Scanner(System.in,"ISO-8859-1");
        
        System.out.println("************************ Cadastro de Usuário ****************************");
        System.out.print("Informe seu nome: ");
        usuario.setNome(scan.nextLine());
        System.out.print("Informe seu CPF: ");
        usuario.setCpf(scan.nextLine());
        return usuario;
    }
    
    public static Livro consultaLivro(Livro[] livros, String titulo){
        Scanner scan = new Scanner(System.in,"ISO-8859-1");
        
        for (Livro livro : livros) {
            if(livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }        
        return null;    
    }
    
    public static void fazerEmprestimo(Livro[] livros, Pessoa pessoa){
        boolean controlador = true;
        byte escolha;
        String titulo;
        byte dia;
        byte mes;
        short ano;
        Data dataDoEmprestimo;
        Scanner scan = new Scanner(System.in);
        Emprestimo emprestimos[];
        
        System.out.println("Escolha uma das seguintes opções: ");
        System.out.println("1 - Fazer Empréstimo\n2 - Consultar Livro\n3 - Sair");
        System.out.print("Digite aqui sua escolha: ");
        escolha = scan.nextByte();
        while(escolha!=1 && escolha!=2 && escolha!=3){
            System.out.println("Opção inválida! Por favor, insira uma opção válida (1, 2 ou 3): ");
            escolha = scan.nextByte();
        }
        scan = new Scanner(System.in);
        if(escolha==1){
            System.out.println("******************  Solicitação de Empréstimos  *************************");
            scan = new Scanner(System.in, "ISO-8859-1");
            Emprestimo emprestimo = new Emprestimo();
            emprestimo.setPessoa(pessoa);
            System.out.println("Informe a data do emprestimo:");
            System.out.print("Dia: ");
            dia = scan.nextByte();
            System.out.print("Mês: ");
            mes = scan.nextByte();
            scan.reset();
            System.out.print("Ano: ");
            ano = scan.nextShort();
            dataDoEmprestimo = new Data(dia, mes, ano);
            emprestimo.setDataDoEmprestimo(dataDoEmprestimo);
            while(controlador){
                scan = new Scanner(System.in, "ISO-8859-1");
                System.out.print("Informe o título do livro, para pesquisa (para o sistema encontrar o livro, o título têm que ser exato): ");
                titulo = scan.nextLine();
                
                Livro livro = consultaLivro(livros, titulo);
                if (livro == null) {
                    System.out.println("Não foi possível fazer o empréstimo. Livro não encontrado no acervo.");
                } else if(livro.getStatus()==DISPONÍVEL){                    
                    System.out.println("\nLivro encontrado: ");
                    System.out.println(livro);
                    livro.setStatus(StatusDoLivro.EMPRESTADO);
                    System.out.println("Empréstimo realizado com sucesso!");
                    emprestimo.setIdDoEmprestimo(emprestimo.getIdDoEmprestimo() + 1);
                    emprestimo.setLivro(livro);
                    System.out.println("\n************************ Dados do Empréstimo ****************************");
                    System.out.println(emprestimo);
                }
                else{
                    System.out.println("Não foi possível fazer o empréstimo do livro. Livro já emprestado.");
                }
                
                System.out.print("Digite 1 (para fazer um novo empréstimo) ou 2 (para sair):");
                scan.reset();
                escolha = scan.nextByte();
                while(escolha!=1 && escolha!=2){
                   System.out.print("Opção inválida. Escolha 1 para um novo empréstimo ou 2 para sair: ");
                   escolha = scan.nextByte();
                }
                if(escolha==1){
                    controlador = true;
                }
                else{
                    controlador = false;
                }
            }
            System.out.println("=========================================================================");
            System.out.println("************************* Programa Encerrado ****************************");
        }     
        else if(escolha==2){
            while(controlador){
                System.out.println("************************ Consulta de Livros *****************************");
                System.out.print("Informe o título do livro, para pesquisa: ");
                titulo = scan.nextLine();

                if (consultaLivro(livros, titulo) == null) {
                    System.out.println("Livro não encontrado no acervo.");
                } else {
                    Livro livro = consultaLivro(livros, titulo);
                    System.out.println("\nLivro encontrado: ");
                    System.out.println(livro);
                }
                System.out.print("Digite 1, para fazer uma nova consulta ou 2, para sair: ");
                scan.reset();
                escolha = scan.nextByte();
                while(escolha!=1 && escolha!=2){
                   System.out.print("Opção inválida. Escolha 1 para uma nova consulta ou 2 para sair: ");
                   escolha = scan.nextByte();
                }
                scan = new Scanner(System.in,"ISO-8859-1");
                if(escolha==1){
                    controlador = true;
                }
                else{
                    controlador = false;
                }
            }
            
            System.out.println("=========================================================================");
            System.out.println("************************* Programa Encerrado ****************************");
        }
        else{
            System.out.println("=========================================================================");
            System.out.println("************************* Programa Encerrado ****************************");
        }
    }
    public static void main(String[] argumentos){
        System.out.println("************************* Empréstimo de Livros***************************");
        System.out.println("=========================================================================");
        Livro livros[] = cadastrarLivro();
        System.out.println();
        Pessoa usuario = cadastrarPessoa();
        System.out.println("*************************       Menu         ****************************");
        fazerEmprestimo(livros,usuario);
    
    }
}
