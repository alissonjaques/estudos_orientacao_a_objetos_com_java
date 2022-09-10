import java.util.Scanner; // importação da classe Scanner, que permite a manipulação de dados inseridos pelo usuário

/**
 * A classe CalculadoraSimples é um programa de computador que representa uma calculadora
 * com operações básicas (multiplicar, dividir, somar e subtrair). 
 * Dados de Entrada: Dois números flutuantes e um simbolo de operação.
 * Saída do Programa: O resultado da expressão envolvendo os dois números informados e o símbolo.
 * 
 * @author Alisson Jaques
 * 
 */
public class CalculadoraComFluxo {

      /**
     * O método main permite a execução dessa classe, ele realiza uma operação matemática (multiplicação, divisão, soma ou subtração)
     * com os dados passados pelo usuário, caso o usuário informe dados inesperados o programa imprime uma mensagem explicitando o erro.
     * @param argumentos os argumentos que podem ser passados ao método via linha de comando,
     * mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos){ // declara o método

        /*
            declaração de variáveis auxiliares            
        */
        double numero1;                              // primeiro número da expressão
        double numero2;                              // segundo número da expressão
        double resultado;                            // resultado da expressão
        char simboloOperacao;                        // simbolo da operação

        /* 
            criamos duas referências a instâncias da classe Scanner,
            uma para manipularmos os números informados pelo usuário
            e outra para manipularmos o simbolo da operação (também fornecido
            pelo usuário).            
        */
        Scanner expressao = new Scanner(System.in);
        Scanner simbolo = new Scanner(System.in);

        /*
            Solicitamos ao usuário que nos informe dois números e o simbolo da operação.
            Em seguida inicializamos as variáveis auxiliares com os dados informados.
        */
        System.out.println("Informe dois números e um operador (+, -, * ou /): ");
        numero1 = expressao.nextDouble();
        numero2 = expressao.nextDouble();
        simboloOperacao = simbolo.next().charAt(0);

        if(numero2 == 0.0){

            while(simboloOperacao == '/'){

                System.out.println("Não existe divisão por zero! Informe um simbolo válido:");
                simboloOperacao = simbolo.next().charAt(0);

            }
        }

        expressao.close(); // encerra a execução do objeto expressao
        simbolo.close();   // encerra a execução do objeto simbolo
        

        if(simboloOperacao == '+'){ // se o usuário escolher somar

            // realizamos a soma
            resultado = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + resultado); // mostramos o resultado da soma dos números

        }
        else{ // senão

            if(simboloOperacao == '-'){ // se o usuário escolher subtrair

                // calculamos a subtração
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado); // mostramos o resultado da subtração dos números

            }
            else{ // senão

                if(simboloOperacao == '*'){ // se o usuário escolher multiplicar

                    // calculamos a multiplicação
                    resultado = numero1*numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + resultado); // mostramos o resultado da multiplicação

                }
                else{ // senão

                    if(simboloOperacao == '/'){ // se o usuário escolher dividir
                        
                        // calculamos a divisão
                        resultado = numero1/numero2;
                        System.out.println(numero1 + " / " + numero2 + " = " + resultado); // mostramos o resultado da divisão
                       
                    }
                    else{ // se o usuário não escolher uma operação válida

                        // imformamos que o símbolo para a operação é inválido
                        System.out.println("Erro! Simbolo para operação inválido.");

                    } // fim-se

                } // fim-se

            } // fim-se

        } // fim-se

    } // fim do método main

} // fim da classe CalculadoraComFluxo