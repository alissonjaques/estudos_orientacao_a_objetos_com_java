import java.util.Scanner; // importa��o da classe Scanner, que permite a manipula��o de dados inseridos pelo usu�rio

/**
 * A classe CalculadoraSimples � um programa de computador que representa uma calculadora
 * com opera��es b�sicas (multiplicar, dividir, somar e subtrair). 
 * Dados de Entrada: Dois n�meros flutuantes e um simbolo de opera��o.
 * Sa�da do Programa: O resultado da express�o envolvendo os dois n�meros informados e o s�mbolo.
 * 
 * @author Alisson Jaques
 * 
 */
public class CalculadoraSimples { // declara a classe
    
    /**
     * O m�todo main permite a execu��o dessa classe, ele realiza uma opera��o matem�tica (multiplica��o, divis�o, soma ou subtra��o)
     * com os dados passados pelo usu�rio, caso o usu�rio informe dados inesperados o programa imprime uma mensagem explicitando o erro.
     * @param argumentos os argumentos que podem ser passados ao m�todo via linha de comando,
     * mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos){ // declara o m�todo

        /*
            declara��o de vari�veis auxiliares            
        */
        double numero1;                              // primeiro n�mero da express�o
        double numero2;                              // segundo n�mero da express�o
        double resultado;                            // resultado da express�o
        char simboloOperacao;                        // simbolo da opera��o

        /* 
            criamos duas refer�ncias a inst�ncias da classe Scanner,
            uma para manipularmos os n�meros informados pelo usu�rio
            e outra para manipularmos o simbolo da opera��o (tamb�m fornecido
            pelo usu�rio).            
        */
        Scanner expressao = new Scanner(System.in);
        Scanner simbolo = new Scanner(System.in);

        /*
            Solicitamos ao usu�rio que nos informe dois n�meros e o simbolo da opera��o.
            Em seguida inicializamos as vari�veis auxiliares com os dados informados.
        */
        System.out.println("Informe dois n�meros e um operador (+, -, * ou /):");
        numero1 = expressao.nextDouble();
        numero2 = expressao.nextDouble();
        simboloOperacao = simbolo.next().charAt(0);

        expressao.close(); // encerra a execu��o do objeto expressao
        simbolo.close();   // encerra a execu��o do objeto simbolo

        if(simboloOperacao == '+'){ // se o usu�rio escolher somar

            // realizamos a soma
            resultado = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + resultado); // mostramos o resultado da soma dos n�meros

        }
        else{ // sen�o

            if(simboloOperacao == '-'){ // se o usu�rio escolher subtrair

                // calculamos a subtra��o
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado); // mostramos o resultado da subtra��o dos n�meros

            }
            else{ // sen�o

                if(simboloOperacao == '*'){ // se o usu�rio escolher multiplicar

                    // calculamos a multiplica��o
                    resultado = numero1*numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + resultado); // mostramos o resultado da multiplica��o

                }
                else{ // sen�o

                    if(simboloOperacao == '/'){ // se o usu�rio escolher dividir
                        
                        if(numero2 == 0){ // se for divis�o por zero

                            // informamos que n�o � poss�vel dividir um n�mero por zero
                            System.out.println("Opera��o inv�lida! N�o � poss�vel dividir um n�mero por zero.     ");

                        }
                        else{ // se�o

                            // calculamos a divis�o
                            resultado = numero1/numero2;
                            System.out.println(numero1 + " / " + numero2 + " = " + resultado); // mostramos o resultado da divis�o

                        } // fim-se
                    }
                    else{ // se o usu�rio n�o escolher uma opera��o v�lida

                        // imformamos que o s�mbolo para a opera��o � inv�lido
                        System.out.println("Erro! Simbolo para opera��o inv�lido.");

                    } // fim-se

                } // fim-se

            } // fim-se

        } // fim-se

    } // fim do m�todo main

} // fim da classe CalculadoraSimples