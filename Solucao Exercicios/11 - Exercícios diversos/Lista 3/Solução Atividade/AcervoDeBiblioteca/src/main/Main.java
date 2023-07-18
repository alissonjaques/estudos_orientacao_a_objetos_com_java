package main;

import acervo.PreencheColecaoAcervo;
import classeAncestral.ItemDeBiblioteca;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Alisson Jaques
 */
public class Main {
    
    public static void fazerEmprestimo(ArrayList<ItemDeBiblioteca> acervo) throws ParseException{
        Scanner scan = new Scanner(System.in,"ISO-8859-1");
        String termo;
        System.out.print("Informe o código do item (o valor tem que ser exato): ");
        termo = scan.nextLine();
        ConsultaItensAcervo.consultaParaEmprestimo(termo,acervo);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<ItemDeBiblioteca> acervo = PreencheColecaoAcervo.listaDeItensDoAcervo();
        Scanner scan = new Scanner(System.in,"ISO-8859-1");
        String termo;
        boolean botao = true;
        short ano;
        byte escolha;
        System.out.println("=========================== Biblioteca Universitária - BU ==========================\n");
        System.out.println("====================================================================================\n");
        
        do{
            System.out.println("Escolha uma das seguintes opções: \n1 - Consultar itens no acervo\n2 - Fazer empréstimo\n3 - Sair\n");
            System.out.print("Digite aqui sua escolha: ");
            escolha = scan.nextByte();
            while(escolha!=1 && escolha!=2 && escolha!=3){
                System.out.print("Opção inválida!Por favor, escolha uma opção válida (1, 2 ou 3): ");
                escolha = scan.nextByte();
            }
            System.out.println();
            
            if(escolha==1){
                System.out.println("*************************** Consulta de Itens no Acervo ****************************\n");
                System.out.println("Escolha uma forma de consulta: \n1 - Consultar todos os itens do acervo\n2 - Consultar por título\n3"
                        + " - Consultar por ano de publicação\n4 - Consultar por código na biblioteca");
                System.out.print("\nDigite aqui sua escolha: ");
                escolha = scan.nextByte();
                while(escolha!=1 && escolha!=2 && escolha!=3 && escolha!=4){
                    System.out.print("Opção inválida!Por favor, escolha uma opção válida (1, 2, 3 ou 4): ");
                    escolha = scan.nextByte();
                }                
                scan = new Scanner(System.in,"ISO-8859-1");
                
                if(escolha==1){
                    System.out.println("\n---------------------- Consulta de Todos os Itens do Acervo ------------------------\n");
                    System.out.println("Resultado da busca:\n");
                    ConsultaItensAcervo.consultaTodosOsItens(acervo);
                    System.out.println("------------------------------------------------------------------------------------\n");
                }
                else if(escolha==2){
                    System.out.println("\n------------------------------- Consulta por Título --------------------------------\n");
                    System.out.print("Informe um termo para busca: ");
                    termo = scan.nextLine();
                    System.out.println("Resultado da busca:\n");
                    ConsultaItensAcervo.consultaPorTitulo(termo,acervo);
                    System.out.println("------------------------------------------------------------------------------------\n");
                }
                else if(escolha==3){
                    System.out.println("\n--------------------------------- Consulta por Ano ---------------------------------\n");
                    System.out.print("Informe o ano para busca: ");
                    ano = scan.nextShort();
                    System.out.println("Resultado da busca:\n");
                    ConsultaItensAcervo.consultaPorAno(ano,acervo);
                    System.out.println("------------------------------------------------------------------------------------\n");
                }
                else{
                    System.out.println("\n----------------------- Consulta por Código na Biblioteca --------------------------\n");
                    System.out.print("Informe um termo para busca: ");
                    termo = scan.nextLine();
                    System.out.println("Resultado da busca:\n");
                    ConsultaItensAcervo.consultaPorCodigo(termo,acervo);
                    System.out.println("------------------------------------------------------------------------------------\n");
                }
                scan = new Scanner(System.in,"ISO-8859-1");
            }
            else if(escolha==2){
                System.out.println("*********************************** Empréstimo *************************************\n");
                fazerEmprestimo(acervo);
                scan.reset();
            }
            else{
                System.out.println("================================ Programa Encerrado ================================\n");
                System.out.println("====================================================================================\n");
                botao = false;
            }
        }while(botao);
    }    
}
