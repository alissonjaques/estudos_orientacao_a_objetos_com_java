/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Aluno;
import classes.Funcionario;
import classes.Pessoa;
import classes.Professor;
import enums.Serie;
import enums.Titulacao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author ericd
 */
public class Aula5_CadastroEscola {
    
    public void cadastrarPessoa(Pessoa pessoa){
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1");
        
        System.out.print("Entre com o nome: ");
        pessoa.setNome(scan.nextLine());
        
        System.out.print("Entre com o CPF: ");
        pessoa.setCpf(scan.nextLine());
        
        String data;
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

        boolean validado;

        do {
            validado = true;
            try {
                System.out.print("Entre com a data de nascimento (DD/MM/YYYY): ");
                data = scan.nextLine();
                pessoa.setDataNasc(dateFormat.parse(data));
            } catch (ParseException ex) {
                System.out.println("Exception: " + ex.getMessage());
                System.out.println("Data de nascimento com valor invalido! Favor, inserir uma data válida.");
                System.out.println("");
                validado = false;
            }
        } while (!validado);
        
        
        do {
            validado = true;
            try {
                System.out.print("Entre com o sexo (M/F): ");
                String sexo = scan.nextLine();
                
                if(sexo.length() > 1)
                    throw new Exception("Sexo invalido! Favor entrar com M para Masculino e F para Feminino");
                
                pessoa.setSexo(sexo.charAt(0));
                if(pessoa.getSexo() != 'M' && pessoa.getSexo() != 'm' && pessoa.getSexo() != 'F' && pessoa.getSexo() != 'f')
                    throw new Exception("Sexo invalido! Favor entrar com M para Masculino e F para Feminino");
                    
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println("");
                validado = false;
            }
        } while (!validado);
        
    } 
    
    public void cadastrarAluno(Aluno aluno){
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1");
        cadastrarPessoa(aluno);
        
        System.out.print("Entre com a matrícula: ");
        aluno.setMatricula(scan.nextLine());
        
        int op;
        do {         
            System.out.println("Série do aluno");
            System.out.println("1 - 1° ano");
            System.out.println("2 - 2° ano");
            System.out.println("3 - 3° ano");
            System.out.print("Entre com a opção: ");
            op = scan.nextInt();
            
            if(op < 1 || op > 3)
                System.out.println("Opção invalida! Favor, entre com uma opção valida.");
            
            System.out.println("");
            
        } while (op < 1 || op > 3);
        
        Serie serie = null;
        
        switch(op){
            
            case 1:
                    serie = Serie.PRIMEIRO;
                    break;
            case 2:
                    serie = Serie.SEGUNDO;
                    break;
            case 3:
                    serie = Serie.TERCEIRO;
                    break;
            
        }
        
        aluno.setSerie(serie);
        
        System.out.print("Entre com a nota final: ");
        aluno.setNotaFinal(scan.nextFloat());

        System.out.print("Entre com a frequencia: ");
        aluno.setFrequencia(scan.nextFloat());
        
    }
    
    public void cadastrarFuncionario(Funcionario funcionario){
        Scanner scan = new Scanner(System.in, "ISO-8859-1");
        cadastrarPessoa(funcionario);
        
        System.out.print("Entre com o código: ");
        funcionario.setCodigo(scan.nextLine());
        
        System.out.print("Entre com o salário: ");
        funcionario.setSalario(scan.nextFloat());
        
        System.out.print("Entre com o regime de trabalho (horas): ");
        funcionario.setRegimeTrabalho(scan.nextInt());
    }
    
    public void cadastrarProfessor(Professor professor){
        Scanner scan = new Scanner(System.in, "ISO-8859-1");
        cadastrarFuncionario(professor);
        
        System.out.print("Entre com a matéria: ");
        professor.setMateria(scan.nextLine());
        
        System.out.print("Entre com a formação: ");
        professor.setFormacao(scan.nextLine());
        
        int op;
        do {         
            System.out.println("Titulação do professor");
            System.out.println("1 - Graduado");
            System.out.println("2 - Especialista");
            System.out.println("3 - Mestre");
            System.out.println("4 - Doutor");
            System.out.print("Entre com a opção: ");
            op = scan.nextInt();
            
            if(op < 1 || op > 4)
                System.out.println("Opção invalida! Favor, entre com uma opção valida.");
            
            System.out.println("");
            
        } while (op < 1 || op > 4);
        
        Titulacao titulacao = null;
        
        switch(op){
            
            case 1:
                    titulacao = Titulacao.GRADUADO;
                    break;
            case 2:
                    titulacao = Titulacao.ESPECIALISTA;
                    break;
            case 3:
                    titulacao = Titulacao.MESTRE;
                    break;
            case 4:
                    titulacao = Titulacao.DOUTOR;
                    break;            
        }
        
        professor.setTitulacao(titulacao);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aula5_CadastroEscola cadastro = new Aula5_CadastroEscola();
        Pessoa listPessoa[];
        listPessoa = new Pessoa[3];
        
        Pessoa aluno = new Aluno();
        System.out.println("        Cadastro de Aluno   ");
        cadastro.cadastrarAluno((Aluno) aluno);
        listPessoa[0] = aluno;
        System.out.println("");
        
        Pessoa funcionario = new Funcionario();
        System.out.println("    Cadastro de Funcionário");
        cadastro.cadastrarFuncionario((Funcionario) funcionario);
        listPessoa[1] = funcionario;
        System.out.println("");
        
        Pessoa professor = new Professor();
        System.out.println("    Cadastro de Professor");
        cadastro.cadastrarProfessor((Professor) professor);
        listPessoa[2] = professor;
        System.out.println("");
        
        for (Pessoa pes : listPessoa) {
            
            if( pes instanceof Professor){
                System.out.println("        Informações de Professor");
                Professor prof = (Professor) pes;
                prof.imprimirInformacoes();
            }else if(pes instanceof Aluno){
                System.out.println("        Informações de Aluno");
                Aluno alu = (Aluno) pes;
                alu.imprimirInformacoes();
            }else if (pes instanceof Funcionario){
                System.out.println("        Informações de Funcionário");
                Funcionario fun = (Funcionario) pes;
                fun.imprimirInformacoes();
            }
       
            
            System.out.println("");
        }
        
    }
    
}
