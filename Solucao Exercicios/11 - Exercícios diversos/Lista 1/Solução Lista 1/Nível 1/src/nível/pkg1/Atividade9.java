package nível.pkg1;

import java.util.Scanner; // importação da classe Scanner, para manipular dados fornecidos pelo teclado

/**
 * A classe Atividade9 representa um programa de computador, ela possui dois métodos, sendo um o método main
 * e o outro uma sub-rotina. As entradas do progroma são a idade de uma pessoa, expressa em anos, meses e dias e 
 * a saída do mesmo é essa idade expressa somente em dias.
 * @author Alisson Jaques
 */
public class Atividade9 { // declara a classe
    
    /**
     * O método main permite a execução dessa classe, ele recebe como entradas a idade do usuário, expressa em
     * anos, meses e dias e imprimi a idade expressa somente em dias.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){

        /*
         *  Declaração de variáveis auxiliares 
         */
        byte meses;                            // quantidade de meses
        short anos;                            // quantidade de anos
        int dias;                              // quantidade de dias
        Scanner scan = new Scanner(System.in); // Declaração de uma instância da classe Scanner, para obter dados
                                               // fornecidos pelo usuário

        System.out.println("********************** Idade Expressa em Dias ************************");

        /*
            Solicita a quantidade de anos, meses e dias referente à idade e inicializa os campos correspondentes
            a esses dados.        
        */
        System.out.println("\nInforme a idade, incluindo meses e dias:");
        System.out.print("Anos: ");
        anos = scan.nextShort();
        scan.reset(); // limpa o objeto scan

        System.out.print("Meses: ");
        meses = scan.nextByte();
        scan.reset();

        System.out.print("Dias: ");
        dias = scan.nextInt();
        scan.close(); // fecha o objeto scan

        // Informa a idade, expressa apenas em dias
        System.out.println("Idade expressa somente em dias: " + idadeEmDias(anos, meses, dias));
        System.out.println("\n**********************************************************************");

    } // fim do método main

    /**
     * O método idadeEmdias recebe como argumentos os anos, os meses e o dias da idade fornecida pelo
     * usuário e retorna a idade expressa apenas em dias.
     * @param a os anos da idade
     * @param m os meses da idade
     * @param d os dias da idade
     * @return A idade expressa apenas em dias
     */
    private static int idadeEmDias(short a, byte m, int d){

        int idadeDias = (a*365) + (m*30) + d;

        return idadeDias;

    } // fim do método idadeEmDias

} // fim da classe Atividade9