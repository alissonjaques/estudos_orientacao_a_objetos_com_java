/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Calculadora;
import classes.CalculadoraAvancada;
import interfaces.OperacoesBasicas;
import interfaces.OperacoesEspecializadas;
import java.util.Scanner;

/**
 *
 * @author ericd
 */
public class Aula1_CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float num1, num2, result;
        int op;
        Scanner scan = new Scanner(System.in);

        num1 = 0;
        num2 = 0;

        System.out.println("        Calculadora Simples     \n");

        do {

            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Raiz");
            System.out.print("Entre com o opção: ");
            op = scan.nextInt();
            scan.reset();

            if (op < 1 || op > 5) {
                System.out.println("Você entrou com uma opção invalida! Digite novamente ... \n");
            }

        } while (op < 1 || op > 4);

        System.out.println("");

        if (op >= 1 && op <= 5) {

            System.out.print("Entre com o 1° valor: ");
            num1 = scan.nextFloat();
            scan.reset();

            if(op != 5){
                System.out.print("Entre com o 2° valor: ");
                num2 = scan.nextFloat();
                scan.reset();
            }
            
        }
        
        OperacoesBasicas calc = new CalculadoraAvancada();

        switch (op) {

            case 1:
                result = calc.somar(num1, num2);
                System.out.println("O resultado da soma é: " + result);
                break;
            case 2:
                result = calc.subtrair(num1, num2);
                System.out.println("O resultado da subtração é: " + result);
                break;
            case 3:
                result = calc.multiplicar(num1, num2);
                System.out.println("O resultado da multiplicação é: " + result);
                break;
            case 4:
                result = calc.dividir(num1, num2);
                System.out.println("O resultado da divisão é: " + result);
                break;
            case 5:
                result = ((OperacoesEspecializadas)calc).raiz(num1);
                System.out.println("O resultado da raiz quadrada é: " + result);
                break;
            default:
                System.out.println("Você entrou com uma opção invalida!");

        }

    }

}
