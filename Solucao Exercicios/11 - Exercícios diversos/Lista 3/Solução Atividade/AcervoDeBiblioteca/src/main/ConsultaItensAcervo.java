package main;

import Relatorios.Relatorio;
import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import livros.Livro;
import trabalhosDeConclusao.Dissertacao;
import trabalhosDeConclusao.Monografia;
import trabalhosDeConclusao.Tese;

/**
 *
 * @author Alisson Jaques
 */
public class ConsultaItensAcervo {
    
    public static void consultaTodosOsItens(ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
                
        for (ItemDeBiblioteca acervo1 : acervo) {
            if(acervo1 instanceof Livro){
                System.out.println(acervo1);
                System.out.println(((Livro) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Relatorio){
                System.out.println(acervo1);
                System.out.println(((Relatorio) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Dissertacao){
                System.out.println(acervo1);
                System.out.println(((Dissertacao) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Monografia){
                System.out.println(acervo1);
                System.out.println(((Monografia) acervo1).fichaCatalografica());
            }
            else if(acervo1 instanceof Tese){
                System.out.println(acervo1);
                System.out.println(((Tese) acervo1).fichaCatalografica());
            }
            else{
                System.out.println(acervo1);
            }
        }
    }
    
    public static void consultaPorTitulo(String termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        String frase;
        boolean botao = false;
        for (ItemDeBiblioteca acervo1 : acervo) {
            frase = acervo1.getTitulo();
            
            if(frase.contains(termo)){
                botao = true;
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                }
                else{
                    System.out.println(acervo1);
                }            
            }                     
        }
        
        if(!botao){
                System.out.println("Não foram encontrados intens que satisfaçam a busca informada.");
        }
    }
    
    public static void consultaPorAno(Short termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        short ano;
        boolean botao = false;
        for (ItemDeBiblioteca acervo1 : acervo) {
            ano = acervo1.getAno();
            
            if(ano==termo){
                botao = true;
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                }
                else{
                    System.out.println(acervo1);
                }            
            }                 
        }
        
        if(!botao){
                System.out.println("Não foram encontrados intens que satisfaçam a busca informada.");
        }
    }
    
    public static void consultaPorCodigo(String termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        String frase;
        boolean botao = false;
        for (ItemDeBiblioteca acervo1 : acervo) {
            frase = acervo1.getCodigoId();
            
            if(frase.contains(termo)){
                botao = true;
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                }
                else{
                    System.out.println(acervo1);
                }            
            }                 
        }
        
        if(!botao){
                System.out.println("Não foram encontrados itens que satisfaçam a busca informada.");
        }
    }
    
    public static void consultaParaEmprestimo(String termo,ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        String frase;
        boolean botao = false;
        byte escolha;
        Scanner scan = new Scanner(System.in);
        for (ItemDeBiblioteca acervo1 : acervo) {
            frase = acervo1.getCodigoId();
           
            if(frase.equals(termo)){
                botao = true;
                System.out.println("Item encontrado:");
                if(acervo1 instanceof Livro){
                    System.out.println(acervo1);
                    System.out.println(((Livro) acervo1).fichaCatalografica());
                    System.out.print("Deseja realizar o empréstimo do item? (1 - sim | 2 - não): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Opção inválida, por favor escolha 1 (fazer empréstimo) ou 2 (não fazer empréstimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPONÍVEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empréstimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("Não foi possível realizar o empréstimo. Item já emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empréstimo cancelado pelo usuário.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Relatorio){
                    System.out.println(acervo1);
                    System.out.println(((Relatorio) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empréstimo do item? (1 - sim | 2 - não): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 || escolha!=2){
                        System.out.print("Opção inválida, por favor escolha 1 (fazer empréstimo) ou 2 (não fazer empréstimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPONÍVEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empréstimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("Não foi possível realizar o empréstimo. Item já emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empréstimo cancelado pelo usuário.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Dissertacao){
                    System.out.println(acervo1);
                    System.out.println(((Dissertacao) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empréstimo do item? (1 - sim | 2 - não): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Opção inválida, por favor escolha 1 (fazer empréstimo) ou 2 (não fazer empréstimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPONÍVEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empréstimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("Não foi possível realizar o empréstimo. Item já emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empréstimo cancelado pelo usuário.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Monografia){
                    System.out.println(acervo1);
                    System.out.println(((Monografia) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empréstimo do item? (1 - sim | 2 - não): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Opção inválida, por favor escolha 1 (fazer empréstimo) ou 2 (não fazer empréstimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPONÍVEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empréstimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("Não foi possível realizar o empréstimo. Item já emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empréstimo cancelado pelo usuário.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else if(acervo1 instanceof Tese){
                    System.out.println(acervo1);
                    System.out.println(((Tese) acervo1).fichaCatalografica());
                    System.out.print("\nDeseja realizar o empréstimo do item? (1 - sim | 2 - não): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 || escolha!=2){
                        System.out.print("Opção inválida, por favor escolha 1 (fazer empréstimo) ou 2 (não fazer empréstimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPONÍVEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empréstimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("Não foi possível realizar o empréstimo. Item já emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empréstimo cancelado pelo usuário.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }
                else{
                    System.out.println(acervo1);
                    System.out.print("\nDeseja realizar o empréstimo do item? (1 - sim | 2 - não): ");
                    escolha = scan.nextByte();
                    while(escolha!=1 && escolha!=2){
                        System.out.print("Opção inválida, por favor escolha 1 (fazer empréstimo) ou 2 (não fazer empréstimo): ");
                        escolha = scan.nextByte();
                    }
                    if(escolha==1){
                        if(acervo1.getStatus()==StatusDoItem.DISPONÍVEL){
                            acervo1.setStatus(StatusDoItem.EMPRESTADO);
                            System.out.println("Empréstimo realizado com sucesso!");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                        else{
                            System.out.println("Não foi possível realizar o empréstimo. Item já emprestado.");
                            System.out.println("------------------------------------------------------------------------------------\n");
                        }
                    }
                    else{
                        System.out.println("Empréstimo cancelado pelo usuário.");
                        System.out.println("------------------------------------------------------------------------------------\n");
                    }
                }            
            }                 
        }
        
        if(!botao){
                System.out.println("Não foram encontrados itens que satisfaçam a busca informada.");
                System.out.println("------------------------------------------------------------------------------------\n");
        }
    }
}
