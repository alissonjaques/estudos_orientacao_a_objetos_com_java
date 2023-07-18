import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo usuário
/**
 * A classe Atividade62 possui dois métodos, sendo um o método main e outro uma sub-rotina do main. Essa
 * classe representa um programa de computador que recebe como entrada a altura e a base de um triângulo
 * retângulo e imprimi, como saída, a hipotenusa desse triângulo.
 * @author Alisson Jaques
 */
public class Atividade62 { // declara a classe
    /**
     * O método main permite a execução dessa classe, ele recebe como entrada dois números flutuantes,
     * correspondentes à altura e à base do triângulo retângulo, e utiliza a sub-rotina hipotenusa(double,double)
     * para imprimir no terminal a hipotenusa do triângulo, formado pelos dados passados.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){
        double base;                            // a base do triângulo retângulo
        double altura;                          // a altura do triângulo retângulo
        Scanner scan = new Scanner(System.in);  // scan é uma referência a um objeto da classe Scanner

        System.out.println("************************** Calcula Hipotenusa de um Triângula Retângulo *****************************");
        /*
            Solicita ao usuário a altura e a base do triângulo, inicializando as variáveis correspondentes
            com esses dados.
        */
        System.out.print("\nForneça a altura do triângulo retângulo: ");
        altura = scan.nextDouble();
        System.out.print("Forneça a base do triângulo retângulo: ");
        base = scan.nextDouble();
        scan.close(); // fecha o objeto scan

        System.out.println("\nValor da hipotenusa: " + hipotenusa(base,altura)); // imprimi o valor da hipotenusa utilizando a sub-rotina hipotenusa(double,double)
        System.out.println("\n*****************************************************************************************************");
    } // fim do método main

    /**
     * O método hipotenusa recebe como argumentos dois números flutuantes, referentes à altura e a base
     * do triângulo retângulo, e retorna a hipotenusa desse triângulo.
     * @param umaBase a base do triângulo retângulo
     * @param umaAltura a altura do triângulo retângulo
     * @return a hipotenusa do triângulo retângulo
     */
    private static double hipotenusa(double umaBase, double umaAltura){
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(umaBase, 2) + Math.pow(umaAltura,2)); // hipotenusa² = area² + altura²
        return hipotenusa;
    } // fim do método hipotenusa
} // fim da classe Atividade62
