package nível.pkg6;

import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo usuário
/**
 * A classe Atividade63 possui dois métodos, sendo um o método main e o outro uma sub-rotina para o main.
 * Ela representa um programa de computador, que recebe como entrada um número inteiro e fornece como saída
 * a informação deste número, se ele é par ou ímpar.
 * @author Alisson Jaques
 */
public class Atividade63 { // declara a classe
    /**
     * O método main permite a execução dessa classe, ele recebe como entrada um número inteiro e imprimi no
     * terminal uma mensagem, dizendo se o número é par ou ímpar.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){

        int numero;                            // o número a ser informado pelo usuário
        Scanner scan = new Scanner(System.in); // scan é um objeto da classe Scanner

        System.out.println("************************** Par ou Ímpar *****************************");
        /*
            Solicita o número ao usuário e inializa a variável correspondente com o mesmo.
        */
        System.out.print("Informe o número: ");
        numero = scan.nextInt();
        scan.close(); // encerra o objeto scan

        System.out.println("O número informado é "+verifica(numero)+"."); // informa se o número é par ou ímpar utilizando o método verifica(double,double)
        System.out.println("*********************************************************************");
    } // fim do método main

    /**
     * O método verifica recebe como argumento um número inteiro e retorna a mensagem "par", se o número for par, ou "ímpar"
     * se o número for ímpar.
     * @param umNumero o número inteiro a ser verificado
     * @return a mensagem "par", se o número for par
     * <li>a mensagem "ímpar", se o número for ímpar</li>
     */
    private static String verifica(int umNumero){
        String resultado;
        if(umNumero%2==0){ // se o número for par
            resultado = "par";
        }
        else{ // senão
            resultado = "ímpar";
        } // fim-se
        return resultado;
    } // fim do método verfica
} // fim da classe Atividade63